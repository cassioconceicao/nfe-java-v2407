/*
 * Copyright (C) 2023 ctecinf.com.br
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY"); without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.ctecinf;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class Contribuinte {

    private static Map<String, Object> data;

    public static void setData(Map<String, Object> data) {
        Contribuinte.data = data == null ? new LinkedHashMap() : data;
    }

    public static String getString(String name) {
        return data == null || data.get(name) == null ? "" : data.get(name).toString().trim();
    }

    public static String getMunicipioCodigo() {
        return getString("municipio_codigo");
    }

    public static String getMunicipioDescricao() {
        return getString("municipio_descricao");
    }

    public static String getMunicipioUFCodigo() {
        return getString("municipio_uf_codigo");
    }

    public static String getMunicipioUFSigla() {
        return getString("municipio_uf_sigla");
    }

    public static String getMunicipioUFDescricao() {
        return getString("municipio_uf_descricao");
    }

    public static String getCnpj() {
        return getString("cnpj");
    }

    public static String getSenha() {
        return getString("senha");
    }

    public static String getNomeFantasia() {
        return getString("nome_fantasia");
    }

    public static String getRazaoSocial() {
        return getString("razao_social");
    }

    public static String getInscricaoEstadual() {
        return getString("insc_estadual");
    }

    public static String getLogradouro() {
        return getString("logradouro");
    }

    public static String getNumero() {
        return getString("numero");
    }

    public static String getBairro() {
        return getString("bairro");
    }

    public static String getComplemento() {
        return getString("complemento");
    }

    public static String getCep() {
        return getString("cep");
    }

    public static String getFone() {
        return getString("fone");
    }

    public static String getCelular() {
        return getString("celular");
    }

    public static String getEmail() {
        return getString("email");
    }

    public static String getContadorCNPJ() {
        return getString("contador_cnpj");
    }

    public static String getContadorEmail() {
        return getString("contador_email");
    }

    public static String getSerie() {
        return getString("serie");
    }

    public static String getTpAmb() {
        return getString("tp_amb");
    }

    public static String getTpIntegra() {
        return getString("tp_integra");
    }

    public static String getCSCTokenHomo() {
        return getString("csc_token_homo");
    }

    public static String getCSCTokenProd() {
        return getString("csc_token_prod");
    }

    public static String getSenhaCertificado() {
        return getString("senha_certificado");
    }

    public static String getNaturezaOperacao() {
        return getString("nat_operacao");
    }

    public static double getAliquota() {
        return Double.parseDouble(getString("aliquota"));
    }

    public static String getCRT() {
        return getString("crt");
    }

    public static String getXMLPath() {
        return getString("xml_path");
    }

    public static String getServerName() {
        return getString("server_name");
    }

    public static String getSlogan() {
        return getString("slogan");
    }

    public static String getLicensa() {
        return getString("licensa");
    }

    public static String getLastAccess() {
        return getString("last_access");
    }

    public static String getMessage() {
        return getString("message");
    }

}
