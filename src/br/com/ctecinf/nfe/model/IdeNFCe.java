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
 * <b>DANFE</b><br>
 * 0: Sem geração de DANFE<br>
 * 1: DANFE normal, Retrato<br>
 * 2: DANFE normal, Paisagem<br>
 * 3: DANFE Simplificado<br>
 * 4: DANFE NFC-e<br>
 * 5: DANFE NFC-e em mensagem eletrônica (o envio de mensagem eletrônica pode
 * ser feita de forma simultânea com a impressão do DANFE; usar o tpImp=5 quando
 * esta for a única forma de disponibilização do DANFE)
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class IdeNFCe extends IdeNFe {

    /**
     * DEFAULT Venda de mercadoria
     *
     * @param nnf
     * @throws IOException
     * @throws IllegalAccessException
     */
    public IdeNFCe(Number nnf) throws IOException, IllegalAccessException {
        super(nnf, NaturezaOperacao.VENDA_DE_MERCADORIA, 65, Integer.valueOf(DANFE.DANFE_4.getCodigo()));
    }

    /**
     *
     * @param nnf
     * @param naturezaOperacao
     * @throws IOException
     * @throws IllegalAccessException
     */
    public IdeNFCe(Number nnf, NaturezaOperacao naturezaOperacao) throws IOException, IllegalAccessException {
        super(nnf, naturezaOperacao, 65, Integer.valueOf(DANFE.DANFE_4.getCodigo()));
    }

    /**
     *
     * @param nnf
     * @param naturezaOperacao
     * @param danfe<br>
     * 0: Sem geração de DANFE<br>
     * 1: DANFE normal, Retrato<br>
     * 2: DANFE normal, Paisagem<br>
     * 3: DANFE Simplificado<br>
     * 4: DANFE NFC-e<br>
     * 5: DANFE NFC-e em mensagem eletrônica (o envio de mensagem eletrônica
     * pode ser feita de forma simultânea com a impressão do DANFE; usar o
     * tpImp=5 quando esta for a única forma de disponibilização do DANFE)
     * @throws IOException
     * @throws IllegalAccessException
     */
    public IdeNFCe(Number nnf, NaturezaOperacao naturezaOperacao, Integer danfe) throws IOException, IllegalAccessException {
        super(nnf, naturezaOperacao, 65, danfe);
    }
}
