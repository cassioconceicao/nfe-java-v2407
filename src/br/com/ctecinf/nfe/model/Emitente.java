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

import br.com.ctecinf.Contribuinte;
import br.inf.portalfiscal.nfe.TEnderEmi;
import br.inf.portalfiscal.nfe.TNFe;
import br.inf.portalfiscal.nfe.TUfEmi;
import java.io.IOException;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class Emitente extends TNFe.Emit {

    public Emitente() throws IOException, IllegalAccessException {

        this.cNPJ = Contribuinte.getCnpj();
        this.xFant = Contribuinte.getNomeFantasia();
        this.xNome = Contribuinte.getRazaoSocial();
        this.iE = Contribuinte.getInscricaoEstadual();
        this.cRT = Contribuinte.getCRT();

        this.enderEmit = new TEnderEmi();
        enderEmit.setCEP(Contribuinte.getCep());
        enderEmit.setCMun(Contribuinte.getMunicipioCodigo());
        enderEmit.setFone(Contribuinte.getFone());
        enderEmit.setNro(Contribuinte.getNumero());
        enderEmit.setUF(TUfEmi.valueOf(Contribuinte.getMunicipioUFSigla()));
        enderEmit.setXBairro(Contribuinte.getBairro());
        enderEmit.setXCpl(Contribuinte.getComplemento());
        enderEmit.setXLgr(Contribuinte.getLogradouro());
        enderEmit.setXMun(Contribuinte.getMunicipioDescricao());
    }

}
