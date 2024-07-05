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
 * Tipo Dados do Endereço  // 24/10/08 - tamanho mínimo
 */
public class TEndereco extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("xLgr")
    protected String xLgr;

    @br.com.ctecinf.SimpleXML.Name("nro")
    protected String nro;

    @br.com.ctecinf.SimpleXML.Name("xCpl")
    protected String xCpl;

    @br.com.ctecinf.SimpleXML.Name("xBairro")
    protected String xBairro;

    @br.com.ctecinf.SimpleXML.Name("cMun")
    protected String cMun;

    @br.com.ctecinf.SimpleXML.Name("xMun")
    protected String xMun;

    @br.com.ctecinf.SimpleXML.Name("UF")
    protected TUf uF;

    @br.com.ctecinf.SimpleXML.Name("CEP")
    protected String cEP;

    @br.com.ctecinf.SimpleXML.Name("cPais")
    protected String cPais;

    @br.com.ctecinf.SimpleXML.Name("xPais")
    protected String xPais;

    @br.com.ctecinf.SimpleXML.Name("fone")
    protected String fone;

    public TEndereco() {
        super("endereco", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    /**
     * Logradouro
     *
     * @return String
     */
    public final String getXLgr() {
        return this.xLgr;
    }

    /**
     * Logradouro
     *
     * @param xLgr
     */
    public final void setXLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    /**
     * Número
     *
     * @return String
     */
    public final String getNro() {
        return this.nro;
    }

    /**
     * Número
     *
     * @param nro
     */
    public final void setNro(String nro) {
        this.nro = nro;
    }

    /**
     * Complemento
     *
     * @return String
     */
    public final String getXCpl() {
        return this.xCpl;
    }

    /**
     * Complemento
     *
     * @param xCpl
     */
    public final void setXCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    /**
     * Bairro
     *
     * @return String
     */
    public final String getXBairro() {
        return this.xBairro;
    }

    /**
     * Bairro
     *
     * @param xBairro
     */
    public final void setXBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    /**
     * Código do município (utilizar a tabela do IBGE), informar 9999999 para operações com o exterior.
     *
     * @return String
     */
    public final String getCMun() {
        return this.cMun;
    }

    /**
     * Código do município (utilizar a tabela do IBGE), informar 9999999 para operações com o exterior.
     *
     * @param cMun
     */
    public final void setCMun(String cMun) {
        this.cMun = cMun;
    }

    /**
     * Nome do município, informar EXTERIOR para operações com o exterior.
     *
     * @return String
     */
    public final String getXMun() {
        return this.xMun;
    }

    /**
     * Nome do município, informar EXTERIOR para operações com o exterior.
     *
     * @param xMun
     */
    public final void setXMun(String xMun) {
        this.xMun = xMun;
    }

    /**
     * Sigla da UF, informar EX para operações com o exterior.
     *
     * @return TUf
     */
    public final TUf getUF() {
        return this.uF;
    }

    /**
     * Sigla da UF, informar EX para operações com o exterior.
     *
     * @param uF
     */
    public final void setUF(TUf uF) {
        this.uF = uF;
    }

    /**
     * CEP
     *
     * @return String
     */
    public final String getCEP() {
        return this.cEP;
    }

    /**
     * CEP
     *
     * @param cEP
     */
    public final void setCEP(String cEP) {
        this.cEP = cEP;
    }

    /**
     * Código de Pais
     *
     * @return String
     */
    public final String getCPais() {
        return this.cPais;
    }

    /**
     * Código de Pais
     *
     * @param cPais
     */
    public final void setCPais(String cPais) {
        this.cPais = cPais;
    }

    /**
     * Nome do país
     *
     * @return String
     */
    public final String getXPais() {
        return this.xPais;
    }

    /**
     * Nome do país
     *
     * @param xPais
     */
    public final void setXPais(String xPais) {
        this.xPais = xPais;
    }

    /**
     * Telefone, preencher com Código DDD + número do telefone , nas operações com exterior é permtido informar o código do país + código da localidade + número do telefone
     *
     * @return String
     */
    public final String getFone() {
        return this.fone;
    }

    /**
     * Telefone, preencher com Código DDD + número do telefone , nas operações com exterior é permtido informar o código do país + código da localidade + número do telefone
     *
     * @param fone
     */
    public final void setFone(String fone) {
        this.fone = fone;
    }

}