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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class DateTime {

    public static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

    /**
     * Timestamp agora
     *
     * @return Calendar
     */
    public static Calendar getInstance() {
        return Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("America/Sao_Paulo")), new Locale("pt", "BR"));
    }

    /**
     * OffSet horário de verão
     *
     * @param calendar
     * @return String
     */
    public static String getOffSet(Calendar calendar) {
        return calendar.get(Calendar.DST_OFFSET) == 0 ? "'-03:00'" : "'-02:00'";
    }

    /**
     * DateFormat
     *
     * @param calendar
     * @return DateFormat
     */
    public static DateFormat getDateFormat(Calendar calendar) {
        return new SimpleDateFormat(PATTERN + DateTime.getOffSet(calendar));
    }

    /**
     * Converte <i>String</i> de data para objeto <i>Calendar</i>.
     *
     * @param date
     *
     * @return java.util.Calendar
     * @throws br.com.ctecinf.nfe.NFeException
     */
    public static Calendar parse(String date) throws NFeException {
        if (date == null || date.isEmpty()) {
            return DateTime.getInstance();
        }
        Calendar calendar = Calendar.getInstance(new Locale("pt", "BR"));
        Date dt = null;
        try {
            dt = DateTime.getDateFormat(calendar).parse(date.replace("-03:00", "").replace("-02:00", ""));
        } catch (ParseException ex) {
            throw new NFeException(ex);
        }
        calendar.setTime(dt);
        return calendar;
    }

    /**
     * Converte objeto <i>Calendar</i> para <i>String</i>.
     *
     *
     * @param calendar
     * @return java.util.Calendar
     */
    public static String format(Calendar calendar) {
        if (calendar == null) {
            calendar = DateTime.getInstance();
        }
        return DateTime.getDateFormat(calendar).format(calendar.getTime());
    }
}
