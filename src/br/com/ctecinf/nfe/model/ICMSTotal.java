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
public class ICMSTotal extends TNFe.Total {

    public ICMSTotal() {
        iCMSTot = new TNFe.ICMSTot();
        iCMSTot.setVBC("0.00");
        iCMSTot.setVBCST("0.00");
        iCMSTot.setVCOFINS("0.00");
        iCMSTot.setVDesc("0.00"); // Configurar para SIMPLES NACIONAL
        iCMSTot.setVFCP("0.00");
        iCMSTot.setVFCPST("0.00");
        iCMSTot.setVFCPSTRet("0.00");
        iCMSTot.setVFCPUFDest("0.00");
        iCMSTot.setVFrete("0.00");
        iCMSTot.setVICMS("0.00");
        iCMSTot.setVICMSDeson("0.00");
        iCMSTot.setVICMSUFDest("0.00");
        iCMSTot.setVICMSUFRemet("0.00");
        iCMSTot.setVII("0.00");
        iCMSTot.setVIPI("0.00");
        iCMSTot.setVIPIDevol("0.00");
        iCMSTot.setVNF("0.00"); // Configurar para SIMPLES NACIONAL
        iCMSTot.setVOutro("0.00");
        iCMSTot.setVPIS("0.00");
        iCMSTot.setVProd("0.00"); // Configurar para SIMPLES NACIONAL
        iCMSTot.setVST("0.00");
        iCMSTot.setVSeg("0.00");
    }

}
