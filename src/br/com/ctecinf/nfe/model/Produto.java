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

import br.com.ctecinf.nfe.NumberFormatter;
import java.io.IOException;

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
public class Produto extends NFe.Prod {

    private final Double valorUnitario;
    private final Integer csosn;
    private final Integer iCMSOrig;

    /**
     *
     * @param codigo
     * @param codigoNCM
     * @param descricao
     * @param valorUnitario
     * @param unidadeComercial
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
     * @param cfop
     * @throws IOException
     * @throws IllegalAccessException
     */
    public Produto(String codigo, String codigoNCM, String descricao, Double valorUnitario, String unidadeComercial, Integer csosn, Integer iCMSOrig, Integer cfop) throws IOException, IllegalAccessException {
        this(codigo, codigoNCM, descricao, valorUnitario, unidadeComercial, csosn, iCMSOrig, cfop, "SEM GTIN");
    }

    /**
     *
     * @param codigo
     * @param codigoNCM
     * @param descricao
     * @param valorUnitario
     * @param unidadeComercial
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
     * @param cfop
     * @param cean
     * @throws IOException
     * @throws IllegalAccessException
     */
    public Produto(String codigo, String codigoNCM, String descricao, Double valorUnitario, String unidadeComercial, Integer csosn, Integer iCMSOrig, Integer cfop, String cean) throws IOException, IllegalAccessException {
        cProd = codigo.trim();
        nCM = codigoNCM.trim();
        xProd = descricao.trim();
        vUnCom = NumberFormatter.format4Digits(valorUnitario);
        vUnTrib = NumberFormatter.format4Digits(valorUnitario);
        uCom = unidadeComercial.trim();
        uTrib = unidadeComercial.trim();
        cEANTrib = cean;
        indTot = "1";
        this.cEAN = cean;
        this.valorUnitario = valorUnitario;
        this.csosn = csosn;
        this.iCMSOrig = iCMSOrig;
        this.cFOP = String.valueOf(cfop);
    }

    public Produto setQuantidade(double qtde) {
        qCom = NumberFormatter.format4Digits(qtde);
        qTrib = NumberFormatter.format4Digits(qtde);
        vProd = NumberFormatter.format2Digits(valorUnitario * qtde);
        return this;
    }

    public Produto setDesconto(double desconto) {
        vDesc = NumberFormatter.format2Digits(desconto);
        return this;
    }

    public double getValor() {
        return Double.parseDouble(vProd);
    }

    public Integer getCSOSN() {
        return csosn;
    }

    public Integer getICMSOrig() {
        return iCMSOrig;
    }
}
