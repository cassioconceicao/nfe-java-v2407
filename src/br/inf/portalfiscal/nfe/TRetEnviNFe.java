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
 * Tipo Retorno do Pedido de Autorização da Nota Fiscal Eletrônica
 */
public class TRetEnviNFe extends br.com.ctecinf.SimpleXML {

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

    @br.com.ctecinf.SimpleXML.Name("dhRecbto")
    protected String dhRecbto;

    @br.com.ctecinf.SimpleXML.Name("infRec")
    protected InfRec infRec;

    @br.com.ctecinf.SimpleXML.Name("protNFe")
    protected TProtNFe protNFe;

    public TRetEnviNFe() {
        super("retEnviNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
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
     * Versão do Aplicativo que recebeu o Lote.
     *
     * @return String
     */
    public final String getVerAplic() {
        return this.verAplic;
    }

    /**
     * Versão do Aplicativo que recebeu o Lote.
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
     * Data e hora do recebimento, no formato AAAA-MM-DDTHH:MM:SSTZD
     *
     * @return String
     */
    public final String getDhRecbto() {
        return this.dhRecbto;
    }

    /**
     * Data e hora do recebimento, no formato AAAA-MM-DDTHH:MM:SSTZD
     *
     * @param dhRecbto
     */
    public final void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    /**
     * Dados do Recibo do Lote
     *
     * @return InfRec
     */
    public final InfRec getInfRec() {
        return this.infRec;
    }

    /**
     * Dados do Recibo do Lote
     *
     * @param infRec
     */
    public final void setInfRec(InfRec infRec) {
        this.infRec = infRec;
    }

    /**
     * Protocolo de status resultado do processamento sincrono da NFC-e
     *
     * @return TProtNFe
     */
    public final TProtNFe getProtNFe() {
        return this.protNFe;
    }

    /**
     * Protocolo de status resultado do processamento sincrono da NFC-e
     *
     * @param protNFe
     */
    public final void setProtNFe(TProtNFe protNFe) {
        this.protNFe = protNFe;
    }

    /**
     * Dados do Recibo do Lote
     */
    public static class InfRec extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nRec")
        protected String nRec;

        @br.com.ctecinf.SimpleXML.Name("tMed")
        protected String tMed;

        public InfRec() {
            super("infRec");
        }

        /**
         * Número do Recibo
         *
         * @return String
         */
        public final String getNRec() {
            return this.nRec;
        }

        /**
         * Número do Recibo
         *
         * @param nRec
         */
        public final void setNRec(String nRec) {
            this.nRec = nRec;
        }

        /**
         * Tempo médio de resposta do serviço (em segundos) dos últimos 5 minutos
         *
         * @return String
         */
        public final String getTMed() {
            return this.tMed;
        }

        /**
         * Tempo médio de resposta do serviço (em segundos) dos últimos 5 minutos
         *
         * @param tMed
         */
        public final void setTMed(String tMed) {
            this.tMed = tMed;
        }

    }

}