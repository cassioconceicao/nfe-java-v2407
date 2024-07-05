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
public enum Cartao {

    /**
     * Visa
     */
    CARD_01("01", "Visa", "01425787000104"),
    /**
     * Mastercard
     */
    CARD_02("02", "Mastercard", "01425787000104"),
    /**
     * American Express
     */
    CARD_03("03", "American Express", "60419645000195"),
    /**
     * Sorocred
     */
    CARD_04("04", "Sorocred", "60114865000100"),
    /**
     * Diners Club
     */
    CARD_05("05", "Diners Club", "01425787000104"),
    /**
     * Elo
     */
    CARD_06("06", "Elo", "01425787000104"),
    /**
     * Hipercard
     */
    CARD_07("07", "Hipercard", "01425787000104"),
    /**
     * Aura
     */
    CARD_08("08", "Aura", "03722919000187"),
    /**
     * Cabal
     */
    CARD_09("09", "Cabal", "03766873000106"),
    /**
     * Banricompras
     */
    CARD_10("99", "Banricompras", Cartao.CNPJ_BANRISUL),
    /**
     * Verdcard
     */
    CARD_11("99", "Vardecard", Cartao.CNPJ_VERDECARD);

    public static final String CNPJ_BANRISUL = "92934215000106";
    public static final String CNPJ_VERDECARD = "01722480000167";

    private final String codigo;
    private final String descricao;
    private final String cnpj;

    private Cartao(String codigo, String descricao, String cnpj) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cnpj = cnpj;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public static Cartao parse(String codigo, String cnpj) {
        if (codigo.equals("99")) {
            return switch (cnpj) {
                case Cartao.CNPJ_BANRISUL ->
                    Cartao.CARD_10;
                case Cartao.CNPJ_VERDECARD ->
                    Cartao.CARD_11;
                default ->
                    null;
            };
        } else {
            return Cartao.valueOf("CARD_" + codigo);
        }
    }

    @Override
    public String toString() {
        return descricao;
    }
}
