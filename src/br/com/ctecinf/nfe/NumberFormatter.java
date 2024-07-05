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

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class NumberFormatter {

    /**
     * DecimalFormat <i>BR</i> 2 dígitos
     *
     * @return Calendar
     */
    public static DecimalFormat getInstance() {
        return getInstance(2, new Locale("pt", "BR"));
    }

    /**
     * DecimalFormat <i>BR</i>
     *
     * @param digits
     * @return Calendar
     */
    public static DecimalFormat getInstance(int digits) {
        return getInstance(digits, new Locale("pt", "BR"));
    }

    /**
     * DecimalFormat
     *
     * @param digits
     * @param locale
     * @return Calendar
     */
    public static DecimalFormat getInstance(int digits, Locale locale) {
        DecimalFormat numberFormat = (DecimalFormat) DecimalFormat.getNumberInstance(locale);
        numberFormat.setMinimumFractionDigits(digits);
        numberFormat.setMaximumFractionDigits(digits);
        return numberFormat;
    }

    /**
     * Converte <i>String</i> de número para objeto <i>Number</i> 2 dígitos
     * <i>BR</i>.
     *
     * @param number
     *
     * @return Number
     * @throws br.com.ctecinf.nfe.NFeException
     */
    public static Number parse(String number) throws NFeException {
        if (number == null || number.isEmpty()) {
            return null;
        }
        try {
            return getInstance(2, new Locale("pt", "BR")).parse(number);
        } catch (ParseException ex) {
            throw new NFeException(ex);
        }
    }

    /**
     * Converte <i>Number</i> para <i>String</i> 2 dígitos <i>BR</i>.
     *
     *
     * @param number
     * @return String
     */
    public static String format(Object number) {
        if (number == null) {
            return null;
        }
        return getInstance(2, new Locale("pt", "BR")).format(number);
    }

    /**
     * Converte <i>Number</i> para <i>String</i>.
     *
     *
     * @param number
     * @param digits
     * @param locale
     * @return String
     */
    public static String format(Object number, int digits, Locale locale) {
        if (number == null) {
            return null;
        }
        return getInstance(digits, locale).format(number);
    }

    /**
     * Converte <i>Number</i> para <i>String</i> 2 dígitos <i>US</i>.
     *
     *
     * @param number
     * @return String
     */
    public static String format2Digits(Object number) {
        if (number == null) {
            return null;
        }
        return getInstance(2, Locale.US).format(number);
    }

    /**
     * Converte <i>Number</i> para <i>String</i> 4 dígitos <i>US</i>.
     *
     *
     * @param number
     * @return String
     */
    public static String format4Digits(Object number) {
        if (number == null) {
            return null;
        }
        return getInstance(4, Locale.US).format(number);
    }
}
