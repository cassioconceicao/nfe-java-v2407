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
import br.com.ctecinf.nfe.NumberFormatter;
import br.inf.portalfiscal.nfe.TNFe;
import java.io.IOException;

/**
 * <b>Forma de Pagamento</b><br>
 * 01: Dinheiro<br>
 * 02: Cheque<br>
 * 03: Cartao de Credito<br>
 * 04: Cartao de Debito<br>
 * 05: Credito Loja<br>
 * 10: Vale Alimentacao<br>
 * 11: Vale Refeicao<br>
 * 12: Vale Presente<br>
 * 13: Vale Combustivel<br>
 * 15: Boleto Bancario<br>
 * 16: Deposito Bancario<br>
 * 17: Pagamento Instantaneo (PIX)<br>
 * 18: Transferencia bancaria, Carteira Digital<br>
 * 19: Programa de fidelidade, Cashback, Credito Virtual<br>
 * 90: Sem pagamento<br>
 * 99: Outros<br>
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class Pagamento extends TNFe.DetPag {

    /**
     * Outros
     *
     * @param formaPagamento
     * @param valor
     * @throws IOException
     * @throws IllegalAccessException
     */
    public Pagamento(FormaPagamento formaPagamento, Number valor) throws IOException, IllegalAccessException {
        this(formaPagamento, valor, null, null);
    }

    /**
     * Pix Dinâmico
     *
     * @param formaPagamento
     * @param valor
     * @param cAut
     * @throws IOException
     * @throws IllegalAccessException
     */
    public Pagamento(FormaPagamento formaPagamento, Number valor, String cAut) throws IOException, IllegalAccessException {
        this(formaPagamento, valor, cAut, null);
    }

    /**
     * Cartões Deb/Cred
     *
     * @param formaPagamento
     * @param valor
     * @param cartao
     * @param cAut
     * @throws IOException
     * @throws IllegalAccessException
     */
    public Pagamento(FormaPagamento formaPagamento, Number valor, String cAut, Cartao cartao) throws IOException, IllegalAccessException {
        this.tPag = formaPagamento.getCodigo();
        this.vPag = NumberFormatter.format2Digits(valor);
        if (cAut != null) {
            this.card = new TNFe.Card();
            this.card.setCAut(cAut);
            this.card.setTpIntegra(Contribuinte.getTpIntegra());
            if (cartao != null) {
                this.card.setTBand(cartao.getCodigo());
                this.card.setCNPJ(cartao.getCNPJ());
            }
        }
    }

}
