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

import br.com.ctecinf.nfe.DateTime;
import br.com.ctecinf.Contribuinte;
import br.com.ctecinf.Pad;
import br.com.ctecinf.nfe.Constants;
import br.inf.portalfiscal.nfe.TInutNFe;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class InutNFe extends TInutNFe {

    /**
     * Inutilizar NF-e
     *
     * @param mod 55 | 65
     * @param nnfIni
     * @param nnfFim
     * @throws java.io.IOException
     * @throws java.lang.IllegalAccessException
     */
    public InutNFe(Number mod, Number nnfIni, Number nnfFim) throws IOException, IllegalAccessException {
        super.setVersao(Constants.VERSAO_NFE);

        Calendar calendar = DateTime.getInstance();

        infInut = new TInutNFe.InfInut();
        infInut.setAno(String.valueOf(calendar.get(Calendar.YEAR) - 2000));
        infInut.setMod(String.valueOf(mod));

        infInut.setCNPJ(Contribuinte.getCnpj());
        infInut.setCUF(Contribuinte.getMunicipioUFCodigo());
        infInut.setTpAmb(Contribuinte.getTpAmb());
        infInut.setSerie(Contribuinte.getSerie());

        infInut.setXJust("Falha no sistema em gerar identificador causou a quebra de sequência.");
        infInut.setXServ("INUTILIZAR");

        infInut.setNNFIni(String.valueOf(nnfIni.longValue()));

        infInut.setNNFFin(String.valueOf(nnfFim.longValue()));
        String id = "ID";
        id += Pad.left(infInut.getCUF(), 2, '0');
        id += calendar.get(Calendar.YEAR) - 2000;
        id += infInut.getCNPJ();
        id += infInut.getMod();
        id += Pad.left(infInut.getSerie(), 3, '0');
        id += Pad.left(infInut.getNNFIni(), 9, '0');
        id += Pad.left(infInut.getNNFFin(), 9, '0');
        infInut.setId(id);
    }

}
