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
 * Tipo Pedido de Consulta do Status do Serviço
 */
public class TConsStatServ extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("tpAmb")
    protected String tpAmb;

    @br.com.ctecinf.SimpleXML.Name("cUF")
    protected String cUF;

    @br.com.ctecinf.SimpleXML.Name("xServ")
    protected String xServ;

    public TConsStatServ() {
        super("consStatServ", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
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
     * Sigla da UF consultada
     *
     * @return String
     */
    public final String getCUF() {
        return this.cUF;
    }

    /**
     * Sigla da UF consultada
     *
     * @param cUF
     */
    public final void setCUF(String cUF) {
        this.cUF = cUF;
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

}