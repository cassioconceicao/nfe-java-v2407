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
 * Tipo Retorno do Pedido de  Consulta do Recido do Lote de Notas Fiscais Eletrônicas
 */
public class TRetConsReciNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("tpAmb")
    protected String tpAmb;

    @br.com.ctecinf.SimpleXML.Name("verAplic")
    protected String verAplic;

    @br.com.ctecinf.SimpleXML.Name("nRec")
    protected String nRec;

    @br.com.ctecinf.SimpleXML.Name("cStat")
    protected String cStat;

    @br.com.ctecinf.SimpleXML.Name("xMotivo")
    protected String xMotivo;

    @br.com.ctecinf.SimpleXML.Name("cUF")
    protected String cUF;

    @br.com.ctecinf.SimpleXML.Name("dhRecbto")
    protected String dhRecbto;

    @br.com.ctecinf.SimpleXML.Name("cMsg")
    protected String cMsg;

    @br.com.ctecinf.SimpleXML.Name("xMsg")
    protected String xMsg;

    @br.com.ctecinf.SimpleXML.Name("protNFe")
    protected java.util.List<TProtNFe> protNFe;

    public TRetConsReciNFe() {
        super("retConsReciNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
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
     * Número do Recibo Consultado
     *
     * @return String
     */
    public final String getNRec() {
        return this.nRec;
    }

    /**
     * Número do Recibo Consultado
     *
     * @param nRec
     */
    public final void setNRec(String nRec) {
        this.nRec = nRec;
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
     * Data e hora de processamento, no formato AAAA-MM-DDTHH:MM:SSTZD. Em caso de Rejeição, com data e hora do recebimento do Lote de NF-e enviado.
     *
     * @return String
     */
    public final String getDhRecbto() {
        return this.dhRecbto;
    }

    /**
     * Data e hora de processamento, no formato AAAA-MM-DDTHH:MM:SSTZD. Em caso de Rejeição, com data e hora do recebimento do Lote de NF-e enviado.
     *
     * @param dhRecbto
     */
    public final void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    /**
     * Código da Mensagem (v2.0) <br>
     * alterado para tamanho variavel 1-4. (NT2011/004)
     *
     * @return String
     */
    public final String getCMsg() {
        return this.cMsg;
    }

    /**
     * Código da Mensagem (v2.0) <br>
     * alterado para tamanho variavel 1-4. (NT2011/004)
     *
     * @param cMsg
     */
    public final void setCMsg(String cMsg) {
        this.cMsg = cMsg;
    }

    /**
     * Mensagem da SEFAZ para o emissor. (v2.0)
     *
     * @return String
     */
    public final String getXMsg() {
        return this.xMsg;
    }

    /**
     * Mensagem da SEFAZ para o emissor. (v2.0)
     *
     * @param xMsg
     */
    public final void setXMsg(String xMsg) {
        this.xMsg = xMsg;
    }

    /**
     * Protocolo de status resultado do processamento da NF-e
     *
     * @return java.util.List
     */
    public final java.util.List<TProtNFe> getProtNFe() {
        if(this.protNFe == null) {
            this.protNFe = new java.util.ArrayList();
        }
        return this.protNFe;
    }

    /**
     * Protocolo de status resultado do processamento da NF-e
     *
     * @param protNFe
     */
    public final void setProtNFe(java.util.List<TProtNFe> protNFe) {
        this.protNFe = protNFe;
    }

}