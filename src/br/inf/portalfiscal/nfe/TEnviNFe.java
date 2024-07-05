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
 * Tipo Pedido de Concessão de Autorização da Nota Fiscal Eletrônica
 */
public class TEnviNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("idLote")
    protected String idLote;

    @br.com.ctecinf.SimpleXML.Name("indSinc")
    protected String indSinc;

    @br.com.ctecinf.SimpleXML.Name("NFe")
    protected java.util.List<TNFe> nFe;

    public TEnviNFe() {
        super("enviNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
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
     * Indicador de processamento síncrono. 0=NÃO; 1=SIM=Síncrono
     *
     * @return String
     */
    public final String getIndSinc() {
        return this.indSinc;
    }

    /**
     * Indicador de processamento síncrono. 0=NÃO; 1=SIM=Síncrono
     *
     * @param indSinc
     */
    public final void setIndSinc(String indSinc) {
        this.indSinc = indSinc;
    }

    public final java.util.List<TNFe> getNFe() {
        if(this.nFe == null) {
            this.nFe = new java.util.ArrayList();
        }
        return this.nFe;
    }

    public final void setNFe(java.util.List<TNFe> nFe) {
        this.nFe = nFe;
    }

}