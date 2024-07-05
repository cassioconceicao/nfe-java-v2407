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

import java.io.IOException;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class NFePgtoAntecipado extends NFe {

    public NFePgtoAntecipado(Number nnf, Number valor) throws IOException, IllegalAccessException {
        super(new IdeNFCe(nnf, NaturezaOperacao.PAGAMENTO_ANTECIPADO, 4));
        Produto produto = new Produto("CFOP5949", "00000000", "PAGAMENTO ANTECIPADO", valor.doubleValue(), "UNID", 900, 0, 5949);
        produto.setCBenef("RS052999");
        produto.setQuantidade(1);
        addProduto(produto, new ImpostoSN(produto.getCSOSN(), produto.getICMSOrig()));
    }

}
