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
 * Tipo da NF-e processada
 */
public class TNfeProc extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("NFe")
    protected TNFe nFe;

    @br.com.ctecinf.SimpleXML.Name("protNFe")
    protected TProtNFe protNFe;

    public TNfeProc() {
        super("nfeProc", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    public final TNFe getNFe() {
        return this.nFe;
    }

    public final void setNFe(TNFe nFe) {
        this.nFe = nFe;
    }

    public final TProtNFe getProtNFe() {
        return this.protNFe;
    }

    public final void setProtNFe(TProtNFe protNFe) {
        this.protNFe = protNFe;
    }

}