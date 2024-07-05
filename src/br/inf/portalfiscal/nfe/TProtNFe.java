/*
 * Copyright (C) 2024 ctecinf.com.br
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
 *
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2407
 * @see http://ctecinf.com.br/
 *
 */

package br.inf.portalfiscal.nfe;

/**
 * Tipo Protocolo de status resultado do processamento da NF-e
 */
public class TProtNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infProt")
    protected InfProt infProt;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TProtNFe() {
        super("protNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    /**
     * Dados do protocolo de status
     *
     * @return InfProt
     */
    public final InfProt getInfProt() {
        return this.infProt;
    }

    /**
     * Dados do protocolo de status
     *
     * @param infProt
     */
    public final void setInfProt(InfProt infProt) {
        this.infProt = infProt;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Dados do protocolo de status
     */
    public static class InfProt extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpAmb")
        protected String tpAmb;

        @br.com.ctecinf.SimpleXML.Name("verAplic")
        protected String verAplic;

        @br.com.ctecinf.SimpleXML.Name("chNFe")
        protected String chNFe;

        @br.com.ctecinf.SimpleXML.Name("dhRecbto")
        protected String dhRecbto;

        @br.com.ctecinf.SimpleXML.Name("nProt")
        protected String nProt;

        @br.com.ctecinf.SimpleXML.Name("digVal")
        protected String digVal;

        @br.com.ctecinf.SimpleXML.Name("cStat")
        protected String cStat;

        @br.com.ctecinf.SimpleXML.Name("xMotivo")
        protected String xMotivo;

        @br.com.ctecinf.SimpleXML.Name("cMsg")
        protected String cMsg;

        @br.com.ctecinf.SimpleXML.Name("xMsg")
        protected String xMsg;

        public InfProt() {
            super("infProt", "Id");
        }

        public final void setId(String id) {
            this.setAttribute("Id", id);
        }

        /**
         * Identificação do Ambiente:<br>
         * 1 - Produção<br>
         * 2 - Homologação
         *
         * @return String
         */
        public final String getTpAmb() {
            return this.tpAmb;
        }

        /**
         * Identificação do Ambiente:<br>
         * 1 - Produção<br>
         * 2 - Homologação
         *
         * @param tpAmb
         */
        public final void setTpAmb(String tpAmb) {
            this.tpAmb = tpAmb;
        }

        /**
         * Versão do Aplicativo que processou a NF-e
         *
         * @return String
         */
        public final String getVerAplic() {
            return this.verAplic;
        }

        /**
         * Versão do Aplicativo que processou a NF-e
         *
         * @param verAplic
         */
        public final void setVerAplic(String verAplic) {
            this.verAplic = verAplic;
        }

        /**
         * Chaves de acesso da NF-e, compostas por: UF do emitente, AAMM da emissão da NFe, CNPJ do emitente, modelo, série e número da NF-e e código numérico+DV.
         *
         * @return String
         */
        public final String getChNFe() {
            return this.chNFe;
        }

        /**
         * Chaves de acesso da NF-e, compostas por: UF do emitente, AAMM da emissão da NFe, CNPJ do emitente, modelo, série e número da NF-e e código numérico+DV.
         *
         * @param chNFe
         */
        public final void setChNFe(String chNFe) {
            this.chNFe = chNFe;
        }

        /**
         * Data e hora de processamento, no formato AAAA-MM-DDTHH:MM:SSTZD. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação. Em caso de Rejeição, com data e hora do recebimento do Lote de NF-e enviado.
         *
         * @return String
         */
        public final String getDhRecbto() {
            return this.dhRecbto;
        }

        /**
         * Data e hora de processamento, no formato AAAA-MM-DDTHH:MM:SSTZD. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação. Em caso de Rejeição, com data e hora do recebimento do Lote de NF-e enviado.
         *
         * @param dhRecbto
         */
        public final void setDhRecbto(String dhRecbto) {
            this.dhRecbto = dhRecbto;
        }

        /**
         * Número do Protocolo de Status da NF-e. 1 posição (1 – Secretaria de Fazenda Estadual 2 – Receita Federal); 2 - códiga da UF - 2 posições ano; 10 seqüencial no ano.
         *
         * @return String
         */
        public final String getNProt() {
            return this.nProt;
        }

        /**
         * Número do Protocolo de Status da NF-e. 1 posição (1 – Secretaria de Fazenda Estadual 2 – Receita Federal); 2 - códiga da UF - 2 posições ano; 10 seqüencial no ano.
         *
         * @param nProt
         */
        public final void setNProt(String nProt) {
            this.nProt = nProt;
        }

        /**
         * Digest Value da NF-e processada. Utilizado para conferir a integridade da NF-e original.
         *
         * @return String
         */
        public final String getDigVal() {
            return this.digVal;
        }

        /**
         * Digest Value da NF-e processada. Utilizado para conferir a integridade da NF-e original.
         *
         * @param digVal
         */
        public final void setDigVal(String digVal) {
            this.digVal = digVal;
        }

        /**
         * Código do status da mensagem enviada.
         *
         * @return String
         */
        public final String getCStat() {
            return this.cStat;
        }

        /**
         * Código do status da mensagem enviada.
         *
         * @param cStat
         */
        public final void setCStat(String cStat) {
            this.cStat = cStat;
        }

        /**
         * Descrição literal do status do serviço solicitado.
         *
         * @return String
         */
        public final String getXMotivo() {
            return this.xMotivo;
        }

        /**
         * Descrição literal do status do serviço solicitado.
         *
         * @param xMotivo
         */
        public final void setXMotivo(String xMotivo) {
            this.xMotivo = xMotivo;
        }

        /**
         * Código da Mensagem.
         *
         * @return String
         */
        public final String getCMsg() {
            return this.cMsg;
        }

        /**
         * Código da Mensagem.
         *
         * @param cMsg
         */
        public final void setCMsg(String cMsg) {
            this.cMsg = cMsg;
        }

        /**
         * Mensagem da SEFAZ para o emissor.
         *
         * @return String
         */
        public final String getXMsg() {
            return this.xMsg;
        }

        /**
         * Mensagem da SEFAZ para o emissor.
         *
         * @param xMsg
         */
        public final void setXMsg(String xMsg) {
            this.xMsg = xMsg;
        }

    }

}