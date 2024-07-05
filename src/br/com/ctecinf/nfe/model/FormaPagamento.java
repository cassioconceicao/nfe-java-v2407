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
public enum FormaPagamento {

    /**
     * 01: Dinheiro
     */
    TPAG_01("01", "Dinheiro"),
    /**
     * 02: Cheque
     */
    TPAG_02("02", "Cheque"),
    /**
     * 03: Cartao de Credito
     */
    TPAG_03("03", "Cartao de Credito"),
    /**
     * 04: Cartao de Debito
     */
    TPAG_04("04", "Cartao de Debito"),
    /**
     * 05: Credito Loja
     */
    TPAG_05("05", "Credito Loja"),
    /**
     * 10: Vale Alimentacao
     */
    TPAG_10("10", "Vale Alimentacao"),
    /**
     * 11: Vale Refeicao
     */
    TPAG_11("11", "Vale Refeicao"),
    /**
     * 12: Vale Presente
     */
    TPAG_12("12", "Vale Presente"),
    /**
     * 13: Vale Combustivel
     */
    TPAG_13("13", "Vale Combustivel"),
    /**
     * 15: Boleto Bancario
     */
    TPAG_15("15", "Boleto Bancario"),
    /**
     * 16: Deposito Bancario
     */
    TPAG_16("16", "Deposito Bancario"),
    /**
     * 17: Pagamento Instantaneo (PIX) - Dinâmico
     */
    TPAG_17("17", "Pagamento Instantaneo (PIX) - Dinâmico"),
    /**
     * 18: Transferencia bancaria, Carteira Digital
     */
    TPAG_18("18", "Transferencia bancaria, Carteira Digital"),
    /**
     * 19: Programa de fidelidade, Cashback, Credito Virtual
     */
    TPAG_19("19", "Programa de fidelidade, Cashback, Credito Virtual"),
    /**
     * 20: Pagamento Instantaneo (PIX) - Estático
     */
    TPAG_20("20", "Pagamento Instantâneo (PIX) - Estático"),
    /**
     * 90: Sem pagamento
     */
    TPAG_90("90", "Sem pagamento"),
    /**
     * 99: Outros
     */
    TPAG_99("99", "Outros");

    private final String codigo;
    private final String descricao;

    private FormaPagamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static FormaPagamento parse(String codigo) {
        return FormaPagamento.valueOf("TPAG_" + codigo);
    }

    @Override
    public String toString() {
        return descricao;
    }

}
