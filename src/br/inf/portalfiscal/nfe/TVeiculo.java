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
 * Tipo Dados do Veículo
 */
public class TVeiculo extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("placa")
    protected String placa;

    @br.com.ctecinf.SimpleXML.Name("UF")
    protected TUf uF;

    @br.com.ctecinf.SimpleXML.Name("RNTC")
    protected String rNTC;

    public TVeiculo() {
        super("veiculo", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    /**
     * Placa do veículo (NT2011/004)
     *
     * @return String
     */
    public final String getPlaca() {
        return this.placa;
    }

    /**
     * Placa do veículo (NT2011/004)
     *
     * @param placa
     */
    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Sigla da UF
     *
     * @return TUf
     */
    public final TUf getUF() {
        return this.uF;
    }

    /**
     * Sigla da UF
     *
     * @param uF
     */
    public final void setUF(TUf uF) {
        this.uF = uF;
    }

    /**
     * Registro Nacional de Transportador de Carga (ANTT)
     *
     * @return String
     */
    public final String getRNTC() {
        return this.rNTC;
    }

    /**
     * Registro Nacional de Transportador de Carga (ANTT)
     *
     * @param rNTC
     */
    public final void setRNTC(String rNTC) {
        this.rNTC = rNTC;
    }

}