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
 * Tipo procEvento
 */
public class TProcEvento extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("evento")
    protected TEvento evento;

    @br.com.ctecinf.SimpleXML.Name("retEvento")
    protected TRetEvento retEvento;

    public TProcEvento() {
        super("procEvento", "versao", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    public final void setVersao(String versao) {
        this.setAttribute("versao", versao);
    }

    public final TEvento getEvento() {
        return this.evento;
    }

    public final void setEvento(TEvento evento) {
        this.evento = evento;
    }

    public final TRetEvento getRetEvento() {
        return this.retEvento;
    }

    public final void setRetEvento(TRetEvento retEvento) {
        this.retEvento = retEvento;
    }

}