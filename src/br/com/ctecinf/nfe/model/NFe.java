/*
 * Copyright (C) 2023 ctecinf.com.br
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.ctecinf.nfe.model;

import br.com.ctecinf.Contribuinte;
import br.com.ctecinf.nfe.ChaveAcesso;
import br.com.ctecinf.nfe.Constants;
import br.com.ctecinf.nfe.NFeException;
import br.com.ctecinf.nfe.NumberFormatter;
import br.com.ctecinf.nfe.QRCode;
import br.inf.portalfiscal.nfe.TNFe;
import br.inf.portalfiscal.nfe.TNFe.Det;
import br.inf.portalfiscal.nfe.TNFe.DetPag;
import br.inf.portalfiscal.nfe.TNFe.Imposto;
import br.inf.portalfiscal.nfe.TNFe.InfAdic;
import br.inf.portalfiscal.nfe.TNFe.ObsCont;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * <b>Transporte</b><br>
 * 0: Contratação do Frete por conta do Remetente (CIF)<br>
 * 1: Contratação do Frete por conta do Destinatário (FOB)<br>
 * 2: Contratação do Frete por conta de Terceiros<br>
 * 3: Transporte Próprio por conta do Remetente<br>
 * 4: Transporte Próprio por conta do Destinatário<br>
 * 9: Sem Ocorrência de Transporte - <b>DEFAULT</b>
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class NFe extends TNFe {

    /**
     *
     * @param ide
     * @throws IOException
     * @throws IllegalAccessException
     */
    public NFe(IdeNFe ide) throws IOException, IllegalAccessException {
        this(ide, null);
    }

    /**
     *
     * @param ide
     * @param transporte<br>
     * 0: Contratação do Frete por conta do Remetente (CIF)<br>
     * 1: Contratação do Frete por conta do Destinatário (FOB)<br>
     * 2: Contratação do Frete por conta de Terceiros<br>
     * 3: Transporte Próprio por conta do Remetente<br>
     * 4: Transporte Próprio por conta do Destinatário<br>
     * 9: Sem Ocorrência de Transporte - <b>DEFAULT</b>
     * @throws IOException
     * @throws IllegalAccessException
     */
    public NFe(IdeNFe ide, Integer transporte) throws IOException, IllegalAccessException {

        TNFe.Transp transp = new TNFe.Transp();
        transp.setModFrete(transporte == null ? "9" : String.valueOf(transporte));

        infNFe = new TNFe.InfNFe();

        infNFe.setEmit(new Emitente());
        infNFe.setIde(ide);
        infNFe.setTransp(transp);
        infNFe.setTotal(new ICMSTotal());
        infNFe.setPag(new TNFe.Pag());
        infNFe.setVersao(Constants.VERSAO_NFE);

        /**
         * Adiciona CNPJ do contador para ter acesso a NF-e
         */
        if (Contribuinte.getContadorCNPJ() != null && Contribuinte.getContadorCNPJ().replace(".", "").replace("/", "").replace("-", "").trim().length() == 14) {
            TNFe.AutXML autXML = new TNFe.AutXML();
            autXML.setCNPJ(Contribuinte.getContadorCNPJ().replace(".", "").replace("/", "").replace("-", "").trim());
            infNFe.getAutXML().add(autXML);
        }
    }

    /**
     * Dados do consumidor
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) throws NullPointerException {
        if (cliente.getCPF() == null) {
            throw new NullPointerException("CPF não pode ser nulo.");
        }
        if (!infNFe.getIde().getTpAmb().equals("2")) {
            infNFe.setDest(cliente);
        }
    }

    /**
     * Adiciona forma de pagamento
     *
     * @param pagamento
     */
    public void addPagamento(Pagamento pagamento) {
        infNFe.getPag().getDetPag().add(pagamento);
    }

    /**
     * Adiciona um produto ICMS 102 a NFC-e
     *
     * @param produto
     * @param imposto
     */
    public void addProduto(Produto produto, Imposto imposto) {

        if (infNFe.getDet().isEmpty() && infNFe.getIde().getTpAmb().equals("2")) {
            produto.setCProd("CFOP" + produto.getCFOP());
            produto.setXProd("NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
        }

        TNFe.Det det = new TNFe.Det();
        det.setNItem(String.valueOf(infNFe.getDet().size() + 1));
        det.setProd(produto);
        det.setImposto(imposto);

        infNFe.getDet().add(det);
        infNFe.getTotal().getICMSTot().setVProd(NumberFormatter.format2Digits(produto.getValor() + Double.parseDouble(infNFe.getTotal().getICMSTot().getVProd())));
        infNFe.getTotal().getICMSTot().setVNF(NumberFormatter.format2Digits(produto.getValor() + Double.parseDouble(infNFe.getTotal().getICMSTot().getVProd())));
    }

    /**
     * Finaliza NFC-e
     *
     * @throws br.com.ctecinf.nfe.NFeException
     */
    public void finalizar() throws NFeException {

        double total = Double.parseDouble(infNFe.getTotal().getICMSTot().getVProd());
        double desconto = 0;

        /**
         * Calcula o desconto
         */
        for (Det det : infNFe.getDet()) {
            desconto += det.getProd().getVDesc() != null ? Double.parseDouble(det.getProd().getVDesc()) : 0;
        }
        total -= desconto;

        /**
         * Verifica se tem pagamento PIX estático e adiciona informação
         * adicional
         */
        boolean pix = false;
        double totalPago = 0;
        for (DetPag detPag : infNFe.getPag().getDetPag()) {
            if (detPag.getTPag().equals(FormaPagamento.TPAG_20.getCodigo()) && !pix) {
                ObsCont obsCont = new ObsCont();
                obsCont.setXCampo("tPix");
                obsCont.setXTexto("1");
                if (infNFe.getInfAdic() == null) {
                    infNFe.setInfAdic(new InfAdic());
                }
                infNFe.getInfAdic().getObsCont().add(obsCont);
                pix = true;
            }
            totalPago += Double.parseDouble(detPag.getVPag());
        }

        /**
         * Calcula troco
         */
        double troco = 0;
        if (totalPago > total) {
            troco = totalPago - total;
        }
        if (troco > 0) {
            for (DetPag detPag : infNFe.getPag().getDetPag()) {
                if (detPag.getTPag().equals(FormaPagamento.TPAG_01.getCodigo()) && Double.parseDouble(detPag.getVPag()) > troco) {
                    detPag.setVPag(NumberFormatter.format2Digits(Double.parseDouble(detPag.getVPag()) - troco));
                    break;
                }
            }
        }

        infNFe.getPag().setVTroco(NumberFormatter.format2Digits(troco));
        infNFe.getTotal().getICMSTot().setVDesc(NumberFormatter.format2Digits(desconto));
        infNFe.getTotal().getICMSTot().setVNF(NumberFormatter.format2Digits(total));

        if (!infNFe.getIde().getTpAmb().equals("2")) {
            if (infNFe.getInfAdic() == null) {
                infNFe.setInfAdic(new InfAdic());
            }
            infNFe.getInfAdic().setInfCpl("Documento emitido por ME ou EPP optante pelo Simples Nacional. Tributos Totais Incidentes (Lei Federal 12.741/2012):    " + DecimalFormat.getCurrencyInstance(new Locale("pt", "BR")).format(total * Contribuinte.getAliquota() / 100));
        }

        ChaveAcesso.set(this);
        QRCode.set(this);
    }

}
