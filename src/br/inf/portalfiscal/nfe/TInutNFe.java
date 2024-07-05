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
 * Tipo Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
 */
public class TInutNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infInut")
    protected InfInut infInut;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TInutNFe() {
        super("inutNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    /**
     * Dados do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
     *
     * @return InfInut
     */
    public final InfInut getInfInut() {
        return this.infInut;
    }

    /**
     * Dados do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
     *
     * @param infInut
     */
    public final void setInfInut(InfInut infInut) {
        this.infInut = infInut;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Dados do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
     */
    public static class InfInut extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpAmb")
        protected String tpAmb;

        @br.com.ctecinf.SimpleXML.Name("xServ")
        protected String xServ;

        @br.com.ctecinf.SimpleXML.Name("cUF")
        protected String cUF;

        @br.com.ctecinf.SimpleXML.Name("ano")
        protected String ano;

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("mod")
        protected String mod;

        @br.com.ctecinf.SimpleXML.Name("serie")
        protected String serie;

        @br.com.ctecinf.SimpleXML.Name("nNFIni")
        protected String nNFIni;

        @br.com.ctecinf.SimpleXML.Name("nNFFin")
        protected String nNFFin;

        @br.com.ctecinf.SimpleXML.Name("xJust")
        protected String xJust;

        public InfInut() {
            super("infInut", "Id");
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
         * Serviço Solicitado
         *
         * @return String
         */
        public final String getXServ() {
            return this.xServ;
        }

        /**
         * Serviço Solicitado
         *
         * @param xServ
         */
        public final void setXServ(String xServ) {
            this.xServ = xServ;
        }

        /**
         * Código da UF do emitente
         *
         * @return String
         */
        public final String getCUF() {
            return this.cUF;
        }

        /**
         * Código da UF do emitente
         *
         * @param cUF
         */
        public final void setCUF(String cUF) {
            this.cUF = cUF;
        }

        /**
         * Ano de inutilização da numeração
         *
         * @return String
         */
        public final String getAno() {
            return this.ano;
        }

        /**
         * Ano de inutilização da numeração
         *
         * @param ano
         */
        public final void setAno(String ano) {
            this.ano = ano;
        }

        /**
         * CNPJ do emitente
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do emitente
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Modelo da NF-e (55, 65 etc.)
         *
         * @return String
         */
        public final String getMod() {
            return this.mod;
        }

        /**
         * Modelo da NF-e (55, 65 etc.)
         *
         * @param mod
         */
        public final void setMod(String mod) {
            this.mod = mod;
        }

        /**
         * Série da NF-e
         *
         * @return String
         */
        public final String getSerie() {
            return this.serie;
        }

        /**
         * Série da NF-e
         *
         * @param serie
         */
        public final void setSerie(String serie) {
            this.serie = serie;
        }

        /**
         * Número da NF-e inicial
         *
         * @return String
         */
        public final String getNNFIni() {
            return this.nNFIni;
        }

        /**
         * Número da NF-e inicial
         *
         * @param nNFIni
         */
        public final void setNNFIni(String nNFIni) {
            this.nNFIni = nNFIni;
        }

        /**
         * Número da NF-e final
         *
         * @return String
         */
        public final String getNNFFin() {
            return this.nNFFin;
        }

        /**
         * Número da NF-e final
         *
         * @param nNFFin
         */
        public final void setNNFFin(String nNFFin) {
            this.nNFFin = nNFFin;
        }

        /**
         * Justificativa do pedido de inutilização
         *
         * @return String
         */
        public final String getXJust() {
            return this.xJust;
        }

        /**
         * Justificativa do pedido de inutilização
         *
         * @param xJust
         */
        public final void setXJust(String xJust) {
            this.xJust = xJust;
        }

    }

}