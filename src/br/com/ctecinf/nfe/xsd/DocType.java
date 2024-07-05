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

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class DocType {

    protected Document document;
    protected String prefix = "";
    protected String signPrefix = "";
    protected String namespace = "";
    protected String comment = "";
    protected String packageName = "";
    protected List<ClassType> classTypes;
    protected List<EnumType> enumTypes;
    protected List<String> types;

    public DocType(File file) throws XSDException {

        try {

            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            types = new ArrayList();
            enumTypes = new ArrayList();
            classTypes = new ArrayList();

            buildDoc(document, file);

        } catch (IOException | ParserConfigurationException | DOMException | SAXException ex) {
            throw new XSDException(ex);
        }
    }

    private void buildDoc(Document doc, File file) throws XSDException {

        NodeList list = doc.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            if (list.item(i).getNodeType() == Node.COMMENT_NODE) {
                comment += list.item(i).getNodeValue() == null ? "" : list.item(i).getNodeValue().trim() + "\n";
            } else if (list.item(i).getNodeType() == Node.ELEMENT_NODE && list.item(i).getNodeName().contains("schema")) {

                if (list.item(i).getNodeName().contains(":")) {
                    prefix = list.item(i).getNodeName().split(":")[0].trim() + ":";
                }

                if (((Element) list.item(i)).hasAttribute("targetNamespace")) {
                    namespace = ((Element) list.item(i)).getAttribute("targetNamespace");
                }

                NamedNodeMap attribs = list.item(i).getAttributes();
                for (int j = 0; j < attribs.getLength(); j++) {
                    if (attribs.item(j).getNodeValue().equals("http://www.w3.org/2000/09/xmldsig#") && attribs.item(j).getNodeName().contains(":")) {
                        signPrefix = attribs.item(j).getNodeName().split(":")[1].trim() + ":";
                    }
                }

                NodeList include = list.item(i).getChildNodes();
                for (int j = 0; j < include.getLength(); j++) {
                    if (include.item(j).getNodeType() == Node.ELEMENT_NODE && include.item(j).getNodeName().equals(prefix + "include") && getElement(include.item(j)).hasAttribute("schemaLocation")) {
                        DocType docInclude = new DocType(new File(file.getParentFile(), getElement(include.item(j)).getAttribute("schemaLocation")));
                        buildDoc(docInclude.getDocument(), file);
                    }
                }

                buildEnumClass(doc);
            }
        }
    }

    private void buildEnumClass(Document doc) {

        NodeList simple = doc.getElementsByTagName(prefix + "simpleType");
        for (int i = 0; i < simple.getLength(); i++) {
            if (simple.item(i).getNodeType() == Node.ELEMENT_NODE && getElement(simple.item(i)).hasAttribute("name")) {
                List<String> enums = getEnums(simple.item(i));
                if (!enums.isEmpty()) {
                    enumTypes.add(new EnumType(enums, simple.item(i)));
                    types.add(getElement(simple.item(i)).getAttribute("name"));
                }
            }
        }

        NodeList complex = doc.getElementsByTagName(prefix + "complexType");
        for (int i = 0; i < complex.getLength(); i++) {
            if (complex.item(i).getNodeType() == Node.ELEMENT_NODE) {
                ClassType classType = new ClassType(complex.item(i));
                types.add(classType.getClassName());
                classTypes.add(classType);
                if (packageName.isEmpty()) {
                    try {
                        URL url = new URL(namespace);
                        List<String> host = Arrays.asList(url.getHost().replace("www.", "").replace(".", ";").split(";"));
                        Collections.reverse(host);
                        packageName = host.stream().collect(Collectors.joining(".")) + ".nfe";
                    } catch (MalformedURLException ex) {
                        packageName = "br.com.ctecinf.nfe.model";
                    }
                }
            }
        }
    }

    private List<FieldType> getFields(Node node) {
        NodeList nodeList = node.getChildNodes();
        List<FieldType> list = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                if (nodeList.item(i).getNodeName().contains("sequence") || nodeList.item(i).getNodeName().contains("choice")) {
                    list.addAll(getFields(nodeList.item(i)));
                } else if (nodeList.item(i).hasAttributes()) {
                    list.add(new FieldType(nodeList.item(i), types));
                }
            }
        }
        return list;
    }

    private List<FieldType> buildFields(Node node) {
        NodeList nodeList = node.getChildNodes();
        List<FieldType> list = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE && (nodeList.item(i).getNodeName().contains("sequence") || nodeList.item(i).getNodeName().contains("choice"))) {
                list.addAll(getFields(nodeList.item(i)));
            }
        }
        return list.stream().distinct().collect(Collectors.toList());
    }

    private List<String> getEnums(Node node) {
        List<String> list = new ArrayList();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE && nodeList.item(i).getNodeName().equals(prefix + "restriction")) {
                NodeList enums = nodeList.item(i).getChildNodes();
                for (int j = 0; j < enums.getLength(); j++) {
                    if (enums.item(j).getNodeType() == Node.ELEMENT_NODE && enums.item(j).getNodeName().equals(prefix + "enumeration") && getElement(enums.item(j)).hasAttribute("value") && !pattern.matcher(getElement(enums.item(j)).getAttribute("value")).matches()) {
                        list.add(getElement(enums.item(j)).getAttribute("value"));
                    }
                }
            }
        }
        return list;
    }

    private Element getElement(Node node) {
        return (Element) node;
    }

    public Document getDocument() {
        return document;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSignPrefix() {
        return signPrefix;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getComment() {
        return comment;
    }

    public List<ClassType> getClassTypes() {
        return classTypes;
    }

    public List<EnumType> getEnumTypes() {
        return enumTypes;
    }

    public List<FieldType> getFieldTypes(ClassType classType) {
        return buildFields(classType.getElement());
    }

    public List<String> getTypes() {
        return types;
    }

    public String getPackageName() {
        return packageName;
    }

}
