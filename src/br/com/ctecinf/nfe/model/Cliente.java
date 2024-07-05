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
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class Cliente extends TNFe.Dest {

    public Cliente(Number cpf, String nome, String email, Endereco endereco) {
        this(null, cpf, nome, email, endereco);
    }

    public Cliente(Object idEstrangeiro, String nome, String email, Endereco endereco) {
        this(idEstrangeiro, null, nome, email, endereco);
    }

    public Cliente(Object idEstrangeiro, Number cpf, String nome, String email, Endereco endereco) {
        if (idEstrangeiro != null) {
            this.idEstrangeiro = String.valueOf(idEstrangeiro);
        }
        if (cpf != null) {
            this.cPF = String.valueOf(cpf).replaceAll("[^0-9]+", "").trim();
        }
        if (nome != null) {
            this.xNome = nome;
        }
        if (email != null) {
            this.email = email;
        }
        if (endereco != null) {
            this.enderDest = endereco;
        }
        /**
         * 1=Contribuinte ICMS (informar a IE do destinatário);
         * <br>
         * 2=Contribuinte isento de Inscrição no cadastro de Contribuintes
         * <br>
         * 9=Não Contribuinte, que pode ou não possuir Inscrição Estadual no
         * Cadastro de Contribuintes do ICMS.
         * <br>
         * Nota 1: No caso de NFC-e informar indIEDest=9 e não informar a tag IE
         * do destinatário;
         * <br>
         * Nota 2: No caso de operação com o Exterior informar indIEDest=9 e não
         * informar a tag IE do destinatário;
         * <br>
         * Nota 3: No caso de Contribuinte Isento de Inscrição (indIEDest=2),
         * não informar a tag IE do destinatário.
         */
        this.indIEDest = "9";
    }

}
