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
 * Tipo Evento
 */
public class TEvento extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infEvento")
    protected InfEvento infEvento;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TEvento() {
        super("evento", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
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

        @br.com.ctecinf.SimpleXML.Name("cOrgao")
        protected String cOrgao;

        @br.com.ctecinf.SimpleXML.Name("tpAmb")
        protected String tpAmb;

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("CPF")
        protected String cPF;

        @br.com.ctecinf.SimpleXML.Name("chNFe")
        protected String chNFe;

        @br.com.ctecinf.SimpleXML.Name("dhEvento")
        protected String dhEvento;

        @br.com.ctecinf.SimpleXML.Name("tpEvento")
        protected String tpEvento;

        @br.com.ctecinf.SimpleXML.Name("nSeqEvento")
        protected String nSeqEvento;

        @br.com.ctecinf.SimpleXML.Name("verEvento")
        protected String verEvento;

        @br.com.ctecinf.SimpleXML.Name("detEvento")
        protected DetEvento detEvento;

        public InfEvento() {
            super("infEvento", "Id");
        }

        /**
         * Identificador da TAG a ser assinada, a regra de formação do Id é:<br>
         * “ID” + tpEvento +  chave da NF-e + nSeqEvento
         *
         * @param id
         */
        public final void setId(String id) {
            this.setAttribute("Id", id);
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
         * CNPJ
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * CPF
         *
         * @return String
         */
        public final String getCPF() {
            return this.cPF;
        }

        /**
         * CPF
         *
         * @param cPF
         */
        public final void setCPF(String cPF) {
            this.cPF = cPF;
        }

        /**
         * Chave de Acesso da NF-e vinculada ao evento
         *
         * @return String
         */
        public final String getChNFe() {
            return this.chNFe;
        }

        /**
         * Chave de Acesso da NF-e vinculada ao evento
         *
         * @param chNFe
         */
        public final void setChNFe(String chNFe) {
            this.chNFe = chNFe;
        }

        /**
         * Data e Hora do Evento, formato UTC (AAAA-MM-DDThh:mm:ssTZD, onde TZD = +hh:mm ou -hh:mm)
         *
         * @return String
         */
        public final String getDhEvento() {
            return this.dhEvento;
        }

        /**
         * Data e Hora do Evento, formato UTC (AAAA-MM-DDThh:mm:ssTZD, onde TZD = +hh:mm ou -hh:mm)
         *
         * @param dhEvento
         */
        public final void setDhEvento(String dhEvento) {
            this.dhEvento = dhEvento;
        }

        /**
         * Tipo do Evento
         *
         * @return String
         */
        public final String getTpEvento() {
            return this.tpEvento;
        }

        /**
         * Tipo do Evento
         *
         * @param tpEvento
         */
        public final void setTpEvento(String tpEvento) {
            this.tpEvento = tpEvento;
        }

        /**
         * Seqüencial do evento para o mesmo tipo de evento.  Para maioria dos eventos será 1, nos casos em que possa existir mais de um evento, como é o caso da carta de correção, o autor do evento deve numerar de forma seqüencial.
         *
         * @return String
         */
        public final String getNSeqEvento() {
            return this.nSeqEvento;
        }

        /**
         * Seqüencial do evento para o mesmo tipo de evento.  Para maioria dos eventos será 1, nos casos em que possa existir mais de um evento, como é o caso da carta de correção, o autor do evento deve numerar de forma seqüencial.
         *
         * @param nSeqEvento
         */
        public final void setNSeqEvento(String nSeqEvento) {
            this.nSeqEvento = nSeqEvento;
        }

        /**
         * Versão do Tipo do Evento
         *
         * @return String
         */
        public final String getVerEvento() {
            return this.verEvento;
        }

        /**
         * Versão do Tipo do Evento
         *
         * @param verEvento
         */
        public final void setVerEvento(String verEvento) {
            this.verEvento = verEvento;
        }

        /**
         * Schema XML de validação do evento do cancelamento 1101111
         *
         * @return DetEvento
         */
        public final DetEvento getDetEvento() {
            return this.detEvento;
        }

        /**
         * Schema XML de validação do evento do cancelamento 1101111
         *
         * @param detEvento
         */
        public final void setDetEvento(DetEvento detEvento) {
            this.detEvento = detEvento;
        }

    }

    /**
     * Schema XML de validação do evento do cancelamento 1101111
     */
    public static class DetEvento extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("descEvento")
        protected String descEvento;

        @br.com.ctecinf.SimpleXML.Name("nProt")
        protected String nProt;

        @br.com.ctecinf.SimpleXML.Name("xJust")
        protected String xJust;

        public DetEvento() {
            super("detEvento", "versao");
        }

        public final void setVersao(String versao) {
            this.setAttribute("versao", versao);
        }

        /**
         * Descrição do Evento - “Cancelamento”
         *
         * @return String
         */
        public final String getDescEvento() {
            return this.descEvento;
        }

        /**
         * Descrição do Evento - “Cancelamento”
         *
         * @param descEvento
         */
        public final void setDescEvento(String descEvento) {
            this.descEvento = descEvento;
        }

        /**
         * Número do Protocolo de Status da NF-e. 1 posição (1 – Secretaria de Fazenda Estadual 2 – Receita Federal); 2 posições ano; 10 seqüencial no ano.
         *
         * @return String
         */
        public final String getNProt() {
            return this.nProt;
        }

        /**
         * Número do Protocolo de Status da NF-e. 1 posição (1 – Secretaria de Fazenda Estadual 2 – Receita Federal); 2 posições ano; 10 seqüencial no ano.
         *
         * @param nProt
         */
        public final void setNProt(String nProt) {
            this.nProt = nProt;
        }

        /**
         * Justificativa do cancelamento
         *
         * @return String
         */
        public final String getXJust() {
            return this.xJust;
        }

        /**
         * Justificativa do cancelamento
         *
         * @param xJust
         */
        public final void setXJust(String xJust) {
            this.xJust = xJust;
        }

    }

}