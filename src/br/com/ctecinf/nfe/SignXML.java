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
 */
package br.com.ctecinf.nfe;

import br.inf.portalfiscal.nfe.TEvento;
import br.inf.portalfiscal.nfe.TInutNFe;
import br.inf.portalfiscal.nfe.TNFe;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class SignXML {

    public static final String TAG_INF_NFE = "infNFe";
    public static final String TAG_INF_INUT_NFE = "infInut";
    public static final String TAG_INF_EVENTO = "infEvento";

    /**
     * Assina NFe
     *
     * @param privateKey
     * @param nfe
     * @return String
     * @throws NFeException
     */
    public static String nfe(KeyStore.PrivateKeyEntry privateKey, TNFe nfe) throws NFeException {
        try {
            Document document = parse(nfe.toString());
            sign(privateKey, document, TAG_INF_NFE);
            return parse(document);
        } catch (NFeException | IOException | ParserConfigurationException | SAXException ex) {
            throw new NFeException(ex);
        }
    }

    /**
     * Assina inutilização de NFe
     *
     * @param privateKey
     * @param inutNFe
     * @return String
     * @throws NFeException
     */
    public static String inutNFe(KeyStore.PrivateKeyEntry privateKey, TInutNFe inutNFe) throws NFeException {
        try {
            Document document = parse(inutNFe.toString());
            sign(privateKey, document, TAG_INF_INUT_NFE);
            return parse(document);
        } catch (NFeException | IOException | ParserConfigurationException | SAXException ex) {
            throw new NFeException(ex);
        }
    }

    /**
     * Assina inutilização de NFe
     *
     * @param privateKey
     * @param evento
     * @return String
     * @throws NFeException
     */
    public static String evento(KeyStore.PrivateKeyEntry privateKey, TEvento evento) throws NFeException {
        try {
            Document document = parse(evento.toString());
            sign(privateKey, document, TAG_INF_EVENTO);
            return parse(document);
        } catch (NFeException | IOException | ParserConfigurationException | SAXException ex) {
            throw new NFeException(ex);
        }
    }

    /**
     * Document to String
     *
     * @param document
     * @return String
     * @throws NFeException
     */
    private static String parse(Document document) throws NFeException {
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(document), new StreamResult(os));
            return os.toString().replace("<Signature>", "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">");
        } catch (TransformerException ex) {
            throw new NFeException(ex);
        }
    }

    /**
     * String to document
     *
     * @param xml
     * @return Document
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     * @throws java.io.IOException
     */
    private static Document parse(String xml) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
        builder.setNamespaceAware(true);
        return builder.newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes()));
    }

    /**
     * Assina documento
     *
     * @param privateKey
     * @param document
     * @param tagRoot
     * @param tagIdAttribute
     * @throws NFeException
     */
    private static void sign(KeyStore.PrivateKeyEntry privateKey, Document document, String tagIdAttribute) throws NFeException {
        try {
            XMLSignatureFactory sigFactory = XMLSignatureFactory.getInstance("DOM");
            KeyInfoFactory keyInfoFactory = sigFactory.getKeyInfoFactory();
            X509Data x509Data = keyInfoFactory.newX509Data(Arrays.asList((X509Certificate) privateKey.getCertificate()));
            NodeList elements = document.getElementsByTagName(tagIdAttribute);
            Element el = (Element) elements.item(0);
            el.setIdAttribute("Id", true);
            String id = el.getAttribute("Id");
            String algorithmC14N = javax.xml.crypto.dsig.CanonicalizationMethod.INCLUSIVE;
            Reference reference = sigFactory.newReference("#" + id, sigFactory.newDigestMethod(DigestMethod.SHA1, null), Arrays.asList(sigFactory.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null), sigFactory.newTransform(algorithmC14N, (TransformParameterSpec) null)), null, null);
            SignedInfo signedInfo = sigFactory.newSignedInfo(sigFactory.newCanonicalizationMethod(algorithmC14N, (C14NMethodParameterSpec) null), sigFactory.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(reference));
            XMLSignature xmlSignature = sigFactory.newXMLSignature(signedInfo, keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data)));
            xmlSignature.sign(new DOMSignContext(privateKey.getPrivateKey(), document.getDocumentElement()));
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | MarshalException | XMLSignatureException | DOMException ex) {
            throw new NFeException(ex);
        }
    }

}
