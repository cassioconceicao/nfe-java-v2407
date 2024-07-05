/*
 * Copyright (C) 2023 ctecinf.com.br
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
 */
package br.com.ctecinf.nfe;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class Constants {

    /**
     * SEFAZ Versão
     */
    public static final String VERSAO_EVENTO = "1.00";
    public static final String VERSAO_NFE = "4.00";

    /**
     * Versão do sistema
     */
    public static final String VER_PROC = "CTECINF_NFe-2407";

    /**
     * URL's
     */
    public static final String URL_HOMO_AUTORIZACAO = "https://nfce-homologacao.sefazrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao4.asmx";
    public static final String URL_HOMO_STATUS_SERVICO = "https://nfce-homologacao.sefazrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico4.asmx";
    public static final String URL_HOMO_INUTILIZACAO = "https://nfce-homologacao.sefazrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao4.asmx";
    public static final String URL_HOMO_RECEPCAO_EVENTO = "https://nfce-homologacao.sefazrs.rs.gov.br/ws/recepcaoevento/recepcaoevento4.asmx";
    public static final String URL_HOMO_INTEGRACAO = "https://dfe-servico-homologacao.svrs.rs.gov.br/WS/NFeIntegracao/NFeIntegracao.asmx";

    public static final String URL_PROD_AUTORIZACAO = "https://nfce.sefazrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao4.asmx";
    public static final String URL_PROD_STATUS_SERVICO = "https://nfce.sefazrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico4.asmx";
    public static final String URL_PROD_INUTILIZACAO = "https://nfce.sefazrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao4.asmx";
    public static final String URL_PROD_RECEPCAO_EVENTO = "https://nfce.sefazrs.rs.gov.br/ws/recepcaoevento/recepcaoevento4.asmx";
    public static final String URL_PROD_INTEGRACAO = "https://dfe-servico.svrs.rs.gov.br/WS/NFeIntegracao/NFeIntegracao.asmx";

    public static final String URL_DOWNLOAD_XML = "https://dfe-portal.svrs.rs.gov.br/NFCESSL/DownloadXMLDFe";

    public static final String URL_CONSULTA_NFE = "https://www.sefaz.rs.gov.br/NFE/NFE-NFC.aspx";
    public static final String URL_CONSULTA_NFCE = "https://www.sefaz.rs.gov.br/NFCE/NFCE-COM.aspx";
}
