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
 * Tipo Retorno de Pedido de Consulta da Situação Atual da Nota Fiscal Eletrônica
 */
public class TRetConsSitNFe extends br.com.ctecinf.SimpleXML {

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

    @br.com.ctecinf.SimpleXML.Name("chNFe")
    protected String chNFe;

    @br.com.ctecinf.SimpleXML.Name("protNFe")
    protected TProtNFe protNFe;

    @br.com.ctecinf.SimpleXML.Name("retCancNFe")
    protected TRetCancNFe retCancNFe;

    @br.com.ctecinf.SimpleXML.Name("procEventoNFe")
    protected java.util.List<TProcEvento> procEventoNFe;

    public TRetConsSitNFe() {
        super("retConsSitNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
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
     * AAAA-MM-DDTHH:MM:SSTZD
     *
     * @return String
     */
    public final String getDhRecbto() {
        return this.dhRecbto;
    }

    /**
     * AAAA-MM-DDTHH:MM:SSTZD
     *
     * @param dhRecbto
     */
    public final void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    /**
     * Chaves de acesso da NF-e consultada
     *
     * @return String
     */
    public final String getChNFe() {
        return this.chNFe;
    }

    /**
     * Chaves de acesso da NF-e consultada
     *
     * @param chNFe
     */
    public final void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    /**
     * Protocolo de autorização de uso da NF-e
     *
     * @return TProtNFe
     */
    public final TProtNFe getProtNFe() {
        return this.protNFe;
    }

    /**
     * Protocolo de autorização de uso da NF-e
     *
     * @param protNFe
     */
    public final void setProtNFe(TProtNFe protNFe) {
        this.protNFe = protNFe;
    }

    /**
     * Protocolo de homologação de cancelamento de uso da NF-e
     *
     * @return TRetCancNFe
     */
    public final TRetCancNFe getRetCancNFe() {
        return this.retCancNFe;
    }

    /**
     * Protocolo de homologação de cancelamento de uso da NF-e
     *
     * @param retCancNFe
     */
    public final void setRetCancNFe(TRetCancNFe retCancNFe) {
        this.retCancNFe = retCancNFe;
    }

    /**
     * Protocolo de registro de evento da NF-e
     *
     * @return java.util.List
     */
    public final java.util.List<TProcEvento> getProcEventoNFe() {
        if(this.procEventoNFe == null) {
            this.procEventoNFe = new java.util.ArrayList();
        }
        return this.procEventoNFe;
    }

    /**
     * Protocolo de registro de evento da NF-e
     *
     * @param procEventoNFe
     */
    public final void setProcEventoNFe(java.util.List<TProcEvento> procEventoNFe) {
        this.procEventoNFe = procEventoNFe;
    }

}