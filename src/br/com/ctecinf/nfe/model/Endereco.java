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

import br.inf.portalfiscal.nfe.TEndereco;
import br.inf.portalfiscal.nfe.TUf;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class Endereco extends TEndereco {

    public Endereco() {
    }

    public Endereco(Number cep, Number cMun, String xMun, String uf, String xBairro, Number nro, String xCpl, String xLgr, Number fone) {
        this.setCep(cep);
        this.setcMun(cMun);
        this.setxMun(xMun);
        this.setUf(uf);
        this.setxBairro(xBairro);
        this.setNro(nro);
        this.setxCpl(xCpl);
        this.setxLgr(xLgr);
        this.setFone(fone);
    }

    public final void setCep(Number cep) {
        if (cep != null) {
            this.cEP = String.valueOf(cep);
        }
    }

    public final void setcMun(Number cMun) {
        if (cMun != null) {
            this.cMun = String.valueOf(cMun);
        }
    }

    public final void setxMun(String xMun) {
        if (xMun != null) {
            this.xMun = xMun;
        }
    }

    /**
     *
     * @param uf RS,SC,PR,SP,RJ,...
     */
    public final void setUf(String uf) {
        if (uf != null) {
            this.uF = TUf.valueOf(uf);
        }
    }

    public final void setxBairro(String xBairro) {
        if (xBairro != null) {
            this.xBairro = xBairro;
        }
    }

    public final void setNro(Number nro) {
        if (nro != null) {
            this.nro = String.valueOf(nro);
        }
    }

    public final void setxCpl(String xCpl) {
        if (xCpl != null) {
            this.xCpl = xCpl;
        }
    }

    public final void setxLgr(String xLgr) {
        if (xLgr != null) {
            this.xLgr = xLgr;
        }
    }

    public final void setFone(Number fone) {
        if (fone != null) {
            this.fone = String.valueOf(fone);
        }
    }

}
