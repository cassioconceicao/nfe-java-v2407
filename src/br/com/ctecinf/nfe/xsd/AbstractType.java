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

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public abstract class AbstractType {

    protected final Node node;

    public AbstractType(Node node) {
        this.node = node;
    }

    public final Element getElement() {
        return (Element) node;
    }

    public String getName() {
        String str = getElement().hasAttribute("ref") ? getElement().getAttribute("ref").split(":")[1].trim() : getElement().hasAttribute("name") ? (getElement().getAttribute("name").startsWith("T") ? getElement().getAttribute("name").substring(1).substring(0, 1).toLowerCase() + getElement().getAttribute("name").substring(2) : getElement().getAttribute("name")) : ((Element) getElement().getParentNode()).getAttribute("name");
        return str.equals("nFe") ? "NFe" : str;
    }

    public String getEnumName() {
        return getClassName();
    }

    public String getClassName() {
        return getName().isEmpty() ? "" : getElement().hasAttribute("name") ? getElement().getAttribute("name").substring(0, 1).toUpperCase() + getElement().getAttribute("name").substring(1) : getName().substring(0, 1).toUpperCase() + getName().substring(1);
    }

    public String getFieldName() {
        return getName().isEmpty() ? "" : getName().substring(0, 1).toLowerCase() + getName().substring(1);
    }

    public boolean isClass() {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeName().contains("complexType")) {
                return true;
            }
        }
        return node.getNodeName().contains("complexType");
    }

    public boolean hasComment() {
        return getComment("", "").isEmpty();
    }

    protected String getAnnotation(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE && nodeList.item(i).getNodeName().contains("annotation")) {
                return nodeList.item(i).getTextContent().trim();
            }
        }
        return null;
    }

    public abstract String getComment(String tab, String... params);

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == null || !obj.getClass().equals(this.getClass()) ? false : obj.toString().equalsIgnoreCase(this.toString());
    }
}
