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
 * Tipo Pedido de Consulta do Recido do Lote de Notas Fiscais Eletrônicas
 */
public class TConsReciNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("tpAmb")
    protected String tpAmb;

    @br.com.ctecinf.SimpleXML.Name("nRec")
    protected String nRec;

    public TConsReciNFe() {
        super("consReciNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
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

}