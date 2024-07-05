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
import br.com.ctecinf.nfe.Constants;
import br.com.ctecinf.nfe.DateTime;
import br.inf.portalfiscal.nfe.TEvento;
import java.io.IOException;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class EventoCanc extends TEvento {

    private Number idLote;

    public EventoCanc(Number idLote, Number nProt, String chaveAcesso, String justificativa) throws IOException, IllegalAccessException {

        this.idLote = idLote;
        this.setVersao(Constants.VERSAO_EVENTO);

        String id = "ID110111" + chaveAcesso.replace("NFe", "").trim() + "01";

        TEvento.DetEvento detEvento = new TEvento.DetEvento();
        detEvento.setVersao(Constants.VERSAO_EVENTO);
        detEvento.setNProt(nProt.toString().trim());
        detEvento.setDescEvento("Cancelamento");
        detEvento.setXJust(justificativa.trim());

        infEvento = new TEvento.InfEvento();
        infEvento.setVerEvento(Constants.VERSAO_EVENTO);
        infEvento.setId(id);
        infEvento.setDhEvento(DateTime.format(DateTime.getInstance()));
        infEvento.setChNFe(chaveAcesso.replace("NFe", "").trim());
        infEvento.setCNPJ(Contribuinte.getCnpj());
        infEvento.setCOrgao(Contribuinte.getMunicipioUFCodigo());
        infEvento.setTpAmb(Contribuinte.getTpAmb());
        infEvento.setTpEvento("110111");
        infEvento.setDetEvento(detEvento);
        infEvento.setNSeqEvento("1");
    }

    public String getIdLote() {
        return String.valueOf(idLote);
    }

    public void setIdLote(Number idLote) {
        this.idLote = idLote;
    }

}
