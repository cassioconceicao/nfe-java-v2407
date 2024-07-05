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
 * Tipo Pedido de inutilzação de númeração de  NF-e processado
 */
public class TProcInutNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("inutNFe")
    protected TInutNFe inutNFe;

    @br.com.ctecinf.SimpleXML.Name("retInutNFe")
    protected TRetInutNFe retInutNFe;

    public TProcInutNFe() {
        super("procInutNFe", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    public final TInutNFe getInutNFe() {
        return this.inutNFe;
    }

    public final void setInutNFe(TInutNFe inutNFe) {
        this.inutNFe = inutNFe;
    }

    public final TRetInutNFe getRetInutNFe() {
        return this.retInutNFe;
    }

    public final void setRetInutNFe(TRetInutNFe retInutNFe) {
        this.retInutNFe = retInutNFe;
    }

}