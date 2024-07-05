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

import br.com.ctecinf.Contribuinte;
import br.inf.portalfiscal.nfe.TNFe;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class QRCode {

    /**
     * Formata QR-Code da NF-e
     *
     * @param nfe
     * @throws br.com.ctecinf.nfe.NFeException
     */
    public static void set(TNFe nfe) throws NFeException {

        if (nfe.getInfNFe().getAttribute("Id") == null) {
            ChaveAcesso.set(nfe);
        }

        String chaveAcesso = nfe.getInfNFe().getAttribute("Id");
        String tpAmb = nfe.getInfNFe().getIde().getTpAmb();

        String cscToken = tpAmb.equals("1") ? Contribuinte.getCSCTokenProd() : Contribuinte.getCSCTokenHomo();

        StringBuilder params = new StringBuilder();

        params.append(chaveAcesso.replace("NFe", "")).append("|");
        params.append("2|");
        params.append(tpAmb).append("|");
        params.append("1");
        params.append(cscToken);

        String qrCode;
        try {
            //qrCode = "<![CDATA[" + Constants.URL_CONSULTA_NFCE + "?p=" + params.toString().replace(cscToken, "") + "|" + sha1(params.toString()).toUpperCase() + "]]>";
            qrCode = Constants.URL_CONSULTA_NFCE + "?p=" + params.toString().replace(cscToken, "") + "|" + sha1(params.toString()).toUpperCase();
        } catch (NoSuchAlgorithmException ex) {
            throw new NFeException(ex);
        }

        nfe.setInfNFeSupl(new TNFe.InfNFeSupl());
        nfe.getInfNFeSupl().setUrlChave(Constants.URL_CONSULTA_NFCE);
        nfe.getInfNFeSupl().setQrCode(qrCode);
    }

    /**
     * Encriptografa SHA-1
     *
     * @param value
     * @return String
     * @throws java.security.NoSuchAlgorithmException
     *
     */
    public static String sha1(String value) throws NoSuchAlgorithmException {
        return new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(value.getBytes())).toString(16);
    }
}
