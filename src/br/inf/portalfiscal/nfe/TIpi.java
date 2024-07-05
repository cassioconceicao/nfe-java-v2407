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
 * Tipo: Dados do IPI
 */
public class TIpi extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("CNPJProd")
    protected String cNPJProd;

    @br.com.ctecinf.SimpleXML.Name("cSelo")
    protected String cSelo;

    @br.com.ctecinf.SimpleXML.Name("qSelo")
    protected String qSelo;

    @br.com.ctecinf.SimpleXML.Name("cEnq")
    protected String cEnq;

    @br.com.ctecinf.SimpleXML.Name("IPITrib")
    protected IPITrib iPITrib;

    @br.com.ctecinf.SimpleXML.Name("IPINT")
    protected IPINT iPINT;

    public TIpi() {
        super("ipi", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    /**
     * CNPJ do produtor da mercadoria, quando diferente do emitente. Somente para os casos de exportação direta ou indireta.
     *
     * @return String
     */
    public final String getCNPJProd() {
        return this.cNPJProd;
    }

    /**
     * CNPJ do produtor da mercadoria, quando diferente do emitente. Somente para os casos de exportação direta ou indireta.
     *
     * @param cNPJProd
     */
    public final void setCNPJProd(String cNPJProd) {
        this.cNPJProd = cNPJProd;
    }

    /**
     * Código do selo de controle do IPI
     *
     * @return String
     */
    public final String getCSelo() {
        return this.cSelo;
    }

    /**
     * Código do selo de controle do IPI
     *
     * @param cSelo
     */
    public final void setCSelo(String cSelo) {
        this.cSelo = cSelo;
    }

    /**
     * Quantidade de selo de controle do IPI
     *
     * @return String
     */
    public final String getQSelo() {
        return this.qSelo;
    }

    /**
     * Quantidade de selo de controle do IPI
     *
     * @param qSelo
     */
    public final void setQSelo(String qSelo) {
        this.qSelo = qSelo;
    }

    /**
     * Código de Enquadramento Legal do IPI (tabela a ser criada pela RFB)
     *
     * @return String
     */
    public final String getCEnq() {
        return this.cEnq;
    }

    /**
     * Código de Enquadramento Legal do IPI (tabela a ser criada pela RFB)
     *
     * @param cEnq
     */
    public final void setCEnq(String cEnq) {
        this.cEnq = cEnq;
    }

    public final IPITrib getIPITrib() {
        return this.iPITrib;
    }

    public final void setIPITrib(IPITrib iPITrib) {
        this.iPITrib = iPITrib;
    }

    public final IPINT getIPINT() {
        return this.iPINT;
    }

    public final void setIPINT(IPINT iPINT) {
        this.iPINT = iPINT;
    }

    public static class IPITrib extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pIPI")
        protected String pIPI;

        @br.com.ctecinf.SimpleXML.Name("qUnid")
        protected String qUnid;

        @br.com.ctecinf.SimpleXML.Name("vUnid")
        protected String vUnid;

        @br.com.ctecinf.SimpleXML.Name("vIPI")
        protected String vIPI;

        public IPITrib() {
            super("IPITrib");
        }

        /**
         * Código da Situação Tributária do IPI:<br>
         * 00-Entrada com recuperação de crédito<br>
         * 49 - Outras entradas<br>
         * 50-Saída tributada<br>
         * 99-Outras saídas
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código da Situação Tributária do IPI:<br>
         * 00-Entrada com recuperação de crédito<br>
         * 49 - Outras entradas<br>
         * 50-Saída tributada<br>
         * 99-Outras saídas
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Valor da BC do IPI
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do IPI
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do IPI
         *
         * @return String
         */
        public final String getPIPI() {
            return this.pIPI;
        }

        /**
         * Alíquota do IPI
         *
         * @param pIPI
         */
        public final void setPIPI(String pIPI) {
            this.pIPI = pIPI;
        }

        /**
         * Quantidade total na unidade padrão para tributação
         *
         * @return String
         */
        public final String getQUnid() {
            return this.qUnid;
        }

        /**
         * Quantidade total na unidade padrão para tributação
         *
         * @param qUnid
         */
        public final void setQUnid(String qUnid) {
            this.qUnid = qUnid;
        }

        /**
         * Valor por Unidade Tributável. Informar o valor do imposto Pauta por unidade de medida.
         *
         * @return String
         */
        public final String getVUnid() {
            return this.vUnid;
        }

        /**
         * Valor por Unidade Tributável. Informar o valor do imposto Pauta por unidade de medida.
         *
         * @param vUnid
         */
        public final void setVUnid(String vUnid) {
            this.vUnid = vUnid;
        }

        /**
         * Valor do IPI
         *
         * @return String
         */
        public final String getVIPI() {
            return this.vIPI;
        }

        /**
         * Valor do IPI
         *
         * @param vIPI
         */
        public final void setVIPI(String vIPI) {
            this.vIPI = vIPI;
        }

    }

    public static class IPINT extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        public IPINT() {
            super("IPINT");
        }

        /**
         * Código da Situação Tributária do IPI:<br>
         * 01-Entrada tributada com alíquota zero<br>
         * 02-Entrada isenta<br>
         * 03-Entrada não-tributada<br>
         * 04-Entrada imune<br>
         * 05-Entrada com suspensão<br>
         * 51-Saída tributada com alíquota zero<br>
         * 52-Saída isenta<br>
         * 53-Saída não-tributada<br>
         * 54-Saída imune<br>
         * 55-Saída com suspensão
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código da Situação Tributária do IPI:<br>
         * 01-Entrada tributada com alíquota zero<br>
         * 02-Entrada isenta<br>
         * 03-Entrada não-tributada<br>
         * 04-Entrada imune<br>
         * 05-Entrada com suspensão<br>
         * 51-Saída tributada com alíquota zero<br>
         * 52-Saída isenta<br>
         * 53-Saída não-tributada<br>
         * 54-Saída imune<br>
         * 55-Saída com suspensão
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

    }

}