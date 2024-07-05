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
public enum CRT {

    /**
     * Simples Nacional
     */
    CRT_1("1", "Simples Nacional"),
    /**
     * Simples Nacional, excesso sublimite de receita bruta
     */
    CRT_2("2", "Simples Nacional, excesso sublimite de receita bruta"),
    /**
     * Regime Normal
     */
    CRT_3("3", "Regime Normal");

    private final String codigo;
    private final String descricao;

    private CRT(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CRT parse(String codigo) {
        return CRT.valueOf("CRT_" + codigo);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
