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
 * Tipo Nota Fiscal Eletrônica
 */
public class TNFe extends br.com.ctecinf.SimpleXML {

    @br.com.ctecinf.SimpleXML.Name("infNFe")
    protected InfNFe infNFe;

    @br.com.ctecinf.SimpleXML.Name("infNFeSupl")
    protected InfNFeSupl infNFeSupl;

    @br.com.ctecinf.SimpleXML.Name("Signature")
    protected String signature;

    public TNFe() {
        super("NFe", "xmlns=http://www.portalfiscal.inf.br/nfe");
    }

    /**
     * Informações da Nota Fiscal eletrônica
     *
     * @return InfNFe
     */
    public final InfNFe getInfNFe() {
        return this.infNFe;
    }

    /**
     * Informações da Nota Fiscal eletrônica
     *
     * @param infNFe
     */
    public final void setInfNFe(InfNFe infNFe) {
        this.infNFe = infNFe;
    }

    /**
     * Informações suplementares Nota Fiscal
     *
     * @return InfNFeSupl
     */
    public final InfNFeSupl getInfNFeSupl() {
        return this.infNFeSupl;
    }

    /**
     * Informações suplementares Nota Fiscal
     *
     * @param infNFeSupl
     */
    public final void setInfNFeSupl(InfNFeSupl infNFeSupl) {
        this.infNFeSupl = infNFeSupl;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Informações da Nota Fiscal eletrônica
     */
    public static class InfNFe extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("ide")
        protected Ide ide;

        @br.com.ctecinf.SimpleXML.Name("emit")
        protected Emit emit;

        @br.com.ctecinf.SimpleXML.Name("avulsa")
        protected Avulsa avulsa;

        @br.com.ctecinf.SimpleXML.Name("dest")
        protected Dest dest;

        @br.com.ctecinf.SimpleXML.Name("retirada")
        protected TLocal retirada;

        @br.com.ctecinf.SimpleXML.Name("entrega")
        protected TLocal entrega;

        @br.com.ctecinf.SimpleXML.Name("autXML")
        protected java.util.List<AutXML> autXML;

        @br.com.ctecinf.SimpleXML.Name("det")
        protected java.util.List<Det> det;

        @br.com.ctecinf.SimpleXML.Name("total")
        protected Total total;

        @br.com.ctecinf.SimpleXML.Name("transp")
        protected Transp transp;

        @br.com.ctecinf.SimpleXML.Name("cobr")
        protected Cobr cobr;

        @br.com.ctecinf.SimpleXML.Name("pag")
        protected Pag pag;

        @br.com.ctecinf.SimpleXML.Name("infIntermed")
        protected InfIntermed infIntermed;

        @br.com.ctecinf.SimpleXML.Name("infAdic")
        protected InfAdic infAdic;

        @br.com.ctecinf.SimpleXML.Name("exporta")
        protected Exporta exporta;

        @br.com.ctecinf.SimpleXML.Name("compra")
        protected Compra compra;

        @br.com.ctecinf.SimpleXML.Name("cana")
        protected Cana cana;

        @br.com.ctecinf.SimpleXML.Name("infRespTec")
        protected TInfRespTec infRespTec;

        @br.com.ctecinf.SimpleXML.Name("infSolicNFF")
        protected InfSolicNFF infSolicNFF;

        public InfNFe() {
            super("infNFe", "versao", "Id");
        }

        /**
         * Versão do leiaute (v4.00)
         *
         * @param versao
         */
        public final void setVersao(String versao) {
            this.setAttribute("versao", versao);
        }

        /**
         * PL_005d - 11/08/09 - validação do Id
         *
         * @param id
         */
        public final void setId(String id) {
            this.setAttribute("Id", id);
        }

        /**
         * identificação da NF-e
         *
         * @return Ide
         */
        public final Ide getIde() {
            return this.ide;
        }

        /**
         * identificação da NF-e
         *
         * @param ide
         */
        public final void setIde(Ide ide) {
            this.ide = ide;
        }

        /**
         * Identificação do emitente
         *
         * @return Emit
         */
        public final Emit getEmit() {
            return this.emit;
        }

        /**
         * Identificação do emitente
         *
         * @param emit
         */
        public final void setEmit(Emit emit) {
            this.emit = emit;
        }

        /**
         * Emissão de avulsa, informar os dados do Fisco emitente
         *
         * @return Avulsa
         */
        public final Avulsa getAvulsa() {
            return this.avulsa;
        }

        /**
         * Emissão de avulsa, informar os dados do Fisco emitente
         *
         * @param avulsa
         */
        public final void setAvulsa(Avulsa avulsa) {
            this.avulsa = avulsa;
        }

        /**
         * Identificação do Destinatário
         *
         * @return Dest
         */
        public final Dest getDest() {
            return this.dest;
        }

        /**
         * Identificação do Destinatário
         *
         * @param dest
         */
        public final void setDest(Dest dest) {
            this.dest = dest;
        }

        /**
         * Identificação do Local de Retirada (informar apenas quando for diferente do endereço do remetente)
         *
         * @return TLocal
         */
        public final TLocal getRetirada() {
            return this.retirada;
        }

        /**
         * Identificação do Local de Retirada (informar apenas quando for diferente do endereço do remetente)
         *
         * @param retirada
         */
        public final void setRetirada(TLocal retirada) {
            this.retirada = retirada;
        }

        /**
         * Identificação do Local de Entrega (informar apenas quando for diferente do endereço do destinatário)
         *
         * @return TLocal
         */
        public final TLocal getEntrega() {
            return this.entrega;
        }

        /**
         * Identificação do Local de Entrega (informar apenas quando for diferente do endereço do destinatário)
         *
         * @param entrega
         */
        public final void setEntrega(TLocal entrega) {
            this.entrega = entrega;
        }

        /**
         * Pessoas autorizadas para o download do XML da NF-e
         *
         * @return java.util.List
         */
        public final java.util.List<AutXML> getAutXML() {
            if(this.autXML == null) {
                this.autXML = new java.util.ArrayList();
            }
            return this.autXML;
        }

        /**
         * Pessoas autorizadas para o download do XML da NF-e
         *
         * @param autXML
         */
        public final void setAutXML(java.util.List<AutXML> autXML) {
            this.autXML = autXML;
        }

        /**
         * Dados dos detalhes da NF-e
         *
         * @return java.util.List
         */
        public final java.util.List<Det> getDet() {
            if(this.det == null) {
                this.det = new java.util.ArrayList();
            }
            return this.det;
        }

        /**
         * Dados dos detalhes da NF-e
         *
         * @param det
         */
        public final void setDet(java.util.List<Det> det) {
            this.det = det;
        }

        /**
         * Dados dos totais da NF-e
         *
         * @return Total
         */
        public final Total getTotal() {
            return this.total;
        }

        /**
         * Dados dos totais da NF-e
         *
         * @param total
         */
        public final void setTotal(Total total) {
            this.total = total;
        }

        /**
         * Dados dos transportes da NF-e
         *
         * @return Transp
         */
        public final Transp getTransp() {
            return this.transp;
        }

        /**
         * Dados dos transportes da NF-e
         *
         * @param transp
         */
        public final void setTransp(Transp transp) {
            this.transp = transp;
        }

        /**
         * Dados da cobrança da NF-e
         *
         * @return Cobr
         */
        public final Cobr getCobr() {
            return this.cobr;
        }

        /**
         * Dados da cobrança da NF-e
         *
         * @param cobr
         */
        public final void setCobr(Cobr cobr) {
            this.cobr = cobr;
        }

        /**
         * Dados de Pagamento. Obrigatório apenas para (NFC-e) NT 2012/004
         *
         * @return Pag
         */
        public final Pag getPag() {
            return this.pag;
        }

        /**
         * Dados de Pagamento. Obrigatório apenas para (NFC-e) NT 2012/004
         *
         * @param pag
         */
        public final void setPag(Pag pag) {
            this.pag = pag;
        }

        /**
         * Grupo de Informações do Intermediador da Transação
         *
         * @return InfIntermed
         */
        public final InfIntermed getInfIntermed() {
            return this.infIntermed;
        }

        /**
         * Grupo de Informações do Intermediador da Transação
         *
         * @param infIntermed
         */
        public final void setInfIntermed(InfIntermed infIntermed) {
            this.infIntermed = infIntermed;
        }

        /**
         * Informações adicionais da NF-e
         *
         * @return InfAdic
         */
        public final InfAdic getInfAdic() {
            return this.infAdic;
        }

        /**
         * Informações adicionais da NF-e
         *
         * @param infAdic
         */
        public final void setInfAdic(InfAdic infAdic) {
            this.infAdic = infAdic;
        }

        /**
         * Informações de exportação
         *
         * @return Exporta
         */
        public final Exporta getExporta() {
            return this.exporta;
        }

        /**
         * Informações de exportação
         *
         * @param exporta
         */
        public final void setExporta(Exporta exporta) {
            this.exporta = exporta;
        }

        /**
         * Informações de compras  (Nota de Empenho, Pedido e Contrato)
         *
         * @return Compra
         */
        public final Compra getCompra() {
            return this.compra;
        }

        /**
         * Informações de compras  (Nota de Empenho, Pedido e Contrato)
         *
         * @param compra
         */
        public final void setCompra(Compra compra) {
            this.compra = compra;
        }

        /**
         * Informações de registro aquisições de cana
         *
         * @return Cana
         */
        public final Cana getCana() {
            return this.cana;
        }

        /**
         * Informações de registro aquisições de cana
         *
         * @param cana
         */
        public final void setCana(Cana cana) {
            this.cana = cana;
        }

        /**
         * Informações do Responsável Técnico pela emissão do DF-e
         *
         * @return TInfRespTec
         */
        public final TInfRespTec getInfRespTec() {
            return this.infRespTec;
        }

        /**
         * Informações do Responsável Técnico pela emissão do DF-e
         *
         * @param infRespTec
         */
        public final void setInfRespTec(TInfRespTec infRespTec) {
            this.infRespTec = infRespTec;
        }

        /**
         * Grupo para informações da solicitação da NFF
         *
         * @return InfSolicNFF
         */
        public final InfSolicNFF getInfSolicNFF() {
            return this.infSolicNFF;
        }

        /**
         * Grupo para informações da solicitação da NFF
         *
         * @param infSolicNFF
         */
        public final void setInfSolicNFF(InfSolicNFF infSolicNFF) {
            this.infSolicNFF = infSolicNFF;
        }

    }

    /**
     * identificação da NF-e
     */
    public static class Ide extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cUF")
        protected String cUF;

        @br.com.ctecinf.SimpleXML.Name("cNF")
        protected String cNF;

        @br.com.ctecinf.SimpleXML.Name("natOp")
        protected String natOp;

        @br.com.ctecinf.SimpleXML.Name("mod")
        protected String mod;

        @br.com.ctecinf.SimpleXML.Name("serie")
        protected String serie;

        @br.com.ctecinf.SimpleXML.Name("nNF")
        protected String nNF;

        @br.com.ctecinf.SimpleXML.Name("dhEmi")
        protected String dhEmi;

        @br.com.ctecinf.SimpleXML.Name("dhSaiEnt")
        protected String dhSaiEnt;

        @br.com.ctecinf.SimpleXML.Name("tpNF")
        protected String tpNF;

        @br.com.ctecinf.SimpleXML.Name("idDest")
        protected String idDest;

        @br.com.ctecinf.SimpleXML.Name("cMunFG")
        protected String cMunFG;

        @br.com.ctecinf.SimpleXML.Name("tpImp")
        protected String tpImp;

        @br.com.ctecinf.SimpleXML.Name("tpEmis")
        protected String tpEmis;

        @br.com.ctecinf.SimpleXML.Name("cDV")
        protected String cDV;

        @br.com.ctecinf.SimpleXML.Name("tpAmb")
        protected String tpAmb;

        @br.com.ctecinf.SimpleXML.Name("finNFe")
        protected String finNFe;

        @br.com.ctecinf.SimpleXML.Name("indFinal")
        protected String indFinal;

        @br.com.ctecinf.SimpleXML.Name("indPres")
        protected String indPres;

        @br.com.ctecinf.SimpleXML.Name("indIntermed")
        protected String indIntermed;

        @br.com.ctecinf.SimpleXML.Name("procEmi")
        protected String procEmi;

        @br.com.ctecinf.SimpleXML.Name("verProc")
        protected String verProc;

        @br.com.ctecinf.SimpleXML.Name("dhCont")
        protected String dhCont;

        @br.com.ctecinf.SimpleXML.Name("xJust")
        protected String xJust;

        @br.com.ctecinf.SimpleXML.Name("NFref")
        protected java.util.List<NFref> nFref;

        public Ide() {
            super("ide");
        }

        /**
         * Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do IBGE.
         *
         * @return String
         */
        public final String getCUF() {
            return this.cUF;
        }

        /**
         * Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do IBGE.
         *
         * @param cUF
         */
        public final void setCUF(String cUF) {
            this.cUF = cUF;
        }

        /**
         * Código numérico que compõe a Chave de Acesso. Número aleatório gerado pelo emitente para cada NF-e.
         *
         * @return String
         */
        public final String getCNF() {
            return this.cNF;
        }

        /**
         * Código numérico que compõe a Chave de Acesso. Número aleatório gerado pelo emitente para cada NF-e.
         *
         * @param cNF
         */
        public final void setCNF(String cNF) {
            this.cNF = cNF;
        }

        /**
         * Descrição da Natureza da Operação
         *
         * @return String
         */
        public final String getNatOp() {
            return this.natOp;
        }

        /**
         * Descrição da Natureza da Operação
         *
         * @param natOp
         */
        public final void setNatOp(String natOp) {
            this.natOp = natOp;
        }

        /**
         * Código do modelo do Documento Fiscal. 55 = NF-e; 65 = NFC-e.
         *
         * @return String
         */
        public final String getMod() {
            return this.mod;
        }

        /**
         * Código do modelo do Documento Fiscal. 55 = NF-e; 65 = NFC-e.
         *
         * @param mod
         */
        public final void setMod(String mod) {
            this.mod = mod;
        }

        /**
         * Série do Documento Fiscal<br>
         * série normal 0-889<br>
         * Avulsa Fisco 890-899<br>
         * SCAN 900-999
         *
         * @return String
         */
        public final String getSerie() {
            return this.serie;
        }

        /**
         * Série do Documento Fiscal<br>
         * série normal 0-889<br>
         * Avulsa Fisco 890-899<br>
         * SCAN 900-999
         *
         * @param serie
         */
        public final void setSerie(String serie) {
            this.serie = serie;
        }

        /**
         * Número do Documento Fiscal
         *
         * @return String
         */
        public final String getNNF() {
            return this.nNF;
        }

        /**
         * Número do Documento Fiscal
         *
         * @param nNF
         */
        public final void setNNF(String nNF) {
            this.nNF = nNF;
        }

        /**
         * Data e Hora de emissão do Documento Fiscal (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00
         *
         * @return String
         */
        public final String getDhEmi() {
            return this.dhEmi;
        }

        /**
         * Data e Hora de emissão do Documento Fiscal (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00
         *
         * @param dhEmi
         */
        public final void setDhEmi(String dhEmi) {
            this.dhEmi = dhEmi;
        }

        /**
         * Data e Hora da saída ou de entrada da mercadoria / produto (AAAA-MM-DDTHH:mm:ssTZD)
         *
         * @return String
         */
        public final String getDhSaiEnt() {
            return this.dhSaiEnt;
        }

        /**
         * Data e Hora da saída ou de entrada da mercadoria / produto (AAAA-MM-DDTHH:mm:ssTZD)
         *
         * @param dhSaiEnt
         */
        public final void setDhSaiEnt(String dhSaiEnt) {
            this.dhSaiEnt = dhSaiEnt;
        }

        /**
         * Tipo do Documento Fiscal (0 - entrada; 1 - saída)
         *
         * @return String
         */
        public final String getTpNF() {
            return this.tpNF;
        }

        /**
         * Tipo do Documento Fiscal (0 - entrada; 1 - saída)
         *
         * @param tpNF
         */
        public final void setTpNF(String tpNF) {
            this.tpNF = tpNF;
        }

        /**
         * Identificador de Local de destino da operação (1-Interna;2-Interestadual;3-Exterior)
         *
         * @return String
         */
        public final String getIdDest() {
            return this.idDest;
        }

        /**
         * Identificador de Local de destino da operação (1-Interna;2-Interestadual;3-Exterior)
         *
         * @param idDest
         */
        public final void setIdDest(String idDest) {
            this.idDest = idDest;
        }

        /**
         * Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE)
         *
         * @return String
         */
        public final String getCMunFG() {
            return this.cMunFG;
        }

        /**
         * Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE)
         *
         * @param cMunFG
         */
        public final void setCMunFG(String cMunFG) {
            this.cMunFG = cMunFG;
        }

        /**
         * Formato de impressão do DANFE (0-sem DANFE;1-DANFe Retrato; 2-DANFe Paisagem;3-DANFe Simplificado;<br>
         * 											4-DANFe NFC-e;5-DANFe NFC-e em mensagem eletrônica)
         *
         * @return String
         */
        public final String getTpImp() {
            return this.tpImp;
        }

        /**
         * Formato de impressão do DANFE (0-sem DANFE;1-DANFe Retrato; 2-DANFe Paisagem;3-DANFe Simplificado;<br>
         * 											4-DANFe NFC-e;5-DANFe NFC-e em mensagem eletrônica)
         *
         * @param tpImp
         */
        public final void setTpImp(String tpImp) {
            this.tpImp = tpImp;
        }

        /**
         * Forma de emissão da NF-e<br>
         * 1 - Normal;<br>
         * 2 - Contingência FS<br>
         * 3 - Regime Especial NFF (NT 2021.002)<br>
         * 4 - Contingência DPEC<br>
         * 5 - Contingência FSDA<br>
         * 6 - Contingência SVC - AN<br>
         * 7 - Contingência SVC - RS<br>
         * 9 - Contingência off-line NFC-e
         *
         * @return String
         */
        public final String getTpEmis() {
            return this.tpEmis;
        }

        /**
         * Forma de emissão da NF-e<br>
         * 1 - Normal;<br>
         * 2 - Contingência FS<br>
         * 3 - Regime Especial NFF (NT 2021.002)<br>
         * 4 - Contingência DPEC<br>
         * 5 - Contingência FSDA<br>
         * 6 - Contingência SVC - AN<br>
         * 7 - Contingência SVC - RS<br>
         * 9 - Contingência off-line NFC-e
         *
         * @param tpEmis
         */
        public final void setTpEmis(String tpEmis) {
            this.tpEmis = tpEmis;
        }

        /**
         * Digito Verificador da Chave de Acesso da NF-e
         *
         * @return String
         */
        public final String getCDV() {
            return this.cDV;
        }

        /**
         * Digito Verificador da Chave de Acesso da NF-e
         *
         * @param cDV
         */
        public final void setCDV(String cDV) {
            this.cDV = cDV;
        }

        /**
         * Identificação do Ambiente:<br>
         * 1 - Produção<br>
         * 2 - Homologação
         *
         * @return String
         */
        public final String getTpAmb() {
            return this.tpAmb;
        }

        /**
         * Identificação do Ambiente:<br>
         * 1 - Produção<br>
         * 2 - Homologação
         *
         * @param tpAmb
         */
        public final void setTpAmb(String tpAmb) {
            this.tpAmb = tpAmb;
        }

        /**
         * Finalidade da emissão da NF-e:<br>
         * 1 - NFe normal<br>
         * 2 - NFe complementar<br>
         * 3 - NFe de ajuste<br>
         * 4 - Devolução/Retorno
         *
         * @return String
         */
        public final String getFinNFe() {
            return this.finNFe;
        }

        /**
         * Finalidade da emissão da NF-e:<br>
         * 1 - NFe normal<br>
         * 2 - NFe complementar<br>
         * 3 - NFe de ajuste<br>
         * 4 - Devolução/Retorno
         *
         * @param finNFe
         */
        public final void setFinNFe(String finNFe) {
            this.finNFe = finNFe;
        }

        /**
         * Indica operação com consumidor final (0-Não;1-Consumidor Final)
         *
         * @return String
         */
        public final String getIndFinal() {
            return this.indFinal;
        }

        /**
         * Indica operação com consumidor final (0-Não;1-Consumidor Final)
         *
         * @param indFinal
         */
        public final void setIndFinal(String indFinal) {
            this.indFinal = indFinal;
        }

        /**
         * Indicador de presença do comprador no estabelecimento comercial no momento da oepração<br>
         * 											(0-Não se aplica (ex.: Nota Fiscal complementar ou de ajuste;1-Operação presencial;2-Não presencial, internet;3-Não presencial, teleatendimento;4-NFC-e entrega em domicílio;5-Operação presencial, fora do estabelecimento;9-Não presencial, outros)
         *
         * @return String
         */
        public final String getIndPres() {
            return this.indPres;
        }

        /**
         * Indicador de presença do comprador no estabelecimento comercial no momento da oepração<br>
         * 											(0-Não se aplica (ex.: Nota Fiscal complementar ou de ajuste;1-Operação presencial;2-Não presencial, internet;3-Não presencial, teleatendimento;4-NFC-e entrega em domicílio;5-Operação presencial, fora do estabelecimento;9-Não presencial, outros)
         *
         * @param indPres
         */
        public final void setIndPres(String indPres) {
            this.indPres = indPres;
        }

        /**
         * Indicador de intermediador/marketplace <br>
         * 											0=Operação sem intermediador (em site ou plataforma própria) <br>
         * 											1=Operação em site ou plataforma de terceiros (intermediadores/marketplace)
         *
         * @return String
         */
        public final String getIndIntermed() {
            return this.indIntermed;
        }

        /**
         * Indicador de intermediador/marketplace <br>
         * 											0=Operação sem intermediador (em site ou plataforma própria) <br>
         * 											1=Operação em site ou plataforma de terceiros (intermediadores/marketplace)
         *
         * @param indIntermed
         */
        public final void setIndIntermed(String indIntermed) {
            this.indIntermed = indIntermed;
        }

        /**
         * Processo de emissão utilizado com a seguinte codificação:<br>
         * 0 - emissão de NF-e com aplicativo do contribuinte;<br>
         * 1 - emissão de NF-e avulsa pelo Fisco;<br>
         * 2 - emissão de NF-e avulsa, pelo contribuinte com seu certificado digital, através do site<br>
         * do Fisco;<br>
         * 3- emissão de NF-e pelo contribuinte com aplicativo fornecido pelo Fisco.
         *
         * @return String
         */
        public final String getProcEmi() {
            return this.procEmi;
        }

        /**
         * Processo de emissão utilizado com a seguinte codificação:<br>
         * 0 - emissão de NF-e com aplicativo do contribuinte;<br>
         * 1 - emissão de NF-e avulsa pelo Fisco;<br>
         * 2 - emissão de NF-e avulsa, pelo contribuinte com seu certificado digital, através do site<br>
         * do Fisco;<br>
         * 3- emissão de NF-e pelo contribuinte com aplicativo fornecido pelo Fisco.
         *
         * @param procEmi
         */
        public final void setProcEmi(String procEmi) {
            this.procEmi = procEmi;
        }

        /**
         * versão do aplicativo utilizado no processo de<br>
         * emissão
         *
         * @return String
         */
        public final String getVerProc() {
            return this.verProc;
        }

        /**
         * versão do aplicativo utilizado no processo de<br>
         * emissão
         *
         * @param verProc
         */
        public final void setVerProc(String verProc) {
            this.verProc = verProc;
        }

        /**
         * Informar a data e hora de entrada em contingência contingência no formato  (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00.
         *
         * @return String
         */
        public final String getDhCont() {
            return this.dhCont;
        }

        /**
         * Informar a data e hora de entrada em contingência contingência no formato  (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00.
         *
         * @param dhCont
         */
        public final void setDhCont(String dhCont) {
            this.dhCont = dhCont;
        }

        /**
         * Informar a Justificativa da entrada
         *
         * @return String
         */
        public final String getXJust() {
            return this.xJust;
        }

        /**
         * Informar a Justificativa da entrada
         *
         * @param xJust
         */
        public final void setXJust(String xJust) {
            this.xJust = xJust;
        }

        /**
         * Grupo de infromações da NF referenciada
         *
         * @return java.util.List
         */
        public final java.util.List<NFref> getNFref() {
            if(this.nFref == null) {
                this.nFref = new java.util.ArrayList();
            }
            return this.nFref;
        }

        /**
         * Grupo de infromações da NF referenciada
         *
         * @param nFref
         */
        public final void setNFref(java.util.List<NFref> nFref) {
            this.nFref = nFref;
        }

    }

    /**
     * Grupo de infromações da NF referenciada
     */
    public static class NFref extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("refNFe")
        protected String refNFe;

        @br.com.ctecinf.SimpleXML.Name("refNFeSig")
        protected String refNFeSig;

        @br.com.ctecinf.SimpleXML.Name("refNF")
        protected RefNF refNF;

        @br.com.ctecinf.SimpleXML.Name("refNFP")
        protected RefNFP refNFP;

        @br.com.ctecinf.SimpleXML.Name("refCTe")
        protected String refCTe;

        @br.com.ctecinf.SimpleXML.Name("refECF")
        protected RefECF refECF;

        public NFref() {
            super("NFref");
        }

        /**
         * Chave de acesso das NF-e referenciadas. Chave de acesso compostas por Código da UF (tabela do IBGE) + AAMM da emissão + CNPJ do Emitente + modelo, série e número da NF-e Referenciada + Código Numérico + DV.
         *
         * @return String
         */
        public final String getRefNFe() {
            return this.refNFe;
        }

        /**
         * Chave de acesso das NF-e referenciadas. Chave de acesso compostas por Código da UF (tabela do IBGE) + AAMM da emissão + CNPJ do Emitente + modelo, série e número da NF-e Referenciada + Código Numérico + DV.
         *
         * @param refNFe
         */
        public final void setRefNFe(String refNFe) {
            this.refNFe = refNFe;
        }

        /**
         * Referencia uma NF-e (modelo 55) emitida anteriormente pela sua Chave de Acesso com código numérico zerado, permitindo manter o sigilo da NF-e referenciada.
         *
         * @return String
         */
        public final String getRefNFeSig() {
            return this.refNFeSig;
        }

        /**
         * Referencia uma NF-e (modelo 55) emitida anteriormente pela sua Chave de Acesso com código numérico zerado, permitindo manter o sigilo da NF-e referenciada.
         *
         * @param refNFeSig
         */
        public final void setRefNFeSig(String refNFeSig) {
            this.refNFeSig = refNFeSig;
        }

        /**
         * Dados da NF modelo 1/1A referenciada ou NF modelo 2 referenciada
         *
         * @return RefNF
         */
        public final RefNF getRefNF() {
            return this.refNF;
        }

        /**
         * Dados da NF modelo 1/1A referenciada ou NF modelo 2 referenciada
         *
         * @param refNF
         */
        public final void setRefNF(RefNF refNF) {
            this.refNF = refNF;
        }

        /**
         * Grupo com as informações NF de produtor referenciada
         *
         * @return RefNFP
         */
        public final RefNFP getRefNFP() {
            return this.refNFP;
        }

        /**
         * Grupo com as informações NF de produtor referenciada
         *
         * @param refNFP
         */
        public final void setRefNFP(RefNFP refNFP) {
            this.refNFP = refNFP;
        }

        /**
         * Utilizar esta TAG para referenciar um CT-e emitido anteriormente, vinculada a NF-e atual
         *
         * @return String
         */
        public final String getRefCTe() {
            return this.refCTe;
        }

        /**
         * Utilizar esta TAG para referenciar um CT-e emitido anteriormente, vinculada a NF-e atual
         *
         * @param refCTe
         */
        public final void setRefCTe(String refCTe) {
            this.refCTe = refCTe;
        }

        /**
         * Grupo do Cupom Fiscal vinculado à NF-e
         *
         * @return RefECF
         */
        public final RefECF getRefECF() {
            return this.refECF;
        }

        /**
         * Grupo do Cupom Fiscal vinculado à NF-e
         *
         * @param refECF
         */
        public final void setRefECF(RefECF refECF) {
            this.refECF = refECF;
        }

    }

    /**
     * Dados da NF modelo 1/1A referenciada ou NF modelo 2 referenciada
     */
    public static class RefNF extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cUF")
        protected String cUF;

        @br.com.ctecinf.SimpleXML.Name("AAMM")
        protected String aAMM;

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("mod")
        protected String mod;

        @br.com.ctecinf.SimpleXML.Name("serie")
        protected String serie;

        @br.com.ctecinf.SimpleXML.Name("nNF")
        protected String nNF;

        public RefNF() {
            super("refNF");
        }

        /**
         * Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do IBGE.
         *
         * @return String
         */
        public final String getCUF() {
            return this.cUF;
        }

        /**
         * Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do IBGE.
         *
         * @param cUF
         */
        public final void setCUF(String cUF) {
            this.cUF = cUF;
        }

        /**
         * AAMM da emissão
         *
         * @return String
         */
        public final String getAAMM() {
            return this.aAMM;
        }

        /**
         * AAMM da emissão
         *
         * @param aAMM
         */
        public final void setAAMM(String aAMM) {
            this.aAMM = aAMM;
        }

        /**
         * CNPJ do emitente do documento fiscal referenciado
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do emitente do documento fiscal referenciado
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Código do modelo do Documento Fiscal. Utilizar 01 para NF modelo 1/1A e 02 para NF modelo 02
         *
         * @return String
         */
        public final String getMod() {
            return this.mod;
        }

        /**
         * Código do modelo do Documento Fiscal. Utilizar 01 para NF modelo 1/1A e 02 para NF modelo 02
         *
         * @param mod
         */
        public final void setMod(String mod) {
            this.mod = mod;
        }

        /**
         * Série do Documento Fiscal, informar zero se inexistente
         *
         * @return String
         */
        public final String getSerie() {
            return this.serie;
        }

        /**
         * Série do Documento Fiscal, informar zero se inexistente
         *
         * @param serie
         */
        public final void setSerie(String serie) {
            this.serie = serie;
        }

        /**
         * Número do Documento Fiscal
         *
         * @return String
         */
        public final String getNNF() {
            return this.nNF;
        }

        /**
         * Número do Documento Fiscal
         *
         * @param nNF
         */
        public final void setNNF(String nNF) {
            this.nNF = nNF;
        }

    }

    /**
     * Grupo com as informações NF de produtor referenciada
     */
    public static class RefNFP extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cUF")
        protected String cUF;

        @br.com.ctecinf.SimpleXML.Name("AAMM")
        protected String aAMM;

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("CPF")
        protected String cPF;

        @br.com.ctecinf.SimpleXML.Name("IE")
        protected String iE;

        @br.com.ctecinf.SimpleXML.Name("mod")
        protected String mod;

        @br.com.ctecinf.SimpleXML.Name("serie")
        protected String serie;

        @br.com.ctecinf.SimpleXML.Name("nNF")
        protected String nNF;

        public RefNFP() {
            super("refNFP");
        }

        /**
         * Código da UF do emitente do Documento FiscalUtilizar a Tabela do IBGE (Anexo IV - Tabela de UF, Município e País)
         *
         * @return String
         */
        public final String getCUF() {
            return this.cUF;
        }

        /**
         * Código da UF do emitente do Documento FiscalUtilizar a Tabela do IBGE (Anexo IV - Tabela de UF, Município e País)
         *
         * @param cUF
         */
        public final void setCUF(String cUF) {
            this.cUF = cUF;
        }

        /**
         * AAMM da emissão da NF de produtor
         *
         * @return String
         */
        public final String getAAMM() {
            return this.aAMM;
        }

        /**
         * AAMM da emissão da NF de produtor
         *
         * @param aAMM
         */
        public final void setAAMM(String aAMM) {
            this.aAMM = aAMM;
        }

        /**
         * CNPJ do emitente da NF de produtor
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do emitente da NF de produtor
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * CPF do emitente da NF de produtor
         *
         * @return String
         */
        public final String getCPF() {
            return this.cPF;
        }

        /**
         * CPF do emitente da NF de produtor
         *
         * @param cPF
         */
        public final void setCPF(String cPF) {
            this.cPF = cPF;
        }

        /**
         * IE do emitente da NF de Produtor
         *
         * @return String
         */
        public final String getIE() {
            return this.iE;
        }

        /**
         * IE do emitente da NF de Produtor
         *
         * @param iE
         */
        public final void setIE(String iE) {
            this.iE = iE;
        }

        /**
         * Código do modelo do Documento Fiscal - utilizar 04 para NF de produtor  ou 01 para NF Avulsa
         *
         * @return String
         */
        public final String getMod() {
            return this.mod;
        }

        /**
         * Código do modelo do Documento Fiscal - utilizar 04 para NF de produtor  ou 01 para NF Avulsa
         *
         * @param mod
         */
        public final void setMod(String mod) {
            this.mod = mod;
        }

        /**
         * Série do Documento Fiscal, informar zero se inexistentesérie
         *
         * @return String
         */
        public final String getSerie() {
            return this.serie;
        }

        /**
         * Série do Documento Fiscal, informar zero se inexistentesérie
         *
         * @param serie
         */
        public final void setSerie(String serie) {
            this.serie = serie;
        }

        /**
         * Número do Documento Fiscal - 1 – 999999999
         *
         * @return String
         */
        public final String getNNF() {
            return this.nNF;
        }

        /**
         * Número do Documento Fiscal - 1 – 999999999
         *
         * @param nNF
         */
        public final void setNNF(String nNF) {
            this.nNF = nNF;
        }

    }

    /**
     * Grupo do Cupom Fiscal vinculado à NF-e
     */
    public static class RefECF extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("mod")
        protected String mod;

        @br.com.ctecinf.SimpleXML.Name("nECF")
        protected String nECF;

        @br.com.ctecinf.SimpleXML.Name("nCOO")
        protected String nCOO;

        public RefECF() {
            super("refECF");
        }

        /**
         * Código do modelo do Documento Fiscal <br>
         * Preencher com "2B", quando se tratar de Cupom Fiscal emitido por máquina registradora (não ECF), com "2C", quando se tratar de Cupom Fiscal PDV, ou "2D", quando se tratar de Cupom Fiscal (emitido por ECF)
         *
         * @return String
         */
        public final String getMod() {
            return this.mod;
        }

        /**
         * Código do modelo do Documento Fiscal <br>
         * Preencher com "2B", quando se tratar de Cupom Fiscal emitido por máquina registradora (não ECF), com "2C", quando se tratar de Cupom Fiscal PDV, ou "2D", quando se tratar de Cupom Fiscal (emitido por ECF)
         *
         * @param mod
         */
        public final void setMod(String mod) {
            this.mod = mod;
        }

        /**
         * Informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e
         *
         * @return String
         */
        public final String getNECF() {
            return this.nECF;
        }

        /**
         * Informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e
         *
         * @param nECF
         */
        public final void setNECF(String nECF) {
            this.nECF = nECF;
        }

        /**
         * Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e
         *
         * @return String
         */
        public final String getNCOO() {
            return this.nCOO;
        }

        /**
         * Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e
         *
         * @param nCOO
         */
        public final void setNCOO(String nCOO) {
            this.nCOO = nCOO;
        }

    }

    /**
     * Identificação do emitente
     */
    public static class Emit extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("CPF")
        protected String cPF;

        @br.com.ctecinf.SimpleXML.Name("xNome")
        protected String xNome;

        @br.com.ctecinf.SimpleXML.Name("xFant")
        protected String xFant;

        @br.com.ctecinf.SimpleXML.Name("enderEmit")
        protected TEnderEmi enderEmit;

        @br.com.ctecinf.SimpleXML.Name("IE")
        protected String iE;

        @br.com.ctecinf.SimpleXML.Name("IEST")
        protected String iEST;

        @br.com.ctecinf.SimpleXML.Name("IM")
        protected String iM;

        @br.com.ctecinf.SimpleXML.Name("CNAE")
        protected String cNAE;

        @br.com.ctecinf.SimpleXML.Name("CRT")
        protected String cRT;

        public Emit() {
            super("emit");
        }

        /**
         * Número do CNPJ do emitente
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * Número do CNPJ do emitente
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Número do CPF do emitente
         *
         * @return String
         */
        public final String getCPF() {
            return this.cPF;
        }

        /**
         * Número do CPF do emitente
         *
         * @param cPF
         */
        public final void setCPF(String cPF) {
            this.cPF = cPF;
        }

        /**
         * Razão Social ou Nome do emitente
         *
         * @return String
         */
        public final String getXNome() {
            return this.xNome;
        }

        /**
         * Razão Social ou Nome do emitente
         *
         * @param xNome
         */
        public final void setXNome(String xNome) {
            this.xNome = xNome;
        }

        /**
         * Nome fantasia
         *
         * @return String
         */
        public final String getXFant() {
            return this.xFant;
        }

        /**
         * Nome fantasia
         *
         * @param xFant
         */
        public final void setXFant(String xFant) {
            this.xFant = xFant;
        }

        /**
         * Endereço do emitente
         *
         * @return TEnderEmi
         */
        public final TEnderEmi getEnderEmit() {
            return this.enderEmit;
        }

        /**
         * Endereço do emitente
         *
         * @param enderEmit
         */
        public final void setEnderEmit(TEnderEmi enderEmit) {
            this.enderEmit = enderEmit;
        }

        /**
         * Inscrição Estadual do Emitente
         *
         * @return String
         */
        public final String getIE() {
            return this.iE;
        }

        /**
         * Inscrição Estadual do Emitente
         *
         * @param iE
         */
        public final void setIE(String iE) {
            this.iE = iE;
        }

        /**
         * Inscricao Estadual do Substituto Tributário
         *
         * @return String
         */
        public final String getIEST() {
            return this.iEST;
        }

        /**
         * Inscricao Estadual do Substituto Tributário
         *
         * @param iEST
         */
        public final void setIEST(String iEST) {
            this.iEST = iEST;
        }

        /**
         * Inscrição Municipal
         *
         * @return String
         */
        public final String getIM() {
            return this.iM;
        }

        /**
         * Inscrição Municipal
         *
         * @param iM
         */
        public final void setIM(String iM) {
            this.iM = iM;
        }

        /**
         * CNAE Fiscal
         *
         * @return String
         */
        public final String getCNAE() {
            return this.cNAE;
        }

        /**
         * CNAE Fiscal
         *
         * @param cNAE
         */
        public final void setCNAE(String cNAE) {
            this.cNAE = cNAE;
        }

        /**
         * Código de Regime Tributário. <br>
         * Este campo será obrigatoriamente preenchido com:<br>
         * 1 – Simples Nacional;<br>
         * 2 – Simples Nacional – excesso de sublimite de receita bruta;<br>
         * 3 – Regime Normal.
         *
         * @return String
         */
        public final String getCRT() {
            return this.cRT;
        }

        /**
         * Código de Regime Tributário. <br>
         * Este campo será obrigatoriamente preenchido com:<br>
         * 1 – Simples Nacional;<br>
         * 2 – Simples Nacional – excesso de sublimite de receita bruta;<br>
         * 3 – Regime Normal.
         *
         * @param cRT
         */
        public final void setCRT(String cRT) {
            this.cRT = cRT;
        }

    }

    /**
     * Emissão de avulsa, informar os dados do Fisco emitente
     */
    public static class Avulsa extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("xOrgao")
        protected String xOrgao;

        @br.com.ctecinf.SimpleXML.Name("matr")
        protected String matr;

        @br.com.ctecinf.SimpleXML.Name("xAgente")
        protected String xAgente;

        @br.com.ctecinf.SimpleXML.Name("fone")
        protected String fone;

        @br.com.ctecinf.SimpleXML.Name("UF")
        protected TUfEmi uF;

        @br.com.ctecinf.SimpleXML.Name("nDAR")
        protected String nDAR;

        @br.com.ctecinf.SimpleXML.Name("dEmi")
        protected String dEmi;

        @br.com.ctecinf.SimpleXML.Name("vDAR")
        protected String vDAR;

        @br.com.ctecinf.SimpleXML.Name("repEmi")
        protected String repEmi;

        @br.com.ctecinf.SimpleXML.Name("dPag")
        protected String dPag;

        public Avulsa() {
            super("avulsa");
        }

        /**
         * CNPJ do Órgão emissor
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do Órgão emissor
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Órgão emitente
         *
         * @return String
         */
        public final String getXOrgao() {
            return this.xOrgao;
        }

        /**
         * Órgão emitente
         *
         * @param xOrgao
         */
        public final void setXOrgao(String xOrgao) {
            this.xOrgao = xOrgao;
        }

        /**
         * Matrícula do agente
         *
         * @return String
         */
        public final String getMatr() {
            return this.matr;
        }

        /**
         * Matrícula do agente
         *
         * @param matr
         */
        public final void setMatr(String matr) {
            this.matr = matr;
        }

        /**
         * Nome do agente
         *
         * @return String
         */
        public final String getXAgente() {
            return this.xAgente;
        }

        /**
         * Nome do agente
         *
         * @param xAgente
         */
        public final void setXAgente(String xAgente) {
            this.xAgente = xAgente;
        }

        /**
         * Telefone
         *
         * @return String
         */
        public final String getFone() {
            return this.fone;
        }

        /**
         * Telefone
         *
         * @param fone
         */
        public final void setFone(String fone) {
            this.fone = fone;
        }

        /**
         * Sigla da Unidade da Federação
         *
         * @return TUfEmi
         */
        public final TUfEmi getUF() {
            return this.uF;
        }

        /**
         * Sigla da Unidade da Federação
         *
         * @param uF
         */
        public final void setUF(TUfEmi uF) {
            this.uF = uF;
        }

        /**
         * Número do Documento de Arrecadação de Receita
         *
         * @return String
         */
        public final String getNDAR() {
            return this.nDAR;
        }

        /**
         * Número do Documento de Arrecadação de Receita
         *
         * @param nDAR
         */
        public final void setNDAR(String nDAR) {
            this.nDAR = nDAR;
        }

        /**
         * Data de emissão do DAR (AAAA-MM-DD)
         *
         * @return String
         */
        public final String getDEmi() {
            return this.dEmi;
        }

        /**
         * Data de emissão do DAR (AAAA-MM-DD)
         *
         * @param dEmi
         */
        public final void setDEmi(String dEmi) {
            this.dEmi = dEmi;
        }

        /**
         * Valor Total constante no DAR
         *
         * @return String
         */
        public final String getVDAR() {
            return this.vDAR;
        }

        /**
         * Valor Total constante no DAR
         *
         * @param vDAR
         */
        public final void setVDAR(String vDAR) {
            this.vDAR = vDAR;
        }

        /**
         * Repartição Fiscal emitente
         *
         * @return String
         */
        public final String getRepEmi() {
            return this.repEmi;
        }

        /**
         * Repartição Fiscal emitente
         *
         * @param repEmi
         */
        public final void setRepEmi(String repEmi) {
            this.repEmi = repEmi;
        }

        /**
         * Data de pagamento do DAR (AAAA-MM-DD)
         *
         * @return String
         */
        public final String getDPag() {
            return this.dPag;
        }

        /**
         * Data de pagamento do DAR (AAAA-MM-DD)
         *
         * @param dPag
         */
        public final void setDPag(String dPag) {
            this.dPag = dPag;
        }

    }

    /**
     * Identificação do Destinatário
     */
    public static class Dest extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("CPF")
        protected String cPF;

        @br.com.ctecinf.SimpleXML.Name("idEstrangeiro")
        protected String idEstrangeiro;

        @br.com.ctecinf.SimpleXML.Name("xNome")
        protected String xNome;

        @br.com.ctecinf.SimpleXML.Name("enderDest")
        protected TEndereco enderDest;

        @br.com.ctecinf.SimpleXML.Name("indIEDest")
        protected String indIEDest;

        @br.com.ctecinf.SimpleXML.Name("IE")
        protected String iE;

        @br.com.ctecinf.SimpleXML.Name("ISUF")
        protected String iSUF;

        @br.com.ctecinf.SimpleXML.Name("IM")
        protected String iM;

        @br.com.ctecinf.SimpleXML.Name("email")
        protected String email;

        public Dest() {
            super("dest");
        }

        /**
         * Número do CNPJ
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * Número do CNPJ
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Número do CPF
         *
         * @return String
         */
        public final String getCPF() {
            return this.cPF;
        }

        /**
         * Número do CPF
         *
         * @param cPF
         */
        public final void setCPF(String cPF) {
            this.cPF = cPF;
        }

        /**
         * Identificador do destinatário, em caso de comprador estrangeiro
         *
         * @return String
         */
        public final String getIdEstrangeiro() {
            return this.idEstrangeiro;
        }

        /**
         * Identificador do destinatário, em caso de comprador estrangeiro
         *
         * @param idEstrangeiro
         */
        public final void setIdEstrangeiro(String idEstrangeiro) {
            this.idEstrangeiro = idEstrangeiro;
        }

        /**
         * Razão Social ou nome do destinatário
         *
         * @return String
         */
        public final String getXNome() {
            return this.xNome;
        }

        /**
         * Razão Social ou nome do destinatário
         *
         * @param xNome
         */
        public final void setXNome(String xNome) {
            this.xNome = xNome;
        }

        /**
         * Dados do endereço
         *
         * @return TEndereco
         */
        public final TEndereco getEnderDest() {
            return this.enderDest;
        }

        /**
         * Dados do endereço
         *
         * @param enderDest
         */
        public final void setEnderDest(TEndereco enderDest) {
            this.enderDest = enderDest;
        }

        /**
         * Indicador da IE do destinatário:<br>
         * 1 – Contribuinte ICMSpagamento à vista;<br>
         * 2 – Contribuinte isento de inscrição;<br>
         * 9 – Não Contribuinte
         *
         * @return String
         */
        public final String getIndIEDest() {
            return this.indIEDest;
        }

        /**
         * Indicador da IE do destinatário:<br>
         * 1 – Contribuinte ICMSpagamento à vista;<br>
         * 2 – Contribuinte isento de inscrição;<br>
         * 9 – Não Contribuinte
         *
         * @param indIEDest
         */
        public final void setIndIEDest(String indIEDest) {
            this.indIEDest = indIEDest;
        }

        /**
         * Inscrição Estadual (obrigatório nas operações com contribuintes do ICMS)
         *
         * @return String
         */
        public final String getIE() {
            return this.iE;
        }

        /**
         * Inscrição Estadual (obrigatório nas operações com contribuintes do ICMS)
         *
         * @param iE
         */
        public final void setIE(String iE) {
            this.iE = iE;
        }

        /**
         * Inscrição na SUFRAMA (Obrigatório nas operações com as áreas com benefícios de incentivos fiscais sob controle da SUFRAMA) PL_005d - 11/08/09 - alterado para aceitar 8 ou 9 dígitos
         *
         * @return String
         */
        public final String getISUF() {
            return this.iSUF;
        }

        /**
         * Inscrição na SUFRAMA (Obrigatório nas operações com as áreas com benefícios de incentivos fiscais sob controle da SUFRAMA) PL_005d - 11/08/09 - alterado para aceitar 8 ou 9 dígitos
         *
         * @param iSUF
         */
        public final void setISUF(String iSUF) {
            this.iSUF = iSUF;
        }

        /**
         * Inscrição Municipal do tomador do serviço
         *
         * @return String
         */
        public final String getIM() {
            return this.iM;
        }

        /**
         * Inscrição Municipal do tomador do serviço
         *
         * @param iM
         */
        public final void setIM(String iM) {
            this.iM = iM;
        }

        /**
         * Informar o e-mail do destinatário. O campo pode ser utilizado para informar o e-mail<br>
         * de recepção da NF-e indicada pelo destinatário
         *
         * @return String
         */
        public final String getEmail() {
            return this.email;
        }

        /**
         * Informar o e-mail do destinatário. O campo pode ser utilizado para informar o e-mail<br>
         * de recepção da NF-e indicada pelo destinatário
         *
         * @param email
         */
        public final void setEmail(String email) {
            this.email = email;
        }

    }

    /**
     * Pessoas autorizadas para o download do XML da NF-e
     */
    public static class AutXML extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("CPF")
        protected String cPF;

        public AutXML() {
            super("autXML");
        }

        /**
         * CNPJ Autorizado
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ Autorizado
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * CPF Autorizado
         *
         * @return String
         */
        public final String getCPF() {
            return this.cPF;
        }

        /**
         * CPF Autorizado
         *
         * @param cPF
         */
        public final void setCPF(String cPF) {
            this.cPF = cPF;
        }

    }

    /**
     * Dados dos detalhes da NF-e
     */
    public static class Det extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("prod")
        protected Prod prod;

        @br.com.ctecinf.SimpleXML.Name("imposto")
        protected Imposto imposto;

        @br.com.ctecinf.SimpleXML.Name("impostoDevol")
        protected ImpostoDevol impostoDevol;

        @br.com.ctecinf.SimpleXML.Name("infAdProd")
        protected String infAdProd;

        @br.com.ctecinf.SimpleXML.Name("obsItem")
        protected ObsItem obsItem;

        public Det() {
            super("det", "nItem");
        }

        /**
         * Número do item do NF
         *
         * @param nItem
         */
        public final void setNItem(String nItem) {
            this.setAttribute("nItem", nItem);
        }

        /**
         * Dados dos produtos e serviços da NF-e
         *
         * @return Prod
         */
        public final Prod getProd() {
            return this.prod;
        }

        /**
         * Dados dos produtos e serviços da NF-e
         *
         * @param prod
         */
        public final void setProd(Prod prod) {
            this.prod = prod;
        }

        /**
         * Tributos incidentes nos produtos ou serviços da NF-e
         *
         * @return Imposto
         */
        public final Imposto getImposto() {
            return this.imposto;
        }

        /**
         * Tributos incidentes nos produtos ou serviços da NF-e
         *
         * @param imposto
         */
        public final void setImposto(Imposto imposto) {
            this.imposto = imposto;
        }

        public final ImpostoDevol getImpostoDevol() {
            return this.impostoDevol;
        }

        public final void setImpostoDevol(ImpostoDevol impostoDevol) {
            this.impostoDevol = impostoDevol;
        }

        /**
         * Informações adicionais do produto (norma referenciada, informações complementares, etc)
         *
         * @return String
         */
        public final String getInfAdProd() {
            return this.infAdProd;
        }

        /**
         * Informações adicionais do produto (norma referenciada, informações complementares, etc)
         *
         * @param infAdProd
         */
        public final void setInfAdProd(String infAdProd) {
            this.infAdProd = infAdProd;
        }

        /**
         * Grupo de observações de uso livre (para o item da NF-e)
         *
         * @return ObsItem
         */
        public final ObsItem getObsItem() {
            return this.obsItem;
        }

        /**
         * Grupo de observações de uso livre (para o item da NF-e)
         *
         * @param obsItem
         */
        public final void setObsItem(ObsItem obsItem) {
            this.obsItem = obsItem;
        }

    }

    /**
     * Dados dos produtos e serviços da NF-e
     */
    public static class Prod extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cProd")
        protected String cProd;

        @br.com.ctecinf.SimpleXML.Name("cEAN")
        protected String cEAN;

        @br.com.ctecinf.SimpleXML.Name("cBarra")
        protected String cBarra;

        @br.com.ctecinf.SimpleXML.Name("xProd")
        protected String xProd;

        @br.com.ctecinf.SimpleXML.Name("NCM")
        protected String nCM;

        @br.com.ctecinf.SimpleXML.Name("NVE")
        protected java.util.List<String> nVE;

        @br.com.ctecinf.SimpleXML.Name("CEST")
        protected String cEST;

        @br.com.ctecinf.SimpleXML.Name("indEscala")
        protected String indEscala;

        @br.com.ctecinf.SimpleXML.Name("CNPJFab")
        protected String cNPJFab;

        @br.com.ctecinf.SimpleXML.Name("cBenef")
        protected String cBenef;

        @br.com.ctecinf.SimpleXML.Name("EXTIPI")
        protected String eXTIPI;

        @br.com.ctecinf.SimpleXML.Name("CFOP")
        protected String cFOP;

        @br.com.ctecinf.SimpleXML.Name("uCom")
        protected String uCom;

        @br.com.ctecinf.SimpleXML.Name("qCom")
        protected String qCom;

        @br.com.ctecinf.SimpleXML.Name("vUnCom")
        protected String vUnCom;

        @br.com.ctecinf.SimpleXML.Name("vProd")
        protected String vProd;

        @br.com.ctecinf.SimpleXML.Name("cEANTrib")
        protected String cEANTrib;

        @br.com.ctecinf.SimpleXML.Name("cBarraTrib")
        protected String cBarraTrib;

        @br.com.ctecinf.SimpleXML.Name("uTrib")
        protected String uTrib;

        @br.com.ctecinf.SimpleXML.Name("qTrib")
        protected String qTrib;

        @br.com.ctecinf.SimpleXML.Name("vUnTrib")
        protected String vUnTrib;

        @br.com.ctecinf.SimpleXML.Name("vFrete")
        protected String vFrete;

        @br.com.ctecinf.SimpleXML.Name("vSeg")
        protected String vSeg;

        @br.com.ctecinf.SimpleXML.Name("vDesc")
        protected String vDesc;

        @br.com.ctecinf.SimpleXML.Name("vOutro")
        protected String vOutro;

        @br.com.ctecinf.SimpleXML.Name("indTot")
        protected String indTot;

        @br.com.ctecinf.SimpleXML.Name("DI")
        protected java.util.List<DI> dI;

        @br.com.ctecinf.SimpleXML.Name("detExport")
        protected java.util.List<DetExport> detExport;

        @br.com.ctecinf.SimpleXML.Name("xPed")
        protected String xPed;

        @br.com.ctecinf.SimpleXML.Name("nItemPed")
        protected String nItemPed;

        @br.com.ctecinf.SimpleXML.Name("nFCI")
        protected String nFCI;

        @br.com.ctecinf.SimpleXML.Name("rastro")
        protected java.util.List<Rastro> rastro;

        @br.com.ctecinf.SimpleXML.Name("infProdNFF")
        protected InfProdNFF infProdNFF;

        @br.com.ctecinf.SimpleXML.Name("infProdEmb")
        protected InfProdEmb infProdEmb;

        @br.com.ctecinf.SimpleXML.Name("veicProd")
        protected VeicProd veicProd;

        @br.com.ctecinf.SimpleXML.Name("med")
        protected Med med;

        @br.com.ctecinf.SimpleXML.Name("arma")
        protected java.util.List<Arma> arma;

        @br.com.ctecinf.SimpleXML.Name("comb")
        protected Comb comb;

        @br.com.ctecinf.SimpleXML.Name("nRECOPI")
        protected String nRECOPI;

        public Prod() {
            super("prod");
        }

        /**
         * Código do produto ou serviço. Preencher com CFOP caso se trate de itens não relacionados com mercadorias/produto e que o contribuinte não possua codificação própria<br>
         * Formato ”CFOP9999”.
         *
         * @return String
         */
        public final String getCProd() {
            return this.cProd;
        }

        /**
         * Código do produto ou serviço. Preencher com CFOP caso se trate de itens não relacionados com mercadorias/produto e que o contribuinte não possua codificação própria<br>
         * Formato ”CFOP9999”.
         *
         * @param cProd
         */
        public final void setCProd(String cProd) {
            this.cProd = cProd;
        }

        /**
         * GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras
         *
         * @return String
         */
        public final String getCEAN() {
            return this.cEAN;
        }

        /**
         * GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras
         *
         * @param cEAN
         */
        public final void setCEAN(String cEAN) {
            this.cEAN = cEAN;
        }

        /**
         * Codigo de barras diferente do padrão GTIN
         *
         * @return String
         */
        public final String getCBarra() {
            return this.cBarra;
        }

        /**
         * Codigo de barras diferente do padrão GTIN
         *
         * @param cBarra
         */
        public final void setCBarra(String cBarra) {
            this.cBarra = cBarra;
        }

        /**
         * Descrição do produto ou serviço
         *
         * @return String
         */
        public final String getXProd() {
            return this.xProd;
        }

        /**
         * Descrição do produto ou serviço
         *
         * @param xProd
         */
        public final void setXProd(String xProd) {
            this.xProd = xProd;
        }

        /**
         * Código NCM (8 posições), será permitida a informação do gênero (posição do capítulo do NCM) quando a operação não for de comércio exterior (importação/exportação) ou o produto não seja tributado pelo IPI. Em caso de item de serviço ou item que não tenham produto (Ex. transferência de crédito, crédito do ativo imobilizado, etc.), informar o código 00 (zeros) (v2.0)
         *
         * @return String
         */
        public final String getNCM() {
            return this.nCM;
        }

        /**
         * Código NCM (8 posições), será permitida a informação do gênero (posição do capítulo do NCM) quando a operação não for de comércio exterior (importação/exportação) ou o produto não seja tributado pelo IPI. Em caso de item de serviço ou item que não tenham produto (Ex. transferência de crédito, crédito do ativo imobilizado, etc.), informar o código 00 (zeros) (v2.0)
         *
         * @param nCM
         */
        public final void setNCM(String nCM) {
            this.nCM = nCM;
        }

        /**
         * Nomenclatura de Valor aduaneio e Estatístico
         *
         * @return java.util.List
         */
        public final java.util.List<String> getNVE() {
            if(this.nVE == null) {
                this.nVE = new java.util.ArrayList();
            }
            return this.nVE;
        }

        /**
         * Nomenclatura de Valor aduaneio e Estatístico
         *
         * @param nVE
         */
        public final void setNVE(java.util.List<String> nVE) {
            this.nVE = nVE;
        }

        /**
         * Codigo especificador da Substuicao Tributaria - CEST, que identifica a mercadoria sujeita aos regimes de  substituicao tributária e de antecipação do recolhimento  do imposto
         *
         * @return String
         */
        public final String getCEST() {
            return this.cEST;
        }

        /**
         * Codigo especificador da Substuicao Tributaria - CEST, que identifica a mercadoria sujeita aos regimes de  substituicao tributária e de antecipação do recolhimento  do imposto
         *
         * @param cEST
         */
        public final void setCEST(String cEST) {
            this.cEST = cEST;
        }

        public final String getIndEscala() {
            return this.indEscala;
        }

        public final void setIndEscala(String indEscala) {
            this.indEscala = indEscala;
        }

        /**
         * CNPJ do Fabricante da Mercadoria, obrigatório para produto em escala NÃO relevante.
         *
         * @return String
         */
        public final String getCNPJFab() {
            return this.cNPJFab;
        }

        /**
         * CNPJ do Fabricante da Mercadoria, obrigatório para produto em escala NÃO relevante.
         *
         * @param cNPJFab
         */
        public final void setCNPJFab(String cNPJFab) {
            this.cNPJFab = cNPJFab;
        }

        public final String getCBenef() {
            return this.cBenef;
        }

        public final void setCBenef(String cBenef) {
            this.cBenef = cBenef;
        }

        /**
         * Código EX TIPI (3 posições)
         *
         * @return String
         */
        public final String getEXTIPI() {
            return this.eXTIPI;
        }

        /**
         * Código EX TIPI (3 posições)
         *
         * @param eXTIPI
         */
        public final void setEXTIPI(String eXTIPI) {
            this.eXTIPI = eXTIPI;
        }

        /**
         * Cfop
         *
         * @return String
         */
        public final String getCFOP() {
            return this.cFOP;
        }

        /**
         * Cfop
         *
         * @param cFOP
         */
        public final void setCFOP(String cFOP) {
            this.cFOP = cFOP;
        }

        /**
         * Unidade comercial
         *
         * @return String
         */
        public final String getUCom() {
            return this.uCom;
        }

        /**
         * Unidade comercial
         *
         * @param uCom
         */
        public final void setUCom(String uCom) {
            this.uCom = uCom;
        }

        /**
         * Quantidade Comercial  do produto, alterado para aceitar de 0 a 4 casas decimais e 11 inteiros.
         *
         * @return String
         */
        public final String getQCom() {
            return this.qCom;
        }

        /**
         * Quantidade Comercial  do produto, alterado para aceitar de 0 a 4 casas decimais e 11 inteiros.
         *
         * @param qCom
         */
        public final void setQCom(String qCom) {
            this.qCom = qCom;
        }

        /**
         * Valor unitário de comercialização  - alterado para aceitar 0 a 10 casas decimais e 11 inteiros
         *
         * @return String
         */
        public final String getVUnCom() {
            return this.vUnCom;
        }

        /**
         * Valor unitário de comercialização  - alterado para aceitar 0 a 10 casas decimais e 11 inteiros
         *
         * @param vUnCom
         */
        public final void setVUnCom(String vUnCom) {
            this.vUnCom = vUnCom;
        }

        /**
         * Valor bruto do produto ou serviço.
         *
         * @return String
         */
        public final String getVProd() {
            return this.vProd;
        }

        /**
         * Valor bruto do produto ou serviço.
         *
         * @param vProd
         */
        public final void setVProd(String vProd) {
            this.vProd = vProd;
        }

        /**
         * GTIN (Global Trade Item Number) da unidade tributável, antigo código EAN ou código de barras
         *
         * @return String
         */
        public final String getCEANTrib() {
            return this.cEANTrib;
        }

        /**
         * GTIN (Global Trade Item Number) da unidade tributável, antigo código EAN ou código de barras
         *
         * @param cEANTrib
         */
        public final void setCEANTrib(String cEANTrib) {
            this.cEANTrib = cEANTrib;
        }

        /**
         * Código de barras da unidade tributável diferente do padrão GTIN
         *
         * @return String
         */
        public final String getCBarraTrib() {
            return this.cBarraTrib;
        }

        /**
         * Código de barras da unidade tributável diferente do padrão GTIN
         *
         * @param cBarraTrib
         */
        public final void setCBarraTrib(String cBarraTrib) {
            this.cBarraTrib = cBarraTrib;
        }

        /**
         * Unidade Tributável
         *
         * @return String
         */
        public final String getUTrib() {
            return this.uTrib;
        }

        /**
         * Unidade Tributável
         *
         * @param uTrib
         */
        public final void setUTrib(String uTrib) {
            this.uTrib = uTrib;
        }

        /**
         * Quantidade Tributável - alterado para aceitar de 0 a 4 casas decimais e 11 inteiros
         *
         * @return String
         */
        public final String getQTrib() {
            return this.qTrib;
        }

        /**
         * Quantidade Tributável - alterado para aceitar de 0 a 4 casas decimais e 11 inteiros
         *
         * @param qTrib
         */
        public final void setQTrib(String qTrib) {
            this.qTrib = qTrib;
        }

        /**
         * Valor unitário de tributação - - alterado para aceitar 0 a 10 casas decimais e 11 inteiros
         *
         * @return String
         */
        public final String getVUnTrib() {
            return this.vUnTrib;
        }

        /**
         * Valor unitário de tributação - - alterado para aceitar 0 a 10 casas decimais e 11 inteiros
         *
         * @param vUnTrib
         */
        public final void setVUnTrib(String vUnTrib) {
            this.vUnTrib = vUnTrib;
        }

        /**
         * Valor Total do Frete
         *
         * @return String
         */
        public final String getVFrete() {
            return this.vFrete;
        }

        /**
         * Valor Total do Frete
         *
         * @param vFrete
         */
        public final void setVFrete(String vFrete) {
            this.vFrete = vFrete;
        }

        /**
         * Valor Total do Seguro
         *
         * @return String
         */
        public final String getVSeg() {
            return this.vSeg;
        }

        /**
         * Valor Total do Seguro
         *
         * @param vSeg
         */
        public final void setVSeg(String vSeg) {
            this.vSeg = vSeg;
        }

        /**
         * Valor do Desconto
         *
         * @return String
         */
        public final String getVDesc() {
            return this.vDesc;
        }

        /**
         * Valor do Desconto
         *
         * @param vDesc
         */
        public final void setVDesc(String vDesc) {
            this.vDesc = vDesc;
        }

        /**
         * Outras despesas acessórias
         *
         * @return String
         */
        public final String getVOutro() {
            return this.vOutro;
        }

        /**
         * Outras despesas acessórias
         *
         * @param vOutro
         */
        public final void setVOutro(String vOutro) {
            this.vOutro = vOutro;
        }

        /**
         * Este campo deverá ser preenchido com:<br>
         *  0 – o valor do item (vProd) não compõe o valor total da NF-e (vProd)<br>
         *  1  – o valor do item (vProd) compõe o valor total da NF-e (vProd)
         *
         * @return String
         */
        public final String getIndTot() {
            return this.indTot;
        }

        /**
         * Este campo deverá ser preenchido com:<br>
         *  0 – o valor do item (vProd) não compõe o valor total da NF-e (vProd)<br>
         *  1  – o valor do item (vProd) compõe o valor total da NF-e (vProd)
         *
         * @param indTot
         */
        public final void setIndTot(String indTot) {
            this.indTot = indTot;
        }

        /**
         * Delcaração de Importação<br>
         * (NT 2011/004)
         *
         * @return java.util.List
         */
        public final java.util.List<DI> getDI() {
            if(this.dI == null) {
                this.dI = new java.util.ArrayList();
            }
            return this.dI;
        }

        /**
         * Delcaração de Importação<br>
         * (NT 2011/004)
         *
         * @param dI
         */
        public final void setDI(java.util.List<DI> dI) {
            this.dI = dI;
        }

        /**
         * Detalhe da exportação
         *
         * @return java.util.List
         */
        public final java.util.List<DetExport> getDetExport() {
            if(this.detExport == null) {
                this.detExport = new java.util.ArrayList();
            }
            return this.detExport;
        }

        /**
         * Detalhe da exportação
         *
         * @param detExport
         */
        public final void setDetExport(java.util.List<DetExport> detExport) {
            this.detExport = detExport;
        }

        /**
         * pedido de compra - Informação de interesse do emissor para controle do B2B.
         *
         * @return String
         */
        public final String getXPed() {
            return this.xPed;
        }

        /**
         * pedido de compra - Informação de interesse do emissor para controle do B2B.
         *
         * @param xPed
         */
        public final void setXPed(String xPed) {
            this.xPed = xPed;
        }

        /**
         * Número do Item do Pedido de Compra - Identificação do número do item do pedido de Compra
         *
         * @return String
         */
        public final String getNItemPed() {
            return this.nItemPed;
        }

        /**
         * Número do Item do Pedido de Compra - Identificação do número do item do pedido de Compra
         *
         * @param nItemPed
         */
        public final void setNItemPed(String nItemPed) {
            this.nItemPed = nItemPed;
        }

        /**
         * Número de controle da FCI - Ficha de Conteúdo de Importação.
         *
         * @return String
         */
        public final String getNFCI() {
            return this.nFCI;
        }

        /**
         * Número de controle da FCI - Ficha de Conteúdo de Importação.
         *
         * @param nFCI
         */
        public final void setNFCI(String nFCI) {
            this.nFCI = nFCI;
        }

        public final java.util.List<Rastro> getRastro() {
            if(this.rastro == null) {
                this.rastro = new java.util.ArrayList();
            }
            return this.rastro;
        }

        public final void setRastro(java.util.List<Rastro> rastro) {
            this.rastro = rastro;
        }

        /**
         * Informações mais detalhadas do produto (usada na NFF)
         *
         * @return InfProdNFF
         */
        public final InfProdNFF getInfProdNFF() {
            return this.infProdNFF;
        }

        /**
         * Informações mais detalhadas do produto (usada na NFF)
         *
         * @param infProdNFF
         */
        public final void setInfProdNFF(InfProdNFF infProdNFF) {
            this.infProdNFF = infProdNFF;
        }

        /**
         * Informações mais detalhadas do produto (usada na NFF)
         *
         * @return InfProdEmb
         */
        public final InfProdEmb getInfProdEmb() {
            return this.infProdEmb;
        }

        /**
         * Informações mais detalhadas do produto (usada na NFF)
         *
         * @param infProdEmb
         */
        public final void setInfProdEmb(InfProdEmb infProdEmb) {
            this.infProdEmb = infProdEmb;
        }

        /**
         * Veículos novos
         *
         * @return VeicProd
         */
        public final VeicProd getVeicProd() {
            return this.veicProd;
        }

        /**
         * Veículos novos
         *
         * @param veicProd
         */
        public final void setVeicProd(VeicProd veicProd) {
            this.veicProd = veicProd;
        }

        /**
         * grupo do detalhamento de Medicamentos e de matérias-primas farmacêuticas
         *
         * @return Med
         */
        public final Med getMed() {
            return this.med;
        }

        /**
         * grupo do detalhamento de Medicamentos e de matérias-primas farmacêuticas
         *
         * @param med
         */
        public final void setMed(Med med) {
            this.med = med;
        }

        /**
         * Armamentos
         *
         * @return java.util.List
         */
        public final java.util.List<Arma> getArma() {
            if(this.arma == null) {
                this.arma = new java.util.ArrayList();
            }
            return this.arma;
        }

        /**
         * Armamentos
         *
         * @param arma
         */
        public final void setArma(java.util.List<Arma> arma) {
            this.arma = arma;
        }

        /**
         * Informar apenas para operações com combustíveis líquidos
         *
         * @return Comb
         */
        public final Comb getComb() {
            return this.comb;
        }

        /**
         * Informar apenas para operações com combustíveis líquidos
         *
         * @param comb
         */
        public final void setComb(Comb comb) {
            this.comb = comb;
        }

        /**
         * Número do RECOPI
         *
         * @return String
         */
        public final String getNRECOPI() {
            return this.nRECOPI;
        }

        /**
         * Número do RECOPI
         *
         * @param nRECOPI
         */
        public final void setNRECOPI(String nRECOPI) {
            this.nRECOPI = nRECOPI;
        }

    }

    /**
     * Delcaração de Importação<br>
     * (NT 2011/004)
     */
    public static class DI extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nDI")
        protected String nDI;

        @br.com.ctecinf.SimpleXML.Name("dDI")
        protected String dDI;

        @br.com.ctecinf.SimpleXML.Name("xLocDesemb")
        protected String xLocDesemb;

        @br.com.ctecinf.SimpleXML.Name("UFDesemb")
        protected TUfEmi uFDesemb;

        @br.com.ctecinf.SimpleXML.Name("dDesemb")
        protected String dDesemb;

        @br.com.ctecinf.SimpleXML.Name("tpViaTransp")
        protected String tpViaTransp;

        @br.com.ctecinf.SimpleXML.Name("vAFRMM")
        protected String vAFRMM;

        @br.com.ctecinf.SimpleXML.Name("tpIntermedio")
        protected String tpIntermedio;

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("UFTerceiro")
        protected TUfEmi uFTerceiro;

        @br.com.ctecinf.SimpleXML.Name("cExportador")
        protected String cExportador;

        @br.com.ctecinf.SimpleXML.Name("adi")
        protected java.util.List<Adi> adi;

        public DI() {
            super("DI");
        }

        /**
         * Numero do Documento de Importação DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) (NT2011/004)
         *
         * @return String
         */
        public final String getNDI() {
            return this.nDI;
        }

        /**
         * Numero do Documento de Importação DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) (NT2011/004)
         *
         * @param nDI
         */
        public final void setNDI(String nDI) {
            this.nDI = nDI;
        }

        /**
         * Data de registro da DI/DSI/DA (AAAA-MM-DD)
         *
         * @return String
         */
        public final String getDDI() {
            return this.dDI;
        }

        /**
         * Data de registro da DI/DSI/DA (AAAA-MM-DD)
         *
         * @param dDI
         */
        public final void setDDI(String dDI) {
            this.dDI = dDI;
        }

        /**
         * Local do desembaraço aduaneiro
         *
         * @return String
         */
        public final String getXLocDesemb() {
            return this.xLocDesemb;
        }

        /**
         * Local do desembaraço aduaneiro
         *
         * @param xLocDesemb
         */
        public final void setXLocDesemb(String xLocDesemb) {
            this.xLocDesemb = xLocDesemb;
        }

        /**
         * UF onde ocorreu o desembaraço aduaneiro
         *
         * @return TUfEmi
         */
        public final TUfEmi getUFDesemb() {
            return this.uFDesemb;
        }

        /**
         * UF onde ocorreu o desembaraço aduaneiro
         *
         * @param uFDesemb
         */
        public final void setUFDesemb(TUfEmi uFDesemb) {
            this.uFDesemb = uFDesemb;
        }

        /**
         * Data do desembaraço aduaneiro (AAAA-MM-DD)
         *
         * @return String
         */
        public final String getDDesemb() {
            return this.dDesemb;
        }

        /**
         * Data do desembaraço aduaneiro (AAAA-MM-DD)
         *
         * @param dDesemb
         */
        public final void setDDesemb(String dDesemb) {
            this.dDesemb = dDesemb;
        }

        /**
         * Via de transporte internacional informada na DI<br>
         * 																	1-Maritima;2-Fluvial;3-Lacustre;4-Aerea;5-Postal;6-Ferroviaria;7-Rodoviaria;8-Conduto;9-Meios Proprios;10-Entrada/Saida Ficta;<br>
         * 																	11-Courier;12-Em maos;13-Por reboque.
         *
         * @return String
         */
        public final String getTpViaTransp() {
            return this.tpViaTransp;
        }

        /**
         * Via de transporte internacional informada na DI<br>
         * 																	1-Maritima;2-Fluvial;3-Lacustre;4-Aerea;5-Postal;6-Ferroviaria;7-Rodoviaria;8-Conduto;9-Meios Proprios;10-Entrada/Saida Ficta;<br>
         * 																	11-Courier;12-Em maos;13-Por reboque.
         *
         * @param tpViaTransp
         */
        public final void setTpViaTransp(String tpViaTransp) {
            this.tpViaTransp = tpViaTransp;
        }

        /**
         * Valor Adicional ao frete para renovação de marinha mercante
         *
         * @return String
         */
        public final String getVAFRMM() {
            return this.vAFRMM;
        }

        /**
         * Valor Adicional ao frete para renovação de marinha mercante
         *
         * @param vAFRMM
         */
        public final void setVAFRMM(String vAFRMM) {
            this.vAFRMM = vAFRMM;
        }

        /**
         * Forma de Importação quanto a intermediação <br>
         * 																	1-por conta propria;2-por conta e ordem;3-encomenda
         *
         * @return String
         */
        public final String getTpIntermedio() {
            return this.tpIntermedio;
        }

        /**
         * Forma de Importação quanto a intermediação <br>
         * 																	1-por conta propria;2-por conta e ordem;3-encomenda
         *
         * @param tpIntermedio
         */
        public final void setTpIntermedio(String tpIntermedio) {
            this.tpIntermedio = tpIntermedio;
        }

        /**
         * CNPJ do adquirente ou do encomendante
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do adquirente ou do encomendante
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Sigla da UF do adquirente ou do encomendante
         *
         * @return TUfEmi
         */
        public final TUfEmi getUFTerceiro() {
            return this.uFTerceiro;
        }

        /**
         * Sigla da UF do adquirente ou do encomendante
         *
         * @param uFTerceiro
         */
        public final void setUFTerceiro(TUfEmi uFTerceiro) {
            this.uFTerceiro = uFTerceiro;
        }

        /**
         * Código do exportador (usado nos sistemas internos de informação do emitente da NF-e)
         *
         * @return String
         */
        public final String getCExportador() {
            return this.cExportador;
        }

        /**
         * Código do exportador (usado nos sistemas internos de informação do emitente da NF-e)
         *
         * @param cExportador
         */
        public final void setCExportador(String cExportador) {
            this.cExportador = cExportador;
        }

        /**
         * Adições (NT 2011/004)
         *
         * @return java.util.List
         */
        public final java.util.List<Adi> getAdi() {
            if(this.adi == null) {
                this.adi = new java.util.ArrayList();
            }
            return this.adi;
        }

        /**
         * Adições (NT 2011/004)
         *
         * @param adi
         */
        public final void setAdi(java.util.List<Adi> adi) {
            this.adi = adi;
        }

    }

    /**
     * Adições (NT 2011/004)
     */
    public static class Adi extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nAdicao")
        protected String nAdicao;

        @br.com.ctecinf.SimpleXML.Name("nSeqAdic")
        protected String nSeqAdic;

        @br.com.ctecinf.SimpleXML.Name("cFabricante")
        protected String cFabricante;

        @br.com.ctecinf.SimpleXML.Name("vDescDI")
        protected String vDescDI;

        @br.com.ctecinf.SimpleXML.Name("nDraw")
        protected String nDraw;

        public Adi() {
            super("adi");
        }

        /**
         * Número da Adição
         *
         * @return String
         */
        public final String getNAdicao() {
            return this.nAdicao;
        }

        /**
         * Número da Adição
         *
         * @param nAdicao
         */
        public final void setNAdicao(String nAdicao) {
            this.nAdicao = nAdicao;
        }

        /**
         * Número seqüencial do item dentro da Adição
         *
         * @return String
         */
        public final String getNSeqAdic() {
            return this.nSeqAdic;
        }

        /**
         * Número seqüencial do item dentro da Adição
         *
         * @param nSeqAdic
         */
        public final void setNSeqAdic(String nSeqAdic) {
            this.nSeqAdic = nSeqAdic;
        }

        /**
         * Código do fabricante estrangeiro (usado nos sistemas internos de informação do emitente da NF-e)
         *
         * @return String
         */
        public final String getCFabricante() {
            return this.cFabricante;
        }

        /**
         * Código do fabricante estrangeiro (usado nos sistemas internos de informação do emitente da NF-e)
         *
         * @param cFabricante
         */
        public final void setCFabricante(String cFabricante) {
            this.cFabricante = cFabricante;
        }

        /**
         * Valor do desconto do item da DI – adição
         *
         * @return String
         */
        public final String getVDescDI() {
            return this.vDescDI;
        }

        /**
         * Valor do desconto do item da DI – adição
         *
         * @param vDescDI
         */
        public final void setVDescDI(String vDescDI) {
            this.vDescDI = vDescDI;
        }

        /**
         * Número do ato concessório de Drawback
         *
         * @return String
         */
        public final String getNDraw() {
            return this.nDraw;
        }

        /**
         * Número do ato concessório de Drawback
         *
         * @param nDraw
         */
        public final void setNDraw(String nDraw) {
            this.nDraw = nDraw;
        }

    }

    /**
     * Detalhe da exportação
     */
    public static class DetExport extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nDraw")
        protected String nDraw;

        @br.com.ctecinf.SimpleXML.Name("exportInd")
        protected ExportInd exportInd;

        public DetExport() {
            super("detExport");
        }

        /**
         * Número do ato concessório de Drawback
         *
         * @return String
         */
        public final String getNDraw() {
            return this.nDraw;
        }

        /**
         * Número do ato concessório de Drawback
         *
         * @param nDraw
         */
        public final void setNDraw(String nDraw) {
            this.nDraw = nDraw;
        }

        /**
         * Exportação indireta
         *
         * @return ExportInd
         */
        public final ExportInd getExportInd() {
            return this.exportInd;
        }

        /**
         * Exportação indireta
         *
         * @param exportInd
         */
        public final void setExportInd(ExportInd exportInd) {
            this.exportInd = exportInd;
        }

    }

    /**
     * Exportação indireta
     */
    public static class ExportInd extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nRE")
        protected String nRE;

        @br.com.ctecinf.SimpleXML.Name("chNFe")
        protected String chNFe;

        @br.com.ctecinf.SimpleXML.Name("qExport")
        protected String qExport;

        public ExportInd() {
            super("exportInd");
        }

        /**
         * Registro de exportação
         *
         * @return String
         */
        public final String getNRE() {
            return this.nRE;
        }

        /**
         * Registro de exportação
         *
         * @param nRE
         */
        public final void setNRE(String nRE) {
            this.nRE = nRE;
        }

        /**
         * Chave de acesso da NF-e recebida para exportação
         *
         * @return String
         */
        public final String getChNFe() {
            return this.chNFe;
        }

        /**
         * Chave de acesso da NF-e recebida para exportação
         *
         * @param chNFe
         */
        public final void setChNFe(String chNFe) {
            this.chNFe = chNFe;
        }

        /**
         * Quantidade do item efetivamente exportado
         *
         * @return String
         */
        public final String getQExport() {
            return this.qExport;
        }

        /**
         * Quantidade do item efetivamente exportado
         *
         * @param qExport
         */
        public final void setQExport(String qExport) {
            this.qExport = qExport;
        }

    }

    public static class Rastro extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nLote")
        protected String nLote;

        @br.com.ctecinf.SimpleXML.Name("qLote")
        protected String qLote;

        @br.com.ctecinf.SimpleXML.Name("dFab")
        protected String dFab;

        @br.com.ctecinf.SimpleXML.Name("dVal")
        protected String dVal;

        @br.com.ctecinf.SimpleXML.Name("cAgreg")
        protected String cAgreg;

        public Rastro() {
            super("rastro");
        }

        /**
         * Número do lote do produto.
         *
         * @return String
         */
        public final String getNLote() {
            return this.nLote;
        }

        /**
         * Número do lote do produto.
         *
         * @param nLote
         */
        public final void setNLote(String nLote) {
            this.nLote = nLote;
        }

        /**
         * Quantidade de produto no lote.
         *
         * @return String
         */
        public final String getQLote() {
            return this.qLote;
        }

        /**
         * Quantidade de produto no lote.
         *
         * @param qLote
         */
        public final void setQLote(String qLote) {
            this.qLote = qLote;
        }

        /**
         * Data de fabricação/produção. Formato "AAAA-MM-DD".
         *
         * @return String
         */
        public final String getDFab() {
            return this.dFab;
        }

        /**
         * Data de fabricação/produção. Formato "AAAA-MM-DD".
         *
         * @param dFab
         */
        public final void setDFab(String dFab) {
            this.dFab = dFab;
        }

        /**
         * Data de validade. Informar o último dia do mês caso a validade não especifique o dia. Formato "AAAA-MM-DD".
         *
         * @return String
         */
        public final String getDVal() {
            return this.dVal;
        }

        /**
         * Data de validade. Informar o último dia do mês caso a validade não especifique o dia. Formato "AAAA-MM-DD".
         *
         * @param dVal
         */
        public final void setDVal(String dVal) {
            this.dVal = dVal;
        }

        public final String getCAgreg() {
            return this.cAgreg;
        }

        public final void setCAgreg(String cAgreg) {
            this.cAgreg = cAgreg;
        }

    }

    /**
     * Informações mais detalhadas do produto (usada na NFF)
     */
    public static class InfProdNFF extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cProdFisco")
        protected String cProdFisco;

        @br.com.ctecinf.SimpleXML.Name("cOperNFF")
        protected String cOperNFF;

        public InfProdNFF() {
            super("infProdNFF");
        }

        /**
         * Código Fiscal do Produto
         *
         * @return String
         */
        public final String getCProdFisco() {
            return this.cProdFisco;
        }

        /**
         * Código Fiscal do Produto
         *
         * @param cProdFisco
         */
        public final void setCProdFisco(String cProdFisco) {
            this.cProdFisco = cProdFisco;
        }

        /**
         * Código da operação selecionada na NFF e relacionada ao item
         *
         * @return String
         */
        public final String getCOperNFF() {
            return this.cOperNFF;
        }

        /**
         * Código da operação selecionada na NFF e relacionada ao item
         *
         * @param cOperNFF
         */
        public final void setCOperNFF(String cOperNFF) {
            this.cOperNFF = cOperNFF;
        }

    }

    /**
     * Informações mais detalhadas do produto (usada na NFF)
     */
    public static class InfProdEmb extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("xEmb")
        protected String xEmb;

        @br.com.ctecinf.SimpleXML.Name("qVolEmb")
        protected String qVolEmb;

        @br.com.ctecinf.SimpleXML.Name("uEmb")
        protected String uEmb;

        public InfProdEmb() {
            super("infProdEmb");
        }

        /**
         * Embalagem do produto
         *
         * @return String
         */
        public final String getXEmb() {
            return this.xEmb;
        }

        /**
         * Embalagem do produto
         *
         * @param xEmb
         */
        public final void setXEmb(String xEmb) {
            this.xEmb = xEmb;
        }

        /**
         * Volume do produto na embalagem
         *
         * @return String
         */
        public final String getQVolEmb() {
            return this.qVolEmb;
        }

        /**
         * Volume do produto na embalagem
         *
         * @param qVolEmb
         */
        public final void setQVolEmb(String qVolEmb) {
            this.qVolEmb = qVolEmb;
        }

        /**
         * Unidade de Medida da Embalagem
         *
         * @return String
         */
        public final String getUEmb() {
            return this.uEmb;
        }

        /**
         * Unidade de Medida da Embalagem
         *
         * @param uEmb
         */
        public final void setUEmb(String uEmb) {
            this.uEmb = uEmb;
        }

    }

    /**
     * Veículos novos
     */
    public static class VeicProd extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpOp")
        protected String tpOp;

        @br.com.ctecinf.SimpleXML.Name("chassi")
        protected String chassi;

        @br.com.ctecinf.SimpleXML.Name("cCor")
        protected String cCor;

        @br.com.ctecinf.SimpleXML.Name("xCor")
        protected String xCor;

        @br.com.ctecinf.SimpleXML.Name("pot")
        protected String pot;

        @br.com.ctecinf.SimpleXML.Name("cilin")
        protected String cilin;

        @br.com.ctecinf.SimpleXML.Name("pesoL")
        protected String pesoL;

        @br.com.ctecinf.SimpleXML.Name("pesoB")
        protected String pesoB;

        @br.com.ctecinf.SimpleXML.Name("nSerie")
        protected String nSerie;

        @br.com.ctecinf.SimpleXML.Name("tpComb")
        protected String tpComb;

        @br.com.ctecinf.SimpleXML.Name("nMotor")
        protected String nMotor;

        @br.com.ctecinf.SimpleXML.Name("CMT")
        protected String cMT;

        @br.com.ctecinf.SimpleXML.Name("dist")
        protected String dist;

        @br.com.ctecinf.SimpleXML.Name("anoMod")
        protected String anoMod;

        @br.com.ctecinf.SimpleXML.Name("anoFab")
        protected String anoFab;

        @br.com.ctecinf.SimpleXML.Name("tpPint")
        protected String tpPint;

        @br.com.ctecinf.SimpleXML.Name("tpVeic")
        protected String tpVeic;

        @br.com.ctecinf.SimpleXML.Name("espVeic")
        protected String espVeic;

        @br.com.ctecinf.SimpleXML.Name("VIN")
        protected String vIN;

        @br.com.ctecinf.SimpleXML.Name("condVeic")
        protected String condVeic;

        @br.com.ctecinf.SimpleXML.Name("cMod")
        protected String cMod;

        @br.com.ctecinf.SimpleXML.Name("cCorDENATRAN")
        protected String cCorDENATRAN;

        @br.com.ctecinf.SimpleXML.Name("lota")
        protected String lota;

        @br.com.ctecinf.SimpleXML.Name("tpRest")
        protected String tpRest;

        public VeicProd() {
            super("veicProd");
        }

        /**
         * Tipo da Operação (1 - Venda concessionária; 2 - Faturamento direto; 3 - Venda direta; 0 - Outros)
         *
         * @return String
         */
        public final String getTpOp() {
            return this.tpOp;
        }

        /**
         * Tipo da Operação (1 - Venda concessionária; 2 - Faturamento direto; 3 - Venda direta; 0 - Outros)
         *
         * @param tpOp
         */
        public final void setTpOp(String tpOp) {
            this.tpOp = tpOp;
        }

        /**
         * Chassi do veículo - VIN (código-identificação-veículo)
         *
         * @return String
         */
        public final String getChassi() {
            return this.chassi;
        }

        /**
         * Chassi do veículo - VIN (código-identificação-veículo)
         *
         * @param chassi
         */
        public final void setChassi(String chassi) {
            this.chassi = chassi;
        }

        /**
         * Cor do veículo (código de cada montadora)
         *
         * @return String
         */
        public final String getCCor() {
            return this.cCor;
        }

        /**
         * Cor do veículo (código de cada montadora)
         *
         * @param cCor
         */
        public final void setCCor(String cCor) {
            this.cCor = cCor;
        }

        /**
         * Descrição da cor
         *
         * @return String
         */
        public final String getXCor() {
            return this.xCor;
        }

        /**
         * Descrição da cor
         *
         * @param xCor
         */
        public final void setXCor(String xCor) {
            this.xCor = xCor;
        }

        /**
         * Potência máxima do motor do veículo em cavalo vapor (CV). (potência-veículo)
         *
         * @return String
         */
        public final String getPot() {
            return this.pot;
        }

        /**
         * Potência máxima do motor do veículo em cavalo vapor (CV). (potência-veículo)
         *
         * @param pot
         */
        public final void setPot(String pot) {
            this.pot = pot;
        }

        /**
         * Capacidade voluntária do motor expressa em centímetros cúbicos (CC). (cilindradas)
         *
         * @return String
         */
        public final String getCilin() {
            return this.cilin;
        }

        /**
         * Capacidade voluntária do motor expressa em centímetros cúbicos (CC). (cilindradas)
         *
         * @param cilin
         */
        public final void setCilin(String cilin) {
            this.cilin = cilin;
        }

        /**
         * Peso líquido
         *
         * @return String
         */
        public final String getPesoL() {
            return this.pesoL;
        }

        /**
         * Peso líquido
         *
         * @param pesoL
         */
        public final void setPesoL(String pesoL) {
            this.pesoL = pesoL;
        }

        /**
         * Peso bruto
         *
         * @return String
         */
        public final String getPesoB() {
            return this.pesoB;
        }

        /**
         * Peso bruto
         *
         * @param pesoB
         */
        public final void setPesoB(String pesoB) {
            this.pesoB = pesoB;
        }

        /**
         * Serial (série)
         *
         * @return String
         */
        public final String getNSerie() {
            return this.nSerie;
        }

        /**
         * Serial (série)
         *
         * @param nSerie
         */
        public final void setNSerie(String nSerie) {
            this.nSerie = nSerie;
        }

        /**
         * Tipo de combustível-Tabela RENAVAM: 01-Álcool; 02-Gasolina; 03-Diesel; 16-Álcool/Gas.; 17-Gas./Álcool/GNV; 18-Gasolina/Elétrico
         *
         * @return String
         */
        public final String getTpComb() {
            return this.tpComb;
        }

        /**
         * Tipo de combustível-Tabela RENAVAM: 01-Álcool; 02-Gasolina; 03-Diesel; 16-Álcool/Gas.; 17-Gas./Álcool/GNV; 18-Gasolina/Elétrico
         *
         * @param tpComb
         */
        public final void setTpComb(String tpComb) {
            this.tpComb = tpComb;
        }

        /**
         * Número do motor
         *
         * @return String
         */
        public final String getNMotor() {
            return this.nMotor;
        }

        /**
         * Número do motor
         *
         * @param nMotor
         */
        public final void setNMotor(String nMotor) {
            this.nMotor = nMotor;
        }

        /**
         * CMT-Capacidade Máxima de Tração - em Toneladas 4 casas decimais
         *
         * @return String
         */
        public final String getCMT() {
            return this.cMT;
        }

        /**
         * CMT-Capacidade Máxima de Tração - em Toneladas 4 casas decimais
         *
         * @param cMT
         */
        public final void setCMT(String cMT) {
            this.cMT = cMT;
        }

        /**
         * Distância entre eixos
         *
         * @return String
         */
        public final String getDist() {
            return this.dist;
        }

        /**
         * Distância entre eixos
         *
         * @param dist
         */
        public final void setDist(String dist) {
            this.dist = dist;
        }

        /**
         * Ano Modelo de Fabricação
         *
         * @return String
         */
        public final String getAnoMod() {
            return this.anoMod;
        }

        /**
         * Ano Modelo de Fabricação
         *
         * @param anoMod
         */
        public final void setAnoMod(String anoMod) {
            this.anoMod = anoMod;
        }

        /**
         * Ano de Fabricação
         *
         * @return String
         */
        public final String getAnoFab() {
            return this.anoFab;
        }

        /**
         * Ano de Fabricação
         *
         * @param anoFab
         */
        public final void setAnoFab(String anoFab) {
            this.anoFab = anoFab;
        }

        /**
         * Tipo de pintura
         *
         * @return String
         */
        public final String getTpPint() {
            return this.tpPint;
        }

        /**
         * Tipo de pintura
         *
         * @param tpPint
         */
        public final void setTpPint(String tpPint) {
            this.tpPint = tpPint;
        }

        /**
         * Tipo de veículo (utilizar tabela RENAVAM)
         *
         * @return String
         */
        public final String getTpVeic() {
            return this.tpVeic;
        }

        /**
         * Tipo de veículo (utilizar tabela RENAVAM)
         *
         * @param tpVeic
         */
        public final void setTpVeic(String tpVeic) {
            this.tpVeic = tpVeic;
        }

        /**
         * Espécie de veículo (utilizar tabela RENAVAM)
         *
         * @return String
         */
        public final String getEspVeic() {
            return this.espVeic;
        }

        /**
         * Espécie de veículo (utilizar tabela RENAVAM)
         *
         * @param espVeic
         */
        public final void setEspVeic(String espVeic) {
            this.espVeic = espVeic;
        }

        /**
         * Informa-se o veículo tem VIN (chassi) remarcado.<br>
         * R-Remarcado<br>
         * N-NormalVIN
         *
         * @return String
         */
        public final String getVIN() {
            return this.vIN;
        }

        /**
         * Informa-se o veículo tem VIN (chassi) remarcado.<br>
         * R-Remarcado<br>
         * N-NormalVIN
         *
         * @param vIN
         */
        public final void setVIN(String vIN) {
            this.vIN = vIN;
        }

        /**
         * Condição do veículo (1 - acabado; 2 - inacabado; 3 - semi-acabado)
         *
         * @return String
         */
        public final String getCondVeic() {
            return this.condVeic;
        }

        /**
         * Condição do veículo (1 - acabado; 2 - inacabado; 3 - semi-acabado)
         *
         * @param condVeic
         */
        public final void setCondVeic(String condVeic) {
            this.condVeic = condVeic;
        }

        /**
         * Código Marca Modelo (utilizar tabela RENAVAM)
         *
         * @return String
         */
        public final String getCMod() {
            return this.cMod;
        }

        /**
         * Código Marca Modelo (utilizar tabela RENAVAM)
         *
         * @param cMod
         */
        public final void setCMod(String cMod) {
            this.cMod = cMod;
        }

        /**
         * Código da Cor Segundo as regras de pré-cadastro do DENATRAN: 01-AMARELO;02-AZUL;03-BEGE;04-BRANCA;05-CINZA;06-DOURADA;07-GRENA <br>
         * 08-LARANJA;09-MARROM;10-PRATA;11-PRETA;12-ROSA;13-ROXA;14-VERDE;15-VERMELHA;16-FANTASIA
         *
         * @return String
         */
        public final String getCCorDENATRAN() {
            return this.cCorDENATRAN;
        }

        /**
         * Código da Cor Segundo as regras de pré-cadastro do DENATRAN: 01-AMARELO;02-AZUL;03-BEGE;04-BRANCA;05-CINZA;06-DOURADA;07-GRENA <br>
         * 08-LARANJA;09-MARROM;10-PRATA;11-PRETA;12-ROSA;13-ROXA;14-VERDE;15-VERMELHA;16-FANTASIA
         *
         * @param cCorDENATRAN
         */
        public final void setCCorDENATRAN(String cCorDENATRAN) {
            this.cCorDENATRAN = cCorDENATRAN;
        }

        /**
         * Quantidade máxima de permitida de passageiros sentados, inclusive motorista.
         *
         * @return String
         */
        public final String getLota() {
            return this.lota;
        }

        /**
         * Quantidade máxima de permitida de passageiros sentados, inclusive motorista.
         *
         * @param lota
         */
        public final void setLota(String lota) {
            this.lota = lota;
        }

        /**
         * Restrição<br>
         * 0 - Não há;<br>
         * 1 - Alienação Fiduciária;<br>
         * 2 - Arrendamento Mercantil;<br>
         * 3 - Reserva de Domínio;<br>
         * 4 - Penhor de Veículos;<br>
         * 9 - outras.
         *
         * @return String
         */
        public final String getTpRest() {
            return this.tpRest;
        }

        /**
         * Restrição<br>
         * 0 - Não há;<br>
         * 1 - Alienação Fiduciária;<br>
         * 2 - Arrendamento Mercantil;<br>
         * 3 - Reserva de Domínio;<br>
         * 4 - Penhor de Veículos;<br>
         * 9 - outras.
         *
         * @param tpRest
         */
        public final void setTpRest(String tpRest) {
            this.tpRest = tpRest;
        }

    }

    /**
     * grupo do detalhamento de Medicamentos e de matérias-primas farmacêuticas
     */
    public static class Med extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cProdANVISA")
        protected String cProdANVISA;

        @br.com.ctecinf.SimpleXML.Name("xMotivoIsencao")
        protected String xMotivoIsencao;

        @br.com.ctecinf.SimpleXML.Name("vPMC")
        protected String vPMC;

        public Med() {
            super("med");
        }

        /**
         * Utilizar o número do registro ANVISA  ou preencher com o literal “ISENTO”, no caso de medicamento isento de registro na ANVISA.
         *
         * @return String
         */
        public final String getCProdANVISA() {
            return this.cProdANVISA;
        }

        /**
         * Utilizar o número do registro ANVISA  ou preencher com o literal “ISENTO”, no caso de medicamento isento de registro na ANVISA.
         *
         * @param cProdANVISA
         */
        public final void setCProdANVISA(String cProdANVISA) {
            this.cProdANVISA = cProdANVISA;
        }

        /**
         * Obs.: Para medicamento isento de registro na ANVISA, informar o número da decisão que o isenta, como por exemplo o número da Resolução da Diretoria Colegiada da ANVISA (RDC).
         *
         * @return String
         */
        public final String getXMotivoIsencao() {
            return this.xMotivoIsencao;
        }

        /**
         * Obs.: Para medicamento isento de registro na ANVISA, informar o número da decisão que o isenta, como por exemplo o número da Resolução da Diretoria Colegiada da ANVISA (RDC).
         *
         * @param xMotivoIsencao
         */
        public final void setXMotivoIsencao(String xMotivoIsencao) {
            this.xMotivoIsencao = xMotivoIsencao;
        }

        /**
         * Preço Máximo ao Consumidor.
         *
         * @return String
         */
        public final String getVPMC() {
            return this.vPMC;
        }

        /**
         * Preço Máximo ao Consumidor.
         *
         * @param vPMC
         */
        public final void setVPMC(String vPMC) {
            this.vPMC = vPMC;
        }

    }

    /**
     * Armamentos
     */
    public static class Arma extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpArma")
        protected String tpArma;

        @br.com.ctecinf.SimpleXML.Name("nSerie")
        protected String nSerie;

        @br.com.ctecinf.SimpleXML.Name("nCano")
        protected String nCano;

        @br.com.ctecinf.SimpleXML.Name("descr")
        protected String descr;

        public Arma() {
            super("arma");
        }

        /**
         * Indicador do tipo de arma de fogo (0 - Uso permitido; 1 - Uso restrito)
         *
         * @return String
         */
        public final String getTpArma() {
            return this.tpArma;
        }

        /**
         * Indicador do tipo de arma de fogo (0 - Uso permitido; 1 - Uso restrito)
         *
         * @param tpArma
         */
        public final void setTpArma(String tpArma) {
            this.tpArma = tpArma;
        }

        /**
         * Número de série da arma
         *
         * @return String
         */
        public final String getNSerie() {
            return this.nSerie;
        }

        /**
         * Número de série da arma
         *
         * @param nSerie
         */
        public final void setNSerie(String nSerie) {
            this.nSerie = nSerie;
        }

        /**
         * Número de série do cano
         *
         * @return String
         */
        public final String getNCano() {
            return this.nCano;
        }

        /**
         * Número de série do cano
         *
         * @param nCano
         */
        public final void setNCano(String nCano) {
            this.nCano = nCano;
        }

        /**
         * Descrição completa da arma, compreendendo: calibre, marca, capacidade, tipo de funcionamento, comprimento e demais elementos que permitam a sua perfeita identificação.
         *
         * @return String
         */
        public final String getDescr() {
            return this.descr;
        }

        /**
         * Descrição completa da arma, compreendendo: calibre, marca, capacidade, tipo de funcionamento, comprimento e demais elementos que permitam a sua perfeita identificação.
         *
         * @param descr
         */
        public final void setDescr(String descr) {
            this.descr = descr;
        }

    }

    /**
     * Informar apenas para operações com combustíveis líquidos
     */
    public static class Comb extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("cProdANP")
        protected String cProdANP;

        @br.com.ctecinf.SimpleXML.Name("descANP")
        protected String descANP;

        @br.com.ctecinf.SimpleXML.Name("pGLP")
        protected String pGLP;

        @br.com.ctecinf.SimpleXML.Name("pGNn")
        protected String pGNn;

        @br.com.ctecinf.SimpleXML.Name("pGNi")
        protected String pGNi;

        @br.com.ctecinf.SimpleXML.Name("vPart")
        protected String vPart;

        @br.com.ctecinf.SimpleXML.Name("CODIF")
        protected String cODIF;

        @br.com.ctecinf.SimpleXML.Name("qTemp")
        protected String qTemp;

        @br.com.ctecinf.SimpleXML.Name("UFCons")
        protected TUf uFCons;

        @br.com.ctecinf.SimpleXML.Name("CIDE")
        protected CIDE cIDE;

        @br.com.ctecinf.SimpleXML.Name("encerrante")
        protected Encerrante encerrante;

        @br.com.ctecinf.SimpleXML.Name("pBio")
        protected String pBio;

        @br.com.ctecinf.SimpleXML.Name("origComb")
        protected java.util.List<OrigComb> origComb;

        public Comb() {
            super("comb");
        }

        /**
         * Código de produto da ANP. codificação de produtos do SIMP (http://www.anp.gov.br)
         *
         * @return String
         */
        public final String getCProdANP() {
            return this.cProdANP;
        }

        /**
         * Código de produto da ANP. codificação de produtos do SIMP (http://www.anp.gov.br)
         *
         * @param cProdANP
         */
        public final void setCProdANP(String cProdANP) {
            this.cProdANP = cProdANP;
        }

        /**
         * Descrição do Produto conforme ANP. Utilizar a descrição de produtos do Sistema de Informações de Movimentação de Produtos - SIMP (http://www.anp.gov.br/simp/).
         *
         * @return String
         */
        public final String getDescANP() {
            return this.descANP;
        }

        /**
         * Descrição do Produto conforme ANP. Utilizar a descrição de produtos do Sistema de Informações de Movimentação de Produtos - SIMP (http://www.anp.gov.br/simp/).
         *
         * @param descANP
         */
        public final void setDescANP(String descANP) {
            this.descANP = descANP;
        }

        /**
         * Percentual do GLP derivado do petróleo no produto GLP (cProdANP=210203001). Informar em número decimal o percentual do GLP derivado de petróleo no produto GLP. Valores 0 a 100.
         *
         * @return String
         */
        public final String getPGLP() {
            return this.pGLP;
        }

        /**
         * Percentual do GLP derivado do petróleo no produto GLP (cProdANP=210203001). Informar em número decimal o percentual do GLP derivado de petróleo no produto GLP. Valores 0 a 100.
         *
         * @param pGLP
         */
        public final void setPGLP(String pGLP) {
            this.pGLP = pGLP;
        }

        /**
         * Percentual de gás natural nacional - GLGNn para o produto GLP (cProdANP=210203001). Informar em número decimal o percentual do Gás Natural Nacional - GLGNn para o produto GLP. Valores de 0 a 100.
         *
         * @return String
         */
        public final String getPGNn() {
            return this.pGNn;
        }

        /**
         * Percentual de gás natural nacional - GLGNn para o produto GLP (cProdANP=210203001). Informar em número decimal o percentual do Gás Natural Nacional - GLGNn para o produto GLP. Valores de 0 a 100.
         *
         * @param pGNn
         */
        public final void setPGNn(String pGNn) {
            this.pGNn = pGNn;
        }

        /**
         * Percentual de gás natural importado GLGNi para o produto GLP (cProdANP=210203001). Informar em número deciaml o percentual do Gás Natural Importado - GLGNi para o produto GLP. Valores de 0 a 100.
         *
         * @return String
         */
        public final String getPGNi() {
            return this.pGNi;
        }

        /**
         * Percentual de gás natural importado GLGNi para o produto GLP (cProdANP=210203001). Informar em número deciaml o percentual do Gás Natural Importado - GLGNi para o produto GLP. Valores de 0 a 100.
         *
         * @param pGNi
         */
        public final void setPGNi(String pGNi) {
            this.pGNi = pGNi;
        }

        /**
         * Valor de partida (cProdANP=210203001). Deve ser informado neste campo o valor por quilograma sem ICMS.
         *
         * @return String
         */
        public final String getVPart() {
            return this.vPart;
        }

        /**
         * Valor de partida (cProdANP=210203001). Deve ser informado neste campo o valor por quilograma sem ICMS.
         *
         * @param vPart
         */
        public final void setVPart(String vPart) {
            this.vPart = vPart;
        }

        /**
         * Código de autorização / registro do CODIF. Informar apenas quando a UF utilizar o CODIF (Sistema de Controle do 			Diferimento do Imposto nas Operações com AEAC - Álcool Etílico Anidro Combustível).
         *
         * @return String
         */
        public final String getCODIF() {
            return this.cODIF;
        }

        /**
         * Código de autorização / registro do CODIF. Informar apenas quando a UF utilizar o CODIF (Sistema de Controle do 			Diferimento do Imposto nas Operações com AEAC - Álcool Etílico Anidro Combustível).
         *
         * @param cODIF
         */
        public final void setCODIF(String cODIF) {
            this.cODIF = cODIF;
        }

        /**
         * Quantidade de combustível<br>
         * faturada à temperatura ambiente.<br>
         * Informar quando a quantidade<br>
         * faturada informada no campo<br>
         * qCom (I10) tiver sido ajustada para<br>
         * uma temperatura diferente da<br>
         * ambiente.
         *
         * @return String
         */
        public final String getQTemp() {
            return this.qTemp;
        }

        /**
         * Quantidade de combustível<br>
         * faturada à temperatura ambiente.<br>
         * Informar quando a quantidade<br>
         * faturada informada no campo<br>
         * qCom (I10) tiver sido ajustada para<br>
         * uma temperatura diferente da<br>
         * ambiente.
         *
         * @param qTemp
         */
        public final void setQTemp(String qTemp) {
            this.qTemp = qTemp;
        }

        /**
         * Sigla da UF de Consumo
         *
         * @return TUf
         */
        public final TUf getUFCons() {
            return this.uFCons;
        }

        /**
         * Sigla da UF de Consumo
         *
         * @param uFCons
         */
        public final void setUFCons(TUf uFCons) {
            this.uFCons = uFCons;
        }

        /**
         * CIDE Combustíveis
         *
         * @return CIDE
         */
        public final CIDE getCIDE() {
            return this.cIDE;
        }

        /**
         * CIDE Combustíveis
         *
         * @param cIDE
         */
        public final void setCIDE(CIDE cIDE) {
            this.cIDE = cIDE;
        }

        /**
         * Informações do grupo de "encerrante"
         *
         * @return Encerrante
         */
        public final Encerrante getEncerrante() {
            return this.encerrante;
        }

        /**
         * Informações do grupo de "encerrante"
         *
         * @param encerrante
         */
        public final void setEncerrante(Encerrante encerrante) {
            this.encerrante = encerrante;
        }

        /**
         * Percentual do índice de mistura do Biodiesel (B100) no Óleo Diesel B instituído pelo órgão regulamentador
         *
         * @return String
         */
        public final String getPBio() {
            return this.pBio;
        }

        /**
         * Percentual do índice de mistura do Biodiesel (B100) no Óleo Diesel B instituído pelo órgão regulamentador
         *
         * @param pBio
         */
        public final void setPBio(String pBio) {
            this.pBio = pBio;
        }

        /**
         * Grupo indicador da origem do combustível
         *
         * @return java.util.List
         */
        public final java.util.List<OrigComb> getOrigComb() {
            if(this.origComb == null) {
                this.origComb = new java.util.ArrayList();
            }
            return this.origComb;
        }

        /**
         * Grupo indicador da origem do combustível
         *
         * @param origComb
         */
        public final void setOrigComb(java.util.List<OrigComb> origComb) {
            this.origComb = origComb;
        }

    }

    /**
     * CIDE Combustíveis
     */
    public static class CIDE extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vCIDE")
        protected String vCIDE;

        public CIDE() {
            super("CIDE");
        }

        /**
         * BC do CIDE ( Quantidade comercializada)
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * BC do CIDE ( Quantidade comercializada)
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do CIDE  (em reais)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do CIDE  (em reais)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do CIDE
         *
         * @return String
         */
        public final String getVCIDE() {
            return this.vCIDE;
        }

        /**
         * Valor do CIDE
         *
         * @param vCIDE
         */
        public final void setVCIDE(String vCIDE) {
            this.vCIDE = vCIDE;
        }

    }

    /**
     * Informações do grupo de "encerrante"
     */
    public static class Encerrante extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nBico")
        protected String nBico;

        @br.com.ctecinf.SimpleXML.Name("nBomba")
        protected String nBomba;

        @br.com.ctecinf.SimpleXML.Name("nTanque")
        protected String nTanque;

        @br.com.ctecinf.SimpleXML.Name("vEncIni")
        protected String vEncIni;

        @br.com.ctecinf.SimpleXML.Name("vEncFin")
        protected String vEncFin;

        public Encerrante() {
            super("encerrante");
        }

        /**
         * Numero de identificação do Bico utilizado no abastecimento
         *
         * @return String
         */
        public final String getNBico() {
            return this.nBico;
        }

        /**
         * Numero de identificação do Bico utilizado no abastecimento
         *
         * @param nBico
         */
        public final void setNBico(String nBico) {
            this.nBico = nBico;
        }

        /**
         * Numero de identificação da bomba ao qual o bico está interligado
         *
         * @return String
         */
        public final String getNBomba() {
            return this.nBomba;
        }

        /**
         * Numero de identificação da bomba ao qual o bico está interligado
         *
         * @param nBomba
         */
        public final void setNBomba(String nBomba) {
            this.nBomba = nBomba;
        }

        /**
         * Numero de identificação do tanque ao qual o bico está interligado
         *
         * @return String
         */
        public final String getNTanque() {
            return this.nTanque;
        }

        /**
         * Numero de identificação do tanque ao qual o bico está interligado
         *
         * @param nTanque
         */
        public final void setNTanque(String nTanque) {
            this.nTanque = nTanque;
        }

        /**
         * Valor do Encerrante no ínicio do abastecimento
         *
         * @return String
         */
        public final String getVEncIni() {
            return this.vEncIni;
        }

        /**
         * Valor do Encerrante no ínicio do abastecimento
         *
         * @param vEncIni
         */
        public final void setVEncIni(String vEncIni) {
            this.vEncIni = vEncIni;
        }

        /**
         * Valor do Encerrante no final do abastecimento
         *
         * @return String
         */
        public final String getVEncFin() {
            return this.vEncFin;
        }

        /**
         * Valor do Encerrante no final do abastecimento
         *
         * @param vEncFin
         */
        public final void setVEncFin(String vEncFin) {
            this.vEncFin = vEncFin;
        }

    }

    /**
     * Grupo indicador da origem do combustível
     */
    public static class OrigComb extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("indImport")
        protected String indImport;

        @br.com.ctecinf.SimpleXML.Name("cUFOrig")
        protected String cUFOrig;

        @br.com.ctecinf.SimpleXML.Name("pOrig")
        protected String pOrig;

        public OrigComb() {
            super("origComb");
        }

        /**
         * Indicador de importação 0=Nacional; 1=Importado;
         *
         * @return String
         */
        public final String getIndImport() {
            return this.indImport;
        }

        /**
         * Indicador de importação 0=Nacional; 1=Importado;
         *
         * @param indImport
         */
        public final void setIndImport(String indImport) {
            this.indImport = indImport;
        }

        /**
         * UF de origem do produtor ou do importado
         *
         * @return String
         */
        public final String getCUFOrig() {
            return this.cUFOrig;
        }

        /**
         * UF de origem do produtor ou do importado
         *
         * @param cUFOrig
         */
        public final void setCUFOrig(String cUFOrig) {
            this.cUFOrig = cUFOrig;
        }

        /**
         * Percentual originário para a UF
         *
         * @return String
         */
        public final String getPOrig() {
            return this.pOrig;
        }

        /**
         * Percentual originário para a UF
         *
         * @param pOrig
         */
        public final void setPOrig(String pOrig) {
            this.pOrig = pOrig;
        }

    }

    /**
     * Tributos incidentes nos produtos ou serviços da NF-e
     */
    public static class Imposto extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vTotTrib")
        protected String vTotTrib;

        @br.com.ctecinf.SimpleXML.Name("ICMS")
        protected ICMS iCMS;

        @br.com.ctecinf.SimpleXML.Name("IPI")
        protected TIpi iPI;

        @br.com.ctecinf.SimpleXML.Name("II")
        protected II iI;

        @br.com.ctecinf.SimpleXML.Name("ISSQN")
        protected ISSQN iSSQN;

        @br.com.ctecinf.SimpleXML.Name("PIS")
        protected PIS pIS;

        @br.com.ctecinf.SimpleXML.Name("PISST")
        protected PISST pISST;

        @br.com.ctecinf.SimpleXML.Name("COFINS")
        protected COFINS cOFINS;

        @br.com.ctecinf.SimpleXML.Name("COFINSST")
        protected COFINSST cOFINSST;

        @br.com.ctecinf.SimpleXML.Name("ICMSUFDest")
        protected ICMSUFDest iCMSUFDest;

        public Imposto() {
            super("imposto");
        }

        /**
         * Valor estimado total de impostos federais, estaduais e municipais
         *
         * @return String
         */
        public final String getVTotTrib() {
            return this.vTotTrib;
        }

        /**
         * Valor estimado total de impostos federais, estaduais e municipais
         *
         * @param vTotTrib
         */
        public final void setVTotTrib(String vTotTrib) {
            this.vTotTrib = vTotTrib;
        }

        /**
         * Dados do ICMS Normal e ST
         *
         * @return ICMS
         */
        public final ICMS getICMS() {
            return this.iCMS;
        }

        /**
         * Dados do ICMS Normal e ST
         *
         * @param iCMS
         */
        public final void setICMS(ICMS iCMS) {
            this.iCMS = iCMS;
        }

        public final TIpi getIPI() {
            return this.iPI;
        }

        public final void setIPI(TIpi iPI) {
            this.iPI = iPI;
        }

        /**
         * Dados do Imposto de Importação
         *
         * @return II
         */
        public final II getII() {
            return this.iI;
        }

        /**
         * Dados do Imposto de Importação
         *
         * @param iI
         */
        public final void setII(II iI) {
            this.iI = iI;
        }

        /**
         * ISSQN
         *
         * @return ISSQN
         */
        public final ISSQN getISSQN() {
            return this.iSSQN;
        }

        /**
         * ISSQN
         *
         * @param iSSQN
         */
        public final void setISSQN(ISSQN iSSQN) {
            this.iSSQN = iSSQN;
        }

        /**
         * Dados do PIS
         *
         * @return PIS
         */
        public final PIS getPIS() {
            return this.pIS;
        }

        /**
         * Dados do PIS
         *
         * @param pIS
         */
        public final void setPIS(PIS pIS) {
            this.pIS = pIS;
        }

        /**
         * Dados do PIS Substituição Tributária
         *
         * @return PISST
         */
        public final PISST getPISST() {
            return this.pISST;
        }

        /**
         * Dados do PIS Substituição Tributária
         *
         * @param pISST
         */
        public final void setPISST(PISST pISST) {
            this.pISST = pISST;
        }

        /**
         * Dados do COFINS
         *
         * @return COFINS
         */
        public final COFINS getCOFINS() {
            return this.cOFINS;
        }

        /**
         * Dados do COFINS
         *
         * @param cOFINS
         */
        public final void setCOFINS(COFINS cOFINS) {
            this.cOFINS = cOFINS;
        }

        /**
         * Dados do COFINS da<br>
         * Substituição Tributaria;
         *
         * @return COFINSST
         */
        public final COFINSST getCOFINSST() {
            return this.cOFINSST;
        }

        /**
         * Dados do COFINS da<br>
         * Substituição Tributaria;
         *
         * @param cOFINSST
         */
        public final void setCOFINSST(COFINSST cOFINSST) {
            this.cOFINSST = cOFINSST;
        }

        /**
         * Grupo a ser informado nas vendas interestarduais para consumidor final, não contribuinte de ICMS
         *
         * @return ICMSUFDest
         */
        public final ICMSUFDest getICMSUFDest() {
            return this.iCMSUFDest;
        }

        /**
         * Grupo a ser informado nas vendas interestarduais para consumidor final, não contribuinte de ICMS
         *
         * @param iCMSUFDest
         */
        public final void setICMSUFDest(ICMSUFDest iCMSUFDest) {
            this.iCMSUFDest = iCMSUFDest;
        }

    }

    /**
     * Dados do ICMS Normal e ST
     */
    public static class ICMS extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("ICMS00")
        protected ICMS00 iCMS00;

        @br.com.ctecinf.SimpleXML.Name("ICMS02")
        protected ICMS02 iCMS02;

        @br.com.ctecinf.SimpleXML.Name("ICMS10")
        protected ICMS10 iCMS10;

        @br.com.ctecinf.SimpleXML.Name("ICMS15")
        protected ICMS15 iCMS15;

        @br.com.ctecinf.SimpleXML.Name("ICMS20")
        protected ICMS20 iCMS20;

        @br.com.ctecinf.SimpleXML.Name("ICMS30")
        protected ICMS30 iCMS30;

        @br.com.ctecinf.SimpleXML.Name("ICMS40")
        protected ICMS40 iCMS40;

        @br.com.ctecinf.SimpleXML.Name("ICMS51")
        protected ICMS51 iCMS51;

        @br.com.ctecinf.SimpleXML.Name("ICMS53")
        protected ICMS53 iCMS53;

        @br.com.ctecinf.SimpleXML.Name("ICMS60")
        protected ICMS60 iCMS60;

        @br.com.ctecinf.SimpleXML.Name("ICMS61")
        protected ICMS61 iCMS61;

        @br.com.ctecinf.SimpleXML.Name("ICMS70")
        protected ICMS70 iCMS70;

        @br.com.ctecinf.SimpleXML.Name("ICMS90")
        protected ICMS90 iCMS90;

        @br.com.ctecinf.SimpleXML.Name("ICMSPart")
        protected ICMSPart iCMSPart;

        @br.com.ctecinf.SimpleXML.Name("ICMSST")
        protected ICMSST iCMSST;

        @br.com.ctecinf.SimpleXML.Name("ICMSSN101")
        protected ICMSSN101 iCMSSN101;

        @br.com.ctecinf.SimpleXML.Name("ICMSSN102")
        protected ICMSSN102 iCMSSN102;

        @br.com.ctecinf.SimpleXML.Name("ICMSSN201")
        protected ICMSSN201 iCMSSN201;

        @br.com.ctecinf.SimpleXML.Name("ICMSSN202")
        protected ICMSSN202 iCMSSN202;

        @br.com.ctecinf.SimpleXML.Name("ICMSSN500")
        protected ICMSSN500 iCMSSN500;

        @br.com.ctecinf.SimpleXML.Name("ICMSSN900")
        protected ICMSSN900 iCMSSN900;

        public ICMS() {
            super("ICMS");
        }

        /**
         * Tributação pelo ICMS<br>
         * 00 - Tributada integralmente
         *
         * @return ICMS00
         */
        public final ICMS00 getICMS00() {
            return this.iCMS00;
        }

        /**
         * Tributação pelo ICMS<br>
         * 00 - Tributada integralmente
         *
         * @param iCMS00
         */
        public final void setICMS00(ICMS00 iCMS00) {
            this.iCMS00 = iCMS00;
        }

        /**
         * Tributação monofásica própria sobre combustíveis
         *
         * @return ICMS02
         */
        public final ICMS02 getICMS02() {
            return this.iCMS02;
        }

        /**
         * Tributação monofásica própria sobre combustíveis
         *
         * @param iCMS02
         */
        public final void setICMS02(ICMS02 iCMS02) {
            this.iCMS02 = iCMS02;
        }

        /**
         * Tributação pelo ICMS<br>
         * 10 - Tributada e com cobrança do ICMS por substituição tributária
         *
         * @return ICMS10
         */
        public final ICMS10 getICMS10() {
            return this.iCMS10;
        }

        /**
         * Tributação pelo ICMS<br>
         * 10 - Tributada e com cobrança do ICMS por substituição tributária
         *
         * @param iCMS10
         */
        public final void setICMS10(ICMS10 iCMS10) {
            this.iCMS10 = iCMS10;
        }

        /**
         * Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis
         *
         * @return ICMS15
         */
        public final ICMS15 getICMS15() {
            return this.iCMS15;
        }

        /**
         * Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis
         *
         * @param iCMS15
         */
        public final void setICMS15(ICMS15 iCMS15) {
            this.iCMS15 = iCMS15;
        }

        /**
         * Tributção pelo ICMS<br>
         * 20 - Com redução de base de cálculo
         *
         * @return ICMS20
         */
        public final ICMS20 getICMS20() {
            return this.iCMS20;
        }

        /**
         * Tributção pelo ICMS<br>
         * 20 - Com redução de base de cálculo
         *
         * @param iCMS20
         */
        public final void setICMS20(ICMS20 iCMS20) {
            this.iCMS20 = iCMS20;
        }

        /**
         * Tributação pelo ICMS<br>
         * 30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária
         *
         * @return ICMS30
         */
        public final ICMS30 getICMS30() {
            return this.iCMS30;
        }

        /**
         * Tributação pelo ICMS<br>
         * 30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária
         *
         * @param iCMS30
         */
        public final void setICMS30(ICMS30 iCMS30) {
            this.iCMS30 = iCMS30;
        }

        /**
         * Tributação pelo ICMS<br>
         * 40 - Isenta <br>
         * 41 - Não tributada <br>
         * 50 - Suspensão
         *
         * @return ICMS40
         */
        public final ICMS40 getICMS40() {
            return this.iCMS40;
        }

        /**
         * Tributação pelo ICMS<br>
         * 40 - Isenta <br>
         * 41 - Não tributada <br>
         * 50 - Suspensão
         *
         * @param iCMS40
         */
        public final void setICMS40(ICMS40 iCMS40) {
            this.iCMS40 = iCMS40;
        }

        /**
         * Tributção pelo ICMS<br>
         * 51 - Diferimento<br>
         * A exigência do preenchimento das informações do ICMS diferido fica à critério de cada UF.
         *
         * @return ICMS51
         */
        public final ICMS51 getICMS51() {
            return this.iCMS51;
        }

        /**
         * Tributção pelo ICMS<br>
         * 51 - Diferimento<br>
         * A exigência do preenchimento das informações do ICMS diferido fica à critério de cada UF.
         *
         * @param iCMS51
         */
        public final void setICMS51(ICMS51 iCMS51) {
            this.iCMS51 = iCMS51;
        }

        /**
         * Tributação monofásica sobre combustíveis com recolhimento diferido
         *
         * @return ICMS53
         */
        public final ICMS53 getICMS53() {
            return this.iCMS53;
        }

        /**
         * Tributação monofásica sobre combustíveis com recolhimento diferido
         *
         * @param iCMS53
         */
        public final void setICMS53(ICMS53 iCMS53) {
            this.iCMS53 = iCMS53;
        }

        /**
         * Tributação pelo ICMS<br>
         * 60 - ICMS cobrado anteriormente por substituição tributária
         *
         * @return ICMS60
         */
        public final ICMS60 getICMS60() {
            return this.iCMS60;
        }

        /**
         * Tributação pelo ICMS<br>
         * 60 - ICMS cobrado anteriormente por substituição tributária
         *
         * @param iCMS60
         */
        public final void setICMS60(ICMS60 iCMS60) {
            this.iCMS60 = iCMS60;
        }

        /**
         * Tributação monofásica sobre combustíveis cobrada anteriormente;
         *
         * @return ICMS61
         */
        public final ICMS61 getICMS61() {
            return this.iCMS61;
        }

        /**
         * Tributação monofásica sobre combustíveis cobrada anteriormente;
         *
         * @param iCMS61
         */
        public final void setICMS61(ICMS61 iCMS61) {
            this.iCMS61 = iCMS61;
        }

        /**
         * Tributação pelo ICMS <br>
         * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária
         *
         * @return ICMS70
         */
        public final ICMS70 getICMS70() {
            return this.iCMS70;
        }

        /**
         * Tributação pelo ICMS <br>
         * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária
         *
         * @param iCMS70
         */
        public final void setICMS70(ICMS70 iCMS70) {
            this.iCMS70 = iCMS70;
        }

        /**
         * Tributação pelo ICMS<br>
         * 90 - Outras
         *
         * @return ICMS90
         */
        public final ICMS90 getICMS90() {
            return this.iCMS90;
        }

        /**
         * Tributação pelo ICMS<br>
         * 90 - Outras
         *
         * @param iCMS90
         */
        public final void setICMS90(ICMS90 iCMS90) {
            this.iCMS90 = iCMS90;
        }

        /**
         * Partilha do ICMS entre a UF de origem e UF de destino ou a UF definida na legislação<br>
         * Operação interestadual para consumidor final com partilha do ICMS  devido na operação entre a UF de origem e a UF do destinatário ou ou a UF definida na legislação. (Ex. UF da concessionária de entrega do  veículos)
         *
         * @return ICMSPart
         */
        public final ICMSPart getICMSPart() {
            return this.iCMSPart;
        }

        /**
         * Partilha do ICMS entre a UF de origem e UF de destino ou a UF definida na legislação<br>
         * Operação interestadual para consumidor final com partilha do ICMS  devido na operação entre a UF de origem e a UF do destinatário ou ou a UF definida na legislação. (Ex. UF da concessionária de entrega do  veículos)
         *
         * @param iCMSPart
         */
        public final void setICMSPart(ICMSPart iCMSPart) {
            this.iCMSPart = iCMSPart;
        }

        /**
         * Grupo de informação do ICMSST devido para a UF de destino, nas operações interestaduais de produtos que tiveram retenção antecipada de ICMS por ST na UF do remetente. Repasse via Substituto Tributário.
         *
         * @return ICMSST
         */
        public final ICMSST getICMSST() {
            return this.iCMSST;
        }

        /**
         * Grupo de informação do ICMSST devido para a UF de destino, nas operações interestaduais de produtos que tiveram retenção antecipada de ICMS por ST na UF do remetente. Repasse via Substituto Tributário.
         *
         * @param iCMSST
         */
        public final void setICMSST(ICMSST iCMSST) {
            this.iCMSST = iCMSST;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=101 (v.2.0)
         *
         * @return ICMSSN101
         */
        public final ICMSSN101 getICMSSN101() {
            return this.iCMSSN101;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=101 (v.2.0)
         *
         * @param iCMSSN101
         */
        public final void setICMSSN101(ICMSSN101 iCMSSN101) {
            this.iCMSSN101 = iCMSSN101;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=102, 103, 300 ou 400 (v.2.0))
         *
         * @return ICMSSN102
         */
        public final ICMSSN102 getICMSSN102() {
            return this.iCMSSN102;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=102, 103, 300 ou 400 (v.2.0))
         *
         * @param iCMSSN102
         */
        public final void setICMSSN102(ICMSSN102 iCMSSN102) {
            this.iCMSSN102 = iCMSSN102;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=201 (v.2.0)
         *
         * @return ICMSSN201
         */
        public final ICMSSN201 getICMSSN201() {
            return this.iCMSSN201;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=201 (v.2.0)
         *
         * @param iCMSSN201
         */
        public final void setICMSSN201(ICMSSN201 iCMSSN201) {
            this.iCMSSN201 = iCMSSN201;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=202 ou 203 (v.2.0)
         *
         * @return ICMSSN202
         */
        public final ICMSSN202 getICMSSN202() {
            return this.iCMSSN202;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=202 ou 203 (v.2.0)
         *
         * @param iCMSSN202
         */
        public final void setICMSSN202(ICMSSN202 iCMSSN202) {
            this.iCMSSN202 = iCMSSN202;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL,CRT=1 – Simples Nacional e CSOSN=500 (v.2.0)
         *
         * @return ICMSSN500
         */
        public final ICMSSN500 getICMSSN500() {
            return this.iCMSSN500;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL,CRT=1 – Simples Nacional e CSOSN=500 (v.2.0)
         *
         * @param iCMSSN500
         */
        public final void setICMSSN500(ICMSSN500 iCMSSN500) {
            this.iCMSSN500 = iCMSSN500;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL, CRT=1 – Simples Nacional e CSOSN=900 (v2.0)
         *
         * @return ICMSSN900
         */
        public final ICMSSN900 getICMSSN900() {
            return this.iCMSSN900;
        }

        /**
         * Tributação do ICMS pelo SIMPLES NACIONAL, CRT=1 – Simples Nacional e CSOSN=900 (v2.0)
         *
         * @param iCMSSN900
         */
        public final void setICMSSN900(ICMSSN900 iCMSSN900) {
            this.iCMSSN900 = iCMSSN900;
        }

    }

    /**
     * Tributação pelo ICMS<br>
     * 00 - Tributada integralmente
     */
    public static class ICMS00 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("pFCP")
        protected String pFCP;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        public ICMS00() {
            super("ICMS00");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 00 - Tributada integralmente
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 00 - Tributada integralmente
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCP() {
            return this.pFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCP
         */
        public final void setPFCP(String pFCP) {
            this.pFCP = pFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

    }

    /**
     * Tributação monofásica própria sobre combustíveis
     */
    public static class ICMS02 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("qBCMono")
        protected String qBCMono;

        @br.com.ctecinf.SimpleXML.Name("adRemICMS")
        protected String adRemICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSMono")
        protected String vICMSMono;

        public ICMS02() {
            super("ICMS02");
        }

        /**
         * origem da mercadoria
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 02= Tributação monofásica própria sobre combustíveis;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 02= Tributação monofásica própria sobre combustíveis;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Quantidade tributada.
         *
         * @return String
         */
        public final String getQBCMono() {
            return this.qBCMono;
        }

        /**
         * Quantidade tributada.
         *
         * @param qBCMono
         */
        public final void setQBCMono(String qBCMono) {
            this.qBCMono = qBCMono;
        }

        /**
         * Alíquota ad rem do imposto.
         *
         * @return String
         */
        public final String getAdRemICMS() {
            return this.adRemICMS;
        }

        /**
         * Alíquota ad rem do imposto.
         *
         * @param adRemICMS
         */
        public final void setAdRemICMS(String adRemICMS) {
            this.adRemICMS = adRemICMS;
        }

        /**
         * Valor do ICMS própri
         *
         * @return String
         */
        public final String getVICMSMono() {
            return this.vICMSMono;
        }

        /**
         * Valor do ICMS própri
         *
         * @param vICMSMono
         */
        public final void setVICMSMono(String vICMSMono) {
            this.vICMSMono = vICMSMono;
        }

    }

    /**
     * Tributação pelo ICMS<br>
     * 10 - Tributada e com cobrança do ICMS por substituição tributária
     */
    public static class ICMS10 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("vBCFCP")
        protected String vBCFCP;

        @br.com.ctecinf.SimpleXML.Name("pFCP")
        protected String pFCP;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTDeson")
        protected String vICMSSTDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMSST")
        protected String motDesICMSST;

        public ICMS10() {
            super("ICMS10");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * 10 - Tributada e com cobrança do ICMS por substituição tributária
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * 10 - Tributada e com cobrança do ICMS por substituição tributária
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCP() {
            return this.vBCFCP;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCP
         */
        public final void setVBCFCP(String vBCFCP) {
            this.vBCFCP = vBCFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCP() {
            return this.pFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCP
         */
        public final void setPFCP(String pFCP) {
            this.pFCP = pFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor)<br>
         * 6-Valor da Operação;
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor)<br>
         * 6-Valor da Operação;
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP retido por substituicao tributaria.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP retido por substituicao tributaria.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Valor do ICMS-ST desonerado.
         *
         * @return String
         */
        public final String getVICMSSTDeson() {
            return this.vICMSSTDeson;
        }

        /**
         * Valor do ICMS-ST desonerado.
         *
         * @param vICMSSTDeson
         */
        public final void setVICMSSTDeson(String vICMSSTDeson) {
            this.vICMSSTDeson = vICMSSTDeson;
        }

        /**
         * Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária; 9-Outros; 12-Fomento agropecuário.
         *
         * @return String
         */
        public final String getMotDesICMSST() {
            return this.motDesICMSST;
        }

        /**
         * Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária; 9-Outros; 12-Fomento agropecuário.
         *
         * @param motDesICMSST
         */
        public final void setMotDesICMSST(String motDesICMSST) {
            this.motDesICMSST = motDesICMSST;
        }

    }

    /**
     * Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis
     */
    public static class ICMS15 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("qBCMono")
        protected String qBCMono;

        @br.com.ctecinf.SimpleXML.Name("adRemICMS")
        protected String adRemICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSMono")
        protected String vICMSMono;

        @br.com.ctecinf.SimpleXML.Name("qBCMonoReten")
        protected String qBCMonoReten;

        @br.com.ctecinf.SimpleXML.Name("adRemICMSReten")
        protected String adRemICMSReten;

        @br.com.ctecinf.SimpleXML.Name("vICMSMonoReten")
        protected String vICMSMonoReten;

        @br.com.ctecinf.SimpleXML.Name("pRedAdRem")
        protected String pRedAdRem;

        @br.com.ctecinf.SimpleXML.Name("motRedAdRem")
        protected String motRedAdRem;

        public ICMS15() {
            super("ICMS15");
        }

        /**
         * origem da mercadoria
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 15= Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 15= Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Quantidade tributada.
         *
         * @return String
         */
        public final String getQBCMono() {
            return this.qBCMono;
        }

        /**
         * Quantidade tributada.
         *
         * @param qBCMono
         */
        public final void setQBCMono(String qBCMono) {
            this.qBCMono = qBCMono;
        }

        /**
         * Alíquota ad rem do imposto.
         *
         * @return String
         */
        public final String getAdRemICMS() {
            return this.adRemICMS;
        }

        /**
         * Alíquota ad rem do imposto.
         *
         * @param adRemICMS
         */
        public final void setAdRemICMS(String adRemICMS) {
            this.adRemICMS = adRemICMS;
        }

        /**
         * Valor do ICMS próprio
         *
         * @return String
         */
        public final String getVICMSMono() {
            return this.vICMSMono;
        }

        /**
         * Valor do ICMS próprio
         *
         * @param vICMSMono
         */
        public final void setVICMSMono(String vICMSMono) {
            this.vICMSMono = vICMSMono;
        }

        /**
         * Quantidade tributada sujeita a retenção.
         *
         * @return String
         */
        public final String getQBCMonoReten() {
            return this.qBCMonoReten;
        }

        /**
         * Quantidade tributada sujeita a retenção.
         *
         * @param qBCMonoReten
         */
        public final void setQBCMonoReten(String qBCMonoReten) {
            this.qBCMonoReten = qBCMonoReten;
        }

        /**
         * Alíquota ad rem do imposto com retenção.
         *
         * @return String
         */
        public final String getAdRemICMSReten() {
            return this.adRemICMSReten;
        }

        /**
         * Alíquota ad rem do imposto com retenção.
         *
         * @param adRemICMSReten
         */
        public final void setAdRemICMSReten(String adRemICMSReten) {
            this.adRemICMSReten = adRemICMSReten;
        }

        /**
         * Valor do ICMS com retenção
         *
         * @return String
         */
        public final String getVICMSMonoReten() {
            return this.vICMSMonoReten;
        }

        /**
         * Valor do ICMS com retenção
         *
         * @param vICMSMonoReten
         */
        public final void setVICMSMonoReten(String vICMSMonoReten) {
            this.vICMSMonoReten = vICMSMonoReten;
        }

        /**
         * Percentual de redução do valor da alíquota ad rem do ICMS.
         *
         * @return String
         */
        public final String getPRedAdRem() {
            return this.pRedAdRem;
        }

        /**
         * Percentual de redução do valor da alíquota ad rem do ICMS.
         *
         * @param pRedAdRem
         */
        public final void setPRedAdRem(String pRedAdRem) {
            this.pRedAdRem = pRedAdRem;
        }

        /**
         * Motivo da redução do adrem<br>
         * 																							1= Transporte coletivo de passageiros; 9=Outros;
         *
         * @return String
         */
        public final String getMotRedAdRem() {
            return this.motRedAdRem;
        }

        /**
         * Motivo da redução do adrem<br>
         * 																							1= Transporte coletivo de passageiros; 9=Outros;
         *
         * @param motRedAdRem
         */
        public final void setMotRedAdRem(String motRedAdRem) {
            this.motRedAdRem = motRedAdRem;
        }

    }

    /**
     * Tributção pelo ICMS<br>
     * 20 - Com redução de base de cálculo
     */
    public static class ICMS20 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("pRedBC")
        protected String pRedBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("vBCFCP")
        protected String vBCFCP;

        @br.com.ctecinf.SimpleXML.Name("pFCP")
        protected String pFCP;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        @br.com.ctecinf.SimpleXML.Name("vICMSDeson")
        protected String vICMSDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMS")
        protected String motDesICMS;

        public ICMS20() {
            super("ICMS20");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 20 - Com redução de base de cálculo
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 20 - Com redução de base de cálculo
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @return String
         */
        public final String getPRedBC() {
            return this.pRedBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @param pRedBC
         */
        public final void setPRedBC(String pRedBC) {
            this.pRedBC = pRedBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCP() {
            return this.vBCFCP;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCP
         */
        public final void setVBCFCP(String vBCFCP) {
            this.vBCFCP = vBCFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCP() {
            return this.pFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCP
         */
        public final void setPFCP(String pFCP) {
            this.pFCP = pFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @return String
         */
        public final String getVICMSDeson() {
            return this.vICMSDeson;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @param vICMSDeson
         */
        public final void setVICMSDeson(String vICMSDeson) {
            this.vICMSDeson = vICMSDeson;
        }

        /**
         * Motivo da desoneração do ICMS:3-Uso na agropecuária;9-Outros;12-Fomento agropecuário
         *
         * @return String
         */
        public final String getMotDesICMS() {
            return this.motDesICMS;
        }

        /**
         * Motivo da desoneração do ICMS:3-Uso na agropecuária;9-Outros;12-Fomento agropecuário
         *
         * @param motDesICMS
         */
        public final void setMotDesICMS(String motDesICMS) {
            this.motDesICMS = motDesICMS;
        }

    }

    /**
     * Tributação pelo ICMS<br>
     * 30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária
     */
    public static class ICMS30 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("vICMSDeson")
        protected String vICMSDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMS")
        protected String motDesICMS;

        public ICMS30() {
            super("ICMS30");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor).<br>
         * 6 - Valor da Operação
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor).<br>
         * 6 - Valor da Operação
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @return String
         */
        public final String getVICMSDeson() {
            return this.vICMSDeson;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @param vICMSDeson
         */
        public final void setVICMSDeson(String vICMSDeson) {
            this.vICMSDeson = vICMSDeson;
        }

        /**
         * Motivo da desoneração do ICMS:6-Utilitários Motocicleta AÁrea Livre;7-SUFRAMA;9-Outros
         *
         * @return String
         */
        public final String getMotDesICMS() {
            return this.motDesICMS;
        }

        /**
         * Motivo da desoneração do ICMS:6-Utilitários Motocicleta AÁrea Livre;7-SUFRAMA;9-Outros
         *
         * @param motDesICMS
         */
        public final void setMotDesICMS(String motDesICMS) {
            this.motDesICMS = motDesICMS;
        }

    }

    /**
     * Tributação pelo ICMS<br>
     * 40 - Isenta <br>
     * 41 - Não tributada <br>
     * 50 - Suspensão
     */
    public static class ICMS40 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vICMSDeson")
        protected String vICMSDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMS")
        protected String motDesICMS;

        public ICMS40() {
            super("ICMS40");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributação pelo ICMS <br>
         * 40 - Isenta <br>
         * 41 - Não tributada <br>
         * 50 - Suspensão <br>
         * 51 - Diferimento
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributação pelo ICMS <br>
         * 40 - Isenta <br>
         * 41 - Não tributada <br>
         * 50 - Suspensão <br>
         * 51 - Diferimento
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * O valor do ICMS será informado apenas nas operações com veículos beneficiados com a desoneração condicional do ICMS.
         *
         * @return String
         */
        public final String getVICMSDeson() {
            return this.vICMSDeson;
        }

        /**
         * O valor do ICMS será informado apenas nas operações com veículos beneficiados com a desoneração condicional do ICMS.
         *
         * @param vICMSDeson
         */
        public final void setVICMSDeson(String vICMSDeson) {
            this.vICMSDeson = vICMSDeson;
        }

        /**
         * Este campo será preenchido quando o campo anterior estiver preenchido.<br>
         * Informar o motivo da desoneração:<br>
         * 1 – Táxi;<br>
         * 3 – Produtor Agropecuário;<br>
         * 4 – Frotista/Locadora;<br>
         * 5 – Diplomático/Consular;<br>
         * 6 – Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações);<br>
         * 7 – SUFRAMA;<br>
         * 8 - Venda a órgão Público;<br>
         * 9 – Outros<br>
         * 10- Deficiente Condutor<br>
         * 11- Deficiente não condutor<br>
         * 16 - Olimpíadas Rio 2016<br>
         * 90 - Solicitado pelo Fisco
         *
         * @return String
         */
        public final String getMotDesICMS() {
            return this.motDesICMS;
        }

        /**
         * Este campo será preenchido quando o campo anterior estiver preenchido.<br>
         * Informar o motivo da desoneração:<br>
         * 1 – Táxi;<br>
         * 3 – Produtor Agropecuário;<br>
         * 4 – Frotista/Locadora;<br>
         * 5 – Diplomático/Consular;<br>
         * 6 – Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações);<br>
         * 7 – SUFRAMA;<br>
         * 8 - Venda a órgão Público;<br>
         * 9 – Outros<br>
         * 10- Deficiente Condutor<br>
         * 11- Deficiente não condutor<br>
         * 16 - Olimpíadas Rio 2016<br>
         * 90 - Solicitado pelo Fisco
         *
         * @param motDesICMS
         */
        public final void setMotDesICMS(String motDesICMS) {
            this.motDesICMS = motDesICMS;
        }

    }

    /**
     * Tributção pelo ICMS<br>
     * 51 - Diferimento<br>
     * A exigência do preenchimento das informações do ICMS diferido fica à critério de cada UF.
     */
    public static class ICMS51 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("pRedBC")
        protected String pRedBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSOp")
        protected String vICMSOp;

        @br.com.ctecinf.SimpleXML.Name("pDif")
        protected String pDif;

        @br.com.ctecinf.SimpleXML.Name("vICMSDif")
        protected String vICMSDif;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("vBCFCP")
        protected String vBCFCP;

        @br.com.ctecinf.SimpleXML.Name("pFCP")
        protected String pFCP;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        @br.com.ctecinf.SimpleXML.Name("pFCPDif")
        protected String pFCPDif;

        @br.com.ctecinf.SimpleXML.Name("vFCPDif")
        protected String vFCPDif;

        @br.com.ctecinf.SimpleXML.Name("vFCPEfet")
        protected String vFCPEfet;

        public ICMS51() {
            super("ICMS51");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 20 - Com redução de base de cálculo
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 20 - Com redução de base de cálculo
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @return String
         */
        public final String getPRedBC() {
            return this.pRedBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @param pRedBC
         */
        public final void setPRedBC(String pRedBC) {
            this.pRedBC = pRedBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do imposto
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do imposto
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS da Operação
         *
         * @return String
         */
        public final String getVICMSOp() {
            return this.vICMSOp;
        }

        /**
         * Valor do ICMS da Operação
         *
         * @param vICMSOp
         */
        public final void setVICMSOp(String vICMSOp) {
            this.vICMSOp = vICMSOp;
        }

        /**
         * Percentual do diferemento
         *
         * @return String
         */
        public final String getPDif() {
            return this.pDif;
        }

        /**
         * Percentual do diferemento
         *
         * @param pDif
         */
        public final void setPDif(String pDif) {
            this.pDif = pDif;
        }

        /**
         * Valor do ICMS da diferido
         *
         * @return String
         */
        public final String getVICMSDif() {
            return this.vICMSDif;
        }

        /**
         * Valor do ICMS da diferido
         *
         * @param vICMSDif
         */
        public final void setVICMSDif(String vICMSDif) {
            this.vICMSDif = vICMSDif;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCP() {
            return this.vBCFCP;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCP
         */
        public final void setVBCFCP(String vBCFCP) {
            this.vBCFCP = vBCFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCP() {
            return this.pFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCP
         */
        public final void setPFCP(String pFCP) {
            this.pFCP = pFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

        /**
         * Percentual do diferimento do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCPDif() {
            return this.pFCPDif;
        }

        /**
         * Percentual do diferimento do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCPDif
         */
        public final void setPFCPDif(String pFCPDif) {
            this.pFCPDif = pFCPDif;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) diferido.
         *
         * @return String
         */
        public final String getVFCPDif() {
            return this.vFCPDif;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) diferido.
         *
         * @param vFCPDif
         */
        public final void setVFCPDif(String vFCPDif) {
            this.vFCPDif = vFCPDif;
        }

        /**
         * Valor efetivo do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCPEfet() {
            return this.vFCPEfet;
        }

        /**
         * Valor efetivo do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCPEfet
         */
        public final void setVFCPEfet(String vFCPEfet) {
            this.vFCPEfet = vFCPEfet;
        }

    }

    /**
     * Tributação monofásica sobre combustíveis com recolhimento diferido
     */
    public static class ICMS53 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("qBCMono")
        protected String qBCMono;

        @br.com.ctecinf.SimpleXML.Name("adRemICMS")
        protected String adRemICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSMonoOp")
        protected String vICMSMonoOp;

        @br.com.ctecinf.SimpleXML.Name("pDif")
        protected String pDif;

        @br.com.ctecinf.SimpleXML.Name("vICMSMonoDif")
        protected String vICMSMonoDif;

        @br.com.ctecinf.SimpleXML.Name("vICMSMono")
        protected String vICMSMono;

        @br.com.ctecinf.SimpleXML.Name("qBCMonoDif")
        protected String qBCMonoDif;

        @br.com.ctecinf.SimpleXML.Name("adRemICMSDif")
        protected String adRemICMSDif;

        public ICMS53() {
            super("ICMS53");
        }

        /**
         * origem da mercadoria
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 53= Tributação monofásica sobre combustíveis com recolhimento diferido;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 53= Tributação monofásica sobre combustíveis com recolhimento diferido;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Quantidade tributada.
         *
         * @return String
         */
        public final String getQBCMono() {
            return this.qBCMono;
        }

        /**
         * Quantidade tributada.
         *
         * @param qBCMono
         */
        public final void setQBCMono(String qBCMono) {
            this.qBCMono = qBCMono;
        }

        /**
         * Alíquota ad rem do imposto.
         *
         * @return String
         */
        public final String getAdRemICMS() {
            return this.adRemICMS;
        }

        /**
         * Alíquota ad rem do imposto.
         *
         * @param adRemICMS
         */
        public final void setAdRemICMS(String adRemICMS) {
            this.adRemICMS = adRemICMS;
        }

        /**
         * Valor do ICMS da operação
         *
         * @return String
         */
        public final String getVICMSMonoOp() {
            return this.vICMSMonoOp;
        }

        /**
         * Valor do ICMS da operação
         *
         * @param vICMSMonoOp
         */
        public final void setVICMSMonoOp(String vICMSMonoOp) {
            this.vICMSMonoOp = vICMSMonoOp;
        }

        /**
         * Percentual do diferemento
         *
         * @return String
         */
        public final String getPDif() {
            return this.pDif;
        }

        /**
         * Percentual do diferemento
         *
         * @param pDif
         */
        public final void setPDif(String pDif) {
            this.pDif = pDif;
        }

        /**
         * Valor do ICMS diferido
         *
         * @return String
         */
        public final String getVICMSMonoDif() {
            return this.vICMSMonoDif;
        }

        /**
         * Valor do ICMS diferido
         *
         * @param vICMSMonoDif
         */
        public final void setVICMSMonoDif(String vICMSMonoDif) {
            this.vICMSMonoDif = vICMSMonoDif;
        }

        /**
         * Valor do ICMS próprio devido
         *
         * @return String
         */
        public final String getVICMSMono() {
            return this.vICMSMono;
        }

        /**
         * Valor do ICMS próprio devido
         *
         * @param vICMSMono
         */
        public final void setVICMSMono(String vICMSMono) {
            this.vICMSMono = vICMSMono;
        }

        /**
         * Quantidade tributada diferida.
         *
         * @return String
         */
        public final String getQBCMonoDif() {
            return this.qBCMonoDif;
        }

        /**
         * Quantidade tributada diferida.
         *
         * @param qBCMonoDif
         */
        public final void setQBCMonoDif(String qBCMonoDif) {
            this.qBCMonoDif = qBCMonoDif;
        }

        /**
         * Alíquota ad rem do imposto diferido
         *
         * @return String
         */
        public final String getAdRemICMSDif() {
            return this.adRemICMSDif;
        }

        /**
         * Alíquota ad rem do imposto diferido
         *
         * @param adRemICMSDif
         */
        public final void setAdRemICMSDif(String adRemICMSDif) {
            this.adRemICMSDif = adRemICMSDif;
        }

    }

    /**
     * Tributação pelo ICMS<br>
     * 60 - ICMS cobrado anteriormente por substituição tributária
     */
    public static class ICMS60 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBCSTRet")
        protected String vBCSTRet;

        @br.com.ctecinf.SimpleXML.Name("pST")
        protected String pST;

        @br.com.ctecinf.SimpleXML.Name("vICMSSubstituto")
        protected String vICMSSubstituto;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTRet")
        protected String vICMSSTRet;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPSTRet")
        protected String vBCFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("pFCPSTRet")
        protected String pFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("vFCPSTRet")
        protected String vFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("pRedBCEfet")
        protected String pRedBCEfet;

        @br.com.ctecinf.SimpleXML.Name("vBCEfet")
        protected String vBCEfet;

        @br.com.ctecinf.SimpleXML.Name("pICMSEfet")
        protected String pICMSEfet;

        @br.com.ctecinf.SimpleXML.Name("vICMSEfet")
        protected String vICMSEfet;

        public ICMS60() {
            super("ICMS60");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributação pelo ICMS <br>
         * 60 - ICMS cobrado anteriormente por substituição tributária
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributação pelo ICMS <br>
         * 60 - ICMS cobrado anteriormente por substituição tributária
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Valor da BC do ICMS ST retido anteriormente
         *
         * @return String
         */
        public final String getVBCSTRet() {
            return this.vBCSTRet;
        }

        /**
         * Valor da BC do ICMS ST retido anteriormente
         *
         * @param vBCSTRet
         */
        public final void setVBCSTRet(String vBCSTRet) {
            this.vBCSTRet = vBCSTRet;
        }

        /**
         * Aliquota suportada pelo consumidor final.
         *
         * @return String
         */
        public final String getPST() {
            return this.pST;
        }

        /**
         * Aliquota suportada pelo consumidor final.
         *
         * @param pST
         */
        public final void setPST(String pST) {
            this.pST = pST;
        }

        /**
         * Valor do ICMS Próprio do Substituto cobrado em operação anterior
         *
         * @return String
         */
        public final String getVICMSSubstituto() {
            return this.vICMSSubstituto;
        }

        /**
         * Valor do ICMS Próprio do Substituto cobrado em operação anterior
         *
         * @param vICMSSubstituto
         */
        public final void setVICMSSubstituto(String vICMSSubstituto) {
            this.vICMSSubstituto = vICMSSubstituto;
        }

        /**
         * Valor do ICMS ST retido anteriormente
         *
         * @return String
         */
        public final String getVICMSSTRet() {
            return this.vICMSSTRet;
        }

        /**
         * Valor do ICMS ST retido anteriormente
         *
         * @param vICMSSTRet
         */
        public final void setVICMSSTRet(String vICMSSTRet) {
            this.vICMSSTRet = vICMSSTRet;
        }

        /**
         * Valor da Base de cálculo do FCP retido anteriormente por ST.
         *
         * @return String
         */
        public final String getVBCFCPSTRet() {
            return this.vBCFCPSTRet;
        }

        /**
         * Valor da Base de cálculo do FCP retido anteriormente por ST.
         *
         * @param vBCFCPSTRet
         */
        public final void setVBCFCPSTRet(String vBCFCPSTRet) {
            this.vBCFCPSTRet = vBCFCPSTRet;
        }

        /**
         * Percentual de FCP retido anteriormente por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPSTRet() {
            return this.pFCPSTRet;
        }

        /**
         * Percentual de FCP retido anteriormente por substituição tributária.
         *
         * @param pFCPSTRet
         */
        public final void setPFCPSTRet(String pFCPSTRet) {
            this.pFCPSTRet = pFCPSTRet;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPSTRet() {
            return this.vFCPSTRet;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPSTRet
         */
        public final void setVFCPSTRet(String vFCPSTRet) {
            this.vFCPSTRet = vFCPSTRet;
        }

        /**
         * Percentual de redução da base de cálculo efetiva.
         *
         * @return String
         */
        public final String getPRedBCEfet() {
            return this.pRedBCEfet;
        }

        /**
         * Percentual de redução da base de cálculo efetiva.
         *
         * @param pRedBCEfet
         */
        public final void setPRedBCEfet(String pRedBCEfet) {
            this.pRedBCEfet = pRedBCEfet;
        }

        /**
         * Valor da base de cálculo efetiva.
         *
         * @return String
         */
        public final String getVBCEfet() {
            return this.vBCEfet;
        }

        /**
         * Valor da base de cálculo efetiva.
         *
         * @param vBCEfet
         */
        public final void setVBCEfet(String vBCEfet) {
            this.vBCEfet = vBCEfet;
        }

        /**
         * Alíquota do ICMS efetiva.
         *
         * @return String
         */
        public final String getPICMSEfet() {
            return this.pICMSEfet;
        }

        /**
         * Alíquota do ICMS efetiva.
         *
         * @param pICMSEfet
         */
        public final void setPICMSEfet(String pICMSEfet) {
            this.pICMSEfet = pICMSEfet;
        }

        /**
         * Valor do ICMS efetivo.
         *
         * @return String
         */
        public final String getVICMSEfet() {
            return this.vICMSEfet;
        }

        /**
         * Valor do ICMS efetivo.
         *
         * @param vICMSEfet
         */
        public final void setVICMSEfet(String vICMSEfet) {
            this.vICMSEfet = vICMSEfet;
        }

    }

    /**
     * Tributação monofásica sobre combustíveis cobrada anteriormente;
     */
    public static class ICMS61 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("qBCMonoRet")
        protected String qBCMonoRet;

        @br.com.ctecinf.SimpleXML.Name("adRemICMSRet")
        protected String adRemICMSRet;

        @br.com.ctecinf.SimpleXML.Name("vICMSMonoRet")
        protected String vICMSMonoRet;

        public ICMS61() {
            super("ICMS61");
        }

        /**
         * origem da mercadoria
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 61= Tributação monofásica sobre combustíveis cobrada anteriormente
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 61= Tributação monofásica sobre combustíveis cobrada anteriormente
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Quantidade tributada retida anteriormente
         *
         * @return String
         */
        public final String getQBCMonoRet() {
            return this.qBCMonoRet;
        }

        /**
         * Quantidade tributada retida anteriormente
         *
         * @param qBCMonoRet
         */
        public final void setQBCMonoRet(String qBCMonoRet) {
            this.qBCMonoRet = qBCMonoRet;
        }

        /**
         * Alíquota ad rem do imposto retido anteriormente
         *
         * @return String
         */
        public final String getAdRemICMSRet() {
            return this.adRemICMSRet;
        }

        /**
         * Alíquota ad rem do imposto retido anteriormente
         *
         * @param adRemICMSRet
         */
        public final void setAdRemICMSRet(String adRemICMSRet) {
            this.adRemICMSRet = adRemICMSRet;
        }

        /**
         * Valor do ICMS retido anteriormente
         *
         * @return String
         */
        public final String getVICMSMonoRet() {
            return this.vICMSMonoRet;
        }

        /**
         * Valor do ICMS retido anteriormente
         *
         * @param vICMSMonoRet
         */
        public final void setVICMSMonoRet(String vICMSMonoRet) {
            this.vICMSMonoRet = vICMSMonoRet;
        }

    }

    /**
     * Tributação pelo ICMS <br>
     * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária
     */
    public static class ICMS70 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("pRedBC")
        protected String pRedBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("vBCFCP")
        protected String vBCFCP;

        @br.com.ctecinf.SimpleXML.Name("pFCP")
        protected String pFCP;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("vICMSDeson")
        protected String vICMSDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMS")
        protected String motDesICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTDeson")
        protected String vICMSSTDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMSST")
        protected String motDesICMSST;

        public ICMS70() {
            super("ICMS70");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS:<br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @return String
         */
        public final String getPRedBC() {
            return this.pRedBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @param pRedBC
         */
        public final void setPRedBC(String pRedBC) {
            this.pRedBC = pRedBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCP() {
            return this.vBCFCP;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCP
         */
        public final void setVBCFCP(String vBCFCP) {
            this.vBCFCP = vBCFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCP() {
            return this.pFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCP
         */
        public final void setPFCP(String pFCP) {
            this.pFCP = pFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor);<br>
         * 6 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor);<br>
         * 6 - Valor da Operação.
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP retido por substituição tributária.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @return String
         */
        public final String getVICMSDeson() {
            return this.vICMSDeson;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @param vICMSDeson
         */
        public final void setVICMSDeson(String vICMSDeson) {
            this.vICMSDeson = vICMSDeson;
        }

        /**
         * Motivo da desoneração do ICMS:3-Uso na agropecuária;9-Outros;12-Fomento agropecuário
         *
         * @return String
         */
        public final String getMotDesICMS() {
            return this.motDesICMS;
        }

        /**
         * Motivo da desoneração do ICMS:3-Uso na agropecuária;9-Outros;12-Fomento agropecuário
         *
         * @param motDesICMS
         */
        public final void setMotDesICMS(String motDesICMS) {
            this.motDesICMS = motDesICMS;
        }

        /**
         * Valor do ICMS-ST desonerado.
         *
         * @return String
         */
        public final String getVICMSSTDeson() {
            return this.vICMSSTDeson;
        }

        /**
         * Valor do ICMS-ST desonerado.
         *
         * @param vICMSSTDeson
         */
        public final void setVICMSSTDeson(String vICMSSTDeson) {
            this.vICMSSTDeson = vICMSSTDeson;
        }

        /**
         * Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária; 9-Outros; 12-Fomento agropecuário.
         *
         * @return String
         */
        public final String getMotDesICMSST() {
            return this.motDesICMSST;
        }

        /**
         * Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária; 9-Outros; 12-Fomento agropecuário.
         *
         * @param motDesICMSST
         */
        public final void setMotDesICMSST(String motDesICMSST) {
            this.motDesICMSST = motDesICMSST;
        }

    }

    /**
     * Tributação pelo ICMS<br>
     * 90 - Outras
     */
    public static class ICMS90 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pRedBC")
        protected String pRedBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("vBCFCP")
        protected String vBCFCP;

        @br.com.ctecinf.SimpleXML.Name("pFCP")
        protected String pFCP;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("vICMSDeson")
        protected String vICMSDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMS")
        protected String motDesICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTDeson")
        protected String vICMSSTDeson;

        @br.com.ctecinf.SimpleXML.Name("motDesICMSST")
        protected String motDesICMSST;

        public ICMS90() {
            super("ICMS90");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 90 - Outras
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 90 - Outras
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS: <br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS: <br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @return String
         */
        public final String getPRedBC() {
            return this.pRedBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @param pRedBC
         */
        public final void setPRedBC(String pRedBC) {
            this.pRedBC = pRedBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCP() {
            return this.vBCFCP;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCP
         */
        public final void setVBCFCP(String vBCFCP) {
            this.vBCFCP = vBCFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getPFCP() {
            return this.pFCP;
        }

        /**
         * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param pFCP
         */
        public final void setPFCP(String pFCP) {
            this.pFCP = pFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor);<br>
         * 6 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor);<br>
         * 6 - Valor da Operação.
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @return String
         */
        public final String getVICMSDeson() {
            return this.vICMSDeson;
        }

        /**
         * Valor do ICMS de desoneração
         *
         * @param vICMSDeson
         */
        public final void setVICMSDeson(String vICMSDeson) {
            this.vICMSDeson = vICMSDeson;
        }

        /**
         * Motivo da desoneração do ICMS:3-Uso na agropecuária;9-Outros;12-Fomento agropecuário
         *
         * @return String
         */
        public final String getMotDesICMS() {
            return this.motDesICMS;
        }

        /**
         * Motivo da desoneração do ICMS:3-Uso na agropecuária;9-Outros;12-Fomento agropecuário
         *
         * @param motDesICMS
         */
        public final void setMotDesICMS(String motDesICMS) {
            this.motDesICMS = motDesICMS;
        }

        /**
         * Valor do ICMS-ST desonerado.
         *
         * @return String
         */
        public final String getVICMSSTDeson() {
            return this.vICMSSTDeson;
        }

        /**
         * Valor do ICMS-ST desonerado.
         *
         * @param vICMSSTDeson
         */
        public final void setVICMSSTDeson(String vICMSSTDeson) {
            this.vICMSSTDeson = vICMSSTDeson;
        }

        /**
         * Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária; 9-Outros; 12-Fomento agropecuário.
         *
         * @return String
         */
        public final String getMotDesICMSST() {
            return this.motDesICMSST;
        }

        /**
         * Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária; 9-Outros; 12-Fomento agropecuário.
         *
         * @param motDesICMSST
         */
        public final void setMotDesICMSST(String motDesICMSST) {
            this.motDesICMSST = motDesICMSST;
        }

    }

    /**
     * Partilha do ICMS entre a UF de origem e UF de destino ou a UF definida na legislação<br>
     * Operação interestadual para consumidor final com partilha do ICMS  devido na operação entre a UF de origem e a UF do destinatário ou ou a UF definida na legislação. (Ex. UF da concessionária de entrega do  veículos)
     */
    public static class ICMSPart extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pRedBC")
        protected String pRedBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("pBCOp")
        protected String pBCOp;

        @br.com.ctecinf.SimpleXML.Name("UFST")
        protected TUf uFST;

        public ICMSPart() {
            super("ICMSPart");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributação pelo ICMS <br>
         * 10 - Tributada e com cobrança do ICMS por substituição tributária;<br>
         * 90 – Outros.
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributação pelo ICMS <br>
         * 10 - Tributada e com cobrança do ICMS por substituição tributária;<br>
         * 90 – Outros.
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Modalidade de determinação da BC do ICMS: <br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS: <br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @return String
         */
        public final String getPRedBC() {
            return this.pRedBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @param pRedBC
         */
        public final void setPRedBC(String pRedBC) {
            this.pRedBC = pRedBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor).<br>
         * 6 - Valor da Operação
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor).<br>
         * 6 - Valor da Operação
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP retido por substituicao tributaria.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP retido por substituicao tributaria.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Percentual para determinação do valor  da Base de Cálculo da operação própria.
         *
         * @return String
         */
        public final String getPBCOp() {
            return this.pBCOp;
        }

        /**
         * Percentual para determinação do valor  da Base de Cálculo da operação própria.
         *
         * @param pBCOp
         */
        public final void setPBCOp(String pBCOp) {
            this.pBCOp = pBCOp;
        }

        /**
         * Sigla da UF para qual é devido o ICMS ST da operação.
         *
         * @return TUf
         */
        public final TUf getUFST() {
            return this.uFST;
        }

        /**
         * Sigla da UF para qual é devido o ICMS ST da operação.
         *
         * @param uFST
         */
        public final void setUFST(TUf uFST) {
            this.uFST = uFST;
        }

    }

    /**
     * Grupo de informação do ICMSST devido para a UF de destino, nas operações interestaduais de produtos que tiveram retenção antecipada de ICMS por ST na UF do remetente. Repasse via Substituto Tributário.
     */
    public static class ICMSST extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBCSTRet")
        protected String vBCSTRet;

        @br.com.ctecinf.SimpleXML.Name("pST")
        protected String pST;

        @br.com.ctecinf.SimpleXML.Name("vICMSSubstituto")
        protected String vICMSSubstituto;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTRet")
        protected String vICMSSTRet;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPSTRet")
        protected String vBCFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("pFCPSTRet")
        protected String pFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("vFCPSTRet")
        protected String vFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("vBCSTDest")
        protected String vBCSTDest;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTDest")
        protected String vICMSSTDest;

        @br.com.ctecinf.SimpleXML.Name("pRedBCEfet")
        protected String pRedBCEfet;

        @br.com.ctecinf.SimpleXML.Name("vBCEfet")
        protected String vBCEfet;

        @br.com.ctecinf.SimpleXML.Name("pICMSEfet")
        protected String pICMSEfet;

        @br.com.ctecinf.SimpleXML.Name("vICMSEfet")
        protected String vICMSEfet;

        public ICMSST() {
            super("ICMSST");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributção pelo ICMS<br>
         * 41-Não Tributado.<br>
         * 60-Cobrado anteriormente por substituição tributária.
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Tributção pelo ICMS<br>
         * 41-Não Tributado.<br>
         * 60-Cobrado anteriormente por substituição tributária.
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Informar o valor da BC do ICMS ST retido na UF remetente
         *
         * @return String
         */
        public final String getVBCSTRet() {
            return this.vBCSTRet;
        }

        /**
         * Informar o valor da BC do ICMS ST retido na UF remetente
         *
         * @param vBCSTRet
         */
        public final void setVBCSTRet(String vBCSTRet) {
            this.vBCSTRet = vBCSTRet;
        }

        /**
         * Aliquota suportada pelo consumidor final.
         *
         * @return String
         */
        public final String getPST() {
            return this.pST;
        }

        /**
         * Aliquota suportada pelo consumidor final.
         *
         * @param pST
         */
        public final void setPST(String pST) {
            this.pST = pST;
        }

        /**
         * Valor do ICMS Próprio do Substituto cobrado em operação anterior
         *
         * @return String
         */
        public final String getVICMSSubstituto() {
            return this.vICMSSubstituto;
        }

        /**
         * Valor do ICMS Próprio do Substituto cobrado em operação anterior
         *
         * @param vICMSSubstituto
         */
        public final void setVICMSSubstituto(String vICMSSubstituto) {
            this.vICMSSubstituto = vICMSSubstituto;
        }

        /**
         * Informar o valor do ICMS ST retido na UF remetente (iv2.0))
         *
         * @return String
         */
        public final String getVICMSSTRet() {
            return this.vICMSSTRet;
        }

        /**
         * Informar o valor do ICMS ST retido na UF remetente (iv2.0))
         *
         * @param vICMSSTRet
         */
        public final void setVICMSSTRet(String vICMSSTRet) {
            this.vICMSSTRet = vICMSSTRet;
        }

        /**
         * Informar o valor da Base de Cálculo do FCP retido anteriormente por ST.
         *
         * @return String
         */
        public final String getVBCFCPSTRet() {
            return this.vBCFCPSTRet;
        }

        /**
         * Informar o valor da Base de Cálculo do FCP retido anteriormente por ST.
         *
         * @param vBCFCPSTRet
         */
        public final void setVBCFCPSTRet(String vBCFCPSTRet) {
            this.vBCFCPSTRet = vBCFCPSTRet;
        }

        /**
         * Percentual relativo ao Fundo de Combate à Pobreza (FCP) retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPSTRet() {
            return this.pFCPSTRet;
        }

        /**
         * Percentual relativo ao Fundo de Combate à Pobreza (FCP) retido por substituição tributária.
         *
         * @param pFCPSTRet
         */
        public final void setPFCPSTRet(String pFCPSTRet) {
            this.pFCPSTRet = pFCPSTRet;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPSTRet() {
            return this.vFCPSTRet;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) retido por substituição tributária.
         *
         * @param vFCPSTRet
         */
        public final void setVFCPSTRet(String vFCPSTRet) {
            this.vFCPSTRet = vFCPSTRet;
        }

        /**
         * Informar o valor da BC do ICMS ST da UF destino
         *
         * @return String
         */
        public final String getVBCSTDest() {
            return this.vBCSTDest;
        }

        /**
         * Informar o valor da BC do ICMS ST da UF destino
         *
         * @param vBCSTDest
         */
        public final void setVBCSTDest(String vBCSTDest) {
            this.vBCSTDest = vBCSTDest;
        }

        /**
         * Informar o valor da BC do ICMS ST da UF destino (v2.0)
         *
         * @return String
         */
        public final String getVICMSSTDest() {
            return this.vICMSSTDest;
        }

        /**
         * Informar o valor da BC do ICMS ST da UF destino (v2.0)
         *
         * @param vICMSSTDest
         */
        public final void setVICMSSTDest(String vICMSSTDest) {
            this.vICMSSTDest = vICMSSTDest;
        }

        /**
         * Percentual de redução da base de cálculo efetiva.
         *
         * @return String
         */
        public final String getPRedBCEfet() {
            return this.pRedBCEfet;
        }

        /**
         * Percentual de redução da base de cálculo efetiva.
         *
         * @param pRedBCEfet
         */
        public final void setPRedBCEfet(String pRedBCEfet) {
            this.pRedBCEfet = pRedBCEfet;
        }

        /**
         * Valor da base de cálculo efetiva.
         *
         * @return String
         */
        public final String getVBCEfet() {
            return this.vBCEfet;
        }

        /**
         * Valor da base de cálculo efetiva.
         *
         * @param vBCEfet
         */
        public final void setVBCEfet(String vBCEfet) {
            this.vBCEfet = vBCEfet;
        }

        /**
         * Alíquota do ICMS efetivo.
         *
         * @return String
         */
        public final String getPICMSEfet() {
            return this.pICMSEfet;
        }

        /**
         * Alíquota do ICMS efetivo.
         *
         * @param pICMSEfet
         */
        public final void setPICMSEfet(String pICMSEfet) {
            this.pICMSEfet = pICMSEfet;
        }

        /**
         * Valor do ICMS efetivo.
         *
         * @return String
         */
        public final String getVICMSEfet() {
            return this.vICMSEfet;
        }

        /**
         * Valor do ICMS efetivo.
         *
         * @param vICMSEfet
         */
        public final void setVICMSEfet(String vICMSEfet) {
            this.vICMSEfet = vICMSEfet;
        }

    }

    /**
     * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=101 (v.2.0)
     */
    public static class ICMSSN101 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CSOSN")
        protected String cSOSN;

        @br.com.ctecinf.SimpleXML.Name("pCredSN")
        protected String pCredSN;

        @br.com.ctecinf.SimpleXML.Name("vCredICMSSN")
        protected String vCredICMSSN;

        public ICMSSN101() {
            super("ICMSSN101");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno <br>
         * (v2.0)
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno <br>
         * (v2.0)
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * 101- Tributada pelo Simples Nacional com permissão de crédito. (v.2.0)
         *
         * @return String
         */
        public final String getCSOSN() {
            return this.cSOSN;
        }

        /**
         * 101- Tributada pelo Simples Nacional com permissão de crédito. (v.2.0)
         *
         * @param cSOSN
         */
        public final void setCSOSN(String cSOSN) {
            this.cSOSN = cSOSN;
        }

        /**
         * Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0)
         *
         * @return String
         */
        public final String getPCredSN() {
            return this.pCredSN;
        }

        /**
         * Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0)
         *
         * @param pCredSN
         */
        public final void setPCredSN(String pCredSN) {
            this.pCredSN = pCredSN;
        }

        /**
         * Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0)
         *
         * @return String
         */
        public final String getVCredICMSSN() {
            return this.vCredICMSSN;
        }

        /**
         * Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0)
         *
         * @param vCredICMSSN
         */
        public final void setVCredICMSSN(String vCredICMSSN) {
            this.vCredICMSSN = vCredICMSSN;
        }

    }

    /**
     * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=102, 103, 300 ou 400 (v.2.0))
     */
    public static class ICMSSN102 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CSOSN")
        protected String cSOSN;

        public ICMSSN102() {
            super("ICMSSN102");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno <br>
         * (v2.0)
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno <br>
         * (v2.0)
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * 102- Tributada pelo Simples Nacional sem permissão de crédito. <br>
         * 103 – Isenção do ICMS  no Simples Nacional para faixa de receita bruta.<br>
         * 300 – Imune.<br>
         * 400 – Não tributda pelo Simples Nacional (v.2.0) (v.2.0)
         *
         * @return String
         */
        public final String getCSOSN() {
            return this.cSOSN;
        }

        /**
         * 102- Tributada pelo Simples Nacional sem permissão de crédito. <br>
         * 103 – Isenção do ICMS  no Simples Nacional para faixa de receita bruta.<br>
         * 300 – Imune.<br>
         * 400 – Não tributda pelo Simples Nacional (v.2.0) (v.2.0)
         *
         * @param cSOSN
         */
        public final void setCSOSN(String cSOSN) {
            this.cSOSN = cSOSN;
        }

    }

    /**
     * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=201 (v.2.0)
     */
    public static class ICMSSN201 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CSOSN")
        protected String cSOSN;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("pCredSN")
        protected String pCredSN;

        @br.com.ctecinf.SimpleXML.Name("vCredICMSSN")
        protected String vCredICMSSN;

        public ICMSSN201() {
            super("ICMSSN201");
        }

        /**
         * Origem da mercadoria:<br>
         * 0 – Nacional;<br>
         * 1 – Estrangeira – Importação direta;<br>
         * 2 – Estrangeira – Adquirida no mercado interno. (v2.0)
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * Origem da mercadoria:<br>
         * 0 – Nacional;<br>
         * 1 – Estrangeira – Importação direta;<br>
         * 2 – Estrangeira – Adquirida no mercado interno. (v2.0)
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * 201- Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por Substituição Tributária (v.2.0)
         *
         * @return String
         */
        public final String getCSOSN() {
            return this.cSOSN;
        }

        /**
         * 201- Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por Substituição Tributária (v.2.0)
         *
         * @param cSOSN
         */
        public final void setCSOSN(String cSOSN) {
            this.cSOSN = cSOSN;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor). (v2.0)<br>
         * 6 - Valor da Operação
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor). (v2.0)<br>
         * 6 - Valor da Operação
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST (v2.0)
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST  (v2.0)
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST  (v2.0)
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST (v2.0)
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST (v2.0)
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST (v2.0)
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0)
         *
         * @return String
         */
        public final String getPCredSN() {
            return this.pCredSN;
        }

        /**
         * Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0)
         *
         * @param pCredSN
         */
        public final void setPCredSN(String pCredSN) {
            this.pCredSN = pCredSN;
        }

        /**
         * Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0)
         *
         * @return String
         */
        public final String getVCredICMSSN() {
            return this.vCredICMSSN;
        }

        /**
         * Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0)
         *
         * @param vCredICMSSN
         */
        public final void setVCredICMSSN(String vCredICMSSN) {
            this.vCredICMSSN = vCredICMSSN;
        }

    }

    /**
     * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=202 ou 203 (v.2.0)
     */
    public static class ICMSSN202 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CSOSN")
        protected String cSOSN;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        public ICMSSN202() {
            super("ICMSSN202");
        }

        /**
         * Origem da mercadoria:<br>
         * 0 – Nacional;<br>
         * 1 – Estrangeira – Importação direta;<br>
         * 2 – Estrangeira – Adquirida no mercado interno. (v2.0)
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * Origem da mercadoria:<br>
         * 0 – Nacional;<br>
         * 1 – Estrangeira – Importação direta;<br>
         * 2 – Estrangeira – Adquirida no mercado interno. (v2.0)
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * 202- Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por Substituição Tributária;<br>
         * 203-  Isenção do ICMS nos Simples Nacional para faixa de receita bruta e com cobrança do ICMS por Substituição Tributária (v.2.0)
         *
         * @return String
         */
        public final String getCSOSN() {
            return this.cSOSN;
        }

        /**
         * 202- Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por Substituição Tributária;<br>
         * 203-  Isenção do ICMS nos Simples Nacional para faixa de receita bruta e com cobrança do ICMS por Substituição Tributária (v.2.0)
         *
         * @param cSOSN
         */
        public final void setCSOSN(String cSOSN) {
            this.cSOSN = cSOSN;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor). (v2.0)<br>
         * 6 - Valor da Operação
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor). (v2.0)<br>
         * 6 - Valor da Operação
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST (v2.0)
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST  (v2.0)
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST  (v2.0)
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST (v2.0)
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST (v2.0)
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST (v2.0)
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST (v2.0)
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

    }

    /**
     * Tributação do ICMS pelo SIMPLES NACIONAL,CRT=1 – Simples Nacional e CSOSN=500 (v.2.0)
     */
    public static class ICMSSN500 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CSOSN")
        protected String cSOSN;

        @br.com.ctecinf.SimpleXML.Name("vBCSTRet")
        protected String vBCSTRet;

        @br.com.ctecinf.SimpleXML.Name("pST")
        protected String pST;

        @br.com.ctecinf.SimpleXML.Name("vICMSSubstituto")
        protected String vICMSSubstituto;

        @br.com.ctecinf.SimpleXML.Name("vICMSSTRet")
        protected String vICMSSTRet;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPSTRet")
        protected String vBCFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("pFCPSTRet")
        protected String pFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("vFCPSTRet")
        protected String vFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("pRedBCEfet")
        protected String pRedBCEfet;

        @br.com.ctecinf.SimpleXML.Name("vBCEfet")
        protected String vBCEfet;

        @br.com.ctecinf.SimpleXML.Name("pICMSEfet")
        protected String pICMSEfet;

        @br.com.ctecinf.SimpleXML.Name("vICMSEfet")
        protected String vICMSEfet;

        public ICMSSN500() {
            super("ICMSSN500");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * 500 – ICMS cobrado anterirmente por substituição tributária (substituído) ou por antecipação<br>
         * (v.2.0)
         *
         * @return String
         */
        public final String getCSOSN() {
            return this.cSOSN;
        }

        /**
         * 500 – ICMS cobrado anterirmente por substituição tributária (substituído) ou por antecipação<br>
         * (v.2.0)
         *
         * @param cSOSN
         */
        public final void setCSOSN(String cSOSN) {
            this.cSOSN = cSOSN;
        }

        /**
         * Valor da BC do ICMS ST retido anteriormente (v2.0)
         *
         * @return String
         */
        public final String getVBCSTRet() {
            return this.vBCSTRet;
        }

        /**
         * Valor da BC do ICMS ST retido anteriormente (v2.0)
         *
         * @param vBCSTRet
         */
        public final void setVBCSTRet(String vBCSTRet) {
            this.vBCSTRet = vBCSTRet;
        }

        /**
         * Aliquota suportada pelo consumidor final.
         *
         * @return String
         */
        public final String getPST() {
            return this.pST;
        }

        /**
         * Aliquota suportada pelo consumidor final.
         *
         * @param pST
         */
        public final void setPST(String pST) {
            this.pST = pST;
        }

        /**
         * Valor do ICMS próprio do substituto
         *
         * @return String
         */
        public final String getVICMSSubstituto() {
            return this.vICMSSubstituto;
        }

        /**
         * Valor do ICMS próprio do substituto
         *
         * @param vICMSSubstituto
         */
        public final void setVICMSSubstituto(String vICMSSubstituto) {
            this.vICMSSubstituto = vICMSSubstituto;
        }

        /**
         * Valor do ICMS ST retido anteriormente  (v2.0)
         *
         * @return String
         */
        public final String getVICMSSTRet() {
            return this.vICMSSTRet;
        }

        /**
         * Valor do ICMS ST retido anteriormente  (v2.0)
         *
         * @param vICMSSTRet
         */
        public final void setVICMSSTRet(String vICMSSTRet) {
            this.vICMSSTRet = vICMSSTRet;
        }

        /**
         * Valor da Base de cálculo do FCP retido anteriormente.
         *
         * @return String
         */
        public final String getVBCFCPSTRet() {
            return this.vBCFCPSTRet;
        }

        /**
         * Valor da Base de cálculo do FCP retido anteriormente.
         *
         * @param vBCFCPSTRet
         */
        public final void setVBCFCPSTRet(String vBCFCPSTRet) {
            this.vBCFCPSTRet = vBCFCPSTRet;
        }

        /**
         * Percentual de FCP retido anteriormente por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPSTRet() {
            return this.pFCPSTRet;
        }

        /**
         * Percentual de FCP retido anteriormente por substituição tributária.
         *
         * @param pFCPSTRet
         */
        public final void setPFCPSTRet(String pFCPSTRet) {
            this.pFCPSTRet = pFCPSTRet;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPSTRet() {
            return this.vFCPSTRet;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPSTRet
         */
        public final void setVFCPSTRet(String vFCPSTRet) {
            this.vFCPSTRet = vFCPSTRet;
        }

        /**
         * Percentual de redução da base de cálculo efetiva.
         *
         * @return String
         */
        public final String getPRedBCEfet() {
            return this.pRedBCEfet;
        }

        /**
         * Percentual de redução da base de cálculo efetiva.
         *
         * @param pRedBCEfet
         */
        public final void setPRedBCEfet(String pRedBCEfet) {
            this.pRedBCEfet = pRedBCEfet;
        }

        /**
         * Valor da base de cálculo efetiva.
         *
         * @return String
         */
        public final String getVBCEfet() {
            return this.vBCEfet;
        }

        /**
         * Valor da base de cálculo efetiva.
         *
         * @param vBCEfet
         */
        public final void setVBCEfet(String vBCEfet) {
            this.vBCEfet = vBCEfet;
        }

        /**
         * Alíquota do ICMS efetiva.
         *
         * @return String
         */
        public final String getPICMSEfet() {
            return this.pICMSEfet;
        }

        /**
         * Alíquota do ICMS efetiva.
         *
         * @param pICMSEfet
         */
        public final void setPICMSEfet(String pICMSEfet) {
            this.pICMSEfet = pICMSEfet;
        }

        /**
         * Valor do ICMS efetivo.
         *
         * @return String
         */
        public final String getVICMSEfet() {
            return this.vICMSEfet;
        }

        /**
         * Valor do ICMS efetivo.
         *
         * @param vICMSEfet
         */
        public final void setVICMSEfet(String vICMSEfet) {
            this.vICMSEfet = vICMSEfet;
        }

    }

    /**
     * Tributação do ICMS pelo SIMPLES NACIONAL, CRT=1 – Simples Nacional e CSOSN=900 (v2.0)
     */
    public static class ICMSSN900 extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("orig")
        protected String orig;

        @br.com.ctecinf.SimpleXML.Name("CSOSN")
        protected String cSOSN;

        @br.com.ctecinf.SimpleXML.Name("modBC")
        protected String modBC;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pRedBC")
        protected String pRedBC;

        @br.com.ctecinf.SimpleXML.Name("pICMS")
        protected String pICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("modBCST")
        protected String modBCST;

        @br.com.ctecinf.SimpleXML.Name("pMVAST")
        protected String pMVAST;

        @br.com.ctecinf.SimpleXML.Name("pRedBCST")
        protected String pRedBCST;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("pICMSST")
        protected String pICMSST;

        @br.com.ctecinf.SimpleXML.Name("vICMSST")
        protected String vICMSST;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPST")
        protected String vBCFCPST;

        @br.com.ctecinf.SimpleXML.Name("pFCPST")
        protected String pFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("pCredSN")
        protected String pCredSN;

        @br.com.ctecinf.SimpleXML.Name("vCredICMSSN")
        protected String vCredICMSSN;

        public ICMSSN900() {
            super("ICMSSN900");
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @return String
         */
        public final String getOrig() {
            return this.orig;
        }

        /**
         * origem da mercadoria: 0 - Nacional <br>
         * 1 - Estrangeira - Importação direta <br>
         * 2 - Estrangeira - Adquirida no mercado interno
         *
         * @param orig
         */
        public final void setOrig(String orig) {
            this.orig = orig;
        }

        /**
         * Tributação pelo ICMS 900 - Outros(v2.0)
         *
         * @return String
         */
        public final String getCSOSN() {
            return this.cSOSN;
        }

        /**
         * Tributação pelo ICMS 900 - Outros(v2.0)
         *
         * @param cSOSN
         */
        public final void setCSOSN(String cSOSN) {
            this.cSOSN = cSOSN;
        }

        /**
         * Modalidade de determinação da BC do ICMS: <br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @return String
         */
        public final String getModBC() {
            return this.modBC;
        }

        /**
         * Modalidade de determinação da BC do ICMS: <br>
         * 0 - Margem Valor Agregado (%);<br>
         * 1 - Pauta (valor);<br>
         * 2 - Preço Tabelado Máximo (valor);<br>
         * 3 - Valor da Operação.
         *
         * @param modBC
         */
        public final void setModBC(String modBC) {
            this.modBC = modBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @return String
         */
        public final String getPRedBC() {
            return this.pRedBC;
        }

        /**
         * Percentual de redução da BC
         *
         * @param pRedBC
         */
        public final void setPRedBC(String pRedBC) {
            this.pRedBC = pRedBC;
        }

        /**
         * Alíquota do ICMS
         *
         * @return String
         */
        public final String getPICMS() {
            return this.pICMS;
        }

        /**
         * Alíquota do ICMS
         *
         * @param pICMS
         */
        public final void setPICMS(String pICMS) {
            this.pICMS = pICMS;
        }

        /**
         * Valor do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor).<br>
         * 6 - Valor da Operação
         *
         * @return String
         */
        public final String getModBCST() {
            return this.modBCST;
        }

        /**
         * Modalidade de determinação da BC do ICMS ST:<br>
         * 0 – Preço tabelado ou máximo  sugerido;<br>
         * 1 - Lista Negativa (valor);<br>
         * 2 - Lista Positiva (valor);<br>
         * 3 - Lista Neutra (valor);<br>
         * 4 - Margem Valor Agregado (%);<br>
         * 5 - Pauta (valor).<br>
         * 6 - Valor da Operação
         *
         * @param modBCST
         */
        public final void setModBCST(String modBCST) {
            this.modBCST = modBCST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @return String
         */
        public final String getPMVAST() {
            return this.pMVAST;
        }

        /**
         * Percentual da Margem de Valor Adicionado ICMS ST
         *
         * @param pMVAST
         */
        public final void setPMVAST(String pMVAST) {
            this.pMVAST = pMVAST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @return String
         */
        public final String getPRedBCST() {
            return this.pRedBCST;
        }

        /**
         * Percentual de redução da BC ICMS ST
         *
         * @param pRedBCST
         */
        public final void setPRedBCST(String pRedBCST) {
            this.pRedBCST = pRedBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * Valor da BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @return String
         */
        public final String getPICMSST() {
            return this.pICMSST;
        }

        /**
         * Alíquota do ICMS ST
         *
         * @param pICMSST
         */
        public final void setPICMSST(String pICMSST) {
            this.pICMSST = pICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @return String
         */
        public final String getVICMSST() {
            return this.vICMSST;
        }

        /**
         * Valor do ICMS ST
         *
         * @param vICMSST
         */
        public final void setVICMSST(String vICMSST) {
            this.vICMSST = vICMSST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @return String
         */
        public final String getVBCFCPST() {
            return this.vBCFCPST;
        }

        /**
         * Valor da Base de cálculo do FCP.
         *
         * @param vBCFCPST
         */
        public final void setVBCFCPST(String vBCFCPST) {
            this.vBCFCPST = vBCFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getPFCPST() {
            return this.pFCPST;
        }

        /**
         * Percentual de FCP retido por substituição tributária.
         *
         * @param pFCPST
         */
        public final void setPFCPST(String pFCPST) {
            this.pFCPST = pFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor do FCP retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0)
         *
         * @return String
         */
        public final String getPCredSN() {
            return this.pCredSN;
        }

        /**
         * Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0)
         *
         * @param pCredSN
         */
        public final void setPCredSN(String pCredSN) {
            this.pCredSN = pCredSN;
        }

        /**
         * Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0)
         *
         * @return String
         */
        public final String getVCredICMSSN() {
            return this.vCredICMSSN;
        }

        /**
         * Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0)
         *
         * @param vCredICMSSN
         */
        public final void setVCredICMSSN(String vCredICMSSN) {
            this.vCredICMSSN = vCredICMSSN;
        }

    }

    /**
     * Dados do Imposto de Importação
     */
    public static class II extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("vDespAdu")
        protected String vDespAdu;

        @br.com.ctecinf.SimpleXML.Name("vII")
        protected String vII;

        @br.com.ctecinf.SimpleXML.Name("vIOF")
        protected String vIOF;

        public II() {
            super("II");
        }

        /**
         * Base da BC do Imposto de Importação
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Base da BC do Imposto de Importação
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Valor das despesas aduaneiras
         *
         * @return String
         */
        public final String getVDespAdu() {
            return this.vDespAdu;
        }

        /**
         * Valor das despesas aduaneiras
         *
         * @param vDespAdu
         */
        public final void setVDespAdu(String vDespAdu) {
            this.vDespAdu = vDespAdu;
        }

        /**
         * Valor do Imposto de Importação
         *
         * @return String
         */
        public final String getVII() {
            return this.vII;
        }

        /**
         * Valor do Imposto de Importação
         *
         * @param vII
         */
        public final void setVII(String vII) {
            this.vII = vII;
        }

        /**
         * Valor do Imposto sobre Operações Financeiras
         *
         * @return String
         */
        public final String getVIOF() {
            return this.vIOF;
        }

        /**
         * Valor do Imposto sobre Operações Financeiras
         *
         * @param vIOF
         */
        public final void setVIOF(String vIOF) {
            this.vIOF = vIOF;
        }

    }

    /**
     * ISSQN
     */
    public static class ISSQN extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("vAliq")
        protected String vAliq;

        @br.com.ctecinf.SimpleXML.Name("vISSQN")
        protected String vISSQN;

        @br.com.ctecinf.SimpleXML.Name("cMunFG")
        protected String cMunFG;

        @br.com.ctecinf.SimpleXML.Name("cListServ")
        protected String cListServ;

        @br.com.ctecinf.SimpleXML.Name("vDeducao")
        protected String vDeducao;

        @br.com.ctecinf.SimpleXML.Name("vOutro")
        protected String vOutro;

        @br.com.ctecinf.SimpleXML.Name("vDescIncond")
        protected String vDescIncond;

        @br.com.ctecinf.SimpleXML.Name("vDescCond")
        protected String vDescCond;

        @br.com.ctecinf.SimpleXML.Name("vISSRet")
        protected String vISSRet;

        @br.com.ctecinf.SimpleXML.Name("indISS")
        protected String indISS;

        @br.com.ctecinf.SimpleXML.Name("cServico")
        protected String cServico;

        @br.com.ctecinf.SimpleXML.Name("cMun")
        protected String cMun;

        @br.com.ctecinf.SimpleXML.Name("cPais")
        protected String cPais;

        @br.com.ctecinf.SimpleXML.Name("nProcesso")
        protected String nProcesso;

        @br.com.ctecinf.SimpleXML.Name("indIncentivo")
        protected String indIncentivo;

        public ISSQN() {
            super("ISSQN");
        }

        /**
         * Valor da BC do ISSQN
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do ISSQN
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do ISSQN
         *
         * @return String
         */
        public final String getVAliq() {
            return this.vAliq;
        }

        /**
         * Alíquota do ISSQN
         *
         * @param vAliq
         */
        public final void setVAliq(String vAliq) {
            this.vAliq = vAliq;
        }

        /**
         * Valor da do ISSQN
         *
         * @return String
         */
        public final String getVISSQN() {
            return this.vISSQN;
        }

        /**
         * Valor da do ISSQN
         *
         * @param vISSQN
         */
        public final void setVISSQN(String vISSQN) {
            this.vISSQN = vISSQN;
        }

        /**
         * Informar o município de ocorrência do fato gerador do ISSQN. Utilizar a Tabela do IBGE (Anexo VII - Tabela de UF, Município e País). “Atenção, não vincular com os campos B12, C10 ou E10” v2.0
         *
         * @return String
         */
        public final String getCMunFG() {
            return this.cMunFG;
        }

        /**
         * Informar o município de ocorrência do fato gerador do ISSQN. Utilizar a Tabela do IBGE (Anexo VII - Tabela de UF, Município e País). “Atenção, não vincular com os campos B12, C10 ou E10” v2.0
         *
         * @param cMunFG
         */
        public final void setCMunFG(String cMunFG) {
            this.cMunFG = cMunFG;
        }

        /**
         * Informar o Item da lista de serviços da LC 116/03 em que se classifica o serviço.
         *
         * @return String
         */
        public final String getCListServ() {
            return this.cListServ;
        }

        /**
         * Informar o Item da lista de serviços da LC 116/03 em que se classifica o serviço.
         *
         * @param cListServ
         */
        public final void setCListServ(String cListServ) {
            this.cListServ = cListServ;
        }

        /**
         * Valor dedução para redução da base de cálculo
         *
         * @return String
         */
        public final String getVDeducao() {
            return this.vDeducao;
        }

        /**
         * Valor dedução para redução da base de cálculo
         *
         * @param vDeducao
         */
        public final void setVDeducao(String vDeducao) {
            this.vDeducao = vDeducao;
        }

        /**
         * Valor outras retenções
         *
         * @return String
         */
        public final String getVOutro() {
            return this.vOutro;
        }

        /**
         * Valor outras retenções
         *
         * @param vOutro
         */
        public final void setVOutro(String vOutro) {
            this.vOutro = vOutro;
        }

        /**
         * Valor desconto incondicionado
         *
         * @return String
         */
        public final String getVDescIncond() {
            return this.vDescIncond;
        }

        /**
         * Valor desconto incondicionado
         *
         * @param vDescIncond
         */
        public final void setVDescIncond(String vDescIncond) {
            this.vDescIncond = vDescIncond;
        }

        /**
         * Valor desconto condicionado
         *
         * @return String
         */
        public final String getVDescCond() {
            return this.vDescCond;
        }

        /**
         * Valor desconto condicionado
         *
         * @param vDescCond
         */
        public final void setVDescCond(String vDescCond) {
            this.vDescCond = vDescCond;
        }

        /**
         * Valor Retenção ISS
         *
         * @return String
         */
        public final String getVISSRet() {
            return this.vISSRet;
        }

        /**
         * Valor Retenção ISS
         *
         * @param vISSRet
         */
        public final void setVISSRet(String vISSRet) {
            this.vISSRet = vISSRet;
        }

        /**
         * Exibilidade do ISS:1-Exigível;2-Não incidente;3-Isenção;4-Exportação;5-Imunidade;6-Exig.Susp. Judicial;7-Exig.Susp. ADM
         *
         * @return String
         */
        public final String getIndISS() {
            return this.indISS;
        }

        /**
         * Exibilidade do ISS:1-Exigível;2-Não incidente;3-Isenção;4-Exportação;5-Imunidade;6-Exig.Susp. Judicial;7-Exig.Susp. ADM
         *
         * @param indISS
         */
        public final void setIndISS(String indISS) {
            this.indISS = indISS;
        }

        /**
         * Código do serviço prestado dentro do município
         *
         * @return String
         */
        public final String getCServico() {
            return this.cServico;
        }

        /**
         * Código do serviço prestado dentro do município
         *
         * @param cServico
         */
        public final void setCServico(String cServico) {
            this.cServico = cServico;
        }

        /**
         * Código do Município de Incidência do Imposto
         *
         * @return String
         */
        public final String getCMun() {
            return this.cMun;
        }

        /**
         * Código do Município de Incidência do Imposto
         *
         * @param cMun
         */
        public final void setCMun(String cMun) {
            this.cMun = cMun;
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
         * Número do Processo administrativo ou judicial de suspenção do processo
         *
         * @return String
         */
        public final String getNProcesso() {
            return this.nProcesso;
        }

        /**
         * Número do Processo administrativo ou judicial de suspenção do processo
         *
         * @param nProcesso
         */
        public final void setNProcesso(String nProcesso) {
            this.nProcesso = nProcesso;
        }

        /**
         * Indicador de Incentivo Fiscal. 1=Sim; 2=Não
         *
         * @return String
         */
        public final String getIndIncentivo() {
            return this.indIncentivo;
        }

        /**
         * Indicador de Incentivo Fiscal. 1=Sim; 2=Não
         *
         * @param indIncentivo
         */
        public final void setIndIncentivo(String indIncentivo) {
            this.indIncentivo = indIncentivo;
        }

    }

    /**
     * Dados do PIS
     */
    public static class PIS extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("PISAliq")
        protected PISAliq pISAliq;

        @br.com.ctecinf.SimpleXML.Name("PISQtde")
        protected PISQtde pISQtde;

        @br.com.ctecinf.SimpleXML.Name("PISNT")
        protected PISNT pISNT;

        @br.com.ctecinf.SimpleXML.Name("PISOutr")
        protected PISOutr pISOutr;

        public PIS() {
            super("PIS");
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @return PISAliq
         */
        public final PISAliq getPISAliq() {
            return this.pISAliq;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @param pISAliq
         */
        public final void setPISAliq(PISAliq pISAliq) {
            this.pISAliq = pISAliq;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @return PISQtde
         */
        public final PISQtde getPISQtde() {
            return this.pISQtde;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @param pISQtde
         */
        public final void setPISQtde(PISQtde pISQtde) {
            this.pISQtde = pISQtde;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @return PISNT
         */
        public final PISNT getPISNT() {
            return this.pISNT;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @param pISNT
         */
        public final void setPISNT(PISNT pISNT) {
            this.pISNT = pISNT;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 99 - Outras Operações.
         *
         * @return PISOutr
         */
        public final PISOutr getPISOutr() {
            return this.pISOutr;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 99 - Outras Operações.
         *
         * @param pISOutr
         */
        public final void setPISOutr(PISOutr pISOutr) {
            this.pISOutr = pISOutr;
        }

    }

    /**
     * Código de Situação Tributária do PIS.<br>
     *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
     * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
     */
    public static class PISAliq extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pPIS")
        protected String pPIS;

        @br.com.ctecinf.SimpleXML.Name("vPIS")
        protected String vPIS;

        public PISAliq() {
            super("PISAliq");
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Valor da BC do PIS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do PIS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do PIS (em percentual)
         *
         * @return String
         */
        public final String getPPIS() {
            return this.pPIS;
        }

        /**
         * Alíquota do PIS (em percentual)
         *
         * @param pPIS
         */
        public final void setPPIS(String pPIS) {
            this.pPIS = pPIS;
        }

        /**
         * Valor do PIS
         *
         * @return String
         */
        public final String getVPIS() {
            return this.vPIS;
        }

        /**
         * Valor do PIS
         *
         * @param vPIS
         */
        public final void setVPIS(String vPIS) {
            this.vPIS = vPIS;
        }

    }

    /**
     * Código de Situação Tributária do PIS.<br>
     * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
     */
    public static class PISQtde extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vPIS")
        protected String vPIS;

        public PISQtde() {
            super("PISQtde");
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Quantidade Vendida  (NT2011/004)
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * Quantidade Vendida  (NT2011/004)
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do PIS (em reais) (NT2011/004)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do PIS (em reais) (NT2011/004)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do PIS
         *
         * @return String
         */
        public final String getVPIS() {
            return this.vPIS;
        }

        /**
         * Valor do PIS
         *
         * @param vPIS
         */
        public final void setVPIS(String vPIS) {
            this.vPIS = vPIS;
        }

    }

    /**
     * Código de Situação Tributária do PIS.<br>
     * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
     * 06 - Operação Tributável - Alíquota Zero;<br>
     * 07 - Operação Isenta da contribuição;<br>
     * 08 - Operação Sem Incidência da contribuição;<br>
     * 09 - Operação com suspensão da contribuição;
     */
    public static class PISNT extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        public PISNT() {
            super("PISNT");
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 05 - Operação Tributável (ST);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 05 - Operação Tributável (ST);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

    }

    /**
     * Código de Situação Tributária do PIS.<br>
     * 99 - Outras Operações.
     */
    public static class PISOutr extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pPIS")
        protected String pPIS;

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vPIS")
        protected String vPIS;

        public PISOutr() {
            super("PISOutr");
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 99 - Outras Operações.
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do PIS.<br>
         * 99 - Outras Operações.
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Valor da BC do PIS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do PIS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do PIS (em percentual)
         *
         * @return String
         */
        public final String getPPIS() {
            return this.pPIS;
        }

        /**
         * Alíquota do PIS (em percentual)
         *
         * @param pPIS
         */
        public final void setPPIS(String pPIS) {
            this.pPIS = pPIS;
        }

        /**
         * Quantidade Vendida (NT2011/004)
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * Quantidade Vendida (NT2011/004)
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do PIS (em reais) (NT2011/004)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do PIS (em reais) (NT2011/004)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do PIS
         *
         * @return String
         */
        public final String getVPIS() {
            return this.vPIS;
        }

        /**
         * Valor do PIS
         *
         * @param vPIS
         */
        public final void setVPIS(String vPIS) {
            this.vPIS = vPIS;
        }

    }

    /**
     * Dados do PIS Substituição Tributária
     */
    public static class PISST extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pPIS")
        protected String pPIS;

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vPIS")
        protected String vPIS;

        @br.com.ctecinf.SimpleXML.Name("indSomaPISST")
        protected String indSomaPISST;

        public PISST() {
            super("PISST");
        }

        /**
         * Valor da BC do PIS ST
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do PIS ST
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do PIS ST (em percentual)
         *
         * @return String
         */
        public final String getPPIS() {
            return this.pPIS;
        }

        /**
         * Alíquota do PIS ST (em percentual)
         *
         * @param pPIS
         */
        public final void setPPIS(String pPIS) {
            this.pPIS = pPIS;
        }

        /**
         * Quantidade Vendida
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * Quantidade Vendida
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do PIS ST (em reais)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do PIS ST (em reais)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do PIS ST
         *
         * @return String
         */
        public final String getVPIS() {
            return this.vPIS;
        }

        /**
         * Valor do PIS ST
         *
         * @param vPIS
         */
        public final void setVPIS(String vPIS) {
            this.vPIS = vPIS;
        }

        /**
         * Indica se o valor do PISST compõe o valor total da NF-e
         *
         * @return String
         */
        public final String getIndSomaPISST() {
            return this.indSomaPISST;
        }

        /**
         * Indica se o valor do PISST compõe o valor total da NF-e
         *
         * @param indSomaPISST
         */
        public final void setIndSomaPISST(String indSomaPISST) {
            this.indSomaPISST = indSomaPISST;
        }

    }

    /**
     * Dados do COFINS
     */
    public static class COFINS extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("COFINSAliq")
        protected COFINSAliq cOFINSAliq;

        @br.com.ctecinf.SimpleXML.Name("COFINSQtde")
        protected COFINSQtde cOFINSQtde;

        @br.com.ctecinf.SimpleXML.Name("COFINSNT")
        protected COFINSNT cOFINSNT;

        @br.com.ctecinf.SimpleXML.Name("COFINSOutr")
        protected COFINSOutr cOFINSOutr;

        public COFINS() {
            super("COFINS");
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @return COFINSAliq
         */
        public final COFINSAliq getCOFINSAliq() {
            return this.cOFINSAliq;
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @param cOFINSAliq
         */
        public final void setCOFINSAliq(COFINSAliq cOFINSAliq) {
            this.cOFINSAliq = cOFINSAliq;
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @return COFINSQtde
         */
        public final COFINSQtde getCOFINSQtde() {
            return this.cOFINSQtde;
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @param cOFINSQtde
         */
        public final void setCOFINSQtde(COFINSQtde cOFINSQtde) {
            this.cOFINSQtde = cOFINSQtde;
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @return COFINSNT
         */
        public final COFINSNT getCOFINSNT() {
            return this.cOFINSNT;
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @param cOFINSNT
         */
        public final void setCOFINSNT(COFINSNT cOFINSNT) {
            this.cOFINSNT = cOFINSNT;
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 49 - Outras Operações de Saída<br>
         * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 51 - Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno<br>
         * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação<br>
         * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno<br>
         * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação<br>
         * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 67 - Crédito Presumido - Outras Operações<br>
         * 70 - Operação de Aquisição sem Direito a Crédito<br>
         * 71 - Operação de Aquisição com Isenção<br>
         * 72 - Operação de Aquisição com Suspensão<br>
         * 73 - Operação de Aquisição a Alíquota Zero<br>
         * 74 - Operação de Aquisição sem Incidência da Contribuição<br>
         * 75 - Operação de Aquisição por Substituição Tributária<br>
         * 98 - Outras Operações de Entrada<br>
         * 99 - Outras Operações.
         *
         * @return COFINSOutr
         */
        public final COFINSOutr getCOFINSOutr() {
            return this.cOFINSOutr;
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 49 - Outras Operações de Saída<br>
         * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 51 - Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno<br>
         * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação<br>
         * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno<br>
         * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação<br>
         * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 67 - Crédito Presumido - Outras Operações<br>
         * 70 - Operação de Aquisição sem Direito a Crédito<br>
         * 71 - Operação de Aquisição com Isenção<br>
         * 72 - Operação de Aquisição com Suspensão<br>
         * 73 - Operação de Aquisição a Alíquota Zero<br>
         * 74 - Operação de Aquisição sem Incidência da Contribuição<br>
         * 75 - Operação de Aquisição por Substituição Tributária<br>
         * 98 - Outras Operações de Entrada<br>
         * 99 - Outras Operações.
         *
         * @param cOFINSOutr
         */
        public final void setCOFINSOutr(COFINSOutr cOFINSOutr) {
            this.cOFINSOutr = cOFINSOutr;
        }

    }

    /**
     * Código de Situação Tributária do COFINS.<br>
     *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
     * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
     */
    public static class COFINSAliq extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pCOFINS")
        protected String pCOFINS;

        @br.com.ctecinf.SimpleXML.Name("vCOFINS")
        protected String vCOFINS;

        public COFINSAliq() {
            super("COFINSAliq");
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         *  01 – Operação Tributável - Base de Cálculo = Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo);<br>
         * 02 - Operação Tributável - Base de Calculo = Valor da Operação (Alíquota Diferenciada);
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Valor da BC do COFINS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do COFINS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do COFINS (em percentual)
         *
         * @return String
         */
        public final String getPCOFINS() {
            return this.pCOFINS;
        }

        /**
         * Alíquota do COFINS (em percentual)
         *
         * @param pCOFINS
         */
        public final void setPCOFINS(String pCOFINS) {
            this.pCOFINS = pCOFINS;
        }

        /**
         * Valor do COFINS
         *
         * @return String
         */
        public final String getVCOFINS() {
            return this.vCOFINS;
        }

        /**
         * Valor do COFINS
         *
         * @param vCOFINS
         */
        public final void setVCOFINS(String vCOFINS) {
            this.vCOFINS = vCOFINS;
        }

    }

    /**
     * Código de Situação Tributária do COFINS.<br>
     * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
     */
    public static class COFINSQtde extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vCOFINS")
        protected String vCOFINS;

        public COFINSQtde() {
            super("COFINSQtde");
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do COFINS.<br>
         * 03 - Operação Tributável - Base de Calculo = Quantidade Vendida x Alíquota por Unidade de Produto;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Quantidade Vendida (NT2011/004)
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * Quantidade Vendida (NT2011/004)
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do COFINS (em reais) (NT2011/004)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do COFINS (em reais) (NT2011/004)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do COFINS
         *
         * @return String
         */
        public final String getVCOFINS() {
            return this.vCOFINS;
        }

        /**
         * Valor do COFINS
         *
         * @param vCOFINS
         */
        public final void setVCOFINS(String vCOFINS) {
            this.vCOFINS = vCOFINS;
        }

    }

    /**
     * Código de Situação Tributária do COFINS:<br>
     * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
     * 06 - Operação Tributável - Alíquota Zero;<br>
     * 07 - Operação Isenta da contribuição;<br>
     * 08 - Operação Sem Incidência da contribuição;<br>
     * 09 - Operação com suspensão da contribuição;
     */
    public static class COFINSNT extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        public COFINSNT() {
            super("COFINSNT");
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 05 - Operação Tributável (ST);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 04 - Operação Tributável - Tributação Monofásica - (Alíquota Zero);<br>
         * 05 - Operação Tributável (ST);<br>
         * 06 - Operação Tributável - Alíquota Zero;<br>
         * 07 - Operação Isenta da contribuição;<br>
         * 08 - Operação Sem Incidência da contribuição;<br>
         * 09 - Operação com suspensão da contribuição;
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

    }

    /**
     * Código de Situação Tributária do COFINS:<br>
     * 49 - Outras Operações de Saída<br>
     * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
     * 51 - Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno<br>
     * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação<br>
     * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
     * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
     * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
     * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
     * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
     * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno<br>
     * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação<br>
     * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
     * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
     * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
     * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
     * 67 - Crédito Presumido - Outras Operações<br>
     * 70 - Operação de Aquisição sem Direito a Crédito<br>
     * 71 - Operação de Aquisição com Isenção<br>
     * 72 - Operação de Aquisição com Suspensão<br>
     * 73 - Operação de Aquisição a Alíquota Zero<br>
     * 74 - Operação de Aquisição sem Incidência da Contribuição<br>
     * 75 - Operação de Aquisição por Substituição Tributária<br>
     * 98 - Outras Operações de Entrada<br>
     * 99 - Outras Operações.
     */
    public static class COFINSOutr extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CST")
        protected String cST;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pCOFINS")
        protected String pCOFINS;

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vCOFINS")
        protected String vCOFINS;

        public COFINSOutr() {
            super("COFINSOutr");
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 49 - Outras Operações de Saída<br>
         * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 51 - Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno<br>
         * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação<br>
         * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno<br>
         * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação<br>
         * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 67 - Crédito Presumido - Outras Operações<br>
         * 70 - Operação de Aquisição sem Direito a Crédito<br>
         * 71 - Operação de Aquisição com Isenção<br>
         * 72 - Operação de Aquisição com Suspensão<br>
         * 73 - Operação de Aquisição a Alíquota Zero<br>
         * 74 - Operação de Aquisição sem Incidência da Contribuição<br>
         * 75 - Operação de Aquisição por Substituição Tributária<br>
         * 98 - Outras Operações de Entrada<br>
         * 99 - Outras Operações.
         *
         * @return String
         */
        public final String getCST() {
            return this.cST;
        }

        /**
         * Código de Situação Tributária do COFINS:<br>
         * 49 - Outras Operações de Saída<br>
         * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 51 - Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno<br>
         * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação<br>
         * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno<br>
         * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno<br>
         * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação<br>
         * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno<br>
         * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação<br>
         * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação<br>
         * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação<br>
         * 67 - Crédito Presumido - Outras Operações<br>
         * 70 - Operação de Aquisição sem Direito a Crédito<br>
         * 71 - Operação de Aquisição com Isenção<br>
         * 72 - Operação de Aquisição com Suspensão<br>
         * 73 - Operação de Aquisição a Alíquota Zero<br>
         * 74 - Operação de Aquisição sem Incidência da Contribuição<br>
         * 75 - Operação de Aquisição por Substituição Tributária<br>
         * 98 - Outras Operações de Entrada<br>
         * 99 - Outras Operações.
         *
         * @param cST
         */
        public final void setCST(String cST) {
            this.cST = cST;
        }

        /**
         * Valor da BC do COFINS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do COFINS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do COFINS (em percentual)
         *
         * @return String
         */
        public final String getPCOFINS() {
            return this.pCOFINS;
        }

        /**
         * Alíquota do COFINS (em percentual)
         *
         * @param pCOFINS
         */
        public final void setPCOFINS(String pCOFINS) {
            this.pCOFINS = pCOFINS;
        }

        /**
         * Quantidade Vendida (NT2011/004)
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * Quantidade Vendida (NT2011/004)
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do COFINS (em reais) (NT2011/004)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do COFINS (em reais) (NT2011/004)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do COFINS
         *
         * @return String
         */
        public final String getVCOFINS() {
            return this.vCOFINS;
        }

        /**
         * Valor do COFINS
         *
         * @param vCOFINS
         */
        public final void setVCOFINS(String vCOFINS) {
            this.vCOFINS = vCOFINS;
        }

    }

    /**
     * Dados do COFINS da<br>
     * Substituição Tributaria;
     */
    public static class COFINSST extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("pCOFINS")
        protected String pCOFINS;

        @br.com.ctecinf.SimpleXML.Name("qBCProd")
        protected String qBCProd;

        @br.com.ctecinf.SimpleXML.Name("vAliqProd")
        protected String vAliqProd;

        @br.com.ctecinf.SimpleXML.Name("vCOFINS")
        protected String vCOFINS;

        @br.com.ctecinf.SimpleXML.Name("indSomaCOFINSST")
        protected String indSomaCOFINSST;

        public COFINSST() {
            super("COFINSST");
        }

        /**
         * Valor da BC do COFINS ST
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Valor da BC do COFINS ST
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Alíquota do COFINS ST(em percentual)
         *
         * @return String
         */
        public final String getPCOFINS() {
            return this.pCOFINS;
        }

        /**
         * Alíquota do COFINS ST(em percentual)
         *
         * @param pCOFINS
         */
        public final void setPCOFINS(String pCOFINS) {
            this.pCOFINS = pCOFINS;
        }

        /**
         * Quantidade Vendida
         *
         * @return String
         */
        public final String getQBCProd() {
            return this.qBCProd;
        }

        /**
         * Quantidade Vendida
         *
         * @param qBCProd
         */
        public final void setQBCProd(String qBCProd) {
            this.qBCProd = qBCProd;
        }

        /**
         * Alíquota do COFINS ST(em reais)
         *
         * @return String
         */
        public final String getVAliqProd() {
            return this.vAliqProd;
        }

        /**
         * Alíquota do COFINS ST(em reais)
         *
         * @param vAliqProd
         */
        public final void setVAliqProd(String vAliqProd) {
            this.vAliqProd = vAliqProd;
        }

        /**
         * Valor do COFINS ST
         *
         * @return String
         */
        public final String getVCOFINS() {
            return this.vCOFINS;
        }

        /**
         * Valor do COFINS ST
         *
         * @param vCOFINS
         */
        public final void setVCOFINS(String vCOFINS) {
            this.vCOFINS = vCOFINS;
        }

        /**
         * Indica se o valor da COFINS ST compõe o valor total da NFe
         *
         * @return String
         */
        public final String getIndSomaCOFINSST() {
            return this.indSomaCOFINSST;
        }

        /**
         * Indica se o valor da COFINS ST compõe o valor total da NFe
         *
         * @param indSomaCOFINSST
         */
        public final void setIndSomaCOFINSST(String indSomaCOFINSST) {
            this.indSomaCOFINSST = indSomaCOFINSST;
        }

    }

    /**
     * Grupo a ser informado nas vendas interestarduais para consumidor final, não contribuinte de ICMS
     */
    public static class ICMSUFDest extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vBCUFDest")
        protected String vBCUFDest;

        @br.com.ctecinf.SimpleXML.Name("vBCFCPUFDest")
        protected String vBCFCPUFDest;

        @br.com.ctecinf.SimpleXML.Name("pFCPUFDest")
        protected String pFCPUFDest;

        @br.com.ctecinf.SimpleXML.Name("pICMSUFDest")
        protected String pICMSUFDest;

        @br.com.ctecinf.SimpleXML.Name("pICMSInter")
        protected String pICMSInter;

        @br.com.ctecinf.SimpleXML.Name("pICMSInterPart")
        protected String pICMSInterPart;

        @br.com.ctecinf.SimpleXML.Name("vFCPUFDest")
        protected String vFCPUFDest;

        @br.com.ctecinf.SimpleXML.Name("vICMSUFDest")
        protected String vICMSUFDest;

        @br.com.ctecinf.SimpleXML.Name("vICMSUFRemet")
        protected String vICMSUFRemet;

        public ICMSUFDest() {
            super("ICMSUFDest");
        }

        /**
         * Valor da Base de Cálculo do ICMS na UF do destinatário.
         *
         * @return String
         */
        public final String getVBCUFDest() {
            return this.vBCUFDest;
        }

        /**
         * Valor da Base de Cálculo do ICMS na UF do destinatário.
         *
         * @param vBCUFDest
         */
        public final void setVBCUFDest(String vBCUFDest) {
            this.vBCUFDest = vBCUFDest;
        }

        /**
         * Valor da Base de Cálculo do FCP na UF do destinatário.
         *
         * @return String
         */
        public final String getVBCFCPUFDest() {
            return this.vBCFCPUFDest;
        }

        /**
         * Valor da Base de Cálculo do FCP na UF do destinatário.
         *
         * @param vBCFCPUFDest
         */
        public final void setVBCFCPUFDest(String vBCFCPUFDest) {
            this.vBCFCPUFDest = vBCFCPUFDest;
        }

        /**
         * Percentual adicional inserido na alíquota interna da UF de destino, relativo ao Fundo de Combate à Pobreza (FCP) naquela UF.
         *
         * @return String
         */
        public final String getPFCPUFDest() {
            return this.pFCPUFDest;
        }

        /**
         * Percentual adicional inserido na alíquota interna da UF de destino, relativo ao Fundo de Combate à Pobreza (FCP) naquela UF.
         *
         * @param pFCPUFDest
         */
        public final void setPFCPUFDest(String pFCPUFDest) {
            this.pFCPUFDest = pFCPUFDest;
        }

        /**
         * Alíquota adotada nas operações internas na UF do destinatário para o produto / mercadoria.
         *
         * @return String
         */
        public final String getPICMSUFDest() {
            return this.pICMSUFDest;
        }

        /**
         * Alíquota adotada nas operações internas na UF do destinatário para o produto / mercadoria.
         *
         * @param pICMSUFDest
         */
        public final void setPICMSUFDest(String pICMSUFDest) {
            this.pICMSUFDest = pICMSUFDest;
        }

        /**
         * Alíquota interestadual das UF envolvidas: - 4% alíquota interestadual para produtos importados; - 7% para os Estados de origem do Sul e Sudeste (exceto ES), destinado para os Estados do Norte e Nordeste  ou ES; - 12% para os demais casos.
         *
         * @return String
         */
        public final String getPICMSInter() {
            return this.pICMSInter;
        }

        /**
         * Alíquota interestadual das UF envolvidas: - 4% alíquota interestadual para produtos importados; - 7% para os Estados de origem do Sul e Sudeste (exceto ES), destinado para os Estados do Norte e Nordeste  ou ES; - 12% para os demais casos.
         *
         * @param pICMSInter
         */
        public final void setPICMSInter(String pICMSInter) {
            this.pICMSInter = pICMSInter;
        }

        /**
         * Percentual de partilha para a UF do destinatário: - 40% em 2016; - 60% em 2017; - 80% em 2018; - 100% a partir de 2019.
         *
         * @return String
         */
        public final String getPICMSInterPart() {
            return this.pICMSInterPart;
        }

        /**
         * Percentual de partilha para a UF do destinatário: - 40% em 2016; - 60% em 2017; - 80% em 2018; - 100% a partir de 2019.
         *
         * @param pICMSInterPart
         */
        public final void setPICMSInterPart(String pICMSInterPart) {
            this.pICMSInterPart = pICMSInterPart;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) da UF de destino.
         *
         * @return String
         */
        public final String getVFCPUFDest() {
            return this.vFCPUFDest;
        }

        /**
         * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) da UF de destino.
         *
         * @param vFCPUFDest
         */
        public final void setVFCPUFDest(String vFCPUFDest) {
            this.vFCPUFDest = vFCPUFDest;
        }

        /**
         * Valor do ICMS de partilha para a UF do destinatário.
         *
         * @return String
         */
        public final String getVICMSUFDest() {
            return this.vICMSUFDest;
        }

        /**
         * Valor do ICMS de partilha para a UF do destinatário.
         *
         * @param vICMSUFDest
         */
        public final void setVICMSUFDest(String vICMSUFDest) {
            this.vICMSUFDest = vICMSUFDest;
        }

        /**
         * Valor do ICMS de partilha para a UF do remetente. Nota: A partir de 2019, este valor será zero.
         *
         * @return String
         */
        public final String getVICMSUFRemet() {
            return this.vICMSUFRemet;
        }

        /**
         * Valor do ICMS de partilha para a UF do remetente. Nota: A partir de 2019, este valor será zero.
         *
         * @param vICMSUFRemet
         */
        public final void setVICMSUFRemet(String vICMSUFRemet) {
            this.vICMSUFRemet = vICMSUFRemet;
        }

    }

    public static class ImpostoDevol extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("pDevol")
        protected String pDevol;

        @br.com.ctecinf.SimpleXML.Name("IPI")
        protected IPI iPI;

        public ImpostoDevol() {
            super("impostoDevol");
        }

        /**
         * Percentual de mercadoria devolvida
         *
         * @return String
         */
        public final String getPDevol() {
            return this.pDevol;
        }

        /**
         * Percentual de mercadoria devolvida
         *
         * @param pDevol
         */
        public final void setPDevol(String pDevol) {
            this.pDevol = pDevol;
        }

        /**
         * Informação de IPI devolvido
         *
         * @return IPI
         */
        public final IPI getIPI() {
            return this.iPI;
        }

        /**
         * Informação de IPI devolvido
         *
         * @param iPI
         */
        public final void setIPI(IPI iPI) {
            this.iPI = iPI;
        }

    }

    /**
     * Informação de IPI devolvido
     */
    public static class IPI extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vIPIDevol")
        protected String vIPIDevol;

        public IPI() {
            super("IPI");
        }

        /**
         * Valor do IPI devolvido
         *
         * @return String
         */
        public final String getVIPIDevol() {
            return this.vIPIDevol;
        }

        /**
         * Valor do IPI devolvido
         *
         * @param vIPIDevol
         */
        public final void setVIPIDevol(String vIPIDevol) {
            this.vIPIDevol = vIPIDevol;
        }

    }

    /**
     * Grupo de observações de uso livre (para o item da NF-e)
     */
    public static class ObsItem extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("obsCont")
        protected ObsCont obsCont;

        @br.com.ctecinf.SimpleXML.Name("obsFisco")
        protected ObsFisco obsFisco;

        public ObsItem() {
            super("obsItem");
        }

        /**
         * Grupo de observações de uso livre (para o item da NF-e)
         *
         * @return ObsCont
         */
        public final ObsCont getObsCont() {
            return this.obsCont;
        }

        /**
         * Grupo de observações de uso livre (para o item da NF-e)
         *
         * @param obsCont
         */
        public final void setObsCont(ObsCont obsCont) {
            this.obsCont = obsCont;
        }

        /**
         * Grupo de observações de uso livre (para o item da NF-e)
         *
         * @return ObsFisco
         */
        public final ObsFisco getObsFisco() {
            return this.obsFisco;
        }

        /**
         * Grupo de observações de uso livre (para o item da NF-e)
         *
         * @param obsFisco
         */
        public final void setObsFisco(ObsFisco obsFisco) {
            this.obsFisco = obsFisco;
        }

    }

    /**
     * Grupo de observações de uso livre (para o item da NF-e)
     */
    public static class ObsCont extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("xTexto")
        protected String xTexto;

        public ObsCont() {
            super("obsCont", "xCampo");
        }

        public final void setXCampo(String xCampo) {
            this.setAttribute("xCampo", xCampo);
        }

        public final String getXTexto() {
            return this.xTexto;
        }

        public final void setXTexto(String xTexto) {
            this.xTexto = xTexto;
        }

    }

    /**
     * Grupo de observações de uso livre (para o item da NF-e)
     */
    public static class ObsFisco extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("xTexto")
        protected String xTexto;

        public ObsFisco() {
            super("obsFisco", "xCampo");
        }

        public final void setXCampo(String xCampo) {
            this.setAttribute("xCampo", xCampo);
        }

        public final String getXTexto() {
            return this.xTexto;
        }

        public final void setXTexto(String xTexto) {
            this.xTexto = xTexto;
        }

    }

    /**
     * Dados dos totais da NF-e
     */
    public static class Total extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("ICMSTot")
        protected ICMSTot iCMSTot;

        @br.com.ctecinf.SimpleXML.Name("ISSQNtot")
        protected ISSQNtot iSSQNtot;

        @br.com.ctecinf.SimpleXML.Name("retTrib")
        protected RetTrib retTrib;

        public Total() {
            super("total");
        }

        /**
         * Totais referentes ao ICMS
         *
         * @return ICMSTot
         */
        public final ICMSTot getICMSTot() {
            return this.iCMSTot;
        }

        /**
         * Totais referentes ao ICMS
         *
         * @param iCMSTot
         */
        public final void setICMSTot(ICMSTot iCMSTot) {
            this.iCMSTot = iCMSTot;
        }

        /**
         * Totais referentes ao ISSQN
         *
         * @return ISSQNtot
         */
        public final ISSQNtot getISSQNtot() {
            return this.iSSQNtot;
        }

        /**
         * Totais referentes ao ISSQN
         *
         * @param iSSQNtot
         */
        public final void setISSQNtot(ISSQNtot iSSQNtot) {
            this.iSSQNtot = iSSQNtot;
        }

        /**
         * Retenção de Tributos Federais
         *
         * @return RetTrib
         */
        public final RetTrib getRetTrib() {
            return this.retTrib;
        }

        /**
         * Retenção de Tributos Federais
         *
         * @param retTrib
         */
        public final void setRetTrib(RetTrib retTrib) {
            this.retTrib = retTrib;
        }

    }

    /**
     * Totais referentes ao ICMS
     */
    public static class ICMSTot extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("vICMS")
        protected String vICMS;

        @br.com.ctecinf.SimpleXML.Name("vICMSDeson")
        protected String vICMSDeson;

        @br.com.ctecinf.SimpleXML.Name("vFCPUFDest")
        protected String vFCPUFDest;

        @br.com.ctecinf.SimpleXML.Name("vICMSUFDest")
        protected String vICMSUFDest;

        @br.com.ctecinf.SimpleXML.Name("vICMSUFRemet")
        protected String vICMSUFRemet;

        @br.com.ctecinf.SimpleXML.Name("vFCP")
        protected String vFCP;

        @br.com.ctecinf.SimpleXML.Name("vBCST")
        protected String vBCST;

        @br.com.ctecinf.SimpleXML.Name("vST")
        protected String vST;

        @br.com.ctecinf.SimpleXML.Name("vFCPST")
        protected String vFCPST;

        @br.com.ctecinf.SimpleXML.Name("vFCPSTRet")
        protected String vFCPSTRet;

        @br.com.ctecinf.SimpleXML.Name("qBCMono")
        protected String qBCMono;

        @br.com.ctecinf.SimpleXML.Name("vICMSMono")
        protected String vICMSMono;

        @br.com.ctecinf.SimpleXML.Name("qBCMonoReten")
        protected String qBCMonoReten;

        @br.com.ctecinf.SimpleXML.Name("vICMSMonoReten")
        protected String vICMSMonoReten;

        @br.com.ctecinf.SimpleXML.Name("qBCMonoRet")
        protected String qBCMonoRet;

        @br.com.ctecinf.SimpleXML.Name("vICMSMonoRet")
        protected String vICMSMonoRet;

        @br.com.ctecinf.SimpleXML.Name("vProd")
        protected String vProd;

        @br.com.ctecinf.SimpleXML.Name("vFrete")
        protected String vFrete;

        @br.com.ctecinf.SimpleXML.Name("vSeg")
        protected String vSeg;

        @br.com.ctecinf.SimpleXML.Name("vDesc")
        protected String vDesc;

        @br.com.ctecinf.SimpleXML.Name("vII")
        protected String vII;

        @br.com.ctecinf.SimpleXML.Name("vIPI")
        protected String vIPI;

        @br.com.ctecinf.SimpleXML.Name("vIPIDevol")
        protected String vIPIDevol;

        @br.com.ctecinf.SimpleXML.Name("vPIS")
        protected String vPIS;

        @br.com.ctecinf.SimpleXML.Name("vCOFINS")
        protected String vCOFINS;

        @br.com.ctecinf.SimpleXML.Name("vOutro")
        protected String vOutro;

        @br.com.ctecinf.SimpleXML.Name("vNF")
        protected String vNF;

        @br.com.ctecinf.SimpleXML.Name("vTotTrib")
        protected String vTotTrib;

        public ICMSTot() {
            super("ICMSTot");
        }

        /**
         * BC do ICMS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * BC do ICMS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Valor Total do ICMS
         *
         * @return String
         */
        public final String getVICMS() {
            return this.vICMS;
        }

        /**
         * Valor Total do ICMS
         *
         * @param vICMS
         */
        public final void setVICMS(String vICMS) {
            this.vICMS = vICMS;
        }

        /**
         * Valor Total do ICMS desonerado
         *
         * @return String
         */
        public final String getVICMSDeson() {
            return this.vICMSDeson;
        }

        /**
         * Valor Total do ICMS desonerado
         *
         * @param vICMSDeson
         */
        public final void setVICMSDeson(String vICMSDeson) {
            this.vICMSDeson = vICMSDeson;
        }

        /**
         * Valor total do ICMS relativo ao Fundo de Combate à Pobreza (FCP) para a UF de destino.
         *
         * @return String
         */
        public final String getVFCPUFDest() {
            return this.vFCPUFDest;
        }

        /**
         * Valor total do ICMS relativo ao Fundo de Combate à Pobreza (FCP) para a UF de destino.
         *
         * @param vFCPUFDest
         */
        public final void setVFCPUFDest(String vFCPUFDest) {
            this.vFCPUFDest = vFCPUFDest;
        }

        /**
         * Valor total do ICMS de partilha para a UF do destinatário
         *
         * @return String
         */
        public final String getVICMSUFDest() {
            return this.vICMSUFDest;
        }

        /**
         * Valor total do ICMS de partilha para a UF do destinatário
         *
         * @param vICMSUFDest
         */
        public final void setVICMSUFDest(String vICMSUFDest) {
            this.vICMSUFDest = vICMSUFDest;
        }

        /**
         * Valor total do ICMS de partilha para a UF do remetente
         *
         * @return String
         */
        public final String getVICMSUFRemet() {
            return this.vICMSUFRemet;
        }

        /**
         * Valor total do ICMS de partilha para a UF do remetente
         *
         * @param vICMSUFRemet
         */
        public final void setVICMSUFRemet(String vICMSUFRemet) {
            this.vICMSUFRemet = vICMSUFRemet;
        }

        /**
         * Valor Total do FCP (Fundo de Combate à Pobreza).
         *
         * @return String
         */
        public final String getVFCP() {
            return this.vFCP;
        }

        /**
         * Valor Total do FCP (Fundo de Combate à Pobreza).
         *
         * @param vFCP
         */
        public final void setVFCP(String vFCP) {
            this.vFCP = vFCP;
        }

        /**
         * BC do ICMS ST
         *
         * @return String
         */
        public final String getVBCST() {
            return this.vBCST;
        }

        /**
         * BC do ICMS ST
         *
         * @param vBCST
         */
        public final void setVBCST(String vBCST) {
            this.vBCST = vBCST;
        }

        /**
         * Valor Total do ICMS ST
         *
         * @return String
         */
        public final String getVST() {
            return this.vST;
        }

        /**
         * Valor Total do ICMS ST
         *
         * @param vST
         */
        public final void setVST(String vST) {
            this.vST = vST;
        }

        /**
         * Valor Total do FCP (Fundo de Combate à Pobreza) retido por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPST() {
            return this.vFCPST;
        }

        /**
         * Valor Total do FCP (Fundo de Combate à Pobreza) retido por substituição tributária.
         *
         * @param vFCPST
         */
        public final void setVFCPST(String vFCPST) {
            this.vFCPST = vFCPST;
        }

        /**
         * Valor Total do FCP (Fundo de Combate à Pobreza) retido anteriormente por substituição tributária.
         *
         * @return String
         */
        public final String getVFCPSTRet() {
            return this.vFCPSTRet;
        }

        /**
         * Valor Total do FCP (Fundo de Combate à Pobreza) retido anteriormente por substituição tributária.
         *
         * @param vFCPSTRet
         */
        public final void setVFCPSTRet(String vFCPSTRet) {
            this.vFCPSTRet = vFCPSTRet;
        }

        /**
         * Valor total da quantidade tributada do ICMS monofásico próprio
         *
         * @return String
         */
        public final String getQBCMono() {
            return this.qBCMono;
        }

        /**
         * Valor total da quantidade tributada do ICMS monofásico próprio
         *
         * @param qBCMono
         */
        public final void setQBCMono(String qBCMono) {
            this.qBCMono = qBCMono;
        }

        /**
         * Valor total do ICMS monofásico próprio
         *
         * @return String
         */
        public final String getVICMSMono() {
            return this.vICMSMono;
        }

        /**
         * Valor total do ICMS monofásico próprio
         *
         * @param vICMSMono
         */
        public final void setVICMSMono(String vICMSMono) {
            this.vICMSMono = vICMSMono;
        }

        /**
         * Valor total da quantidade tributada do ICMS monofásico sujeito a retenção
         *
         * @return String
         */
        public final String getQBCMonoReten() {
            return this.qBCMonoReten;
        }

        /**
         * Valor total da quantidade tributada do ICMS monofásico sujeito a retenção
         *
         * @param qBCMonoReten
         */
        public final void setQBCMonoReten(String qBCMonoReten) {
            this.qBCMonoReten = qBCMonoReten;
        }

        /**
         * Valor total do ICMS monofásico sujeito a retenção
         *
         * @return String
         */
        public final String getVICMSMonoReten() {
            return this.vICMSMonoReten;
        }

        /**
         * Valor total do ICMS monofásico sujeito a retenção
         *
         * @param vICMSMonoReten
         */
        public final void setVICMSMonoReten(String vICMSMonoReten) {
            this.vICMSMonoReten = vICMSMonoReten;
        }

        /**
         * Valor total da quantidade tributada do ICMS monofásico retido anteriormente
         *
         * @return String
         */
        public final String getQBCMonoRet() {
            return this.qBCMonoRet;
        }

        /**
         * Valor total da quantidade tributada do ICMS monofásico retido anteriormente
         *
         * @param qBCMonoRet
         */
        public final void setQBCMonoRet(String qBCMonoRet) {
            this.qBCMonoRet = qBCMonoRet;
        }

        /**
         * Valor do ICMS monofásico retido anteriormente
         *
         * @return String
         */
        public final String getVICMSMonoRet() {
            return this.vICMSMonoRet;
        }

        /**
         * Valor do ICMS monofásico retido anteriormente
         *
         * @param vICMSMonoRet
         */
        public final void setVICMSMonoRet(String vICMSMonoRet) {
            this.vICMSMonoRet = vICMSMonoRet;
        }

        /**
         * Valor Total dos produtos e serviços
         *
         * @return String
         */
        public final String getVProd() {
            return this.vProd;
        }

        /**
         * Valor Total dos produtos e serviços
         *
         * @param vProd
         */
        public final void setVProd(String vProd) {
            this.vProd = vProd;
        }

        /**
         * Valor Total do Frete
         *
         * @return String
         */
        public final String getVFrete() {
            return this.vFrete;
        }

        /**
         * Valor Total do Frete
         *
         * @param vFrete
         */
        public final void setVFrete(String vFrete) {
            this.vFrete = vFrete;
        }

        /**
         * Valor Total do Seguro
         *
         * @return String
         */
        public final String getVSeg() {
            return this.vSeg;
        }

        /**
         * Valor Total do Seguro
         *
         * @param vSeg
         */
        public final void setVSeg(String vSeg) {
            this.vSeg = vSeg;
        }

        /**
         * Valor Total do Desconto
         *
         * @return String
         */
        public final String getVDesc() {
            return this.vDesc;
        }

        /**
         * Valor Total do Desconto
         *
         * @param vDesc
         */
        public final void setVDesc(String vDesc) {
            this.vDesc = vDesc;
        }

        /**
         * Valor Total do II
         *
         * @return String
         */
        public final String getVII() {
            return this.vII;
        }

        /**
         * Valor Total do II
         *
         * @param vII
         */
        public final void setVII(String vII) {
            this.vII = vII;
        }

        /**
         * Valor Total do IPI
         *
         * @return String
         */
        public final String getVIPI() {
            return this.vIPI;
        }

        /**
         * Valor Total do IPI
         *
         * @param vIPI
         */
        public final void setVIPI(String vIPI) {
            this.vIPI = vIPI;
        }

        /**
         * Valor Total do IPI devolvido. Deve ser informado quando preenchido o Grupo Tributos Devolvidos na emissão de nota finNFe=4 (devolução) nas operações com não contribuintes do IPI. Corresponde ao total da soma dos campos id: UA04.
         *
         * @return String
         */
        public final String getVIPIDevol() {
            return this.vIPIDevol;
        }

        /**
         * Valor Total do IPI devolvido. Deve ser informado quando preenchido o Grupo Tributos Devolvidos na emissão de nota finNFe=4 (devolução) nas operações com não contribuintes do IPI. Corresponde ao total da soma dos campos id: UA04.
         *
         * @param vIPIDevol
         */
        public final void setVIPIDevol(String vIPIDevol) {
            this.vIPIDevol = vIPIDevol;
        }

        /**
         * Valor do PIS
         *
         * @return String
         */
        public final String getVPIS() {
            return this.vPIS;
        }

        /**
         * Valor do PIS
         *
         * @param vPIS
         */
        public final void setVPIS(String vPIS) {
            this.vPIS = vPIS;
        }

        /**
         * Valor do COFINS
         *
         * @return String
         */
        public final String getVCOFINS() {
            return this.vCOFINS;
        }

        /**
         * Valor do COFINS
         *
         * @param vCOFINS
         */
        public final void setVCOFINS(String vCOFINS) {
            this.vCOFINS = vCOFINS;
        }

        /**
         * Outras Despesas acessórias
         *
         * @return String
         */
        public final String getVOutro() {
            return this.vOutro;
        }

        /**
         * Outras Despesas acessórias
         *
         * @param vOutro
         */
        public final void setVOutro(String vOutro) {
            this.vOutro = vOutro;
        }

        /**
         * Valor Total da NF-e
         *
         * @return String
         */
        public final String getVNF() {
            return this.vNF;
        }

        /**
         * Valor Total da NF-e
         *
         * @param vNF
         */
        public final void setVNF(String vNF) {
            this.vNF = vNF;
        }

        /**
         * Valor estimado total de impostos federais, estaduais e municipais
         *
         * @return String
         */
        public final String getVTotTrib() {
            return this.vTotTrib;
        }

        /**
         * Valor estimado total de impostos federais, estaduais e municipais
         *
         * @param vTotTrib
         */
        public final void setVTotTrib(String vTotTrib) {
            this.vTotTrib = vTotTrib;
        }

    }

    /**
     * Totais referentes ao ISSQN
     */
    public static class ISSQNtot extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vServ")
        protected String vServ;

        @br.com.ctecinf.SimpleXML.Name("vBC")
        protected String vBC;

        @br.com.ctecinf.SimpleXML.Name("vISS")
        protected String vISS;

        @br.com.ctecinf.SimpleXML.Name("vPIS")
        protected String vPIS;

        @br.com.ctecinf.SimpleXML.Name("vCOFINS")
        protected String vCOFINS;

        @br.com.ctecinf.SimpleXML.Name("dCompet")
        protected String dCompet;

        @br.com.ctecinf.SimpleXML.Name("vDeducao")
        protected String vDeducao;

        @br.com.ctecinf.SimpleXML.Name("vOutro")
        protected String vOutro;

        @br.com.ctecinf.SimpleXML.Name("vDescIncond")
        protected String vDescIncond;

        @br.com.ctecinf.SimpleXML.Name("vDescCond")
        protected String vDescCond;

        @br.com.ctecinf.SimpleXML.Name("vISSRet")
        protected String vISSRet;

        @br.com.ctecinf.SimpleXML.Name("cRegTrib")
        protected String cRegTrib;

        public ISSQNtot() {
            super("ISSQNtot");
        }

        /**
         * Valor Total dos Serviços sob não-incidência ou não tributados pelo ICMS
         *
         * @return String
         */
        public final String getVServ() {
            return this.vServ;
        }

        /**
         * Valor Total dos Serviços sob não-incidência ou não tributados pelo ICMS
         *
         * @param vServ
         */
        public final void setVServ(String vServ) {
            this.vServ = vServ;
        }

        /**
         * Base de Cálculo do ISS
         *
         * @return String
         */
        public final String getVBC() {
            return this.vBC;
        }

        /**
         * Base de Cálculo do ISS
         *
         * @param vBC
         */
        public final void setVBC(String vBC) {
            this.vBC = vBC;
        }

        /**
         * Valor Total do ISS
         *
         * @return String
         */
        public final String getVISS() {
            return this.vISS;
        }

        /**
         * Valor Total do ISS
         *
         * @param vISS
         */
        public final void setVISS(String vISS) {
            this.vISS = vISS;
        }

        /**
         * Valor do PIS sobre serviços
         *
         * @return String
         */
        public final String getVPIS() {
            return this.vPIS;
        }

        /**
         * Valor do PIS sobre serviços
         *
         * @param vPIS
         */
        public final void setVPIS(String vPIS) {
            this.vPIS = vPIS;
        }

        /**
         * Valor do COFINS sobre serviços
         *
         * @return String
         */
        public final String getVCOFINS() {
            return this.vCOFINS;
        }

        /**
         * Valor do COFINS sobre serviços
         *
         * @param vCOFINS
         */
        public final void setVCOFINS(String vCOFINS) {
            this.vCOFINS = vCOFINS;
        }

        /**
         * Data da prestação do serviço  (AAAA-MM-DD)
         *
         * @return String
         */
        public final String getDCompet() {
            return this.dCompet;
        }

        /**
         * Data da prestação do serviço  (AAAA-MM-DD)
         *
         * @param dCompet
         */
        public final void setDCompet(String dCompet) {
            this.dCompet = dCompet;
        }

        /**
         * Valor dedução para redução da base de cálculo
         *
         * @return String
         */
        public final String getVDeducao() {
            return this.vDeducao;
        }

        /**
         * Valor dedução para redução da base de cálculo
         *
         * @param vDeducao
         */
        public final void setVDeducao(String vDeducao) {
            this.vDeducao = vDeducao;
        }

        /**
         * Valor outras retenções
         *
         * @return String
         */
        public final String getVOutro() {
            return this.vOutro;
        }

        /**
         * Valor outras retenções
         *
         * @param vOutro
         */
        public final void setVOutro(String vOutro) {
            this.vOutro = vOutro;
        }

        /**
         * Valor desconto incondicionado
         *
         * @return String
         */
        public final String getVDescIncond() {
            return this.vDescIncond;
        }

        /**
         * Valor desconto incondicionado
         *
         * @param vDescIncond
         */
        public final void setVDescIncond(String vDescIncond) {
            this.vDescIncond = vDescIncond;
        }

        /**
         * Valor desconto condicionado
         *
         * @return String
         */
        public final String getVDescCond() {
            return this.vDescCond;
        }

        /**
         * Valor desconto condicionado
         *
         * @param vDescCond
         */
        public final void setVDescCond(String vDescCond) {
            this.vDescCond = vDescCond;
        }

        /**
         * Valor Total Retenção ISS
         *
         * @return String
         */
        public final String getVISSRet() {
            return this.vISSRet;
        }

        /**
         * Valor Total Retenção ISS
         *
         * @param vISSRet
         */
        public final void setVISSRet(String vISSRet) {
            this.vISSRet = vISSRet;
        }

        /**
         * Código do regime especial de tributação
         *
         * @return String
         */
        public final String getCRegTrib() {
            return this.cRegTrib;
        }

        /**
         * Código do regime especial de tributação
         *
         * @param cRegTrib
         */
        public final void setCRegTrib(String cRegTrib) {
            this.cRegTrib = cRegTrib;
        }

    }

    /**
     * Retenção de Tributos Federais
     */
    public static class RetTrib extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vRetPIS")
        protected String vRetPIS;

        @br.com.ctecinf.SimpleXML.Name("vRetCOFINS")
        protected String vRetCOFINS;

        @br.com.ctecinf.SimpleXML.Name("vRetCSLL")
        protected String vRetCSLL;

        @br.com.ctecinf.SimpleXML.Name("vBCIRRF")
        protected String vBCIRRF;

        @br.com.ctecinf.SimpleXML.Name("vIRRF")
        protected String vIRRF;

        @br.com.ctecinf.SimpleXML.Name("vBCRetPrev")
        protected String vBCRetPrev;

        @br.com.ctecinf.SimpleXML.Name("vRetPrev")
        protected String vRetPrev;

        public RetTrib() {
            super("retTrib");
        }

        /**
         * Valor Retido de PIS
         *
         * @return String
         */
        public final String getVRetPIS() {
            return this.vRetPIS;
        }

        /**
         * Valor Retido de PIS
         *
         * @param vRetPIS
         */
        public final void setVRetPIS(String vRetPIS) {
            this.vRetPIS = vRetPIS;
        }

        /**
         * Valor Retido de COFINS
         *
         * @return String
         */
        public final String getVRetCOFINS() {
            return this.vRetCOFINS;
        }

        /**
         * Valor Retido de COFINS
         *
         * @param vRetCOFINS
         */
        public final void setVRetCOFINS(String vRetCOFINS) {
            this.vRetCOFINS = vRetCOFINS;
        }

        /**
         * Valor Retido de CSLL
         *
         * @return String
         */
        public final String getVRetCSLL() {
            return this.vRetCSLL;
        }

        /**
         * Valor Retido de CSLL
         *
         * @param vRetCSLL
         */
        public final void setVRetCSLL(String vRetCSLL) {
            this.vRetCSLL = vRetCSLL;
        }

        /**
         * Base de Cálculo do IRRF
         *
         * @return String
         */
        public final String getVBCIRRF() {
            return this.vBCIRRF;
        }

        /**
         * Base de Cálculo do IRRF
         *
         * @param vBCIRRF
         */
        public final void setVBCIRRF(String vBCIRRF) {
            this.vBCIRRF = vBCIRRF;
        }

        /**
         * Valor Retido de IRRF
         *
         * @return String
         */
        public final String getVIRRF() {
            return this.vIRRF;
        }

        /**
         * Valor Retido de IRRF
         *
         * @param vIRRF
         */
        public final void setVIRRF(String vIRRF) {
            this.vIRRF = vIRRF;
        }

        /**
         * Base de Cálculo da Retenção da Previdêncica Social
         *
         * @return String
         */
        public final String getVBCRetPrev() {
            return this.vBCRetPrev;
        }

        /**
         * Base de Cálculo da Retenção da Previdêncica Social
         *
         * @param vBCRetPrev
         */
        public final void setVBCRetPrev(String vBCRetPrev) {
            this.vBCRetPrev = vBCRetPrev;
        }

        /**
         * Valor da Retenção da Previdêncica Social
         *
         * @return String
         */
        public final String getVRetPrev() {
            return this.vRetPrev;
        }

        /**
         * Valor da Retenção da Previdêncica Social
         *
         * @param vRetPrev
         */
        public final void setVRetPrev(String vRetPrev) {
            this.vRetPrev = vRetPrev;
        }

    }

    /**
     * Dados dos transportes da NF-e
     */
    public static class Transp extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("modFrete")
        protected String modFrete;

        @br.com.ctecinf.SimpleXML.Name("transporta")
        protected Transporta transporta;

        @br.com.ctecinf.SimpleXML.Name("retTransp")
        protected RetTransp retTransp;

        @br.com.ctecinf.SimpleXML.Name("veicTransp")
        protected TVeiculo veicTransp;

        @br.com.ctecinf.SimpleXML.Name("reboque")
        protected java.util.List<TVeiculo> reboque;

        @br.com.ctecinf.SimpleXML.Name("vagao")
        protected String vagao;

        @br.com.ctecinf.SimpleXML.Name("balsa")
        protected String balsa;

        @br.com.ctecinf.SimpleXML.Name("vol")
        protected java.util.List<Vol> vol;

        public Transp() {
            super("transp");
        }

        /**
         * Modalidade do frete<br>
         * 0- Contratação do Frete por conta do Remetente (CIF);<br>
         * 1- Contratação do Frete por conta do destinatário/remetente (FOB);<br>
         * 2- Contratação do Frete por conta de terceiros;<br>
         * 3- Transporte próprio por conta do remetente;<br>
         * 4- Transporte próprio por conta do destinatário;<br>
         * 9- Sem Ocorrência de transporte.
         *
         * @return String
         */
        public final String getModFrete() {
            return this.modFrete;
        }

        /**
         * Modalidade do frete<br>
         * 0- Contratação do Frete por conta do Remetente (CIF);<br>
         * 1- Contratação do Frete por conta do destinatário/remetente (FOB);<br>
         * 2- Contratação do Frete por conta de terceiros;<br>
         * 3- Transporte próprio por conta do remetente;<br>
         * 4- Transporte próprio por conta do destinatário;<br>
         * 9- Sem Ocorrência de transporte.
         *
         * @param modFrete
         */
        public final void setModFrete(String modFrete) {
            this.modFrete = modFrete;
        }

        /**
         * Dados do transportador
         *
         * @return Transporta
         */
        public final Transporta getTransporta() {
            return this.transporta;
        }

        /**
         * Dados do transportador
         *
         * @param transporta
         */
        public final void setTransporta(Transporta transporta) {
            this.transporta = transporta;
        }

        /**
         * Dados da retenção  ICMS do Transporte
         *
         * @return RetTransp
         */
        public final RetTransp getRetTransp() {
            return this.retTransp;
        }

        /**
         * Dados da retenção  ICMS do Transporte
         *
         * @param retTransp
         */
        public final void setRetTransp(RetTransp retTransp) {
            this.retTransp = retTransp;
        }

        /**
         * Dados do veículo
         *
         * @return TVeiculo
         */
        public final TVeiculo getVeicTransp() {
            return this.veicTransp;
        }

        /**
         * Dados do veículo
         *
         * @param veicTransp
         */
        public final void setVeicTransp(TVeiculo veicTransp) {
            this.veicTransp = veicTransp;
        }

        /**
         * Dados do reboque/Dolly (v2.0)
         *
         * @return java.util.List
         */
        public final java.util.List<TVeiculo> getReboque() {
            if(this.reboque == null) {
                this.reboque = new java.util.ArrayList();
            }
            return this.reboque;
        }

        /**
         * Dados do reboque/Dolly (v2.0)
         *
         * @param reboque
         */
        public final void setReboque(java.util.List<TVeiculo> reboque) {
            this.reboque = reboque;
        }

        /**
         * Identificação do vagão (v2.0)
         *
         * @return String
         */
        public final String getVagao() {
            return this.vagao;
        }

        /**
         * Identificação do vagão (v2.0)
         *
         * @param vagao
         */
        public final void setVagao(String vagao) {
            this.vagao = vagao;
        }

        /**
         * Identificação da balsa (v2.0)
         *
         * @return String
         */
        public final String getBalsa() {
            return this.balsa;
        }

        /**
         * Identificação da balsa (v2.0)
         *
         * @param balsa
         */
        public final void setBalsa(String balsa) {
            this.balsa = balsa;
        }

        /**
         * Dados dos volumes
         *
         * @return java.util.List
         */
        public final java.util.List<Vol> getVol() {
            if(this.vol == null) {
                this.vol = new java.util.ArrayList();
            }
            return this.vol;
        }

        /**
         * Dados dos volumes
         *
         * @param vol
         */
        public final void setVol(java.util.List<Vol> vol) {
            this.vol = vol;
        }

    }

    /**
     * Dados do transportador
     */
    public static class Transporta extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("CPF")
        protected String cPF;

        @br.com.ctecinf.SimpleXML.Name("xNome")
        protected String xNome;

        @br.com.ctecinf.SimpleXML.Name("IE")
        protected String iE;

        @br.com.ctecinf.SimpleXML.Name("xEnder")
        protected String xEnder;

        @br.com.ctecinf.SimpleXML.Name("xMun")
        protected String xMun;

        @br.com.ctecinf.SimpleXML.Name("UF")
        protected TUf uF;

        public Transporta() {
            super("transporta");
        }

        /**
         * CNPJ do transportador
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do transportador
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * CPF do transportador
         *
         * @return String
         */
        public final String getCPF() {
            return this.cPF;
        }

        /**
         * CPF do transportador
         *
         * @param cPF
         */
        public final void setCPF(String cPF) {
            this.cPF = cPF;
        }

        /**
         * Razão Social ou nome do transportador
         *
         * @return String
         */
        public final String getXNome() {
            return this.xNome;
        }

        /**
         * Razão Social ou nome do transportador
         *
         * @param xNome
         */
        public final void setXNome(String xNome) {
            this.xNome = xNome;
        }

        /**
         * Inscrição Estadual (v2.0)
         *
         * @return String
         */
        public final String getIE() {
            return this.iE;
        }

        /**
         * Inscrição Estadual (v2.0)
         *
         * @param iE
         */
        public final void setIE(String iE) {
            this.iE = iE;
        }

        /**
         * Endereço completo
         *
         * @return String
         */
        public final String getXEnder() {
            return this.xEnder;
        }

        /**
         * Endereço completo
         *
         * @param xEnder
         */
        public final void setXEnder(String xEnder) {
            this.xEnder = xEnder;
        }

        /**
         * Nome do munícipio
         *
         * @return String
         */
        public final String getXMun() {
            return this.xMun;
        }

        /**
         * Nome do munícipio
         *
         * @param xMun
         */
        public final void setXMun(String xMun) {
            this.xMun = xMun;
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

    }

    /**
     * Dados da retenção  ICMS do Transporte
     */
    public static class RetTransp extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("vServ")
        protected String vServ;

        @br.com.ctecinf.SimpleXML.Name("vBCRet")
        protected String vBCRet;

        @br.com.ctecinf.SimpleXML.Name("pICMSRet")
        protected String pICMSRet;

        @br.com.ctecinf.SimpleXML.Name("vICMSRet")
        protected String vICMSRet;

        @br.com.ctecinf.SimpleXML.Name("CFOP")
        protected String cFOP;

        @br.com.ctecinf.SimpleXML.Name("cMunFG")
        protected String cMunFG;

        public RetTransp() {
            super("retTransp");
        }

        /**
         * Valor do Serviço
         *
         * @return String
         */
        public final String getVServ() {
            return this.vServ;
        }

        /**
         * Valor do Serviço
         *
         * @param vServ
         */
        public final void setVServ(String vServ) {
            this.vServ = vServ;
        }

        /**
         * BC da Retenção do ICMS
         *
         * @return String
         */
        public final String getVBCRet() {
            return this.vBCRet;
        }

        /**
         * BC da Retenção do ICMS
         *
         * @param vBCRet
         */
        public final void setVBCRet(String vBCRet) {
            this.vBCRet = vBCRet;
        }

        /**
         * Alíquota da Retenção
         *
         * @return String
         */
        public final String getPICMSRet() {
            return this.pICMSRet;
        }

        /**
         * Alíquota da Retenção
         *
         * @param pICMSRet
         */
        public final void setPICMSRet(String pICMSRet) {
            this.pICMSRet = pICMSRet;
        }

        /**
         * Valor do ICMS Retido
         *
         * @return String
         */
        public final String getVICMSRet() {
            return this.vICMSRet;
        }

        /**
         * Valor do ICMS Retido
         *
         * @param vICMSRet
         */
        public final void setVICMSRet(String vICMSRet) {
            this.vICMSRet = vICMSRet;
        }

        /**
         * Código Fiscal de Operações e Prestações
         *
         * @return String
         */
        public final String getCFOP() {
            return this.cFOP;
        }

        /**
         * Código Fiscal de Operações e Prestações
         *
         * @param cFOP
         */
        public final void setCFOP(String cFOP) {
            this.cFOP = cFOP;
        }

        /**
         * Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE)
         *
         * @return String
         */
        public final String getCMunFG() {
            return this.cMunFG;
        }

        /**
         * Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE)
         *
         * @param cMunFG
         */
        public final void setCMunFG(String cMunFG) {
            this.cMunFG = cMunFG;
        }

    }

    /**
     * Dados dos volumes
     */
    public static class Vol extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("qVol")
        protected String qVol;

        @br.com.ctecinf.SimpleXML.Name("esp")
        protected String esp;

        @br.com.ctecinf.SimpleXML.Name("marca")
        protected String marca;

        @br.com.ctecinf.SimpleXML.Name("nVol")
        protected String nVol;

        @br.com.ctecinf.SimpleXML.Name("pesoL")
        protected String pesoL;

        @br.com.ctecinf.SimpleXML.Name("pesoB")
        protected String pesoB;

        @br.com.ctecinf.SimpleXML.Name("lacres")
        protected java.util.List<Lacres> lacres;

        public Vol() {
            super("vol");
        }

        /**
         * Quantidade de volumes transportados
         *
         * @return String
         */
        public final String getQVol() {
            return this.qVol;
        }

        /**
         * Quantidade de volumes transportados
         *
         * @param qVol
         */
        public final void setQVol(String qVol) {
            this.qVol = qVol;
        }

        /**
         * Espécie dos volumes transportados
         *
         * @return String
         */
        public final String getEsp() {
            return this.esp;
        }

        /**
         * Espécie dos volumes transportados
         *
         * @param esp
         */
        public final void setEsp(String esp) {
            this.esp = esp;
        }

        /**
         * Marca dos volumes transportados
         *
         * @return String
         */
        public final String getMarca() {
            return this.marca;
        }

        /**
         * Marca dos volumes transportados
         *
         * @param marca
         */
        public final void setMarca(String marca) {
            this.marca = marca;
        }

        /**
         * Numeração dos volumes transportados
         *
         * @return String
         */
        public final String getNVol() {
            return this.nVol;
        }

        /**
         * Numeração dos volumes transportados
         *
         * @param nVol
         */
        public final void setNVol(String nVol) {
            this.nVol = nVol;
        }

        /**
         * Peso líquido (em kg)
         *
         * @return String
         */
        public final String getPesoL() {
            return this.pesoL;
        }

        /**
         * Peso líquido (em kg)
         *
         * @param pesoL
         */
        public final void setPesoL(String pesoL) {
            this.pesoL = pesoL;
        }

        /**
         * Peso bruto (em kg)
         *
         * @return String
         */
        public final String getPesoB() {
            return this.pesoB;
        }

        /**
         * Peso bruto (em kg)
         *
         * @param pesoB
         */
        public final void setPesoB(String pesoB) {
            this.pesoB = pesoB;
        }

        public final java.util.List<Lacres> getLacres() {
            if(this.lacres == null) {
                this.lacres = new java.util.ArrayList();
            }
            return this.lacres;
        }

        public final void setLacres(java.util.List<Lacres> lacres) {
            this.lacres = lacres;
        }

    }

    public static class Lacres extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nLacre")
        protected String nLacre;

        public Lacres() {
            super("lacres");
        }

        /**
         * Número dos Lacres
         *
         * @return String
         */
        public final String getNLacre() {
            return this.nLacre;
        }

        /**
         * Número dos Lacres
         *
         * @param nLacre
         */
        public final void setNLacre(String nLacre) {
            this.nLacre = nLacre;
        }

    }

    /**
     * Dados da cobrança da NF-e
     */
    public static class Cobr extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("fat")
        protected Fat fat;

        @br.com.ctecinf.SimpleXML.Name("dup")
        protected java.util.List<Dup> dup;

        public Cobr() {
            super("cobr");
        }

        /**
         * Dados da fatura
         *
         * @return Fat
         */
        public final Fat getFat() {
            return this.fat;
        }

        /**
         * Dados da fatura
         *
         * @param fat
         */
        public final void setFat(Fat fat) {
            this.fat = fat;
        }

        /**
         * Dados das duplicatas NT 2011/004
         *
         * @return java.util.List
         */
        public final java.util.List<Dup> getDup() {
            if(this.dup == null) {
                this.dup = new java.util.ArrayList();
            }
            return this.dup;
        }

        /**
         * Dados das duplicatas NT 2011/004
         *
         * @param dup
         */
        public final void setDup(java.util.List<Dup> dup) {
            this.dup = dup;
        }

    }

    /**
     * Dados da fatura
     */
    public static class Fat extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nFat")
        protected String nFat;

        @br.com.ctecinf.SimpleXML.Name("vOrig")
        protected String vOrig;

        @br.com.ctecinf.SimpleXML.Name("vDesc")
        protected String vDesc;

        @br.com.ctecinf.SimpleXML.Name("vLiq")
        protected String vLiq;

        public Fat() {
            super("fat");
        }

        /**
         * Número da fatura
         *
         * @return String
         */
        public final String getNFat() {
            return this.nFat;
        }

        /**
         * Número da fatura
         *
         * @param nFat
         */
        public final void setNFat(String nFat) {
            this.nFat = nFat;
        }

        /**
         * Valor original da fatura
         *
         * @return String
         */
        public final String getVOrig() {
            return this.vOrig;
        }

        /**
         * Valor original da fatura
         *
         * @param vOrig
         */
        public final void setVOrig(String vOrig) {
            this.vOrig = vOrig;
        }

        /**
         * Valor do desconto da fatura
         *
         * @return String
         */
        public final String getVDesc() {
            return this.vDesc;
        }

        /**
         * Valor do desconto da fatura
         *
         * @param vDesc
         */
        public final void setVDesc(String vDesc) {
            this.vDesc = vDesc;
        }

        /**
         * Valor líquido da fatura
         *
         * @return String
         */
        public final String getVLiq() {
            return this.vLiq;
        }

        /**
         * Valor líquido da fatura
         *
         * @param vLiq
         */
        public final void setVLiq(String vLiq) {
            this.vLiq = vLiq;
        }

    }

    /**
     * Dados das duplicatas NT 2011/004
     */
    public static class Dup extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nDup")
        protected String nDup;

        @br.com.ctecinf.SimpleXML.Name("dVenc")
        protected String dVenc;

        @br.com.ctecinf.SimpleXML.Name("vDup")
        protected String vDup;

        public Dup() {
            super("dup");
        }

        /**
         * Número da duplicata
         *
         * @return String
         */
        public final String getNDup() {
            return this.nDup;
        }

        /**
         * Número da duplicata
         *
         * @param nDup
         */
        public final void setNDup(String nDup) {
            this.nDup = nDup;
        }

        /**
         * Data de vencimento da duplicata (AAAA-MM-DD)
         *
         * @return String
         */
        public final String getDVenc() {
            return this.dVenc;
        }

        /**
         * Data de vencimento da duplicata (AAAA-MM-DD)
         *
         * @param dVenc
         */
        public final void setDVenc(String dVenc) {
            this.dVenc = dVenc;
        }

        /**
         * Valor da duplicata
         *
         * @return String
         */
        public final String getVDup() {
            return this.vDup;
        }

        /**
         * Valor da duplicata
         *
         * @param vDup
         */
        public final void setVDup(String vDup) {
            this.vDup = vDup;
        }

    }

    /**
     * Dados de Pagamento. Obrigatório apenas para (NFC-e) NT 2012/004
     */
    public static class Pag extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("detPag")
        protected java.util.List<DetPag> detPag;

        @br.com.ctecinf.SimpleXML.Name("vTroco")
        protected String vTroco;

        public Pag() {
            super("pag");
        }

        /**
         * Grupo de detalhamento da forma de pagamento.
         *
         * @return java.util.List
         */
        public final java.util.List<DetPag> getDetPag() {
            if(this.detPag == null) {
                this.detPag = new java.util.ArrayList();
            }
            return this.detPag;
        }

        /**
         * Grupo de detalhamento da forma de pagamento.
         *
         * @param detPag
         */
        public final void setDetPag(java.util.List<DetPag> detPag) {
            this.detPag = detPag;
        }

        /**
         * Valor do Troco.
         *
         * @return String
         */
        public final String getVTroco() {
            return this.vTroco;
        }

        /**
         * Valor do Troco.
         *
         * @param vTroco
         */
        public final void setVTroco(String vTroco) {
            this.vTroco = vTroco;
        }

    }

    /**
     * Grupo de detalhamento da forma de pagamento.
     */
    public static class DetPag extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("indPag")
        protected String indPag;

        @br.com.ctecinf.SimpleXML.Name("tPag")
        protected String tPag;

        @br.com.ctecinf.SimpleXML.Name("xPag")
        protected String xPag;

        @br.com.ctecinf.SimpleXML.Name("vPag")
        protected String vPag;

        @br.com.ctecinf.SimpleXML.Name("card")
        protected Card card;

        public DetPag() {
            super("detPag");
        }

        /**
         * Indicador da Forma de Pagamento:0-Pagamento à Vista;1-Pagamento à Prazo;
         *
         * @return String
         */
        public final String getIndPag() {
            return this.indPag;
        }

        /**
         * Indicador da Forma de Pagamento:0-Pagamento à Vista;1-Pagamento à Prazo;
         *
         * @param indPag
         */
        public final void setIndPag(String indPag) {
            this.indPag = indPag;
        }

        /**
         * Forma de Pagamento:
         *
         * @return String
         */
        public final String getTPag() {
            return this.tPag;
        }

        /**
         * Forma de Pagamento:
         *
         * @param tPag
         */
        public final void setTPag(String tPag) {
            this.tPag = tPag;
        }

        /**
         * Descrição do Meio de Pagamento
         *
         * @return String
         */
        public final String getXPag() {
            return this.xPag;
        }

        /**
         * Descrição do Meio de Pagamento
         *
         * @param xPag
         */
        public final void setXPag(String xPag) {
            this.xPag = xPag;
        }

        /**
         * Valor do Pagamento. Esta tag poderá ser omitida quando a tag tPag=90 (Sem Pagamento), caso contrário deverá ser preenchida.
         *
         * @return String
         */
        public final String getVPag() {
            return this.vPag;
        }

        /**
         * Valor do Pagamento. Esta tag poderá ser omitida quando a tag tPag=90 (Sem Pagamento), caso contrário deverá ser preenchida.
         *
         * @param vPag
         */
        public final void setVPag(String vPag) {
            this.vPag = vPag;
        }

        /**
         * Grupo de Cartões
         *
         * @return Card
         */
        public final Card getCard() {
            return this.card;
        }

        /**
         * Grupo de Cartões
         *
         * @param card
         */
        public final void setCard(Card card) {
            this.card = card;
        }

    }

    /**
     * Grupo de Cartões
     */
    public static class Card extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("tpIntegra")
        protected String tpIntegra;

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("tBand")
        protected String tBand;

        @br.com.ctecinf.SimpleXML.Name("cAut")
        protected String cAut;

        public Card() {
            super("card");
        }

        /**
         * Tipo de Integração do processo de pagamento com o sistema de automação da empresa/ <br>
         * 																1=Pagamento integrado com o sistema de automação da empresa Ex. equipamento TEF , Comercio Eletronico<br>
         * 																2=Pagamento não integrado com o sistema de automação da empresa Ex: equipamento POS
         *
         * @return String
         */
        public final String getTpIntegra() {
            return this.tpIntegra;
        }

        /**
         * Tipo de Integração do processo de pagamento com o sistema de automação da empresa/ <br>
         * 																1=Pagamento integrado com o sistema de automação da empresa Ex. equipamento TEF , Comercio Eletronico<br>
         * 																2=Pagamento não integrado com o sistema de automação da empresa Ex: equipamento POS
         *
         * @param tpIntegra
         */
        public final void setTpIntegra(String tpIntegra) {
            this.tpIntegra = tpIntegra;
        }

        /**
         * CNPJ da instituição de pagamento
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ da instituição de pagamento
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Bandeira da operadora de cartão
         *
         * @return String
         */
        public final String getTBand() {
            return this.tBand;
        }

        /**
         * Bandeira da operadora de cartão
         *
         * @param tBand
         */
        public final void setTBand(String tBand) {
            this.tBand = tBand;
        }

        /**
         * Número de autorização da operação cartão de crédito/débito
         *
         * @return String
         */
        public final String getCAut() {
            return this.cAut;
        }

        /**
         * Número de autorização da operação cartão de crédito/débito
         *
         * @param cAut
         */
        public final void setCAut(String cAut) {
            this.cAut = cAut;
        }

    }

    /**
     * Grupo de Informações do Intermediador da Transação
     */
    public static class InfIntermed extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("CNPJ")
        protected String cNPJ;

        @br.com.ctecinf.SimpleXML.Name("idCadIntTran")
        protected String idCadIntTran;

        public InfIntermed() {
            super("infIntermed");
        }

        /**
         * CNPJ do Intermediador da Transação (agenciador, plataforma de delivery, marketplace e similar) de serviços e de negócios.
         *
         * @return String
         */
        public final String getCNPJ() {
            return this.cNPJ;
        }

        /**
         * CNPJ do Intermediador da Transação (agenciador, plataforma de delivery, marketplace e similar) de serviços e de negócios.
         *
         * @param cNPJ
         */
        public final void setCNPJ(String cNPJ) {
            this.cNPJ = cNPJ;
        }

        /**
         * Identificador cadastrado no intermediador
         *
         * @return String
         */
        public final String getIdCadIntTran() {
            return this.idCadIntTran;
        }

        /**
         * Identificador cadastrado no intermediador
         *
         * @param idCadIntTran
         */
        public final void setIdCadIntTran(String idCadIntTran) {
            this.idCadIntTran = idCadIntTran;
        }

    }

    /**
     * Informações adicionais da NF-e
     */
    public static class InfAdic extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("infAdFisco")
        protected String infAdFisco;

        @br.com.ctecinf.SimpleXML.Name("infCpl")
        protected String infCpl;

        @br.com.ctecinf.SimpleXML.Name("obsCont")
        protected java.util.List<ObsCont> obsCont;

        @br.com.ctecinf.SimpleXML.Name("obsFisco")
        protected java.util.List<ObsFisco> obsFisco;

        @br.com.ctecinf.SimpleXML.Name("procRef")
        protected java.util.List<ProcRef> procRef;

        public InfAdic() {
            super("infAdic");
        }

        /**
         * Informações adicionais de interesse do Fisco (v2.0)
         *
         * @return String
         */
        public final String getInfAdFisco() {
            return this.infAdFisco;
        }

        /**
         * Informações adicionais de interesse do Fisco (v2.0)
         *
         * @param infAdFisco
         */
        public final void setInfAdFisco(String infAdFisco) {
            this.infAdFisco = infAdFisco;
        }

        /**
         * Informações complementares de interesse do Contribuinte
         *
         * @return String
         */
        public final String getInfCpl() {
            return this.infCpl;
        }

        /**
         * Informações complementares de interesse do Contribuinte
         *
         * @param infCpl
         */
        public final void setInfCpl(String infCpl) {
            this.infCpl = infCpl;
        }

        /**
         * Campo de uso livre do contribuinte<br>
         * informar o nome do campo no atributo xCampo<br>
         * e o conteúdo do campo no xTexto
         *
         * @return java.util.List
         */
        public final java.util.List<ObsCont> getObsCont() {
            if(this.obsCont == null) {
                this.obsCont = new java.util.ArrayList();
            }
            return this.obsCont;
        }

        /**
         * Campo de uso livre do contribuinte<br>
         * informar o nome do campo no atributo xCampo<br>
         * e o conteúdo do campo no xTexto
         *
         * @param obsCont
         */
        public final void setObsCont(java.util.List<ObsCont> obsCont) {
            this.obsCont = obsCont;
        }

        /**
         * Campo de uso exclusivo do Fisco<br>
         * informar o nome do campo no atributo xCampo<br>
         * e o conteúdo do campo no xTexto
         *
         * @return java.util.List
         */
        public final java.util.List<ObsFisco> getObsFisco() {
            if(this.obsFisco == null) {
                this.obsFisco = new java.util.ArrayList();
            }
            return this.obsFisco;
        }

        /**
         * Campo de uso exclusivo do Fisco<br>
         * informar o nome do campo no atributo xCampo<br>
         * e o conteúdo do campo no xTexto
         *
         * @param obsFisco
         */
        public final void setObsFisco(java.util.List<ObsFisco> obsFisco) {
            this.obsFisco = obsFisco;
        }

        /**
         * Grupo de informações do  processo referenciado
         *
         * @return java.util.List
         */
        public final java.util.List<ProcRef> getProcRef() {
            if(this.procRef == null) {
                this.procRef = new java.util.ArrayList();
            }
            return this.procRef;
        }

        /**
         * Grupo de informações do  processo referenciado
         *
         * @param procRef
         */
        public final void setProcRef(java.util.List<ProcRef> procRef) {
            this.procRef = procRef;
        }

    }

    /**
     * Grupo de informações do  processo referenciado
     */
    public static class ProcRef extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("nProc")
        protected String nProc;

        @br.com.ctecinf.SimpleXML.Name("indProc")
        protected String indProc;

        @br.com.ctecinf.SimpleXML.Name("tpAto")
        protected String tpAto;

        public ProcRef() {
            super("procRef");
        }

        /**
         * Indentificador do processo ou ato<br>
         * concessório
         *
         * @return String
         */
        public final String getNProc() {
            return this.nProc;
        }

        /**
         * Indentificador do processo ou ato<br>
         * concessório
         *
         * @param nProc
         */
        public final void setNProc(String nProc) {
            this.nProc = nProc;
        }

        /**
         * Origem do processo, informar com:<br>
         * 0 - SEFAZ;<br>
         * 1 - Justiça Federal;<br>
         * 2 - Justiça Estadual;<br>
         * 3 - Secex/RFB;<br>
         * 9 - Outros
         *
         * @return String
         */
        public final String getIndProc() {
            return this.indProc;
        }

        /**
         * Origem do processo, informar com:<br>
         * 0 - SEFAZ;<br>
         * 1 - Justiça Federal;<br>
         * 2 - Justiça Estadual;<br>
         * 3 - Secex/RFB;<br>
         * 9 - Outros
         *
         * @param indProc
         */
        public final void setIndProc(String indProc) {
            this.indProc = indProc;
        }

        /**
         * Tipo do ato concessório<br>
         * 														Para origem do Processo na SEFAZ (indProc=0), informar o<br>
         * tipo de ato concessório:<br>
         * 08=Termo de Acordo;<br>
         * 10=Regime Especial;<br>
         * 12=Autorização específica;
         *
         * @return String
         */
        public final String getTpAto() {
            return this.tpAto;
        }

        /**
         * Tipo do ato concessório<br>
         * 														Para origem do Processo na SEFAZ (indProc=0), informar o<br>
         * tipo de ato concessório:<br>
         * 08=Termo de Acordo;<br>
         * 10=Regime Especial;<br>
         * 12=Autorização específica;
         *
         * @param tpAto
         */
        public final void setTpAto(String tpAto) {
            this.tpAto = tpAto;
        }

    }

    /**
     * Informações de exportação
     */
    public static class Exporta extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("UFSaidaPais")
        protected TUfEmi uFSaidaPais;

        @br.com.ctecinf.SimpleXML.Name("xLocExporta")
        protected String xLocExporta;

        @br.com.ctecinf.SimpleXML.Name("xLocDespacho")
        protected String xLocDespacho;

        public Exporta() {
            super("exporta");
        }

        /**
         * Sigla da UF de Embarque ou de transposição de fronteira
         *
         * @return TUfEmi
         */
        public final TUfEmi getUFSaidaPais() {
            return this.uFSaidaPais;
        }

        /**
         * Sigla da UF de Embarque ou de transposição de fronteira
         *
         * @param uFSaidaPais
         */
        public final void setUFSaidaPais(TUfEmi uFSaidaPais) {
            this.uFSaidaPais = uFSaidaPais;
        }

        /**
         * Local de Embarque ou de transposição de fronteira
         *
         * @return String
         */
        public final String getXLocExporta() {
            return this.xLocExporta;
        }

        /**
         * Local de Embarque ou de transposição de fronteira
         *
         * @param xLocExporta
         */
        public final void setXLocExporta(String xLocExporta) {
            this.xLocExporta = xLocExporta;
        }

        /**
         * Descrição do local de despacho
         *
         * @return String
         */
        public final String getXLocDespacho() {
            return this.xLocDespacho;
        }

        /**
         * Descrição do local de despacho
         *
         * @param xLocDespacho
         */
        public final void setXLocDespacho(String xLocDespacho) {
            this.xLocDespacho = xLocDespacho;
        }

    }

    /**
     * Informações de compras  (Nota de Empenho, Pedido e Contrato)
     */
    public static class Compra extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("xNEmp")
        protected String xNEmp;

        @br.com.ctecinf.SimpleXML.Name("xPed")
        protected String xPed;

        @br.com.ctecinf.SimpleXML.Name("xCont")
        protected String xCont;

        public Compra() {
            super("compra");
        }

        /**
         * Informação da Nota de Empenho de compras públicas (NT2011/004)
         *
         * @return String
         */
        public final String getXNEmp() {
            return this.xNEmp;
        }

        /**
         * Informação da Nota de Empenho de compras públicas (NT2011/004)
         *
         * @param xNEmp
         */
        public final void setXNEmp(String xNEmp) {
            this.xNEmp = xNEmp;
        }

        /**
         * Informação do pedido
         *
         * @return String
         */
        public final String getXPed() {
            return this.xPed;
        }

        /**
         * Informação do pedido
         *
         * @param xPed
         */
        public final void setXPed(String xPed) {
            this.xPed = xPed;
        }

        /**
         * Informação do contrato
         *
         * @return String
         */
        public final String getXCont() {
            return this.xCont;
        }

        /**
         * Informação do contrato
         *
         * @param xCont
         */
        public final void setXCont(String xCont) {
            this.xCont = xCont;
        }

    }

    /**
     * Informações de registro aquisições de cana
     */
    public static class Cana extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("safra")
        protected String safra;

        @br.com.ctecinf.SimpleXML.Name("ref")
        protected String ref;

        @br.com.ctecinf.SimpleXML.Name("forDia")
        protected java.util.List<ForDia> forDia;

        @br.com.ctecinf.SimpleXML.Name("qTotMes")
        protected String qTotMes;

        @br.com.ctecinf.SimpleXML.Name("qTotAnt")
        protected String qTotAnt;

        @br.com.ctecinf.SimpleXML.Name("qTotGer")
        protected String qTotGer;

        @br.com.ctecinf.SimpleXML.Name("deduc")
        protected java.util.List<Deduc> deduc;

        @br.com.ctecinf.SimpleXML.Name("vFor")
        protected String vFor;

        @br.com.ctecinf.SimpleXML.Name("vTotDed")
        protected String vTotDed;

        @br.com.ctecinf.SimpleXML.Name("vLiqFor")
        protected String vLiqFor;

        public Cana() {
            super("cana");
        }

        /**
         * Identificação da safra
         *
         * @return String
         */
        public final String getSafra() {
            return this.safra;
        }

        /**
         * Identificação da safra
         *
         * @param safra
         */
        public final void setSafra(String safra) {
            this.safra = safra;
        }

        /**
         * Mês e Ano de Referência, formato: MM/AAAA
         *
         * @return String
         */
        public final String getRef() {
            return this.ref;
        }

        /**
         * Mês e Ano de Referência, formato: MM/AAAA
         *
         * @param ref
         */
        public final void setRef(String ref) {
            this.ref = ref;
        }

        /**
         * Fornecimentos diários
         *
         * @return java.util.List
         */
        public final java.util.List<ForDia> getForDia() {
            if(this.forDia == null) {
                this.forDia = new java.util.ArrayList();
            }
            return this.forDia;
        }

        /**
         * Fornecimentos diários
         *
         * @param forDia
         */
        public final void setForDia(java.util.List<ForDia> forDia) {
            this.forDia = forDia;
        }

        /**
         * Total do mês
         *
         * @return String
         */
        public final String getQTotMes() {
            return this.qTotMes;
        }

        /**
         * Total do mês
         *
         * @param qTotMes
         */
        public final void setQTotMes(String qTotMes) {
            this.qTotMes = qTotMes;
        }

        /**
         * Total Anterior
         *
         * @return String
         */
        public final String getQTotAnt() {
            return this.qTotAnt;
        }

        /**
         * Total Anterior
         *
         * @param qTotAnt
         */
        public final void setQTotAnt(String qTotAnt) {
            this.qTotAnt = qTotAnt;
        }

        /**
         * Total Geral
         *
         * @return String
         */
        public final String getQTotGer() {
            return this.qTotGer;
        }

        /**
         * Total Geral
         *
         * @param qTotGer
         */
        public final void setQTotGer(String qTotGer) {
            this.qTotGer = qTotGer;
        }

        /**
         * Deduções - Taxas e Contribuições
         *
         * @return java.util.List
         */
        public final java.util.List<Deduc> getDeduc() {
            if(this.deduc == null) {
                this.deduc = new java.util.ArrayList();
            }
            return this.deduc;
        }

        /**
         * Deduções - Taxas e Contribuições
         *
         * @param deduc
         */
        public final void setDeduc(java.util.List<Deduc> deduc) {
            this.deduc = deduc;
        }

        /**
         * Valor  dos fornecimentos
         *
         * @return String
         */
        public final String getVFor() {
            return this.vFor;
        }

        /**
         * Valor  dos fornecimentos
         *
         * @param vFor
         */
        public final void setVFor(String vFor) {
            this.vFor = vFor;
        }

        /**
         * Valor Total das Deduções
         *
         * @return String
         */
        public final String getVTotDed() {
            return this.vTotDed;
        }

        /**
         * Valor Total das Deduções
         *
         * @param vTotDed
         */
        public final void setVTotDed(String vTotDed) {
            this.vTotDed = vTotDed;
        }

        /**
         * Valor Líquido dos fornecimentos
         *
         * @return String
         */
        public final String getVLiqFor() {
            return this.vLiqFor;
        }

        /**
         * Valor Líquido dos fornecimentos
         *
         * @param vLiqFor
         */
        public final void setVLiqFor(String vLiqFor) {
            this.vLiqFor = vLiqFor;
        }

    }

    /**
     * Fornecimentos diários
     */
    public static class ForDia extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("qtde")
        protected String qtde;

        public ForDia() {
            super("forDia", "dia");
        }

        /**
         * Número do dia
         *
         * @param dia
         */
        public final void setDia(String dia) {
            this.setAttribute("dia", dia);
        }

        /**
         * Quantidade em quilogramas - peso líquido
         *
         * @return String
         */
        public final String getQtde() {
            return this.qtde;
        }

        /**
         * Quantidade em quilogramas - peso líquido
         *
         * @param qtde
         */
        public final void setQtde(String qtde) {
            this.qtde = qtde;
        }

    }

    /**
     * Deduções - Taxas e Contribuições
     */
    public static class Deduc extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("xDed")
        protected String xDed;

        @br.com.ctecinf.SimpleXML.Name("vDed")
        protected String vDed;

        public Deduc() {
            super("deduc");
        }

        /**
         * Descrição da Dedução
         *
         * @return String
         */
        public final String getXDed() {
            return this.xDed;
        }

        /**
         * Descrição da Dedução
         *
         * @param xDed
         */
        public final void setXDed(String xDed) {
            this.xDed = xDed;
        }

        /**
         * valor da dedução
         *
         * @return String
         */
        public final String getVDed() {
            return this.vDed;
        }

        /**
         * valor da dedução
         *
         * @param vDed
         */
        public final void setVDed(String vDed) {
            this.vDed = vDed;
        }

    }

    /**
     * Grupo para informações da solicitação da NFF
     */
    public static class InfSolicNFF extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("xSolic")
        protected String xSolic;

        public InfSolicNFF() {
            super("infSolicNFF");
        }

        /**
         * Solicitação do pedido de emissão da NFF
         *
         * @return String
         */
        public final String getXSolic() {
            return this.xSolic;
        }

        /**
         * Solicitação do pedido de emissão da NFF
         *
         * @param xSolic
         */
        public final void setXSolic(String xSolic) {
            this.xSolic = xSolic;
        }

    }

    /**
     * Informações suplementares Nota Fiscal
     */
    public static class InfNFeSupl extends br.com.ctecinf.SimpleXML {

        @br.com.ctecinf.SimpleXML.Name("qrCode")
        protected String qrCode;

        @br.com.ctecinf.SimpleXML.Name("urlChave")
        protected String urlChave;

        public InfNFeSupl() {
            super("infNFeSupl");
        }

        /**
         * Texto com o QR-Code impresso no DANFE NFC-e
         *
         * @return String
         */
        public final String getQrCode() {
            return this.qrCode;
        }

        /**
         * Texto com o QR-Code impresso no DANFE NFC-e
         *
         * @param qrCode
         */
        public final void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        /**
         * Informar a URL da "Consulta por chave de acesso da NFC-e". A mesma URL que deve estar informada no DANFE NFC-e para consulta por chave de acesso.
         *
         * @return String
         */
        public final String getUrlChave() {
            return this.urlChave;
        }

        /**
         * Informar a URL da "Consulta por chave de acesso da NFC-e". A mesma URL que deve estar informada no DANFE NFC-e para consulta por chave de acesso.
         *
         * @param urlChave
         */
        public final void setUrlChave(String urlChave) {
            this.urlChave = urlChave;
        }

    }

}