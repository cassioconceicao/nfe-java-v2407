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
 * Tipo Retorno de Lote de Envio
 */
public class TRetEnvEvento extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("idLote")
    protected String idLote;

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

    @br.com.ctecinf.SimpleXML.Name("retEvento")
    protected java.util.List<TRetEvento> retEvento;

    public TRetEnvEvento() {
        super("retEnvEvento", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    public final String getIdLote() {
        return this.idLote;
    }

    public final void setIdLote(String idLote) {
        this.idLote = idLote;
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
     * Código do òrgao que registrou o Evento
     *
     * @return String
     */
    public final String getCOrgao() {
        return this.cOrgao;
    }

    /**
     * Código do òrgao que registrou o Evento
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

    public final java.util.List<TRetEvento> getRetEvento() {
        if(this.retEvento == null) {
            this.retEvento = new java.util.ArrayList();
        }
        return this.retEvento;
    }

    public final void setRetEvento(java.util.List<TRetEvento> retEvento) {
        this.retEvento = retEvento;
    }

}