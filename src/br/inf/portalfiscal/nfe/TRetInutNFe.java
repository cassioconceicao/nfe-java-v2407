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
 * Tipo retorno do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
 */
public class TRetInutNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infInut")
    protected InfInut infInut;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TRetInutNFe() {
        super("retInutNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    /**
     * Dados do Retorno do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
     *
     * @return InfInut
     */
    public final InfInut getInfInut() {
        return this.infInut;
    }

    /**
     * Dados do Retorno do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
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
     * Dados do Retorno do Pedido de Inutilização de Numeração da Nota Fiscal Eletrônica
     */
    public static class InfInut extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpAmb")
        protected String tpAmb;

        @br.com.ctecinf.SimpleXML.Name("verAplic")
        protected String verAplic;

        @br.com.ctecinf.SimpleXML.Name("cStat")
        protected String cStat;

        @br.com.ctecinf.SimpleXML.Name("xMotivo")
        protected String xMotivo;

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

        @br.com.ctecinf.SimpleXML.Name("dhRecbto")
        protected String dhRecbto;

        @br.com.ctecinf.SimpleXML.Name("nProt")
        protected String nProt;

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
         * Código da UF que atendeu a solicitação
         *
         * @return String
         */
        public final String getCUF() {
            return this.cUF;
        }

        /**
         * Código da UF que atendeu a solicitação
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
         * Modelo da NF-e (55, etc.)
         *
         * @return String
         */
        public final String getMod() {
            return this.mod;
        }

        /**
         * Modelo da NF-e (55, etc.)
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
         * Data e hora de recebimento, no formato AAAA-MM-DDTHH:MM:SS. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação. Em caso de Rejeição, com data e hora do recebimento do Pedido de Inutilização.
         *
         * @return String
         */
        public final String getDhRecbto() {
            return this.dhRecbto;
        }

        /**
         * Data e hora de recebimento, no formato AAAA-MM-DDTHH:MM:SS. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação. Em caso de Rejeição, com data e hora do recebimento do Pedido de Inutilização.
         *
         * @param dhRecbto
         */
        public final void setDhRecbto(String dhRecbto) {
            this.dhRecbto = dhRecbto;
        }

        /**
         * Número do Protocolo de Status da NF-e. 1 posição (1 – Secretaria de Fazenda Estadual 2 – Receita Federal); 2 - código da UF - 2 posições ano; 10 seqüencial no ano.
         *
         * @return String
         */
        public final String getNProt() {
            return this.nProt;
        }

        /**
         * Número do Protocolo de Status da NF-e. 1 posição (1 – Secretaria de Fazenda Estadual 2 – Receita Federal); 2 - código da UF - 2 posições ano; 10 seqüencial no ano.
         *
         * @param nProt
         */
        public final void setNProt(String nProt) {
            this.nProt = nProt;
        }

    }

}