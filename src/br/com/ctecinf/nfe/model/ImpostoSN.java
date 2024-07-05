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
package br.com.ctecinf.nfe.model;

import br.inf.portalfiscal.nfe.TNFe;

/**
 * <b>CSOSN ICMS</b><br>
 * 101: Tributada pelo Simples Nacional com permissão de crédito<br>
 * 102: Tributada pelo Simples Nacional sem permissão de crédito<br>
 * 103: Isenção do ICMS no Simples Nacional para faixa de receita bruta<br>
 * 201: Tributada pelo Simples Nacional com permissão de crédito e com cobrança
 * do ICMS por substituição tributária<br>
 * 202: Tributada pelo Simples Nacional sem permissão de crédito e com cobrança
 * do ICMS por substituição tributária<br>
 * 203: Isenção do ICMS no Simples Nacional para faixa de receita bruta e com
 * cobrança do ICMS por substituição tributária<br>
 * 300: Imune<br>
 * 400: Não tributada pelo Simples Nacional<br>
 * 500: ICMS cobrado anteriormente por substituição tributária (substituído) ou
 * por antecipação<br>
 * 900: Outros<br>
 * <br>
 * <b>ICMS Origem</b><br>
 * 0: Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8<br>
 * 1: Estrangeira - Importação direta, exceto a indicada no código 6 <br>
 * 2: Estrangeira - Adquirida no mercado interno, exceto a indicada no código
 * 7<br>
 * 3: Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40% e
 * inferior ou igual a 70%<br>
 * 4: Nacional, cuja produção tenha sido feita em conformidade com os processos
 * produtivos básicos de que tratam as legislações citadas nos Ajustes<br>
 * 5: Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a
 * 40%<br>
 * 6: Estrangeira - Importação direta, sem similar nacional, constante em lista
 * da CAMEX e gás natural<br>
 * 7: Estrangeira - Adquirida no mercado interno, sem similar nacional,
 * constante lista CAMEX e gás natural<br>
 * 8: Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class ImpostoSN extends TNFe.Imposto {

    /**
     * ICMS SN 101, 102, 201, 202, 500 ou 900
     *
     * @param csosn <br>
     * 101: Tributada pelo Simples Nacional com permissão de crédito<br>
     * 102: Tributada pelo Simples Nacional sem permissão de crédito<br>
     * 103: Isenção do ICMS no Simples Nacional para faixa de receita bruta<br>
     * 201: Tributada pelo Simples Nacional com permissão de crédito e com
     * cobrança do ICMS por substituição tributária<br>
     * 202: Tributada pelo Simples Nacional sem permissão de crédito e com
     * cobrança do ICMS por substituição tributária<br>
     * 203: Isenção do ICMS no Simples Nacional para faixa de receita bruta e
     * com cobrança do ICMS por substituição tributária<br>
     * 300: Imune<br>
     * 400: Não tributada pelo Simples Nacional<br>
     * 500: ICMS cobrado anteriormente por substituição tributária (substituído)
     * ou por antecipação<br>
     * 900: Outros
     *
     * @param iCMSOrig<br>
     * 0: Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8<br>
     * 1: Estrangeira - Importação direta, exceto a indicada no código 6 <br>
     * 2: Estrangeira - Adquirida no mercado interno, exceto a indicada no
     * código 7<br>
     * 3: Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%
     * e inferior ou igual a 70%<br>
     * 4: Nacional, cuja produção tenha sido feita em conformidade com os
     * processos produtivos básicos de que tratam as legislações citadas nos
     * Ajustes<br>
     * 5: Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou
     * igual a 40%<br>
     * 6: Estrangeira - Importação direta, sem similar nacional, constante em
     * lista da CAMEX e gás natural<br>
     * 7: Estrangeira - Adquirida no mercado interno, sem similar nacional,
     * constante lista CAMEX e gás natural<br>
     * 8: Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%
     */
    public ImpostoSN(Integer csosn, Integer iCMSOrig) {

        TNFe.ICMS icms = new TNFe.ICMS();

        switch (csosn) {
            case 101 -> {
                TNFe.ICMSSN101 icmssn = new TNFe.ICMSSN101();
                icmssn.setCSOSN("101");
                icmssn.setOrig(String.valueOf(iCMSOrig));
                icms.setICMSSN101(icmssn);
            }
            case 102 -> {
                TNFe.ICMSSN102 icmssn = new TNFe.ICMSSN102();
                icmssn.setCSOSN("102");
                icmssn.setOrig(String.valueOf(iCMSOrig));
                icms.setICMSSN102(icmssn);
            }
            case 201 -> {
                TNFe.ICMSSN201 icmssn = new TNFe.ICMSSN201();
                icmssn.setCSOSN("201");
                icmssn.setOrig(String.valueOf(iCMSOrig));
                icms.setICMSSN201(icmssn);
            }
            case 202 -> {
                TNFe.ICMSSN202 icmssn = new TNFe.ICMSSN202();
                icmssn.setCSOSN("202");
                icmssn.setOrig(String.valueOf(iCMSOrig));
                icms.setICMSSN202(icmssn);
            }
            case 500 -> {
                TNFe.ICMSSN500 icmssn = new TNFe.ICMSSN500();
                icmssn.setCSOSN("500");
                icmssn.setOrig(String.valueOf(iCMSOrig));
                icms.setICMSSN500(icmssn);
            }
            case 900 -> {
                TNFe.ICMSSN900 icmssn = new TNFe.ICMSSN900();
                icmssn.setCSOSN("900");
                icmssn.setOrig(String.valueOf(iCMSOrig));
                icms.setICMSSN900(icmssn);
            }
        }

        TNFe.PISOutr pisnt = new TNFe.PISOutr();
        pisnt.setCST("99");
        pisnt.setQBCProd("0.0000");
        pisnt.setVAliqProd("0.0000");
        pisnt.setVPIS("0.00");

        TNFe.PIS pis = new TNFe.PIS();
        pis.setPISOutr(pisnt);

        TNFe.COFINSOutr cofinsnt = new TNFe.COFINSOutr();
        cofinsnt.setCST("99");
        cofinsnt.setQBCProd("0.0000");
        cofinsnt.setVAliqProd("0.0000");
        cofinsnt.setVCOFINS("0.00");

        TNFe.COFINS cofins = new TNFe.COFINS();
        cofins.setCOFINSOutr(cofinsnt);

        iCMS = icms;
        pIS = pis;
        cOFINS = cofins;
    }

}
