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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class CACerts {

    public static final String ALIAS = "cacerts";
    public static final String FILE = "config" + File.separator + ALIAS;
    public static final String KEYSTORE = System.getProperty("java.home") + File.separator + "lib" + File.separator + "security" + File.separator + ALIAS;
    public static final String PASS = "changeit";
    public static final String[] URLS = {"nfe.sefazrs.rs.gov.br"};

    /**
     * Gera CA certs
     *
     */
    public static void create() {

        File cacerts = new File(FILE);

        if (!cacerts.exists()) {

            if (cacerts.getParentFile() != null && !cacerts.getParentFile().exists()) {
                cacerts.getParentFile().mkdirs();
            }

            File file = new File(KEYSTORE);
            file.setReadable(true, false);
            file.setWritable(true, false);
            file.setExecutable(true, false);

            KeyStore ks;

            try (InputStream in = new FileInputStream(file)) {
                ks = KeyStore.getInstance(KeyStore.getDefaultType());
                ks.load(in, PASS.toCharArray());
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException ex) {
                throw new SecurityException(ex);
            }

            System.out.println("Gerando CACerts (" + file.getAbsolutePath() + ")");

            for (String url : URLS) {
                try {
                    generate(url, 443, ks);
                } catch (NoSuchAlgorithmException | KeyStoreException | KeyManagementException | IOException | CertificateEncodingException ex) {
                    throw new SecurityException(ex);
                }
            }

            try (OutputStream out = new FileOutputStream(cacerts)) {
                ks.store(out, PASS.toCharArray());
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException ex) {
                throw new SecurityException(ex);
            }

            cacerts.setReadable(true, false);
            cacerts.setWritable(true, false);
            cacerts.setExecutable(true, false);

            JOptionPane.showMessageDialog(null, "O Sistema precisa ser reeniciado para atualizar certificados.\nClique 'OK' e retire o certificado digital do leitor.\nAntes de iniciar insira novamente o certificado digital no leitor.");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Arquivo já gerado.");
        }
    }

    /**
     *
     * @param host
     * @param port
     * @param ks
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     * @throws CertificateEncodingException
     */
    private static void generate(String host, int port, KeyStore ks) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException, CertificateEncodingException {

        SSLContext context = SSLContext.getInstance("TLS");
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(ks);

        X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
        SavingTrustManager tm = new SavingTrustManager(defaultTrustManager);
        context.init(null, new TrustManager[]{tm}, null);
        SSLSocketFactory factory = context.getSocketFactory();

        System.out.println("INFO: Opening connection to " + host + ":" + port + "...");

        try (SSLSocket socket = (SSLSocket) factory.createSocket(host, port)) {
            socket.setSoTimeout(10000);
            System.out.println("INFO: Starting SSL handshake...");
            try {
                socket.startHandshake();
            } catch (IOException ex) {
            }
            System.out.println("INFO: No errors, certificate is already trusted\n");
        }

        X509Certificate[] chain = tm.chain;

        if (chain == null) {
            System.out.println("INFO: Could not obtain server certificate chain");
        }

        System.out.println("INFO: Server sent " + (chain == null ? "0" : chain.length) + " certificate(s):");

        MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        if (chain != null) {
            for (int i = 0; i < chain.length; i++) {
                X509Certificate cert509 = chain[i];
                sha1.update(cert509.getEncoded());
                md5.update(cert509.getEncoded());
                String alias = host + "-" + (i);
                ks.setCertificateEntry(alias, cert509);
                System.out.println("INFO: Added certificate to keystore 'cacerts' using alias '" + alias + "'");
            }
        }
    }

    private static class SavingTrustManager implements X509TrustManager {

        private final X509TrustManager tm;
        private X509Certificate[] chain;

        SavingTrustManager(X509TrustManager tm) {
            this.tm = tm;
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            throw new UnsupportedOperationException();
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            this.chain = chain;
            tm.checkServerTrusted(chain, authType);
        }
    }

}
