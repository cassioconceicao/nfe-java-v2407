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
public enum CStat {

    /**
     * Autorizado o uso da NF-e
     */
    CSTAT_100("100", "Autorizado o uso da NF-e"),
    /**
     * Cancelamento de NF-e homologado
     */
    CSTAT_101("101", "Cancelamento de NF-e homologado"),
    /**
     * Inutilização de número homologado
     */
    CSTAT_102("102", "Inutilização de número homologado"),
    /**
     * Lote recebido com sucesso
     */
    CSTAT_103("103", "Lote recebido com sucesso"),
    /**
     * Lote processado
     */
    CSTAT_104("104", "Lote processado"),
    /**
     * Lote em processamento
     */
    CSTAT_105("105", "Lote em processamento"),
    /**
     * Lote não localizado
     */
    CSTAT_106("106", "Lote não localizado"),
    /**
     * Serviço em Operação
     */
    CSTAT_107("107", "Serviço em Operação"),
    /**
     * Serviço Paralisado Momentaneamente (curto prazo)
     */
    CSTAT_108("108", "Serviço Paralisado Momentaneamente (curto prazo)"),
    /**
     * Serviço Paralisado sem Previsão
     */
    CSTAT_109("109", "Serviço Paralisado sem Previsão"),
    /**
     * Uso Denegado
     */
    CSTAT_110("110", "Uso Denegado"),
    /**
     * Consulta cadastro com uma ocorrência
     */
    CSTAT_111("111", "Consulta cadastro com uma ocorrência"),
    /**
     * Consulta cadastro com mais de uma ocorrência
     */
    CSTAT_112("112", "Consulta cadastro com mais de uma ocorrência"),
    /**
     * EPEC Autorizado
     */
    CSTAT_124("124", "EPEC Autorizado"),
    /**
     * Lote de Evento Processado
     */
    CSTAT_128("128", "Lote de Evento Processado"),
    /**
     * Evento registrado e vinculado a NF-e
     */
    CSTAT_135("135", "Evento registrado e vinculado a NF-e"),
    /**
     * Evento registrado, mas não vinculado a NF-e
     */
    CSTAT_136("136", "Evento registrado, mas não vinculado a NF-e"),
    /**
     * Nenhum documento localizado para o Destinatário
     */
    CSTAT_137("137", "Nenhum documento localizado para o Destinatário"),
    /**
     * Documento localizado para o Destinatário
     */
    CSTAT_138("138", "Documento localizado para o Destinatário"),
    /**
     * Pedido de Download processado
     */
    CSTAT_139("139", "Pedido de Download processado"),
    /**
     * Download disponibilizado
     */
    CSTAT_140("140", "Download disponibilizado"),
    /**
     * Ambiente de Contingência EPEC bloqueado para o Emitente
     */
    CSTAT_142("142", "Ambiente de Contingência EPEC bloqueado para o Emitente"),
    /**
     * Autorizado o uso da NF-e, autorização fora de prazo
     */
    CSTAT_150("150", "Autorizado o uso da NF-e, autorização fora de prazo"),
    /**
     * Cancelamento de NF-e homologado fora de prazo
     */
    CSTAT_151("151", "Cancelamento de NF-e homologado fora de prazo");

    private final String codigo;
    private final String descricao;

    private CStat(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CStat parse(String codigo) {
        return CStat.valueOf("CSTAT_" + codigo);
    }

    @Override
    public String toString() {
        return descricao;
    }

}
