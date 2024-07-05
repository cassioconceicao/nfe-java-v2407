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
 * Tipo retorno Pedido de Cancelamento da Nota Fiscal Eletrônica
 */
public class TRetCancNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infCanc")
    protected InfCanc infCanc;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TRetCancNFe() {
        super("retCancNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    /**
     * Dados do Resultado do Pedido de Cancelamento da Nota Fiscal Eletrônica
     *
     * @return InfCanc
     */
    public final InfCanc getInfCanc() {
        return this.infCanc;
    }

    /**
     * Dados do Resultado do Pedido de Cancelamento da Nota Fiscal Eletrônica
     *
     * @param infCanc
     */
    public final void setInfCanc(InfCanc infCanc) {
        this.infCanc = infCanc;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Dados do Resultado do Pedido de Cancelamento da Nota Fiscal Eletrônica
     */
    public static class InfCanc extends br.com.ctecinf.SimpleXML {

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

        @br.com.ctecinf.SimpleXML.Name("chNFe")
        protected String chNFe;

        @br.com.ctecinf.SimpleXML.Name("dhRecbto")
        protected String dhRecbto;

        @br.com.ctecinf.SimpleXML.Name("nProt")
        protected String nProt;

        public InfCanc() {
            super("infCanc", "Id");
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
         * Versão do Aplicativo que processou o pedido de cancelamento
         *
         * @return String
         */
        public final String getVerAplic() {
            return this.verAplic;
        }

        /**
         * Versão do Aplicativo que processou o pedido de cancelamento
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
         * código da UF de atendimento
         *
         * @return String
         */
        public final String getCUF() {
            return this.cUF;
        }

        /**
         * código da UF de atendimento
         *
         * @param cUF
         */
        public final void setCUF(String cUF) {
            this.cUF = cUF;
        }

        /**
         * Chaves de acesso da NF-e, compostas por: UF do emitente, AAMM da emissão da NFe, CNPJ do emitente, modelo, série e número da NF-e e código numérico + DV.
         *
         * @return String
         */
        public final String getChNFe() {
            return this.chNFe;
        }

        /**
         * Chaves de acesso da NF-e, compostas por: UF do emitente, AAMM da emissão da NFe, CNPJ do emitente, modelo, série e número da NF-e e código numérico + DV.
         *
         * @param chNFe
         */
        public final void setChNFe(String chNFe) {
            this.chNFe = chNFe;
        }

        /**
         * Data e hora de recebimento, no formato AAAA-MM-DDTHH:MM:SS. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação.
         *
         * @return String
         */
        public final String getDhRecbto() {
            return this.dhRecbto;
        }

        /**
         * Data e hora de recebimento, no formato AAAA-MM-DDTHH:MM:SS. Deve ser preenchida com data e hora da gravação no Banco em caso de Confirmação.
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