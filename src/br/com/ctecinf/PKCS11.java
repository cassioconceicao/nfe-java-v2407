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
package br.com.ctecinf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.util.Enumeration;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class PKCS11 {

    protected static final String NAME = "SunPKCS11";

    /**
     * Carrega certificado digital com a senha da classe Contribuinte
     *
     * @throws KeyStoreException
     */
    public static void load() throws KeyStoreException {
        load(Contribuinte.getSenhaCertificado());
    }

    /**
     * Carrega certificado digital
     *
     * @param certPass
     * @throws KeyStoreException
     */
    public static void load(String certPass) throws KeyStoreException {

        File config = new File("config", "pkcs11.properties");

        if (!config.exists()) {
            config.getParentFile().mkdirs();
            try (PrintWriter pw = new PrintWriter(new FileWriter(config, Charset.forName("UTF-8"), false))) {
                pw.write("name=SmartCard\nlibrary=" + (System.getProperty("os.name").equalsIgnoreCase("linux") ? new File("lib", "libOcsCryptoki.so") : new File("lib", "ocscryptoki.dll")).getAbsolutePath() + "\nshowInfo=false");
            } catch (IOException ex) {
                throw new KeyStoreException(ex);
            }
        }

        if (!Security.getProvider(PKCS11.NAME).isConfigured()) {
            Security.addProvider(Security.getProvider(PKCS11.NAME).configure(config.getAbsolutePath()));
        }

        registerSSL(getKeyStore(), certPass);
    }

    /**
     * Registra conexão segura com o servidor
     *
     * @param keyStore
     * @param certPass
     */
    public static final void registerSSL(KeyStore keyStore, String certPass) {

        if (!new File(CACerts.FILE).exists()) {
            CACerts.create();
        }

        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
        System.setProperty("javax.net.ssl.keyStoreType", keyStore.getType());
        System.setProperty("javax.net.ssl.keyStore", "NONE");
        System.setProperty("javax.net.ssl.keyStorePassword", certPass);
        System.setProperty("javax.net.ssl.keyStoreProvider", keyStore.getProvider().getName());
        System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
        System.setProperty("javax.net.ssl.trustStore", CACerts.FILE);
        System.setProperty("javax.net.ssl.trustStorePassword", CACerts.PASS);
    }

    /**
     * KeyStore PKCS11
     *
     * @return KeyStore
     * @throws KeyStoreException
     */
    public static KeyStore getKeyStore() throws KeyStoreException {
        try {
            return KeyStore.getInstance("PKCS11");
        } catch (KeyStoreException ex) {
            load();
            return KeyStore.getInstance("PKCS11");
        }
    }

    /**
     * Chave privada do certificado com a senha da classe Contribuinte
     *
     * @return KeyStore.PrivateKeyEntry
     * @throws KeyStoreException
     */
    public static KeyStore.PrivateKeyEntry getPrivateKey() throws KeyStoreException {
        return getPrivateKey(Contribuinte.getSenhaCertificado());
    }

    /**
     * Chave privada do certificado
     *
     * @param certPass
     * @return KeyStore.PrivateKeyEntry
     * @throws KeyStoreException
     */
    public static KeyStore.PrivateKeyEntry getPrivateKey(String certPass) throws KeyStoreException {
        try {
            KeyStore keyStore = getKeyStore();
            keyStore.load(null, certPass.toCharArray());
            Enumeration<String> aliasesEnum = keyStore.aliases();
            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (keyStore.isKeyEntry(alias)) {
                    return (KeyStore.PrivateKeyEntry) keyStore.getEntry(alias, new KeyStore.PasswordProtection(certPass.toCharArray()));
                }
            }
            return null;
        } catch (IOException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException ex) {
            throw new KeyStoreException(ex);
        }
    }

    /**
     * Converte Certificado em String
     *
     * @param certificate
     * @return
     * @throws CertificateEncodingException
     */
    public static String certificateToString(Certificate certificate) throws CertificateException {
        String beginCert = "-----BEGIN CERTIFICATE-----";
        String endCert = "-----END CERTIFICATE-----";
        String lineSeparator = System.getProperty("line.separator");
        try {
            return beginCert + lineSeparator + new String(Base64.getMimeEncoder(64, lineSeparator.getBytes()).encode(certificate.getEncoded())) + lineSeparator + endCert;
        } catch (CertificateEncodingException ex) {
            throw new CertificateException(ex);
        }
    }

}
