/*
 * Copyright (C) 2024 ctecinf.com.br
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
package br.com.ctecinf.nfe.xsd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.w3c.dom.Node;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class EnumType extends AbstractType {

    private final List<String> values;

    public EnumType(List<String> values, Node node) {
        super(node);
        this.values = values;
    }

    @Override
    public String getComment(String tab, String... params) {
        String annotation = super.getAnnotation(node);
        return annotation == null ? "" : tab + "/**\n" + tab + " * " + Arrays.asList(annotation.split("\n")).stream().collect(Collectors.joining("<br>\n" + tab + " * ")) + "\n" + tab + (params.length > 0 ? " *\n" + tab + " * " + Arrays.asList(params).stream().collect(Collectors.joining("\n" + tab + " * ")) + "\n" + tab : "") + " */\n";
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return getClassName() + values;
    }

}
