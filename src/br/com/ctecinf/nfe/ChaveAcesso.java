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
package br.com.ctecinf.nfe;

import br.com.ctecinf.Pad;
import br.com.ctecinf.nfe.model.NFe;
import br.inf.portalfiscal.nfe.TNFe;
import java.util.Calendar;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class ChaveAcesso {

    /**
     * Formata chave de acesso da NF-e
     *
     * @param nfe
     */
    public static void set(TNFe nfe) {

        NFe.Ide ide = nfe.getInfNFe().getIde();

        Calendar dt = DateTime.getInstance();
        /**
         * Data e hora no formato UTC (Universal Coordinated Time):
         * AAAA-MM-DDThh:mm:ssTZD
         */
        nfe.getInfNFe().getIde().setDhEmi(DateTime.format(dt));

        String yy = String.valueOf(dt.get(Calendar.YEAR));
        String mm = Pad.left(String.valueOf(dt.get(Calendar.MONTH) + 1), 2, '0');

        StringBuilder chave = new StringBuilder();

        chave.append(Pad.left(ide.getCUF(), 2, '0'));
        chave.append(Pad.left(yy.substring(2) + mm, 4, '0'));
        chave.append(Pad.left(nfe.getInfNFe().getEmit().getCNPJ(), 14, '0'));
        chave.append(Pad.left(ide.getMod(), 2, '0'));
        chave.append(Pad.left(ide.getSerie(), 3, '0'));
        chave.append(Pad.left(ide.getNNF(), 9, '0'));
        chave.append(Pad.left(ide.getTpEmis(), 1, '0'));
        chave.append(ide.getCNF());

        /**
         * Informar o DV da Chave de Acesso da NF-e, o DV será calculado com a
         * aplicação do algoritmo módulo 11 (base 2,9) da Chave de Acesso. (vide
         * item 5.4 do MOC – Visão Geral)
         */
        nfe.getInfNFe().getIde().setCDV(String.valueOf(modulo11(chave.toString())));
        chave.append(ide.getCDV());

        nfe.getInfNFe().setId("NFe" + chave.toString());
    }

    /**
     * Calcula módulo 11
     *
     * @param chave
     * @return int
     */
    public static int modulo11(String chave) {
        int total = 0;
        int peso = 2;
        for (int i = 0; i < chave.length(); i++) {
            total += (chave.charAt((chave.length() - 1) - i) - '0') * peso;
            peso++;
            if (peso == 10) {
                peso = 2;
            }
        }
        int resto = total % 11;
        return (resto == 0 || resto == 1) ? 0 : (11 - resto);
    }
}
