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

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public enum DANFE {

    /**
     * 0: Sem geração de DANFE
     */
    DANFE_0("0", "Sem geração de DANFE"),
    /**
     * 1: DANFE normal, Retrato
     */
    DANFE_1("1", "DANFE normal, Retrato"),
    /**
     * 2: DANFE normal, Paisagem
     */
    DANFE_2("2", "DANFE normal, Paisagem"),
    /**
     * 3: DANFE Simplificado
     */
    DANFE_3("3", "DANFE Simplificado"),
    /**
     * 4: DANFE NFC-e
     */
    DANFE_4("4", "DANFE NFC-e"),
    /**
     * 5: DANFE NFC-e em mensagem eletrônica (o envio de mensagem eletrônica pode ser feita de forma simultânea com a impressão do DANFE; usar o tpImp=5 quando esta for a única forma de disponibilização do DANFE)
     */
    DANFE_5("5", "DANFE NFC-e em mensagem eletrônica (o envio de mensagem eletrônica pode ser feita de forma simultânea com a impressão do DANFE; usar o tpImp=5 quando esta for a única forma de disponibilização do DANFE)");

    private final String codigo;
    private final String descricao;

    private DANFE(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static DANFE parse(String codigo) {
        return DANFE.valueOf("DANFE_" + codigo);
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
