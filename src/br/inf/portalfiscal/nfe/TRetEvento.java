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
 * Tipo retorno do Evento
 */
public class TRetEvento extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infEvento")
    protected InfEvento infEvento;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TRetEvento() {
        super("retEvento", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    public final InfEvento getInfEvento() {
        return this.infEvento;
    }

    public final void setInfEvento(InfEvento infEvento) {
        this.infEvento = infEvento;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setSignature(String signature) {
        this.signature = signature;
    }

    public static class InfEvento extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpAmb")
        protected String tpAmb;

        @br.com.ctecinf.SimpleXML.Name("verAplic")
        protected String verAplic;

        @br.com.ctecinf.SimpleXML.Name("cOrgao")
        protected String cOrgao;

        @br.com.ctecinf.SimpleXML.Name("cStat")
        protected String cStat;

        @br.com.ctecinf.SimpleXML.Name("xMotivo")
        protected String xMotivo;

        @br.com.ctecinf.SimpleXML.Name("chNFe")
        protected String chNFe;

        @br.com.ctecinf.SimpleXML.Name("tpEvento")
        protected String tpEvento;

        @br.com.ctecinf.SimpleXML.Name("xEvento")
        protected String xEvento;

        @br.com.ctecinf.SimpleXML.Name("nSeqEvento")
        protected String nSeqEvento;

        @br.com.ctecinf.SimpleXML.Name("CNPJDest")
        protected String cNPJDest;

        @br.com.ctecinf.SimpleXML.Name("CPFDest")
        protected String cPFDest;

        @br.com.ctecinf.SimpleXML.Name("emailDest")
        protected String emailDest;

        @br.com.ctecinf.SimpleXML.Name("dhRegEvento")
        protected String dhRegEvento;

        @br.com.ctecinf.SimpleXML.Name("nProt")
        protected String nProt;

        public InfEvento() {
            super("infEvento", "Id");
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
         * Versão do Aplicativo que recebeu o Evento
         *
         * @return String
         */
        public final String getVerAplic() {
            return this.verAplic;
        }

        /**
         * Versão do Aplicativo que recebeu o Evento
         *
         * @param verAplic
         */
        public final void setVerAplic(String verAplic) {
            this.verAplic = verAplic;
        }

        /**
         * Código do órgão de recepção do Evento. Utilizar a Tabela do IBGE extendida, utilizar 91 para identificar o Ambiente Nacional
         *
         * @return String
         */
        public final String getCOrgao() {
            return this.cOrgao;
        }

        /**
         * Código do órgão de recepção do Evento. Utilizar a Tabela do IBGE extendida, utilizar 91 para identificar o Ambiente Nacional
         *
         * @param cOrgao
         */
        public final void setCOrgao(String cOrgao) {
            this.cOrgao = cOrgao;
        }

        /**
         * Código do status da registro do Evento
         *
         * @return String
         */
        public final String getCStat() {
            return this.cStat;
        }

        /**
         * Código do status da registro do Evento
         *
         * @param cStat
         */
        public final void setCStat(String cStat) {
            this.cStat = cStat;
        }

        /**
         * Descrição literal do status do registro do Evento
         *
         * @return String
         */
        public final String getXMotivo() {
            return this.xMotivo;
        }

        /**
         * Descrição literal do status do registro do Evento
         *
         * @param xMotivo
         */
        public final void setXMotivo(String xMotivo) {
            this.xMotivo = xMotivo;
        }

        /**
         * Chave de Acesso NF-e vinculada
         *
         * @return String
         */
        public final String getChNFe() {
            return this.chNFe;
        }

        /**
         * Chave de Acesso NF-e vinculada
         *
         * @param chNFe
         */
        public final void setChNFe(String chNFe) {
            this.chNFe = chNFe;
        }

        /**
         * Tipo do Evento vinculado
         *
         * @return String
         */
        public final String getTpEvento() {
            return this.tpEvento;
        }

        /**
         * Tipo do Evento vinculado
         *
         * @param tpEvento
         */
        public final void setTpEvento(String tpEvento) {
            this.tpEvento = tpEvento;
        }

        /**
         * Descrição do Evento
         *
         * @return String
         */
        public final String getXEvento() {
            return this.xEvento;
        }

        /**
         * Descrição do Evento
         *
         * @param xEvento
         */
        public final void setXEvento(String xEvento) {
            this.xEvento = xEvento;
        }

        /**
         * Seqüencial do evento
         *
         * @return String
         */
        public final String getNSeqEvento() {
            return this.nSeqEvento;
        }

        /**
         * Seqüencial do evento
         *
         * @param nSeqEvento
         */
        public final void setNSeqEvento(String nSeqEvento) {
            this.nSeqEvento = nSeqEvento;
        }

        /**
         * CNPJ Destinatário
         *
         * @return String
         */
        public final String getCNPJDest() {
            return this.cNPJDest;
        }

        /**
         * CNPJ Destinatário
         *
         * @param cNPJDest
         */
        public final void setCNPJDest(String cNPJDest) {
            this.cNPJDest = cNPJDest;
        }

        /**
         * CPF Destiantário
         *
         * @return String
         */
        public final String getCPFDest() {
            return this.cPFDest;
        }

        /**
         * CPF Destiantário
         *
         * @param cPFDest
         */
        public final void setCPFDest(String cPFDest) {
            this.cPFDest = cPFDest;
        }

        /**
         * email do destinatário
         *
         * @return String
         */
        public final String getEmailDest() {
            return this.emailDest;
        }

        /**
         * email do destinatário
         *
         * @param emailDest
         */
        public final void setEmailDest(String emailDest) {
            this.emailDest = emailDest;
        }

        /**
         * Data e Hora de do recebimento do evento ou do registro do evento formato UTC AAAA-MM-DDThh:mm:ssTZD.
         *
         * @return String
         */
        public final String getDhRegEvento() {
            return this.dhRegEvento;
        }

        /**
         * Data e Hora de do recebimento do evento ou do registro do evento formato UTC AAAA-MM-DDThh:mm:ssTZD.
         *
         * @param dhRegEvento
         */
        public final void setDhRegEvento(String dhRegEvento) {
            this.dhRegEvento = dhRegEvento;
        }

        /**
         * Número do protocolo de registro do evento
         *
         * @return String
         */
        public final String getNProt() {
            return this.nProt;
        }

        /**
         * Número do protocolo de registro do evento
         *
         * @param nProt
         */
        public final void setNProt(String nProt) {
            this.nProt = nProt;
        }

    }

}