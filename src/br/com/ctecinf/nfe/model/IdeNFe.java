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
import br.com.ctecinf.Pad;
import br.com.ctecinf.nfe.Constants;
import br.inf.portalfiscal.nfe.TNFe;
import java.io.IOException;

/**
 * <b>DANFE</b><br>
 * 0: Sem geração de DANFE<br>
 * 1: DANFE normal, Retrato<br>
 * 2: DANFE normal, Paisagem<br>
 * 3: DANFE Simplificado<br>
 * 4: DANFE NFC-e<br>
 * 5: DANFE NFC-e em mensagem eletrônica (o envio de mensagem eletrônica pode
 * ser feita de forma simultânea com a impressão do DANFE; usar o tpImp=5 quando
 * esta for a única forma de disponibilização do DANFE)
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class IdeNFe extends TNFe.Ide {

    /**
     *
     * @param nnf
     * @param naturezaOperacao
     * @param mod
     * @param danfe<br>
     * 0: Sem geração de DANFE<br>
     * 1: DANFE normal, Retrato<br>
     * 2: DANFE normal, Paisagem<br>
     * 3: DANFE Simplificado<br>
     * 4: DANFE NFC-e<br>
     * 5: DANFE NFC-e em mensagem eletrônica (o envio de mensagem eletrônica
     * pode ser feita de forma simultânea com a impressão do DANFE; usar o
     * tpImp=5 quando esta for a única forma de disponibilização do DANFE)
     * @throws IOException
     * @throws IllegalAccessException
     */
    public IdeNFe(Number nnf, NaturezaOperacao naturezaOperacao, Number mod, Integer danfe) throws IOException, IllegalAccessException {

        /**
         * Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do
         * IBGE de código de unidades da federação (Seção 8.1 do MOC – Visão
         * Geral, Tabela de UF, Município e País)
         */
        cUF = Contribuinte.getMunicipioUFCodigo();

        /**
         * Código numérico que compõe a Chave de Acesso. Número aleatório gerado
         * pelo emitente para cada NF-e para evitar acessos indevidos da NF-e.
         * (v2.0)
         */
        cNF = Pad.left(String.valueOf((int) ((double) Math.random() * 99999999)), 8, '0');

        /**
         * Informar a natureza da operação de que decorrer a saída ou a entrada,
         * tais como: venda, compra, transferência, devolução, importação,
         * consignação, remessa (para fins de demonstração, de industrialização
         * ou outra), conforme previsto na alínea 'i', inciso I, art. 19 do
         * CONVÊNIO S/Nº, de 15 de dezembro de 1970
         */
        natOp = naturezaOperacao.toString();

        /**
         * 55=NF-e emitida em substituição ao modelo 1 ou 1A; 65=NFC-e,utilizada
         * nas operações de venda no varejo (a critério da UF aceitar este
         * modelo de documento).
         */
        this.mod = String.valueOf(mod);

        /**
         * Série do Documento Fiscal, preencher com zeros na hipótese de a NF-e
         * não possuir série. Série na faixa: - [000-889]: Aplicativo do
         * Contribuinte; Emitente=CNPJ; Assinatura pelo e-CNPJ do contribuinte
         * (procEmi<>1,2); - [890-899]: Emissão no site do Fisco (NFA-e -
         * Avulsa); Emitente= CNPJ / CPF; Assinatura pelo e-CNPJ da SEFAZ
         * (procEmi=1); - [900-909]: Emissão no site do Fisco (NFA-e); Emitente=
         * CNPJ; Assinatura pelo e-CNPJ da SEFAZ (procEmi=1), ou Assinatura pelo
         * e-CNPJ do contribuinte (procEmi=2); - [910-919]: Emissão no site do
         * Fisco (NFA-e); Emitente= CPF; Assinatura pelo e-CNPJ da SEFAZ
         * (procEmi=1), ou Assinatura pelo e-CPF do contribuinte (procEmi=2); -
         * [920-969]: Aplicativo do Contribuinte; Emitente=CPF; Assinatura pelo
         * e-CPF do contribuinte (procEmi<>1,2); (Atualizado NT 2018/001)
         */
        serie = Contribuinte.getSerie();

        /**
         * Número do Documento Fiscal.
         */
        this.nNF = String.valueOf(nnf);

        /**
         * 0=Entrada; 1=Saída
         */
        tpNF = String.valueOf(1);

        /**
         * 1=Operação interna; 2=Operação interestadual; 3=Operação com exterior
         */
        idDest = String.valueOf(1);

        /**
         * Informar o município de ocorrência do fato gerador do ICMS. Utilizar
         * a Tabela do IBGE (Seção 8.2 do MOC – Visão Geral, Tabela de UF,
         * Município e País)
         */
        cMunFG = Contribuinte.getMunicipioCodigo();

        /**
         * Formato de Impressão do DANFE
         */
        tpImp = String.valueOf(danfe);

        /**
         * 1=Emissão normal (não em contingência); 2=Contingência FS-IA, com
         * impressão do DANFE em Formulário de Segurança - Impressor Autônomo;
         * 3=Contingência SCAN (Sistema de Contingência do Ambiente Nacional);
         * *Desativado * NT 2015/002 4=Contingência EPEC (Evento Prévio da
         * Emissão em Contingência); 5=Contingência FS-DA, com impressão do
         * DANFE em Formulário de Segurança - Documento Auxiliar; 6=Contingência
         * SVC-AN (SEFAZ Virtual de Contingência do AN); 7=Contingência SVC-RS
         * (SEFAZ Virtual de Contingência do RS); 9=Contingência off-line da
         * NFC-e; Observação: Para a NFC-e somente é válida a opção de
         * contingência: 9-Contingência Off-Line e, a critério da UF, opção
         * 4-Contingência EPEC. (NT 2015/002)
         */
        tpEmis = String.valueOf(1);

        /**
         * 1=Produção; 2=Homologação
         */
        tpAmb = Contribuinte.getTpAmb();

        /**
         * 1=NF-e normal; 2=NF-e complementar; 3=NF-e de ajuste; 4=Devolução de
         * mercadoria.
         */
        finNFe = String.valueOf(1);

        /**
         * 0=Normal; 1=Consumidor final;
         */
        indFinal = String.valueOf(1);

        /**
         * 0=Não se aplica (por exemplo, Nota Fiscal complementar ou de ajuste);
         * 1=Operação presencial; 2=Operação não presencial, pela Internet;
         * 3=Operação não presencial, Teleatendimento; 4=NFC-e em operação com
         * entrega a domicílio; 5=Operação presencial, fora do estabelecimento;
         * (incluído NT2016.002) 9=Operação não presencial, outros.
         */
        indPres = String.valueOf(1);

        /**
         * 0=Emissão de NF-e com aplicativo do contribuinte; 1=Emissão de NF-e
         * avulsa pelo Fisco; 2=Emissão de NF-e avulsa, pelo contribuinte com
         * seu certificado digital, através do site do Fisco; 3=Emissão NF-e
         * pelo contribuinte com aplicativo fornecido pelo Fisco.
         */
        procEmi = String.valueOf(0);

        /**
         * Informar a versão do aplicativo emissor de NF-e.
         */
        verProc = Constants.VER_PROC;
    }

}
