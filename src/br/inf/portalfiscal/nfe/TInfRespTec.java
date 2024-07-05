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
 * Grupo de informações do responsável técnico pelo sistema de emissão de DF-e
 */
public class TInfRespTec extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("CNPJ")
    protected String cNPJ;

    @br.com.ctecinf.SimpleXML.Name("xContato")
    protected String xContato;

    @br.com.ctecinf.SimpleXML.Name("email")
    protected String email;

    @br.com.ctecinf.SimpleXML.Name("fone")
    protected String fone;

    @br.com.ctecinf.SimpleXML.Name("idCSRT")
    protected String idCSRT;

    @br.com.ctecinf.SimpleXML.Name("hashCSRT")
    protected String hashCSRT;

    public TInfRespTec() {
        super("infRespTec", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    /**
     * CNPJ
     *
     * @return String
     */
    public final String getCNPJ() {
        return this.cNPJ;
    }

    /**
     * CNPJ
     *
     * @param cNPJ
     */
    public final void setCNPJ(String cNPJ) {
        this.cNPJ = cNPJ;
    }

    /**
     * Informar o nome da pessoa a ser contatada na empresa desenvolvedora do sistema utilizado na emissão do documento fiscal eletrônico.
     *
     * @return String
     */
    public final String getXContato() {
        return this.xContato;
    }

    /**
     * Informar o nome da pessoa a ser contatada na empresa desenvolvedora do sistema utilizado na emissão do documento fiscal eletrônico.
     *
     * @param xContato
     */
    public final void setXContato(String xContato) {
        this.xContato = xContato;
    }

    /**
     * Informar o e-mail da pessoa a ser contatada na empresa desenvolvedora do sistema.
     *
     * @return String
     */
    public final String getEmail() {
        return this.email;
    }

    /**
     * Informar o e-mail da pessoa a ser contatada na empresa desenvolvedora do sistema.
     *
     * @param email
     */
    public final void setEmail(String email) {
        this.email = email;
    }

    /**
     * Informar o telefone da pessoa a ser contatada na empresa desenvolvedora do sistema. Preencher com o Código DDD + número do telefone.
     *
     * @return String
     */
    public final String getFone() {
        return this.fone;
    }

    /**
     * Informar o telefone da pessoa a ser contatada na empresa desenvolvedora do sistema. Preencher com o Código DDD + número do telefone.
     *
     * @param fone
     */
    public final void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Identificador do CSRT utilizado para montar o hash do CSRT
     *
     * @return String
     */
    public final String getIdCSRT() {
        return this.idCSRT;
    }

    /**
     * Identificador do CSRT utilizado para montar o hash do CSRT
     *
     * @param idCSRT
     */
    public final void setIdCSRT(String idCSRT) {
        this.idCSRT = idCSRT;
    }

    /**
     * O hashCSRT é o resultado da função hash (SHA-1 – Base64) do CSRT fornecido pelo fisco mais a Chave de Acesso da NFe.
     *
     * @return String
     */
    public final String getHashCSRT() {
        return this.hashCSRT;
    }

    /**
     * O hashCSRT é o resultado da função hash (SHA-1 – Base64) do CSRT fornecido pelo fisco mais a Chave de Acesso da NFe.
     *
     * @param hashCSRT
     */
    public final void setHashCSRT(String hashCSRT) {
        this.hashCSRT = hashCSRT;
    }

}