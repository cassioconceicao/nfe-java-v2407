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
package br.com.ctecinf;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class SimpleXML {

    private StringBuilder xml;
    private final String name;
    private Map<String, String> attributes;
    private final List<SimpleXML> childNodes;

    /**
     *
     * @param name Nome da <i>TAG XML</i>.
     * @param attributes Atributos da <i>TAG XML</i>.
     */
    public SimpleXML(String name, String... attributes) {
        this.name = name;
        this.attributes = new LinkedHashMap();
        for (String attribute : attributes) {
            String[] split = attribute.split("=");
            if (split.length == 2) {
                this.attributes.put(split[0].trim(), split[1].trim());
            } else {
                this.attributes.put(attribute.trim(), "");
            }
        }
        childNodes = new ArrayList();
        xml = new StringBuilder();
    }

    /**
     *
     * @param xml <i>String</i> XML.
     * @throws java.io.IOException
     */
    public SimpleXML(File xml) throws IOException {
        this(new FileInputStream(xml));
    }

    /**
     *
     * @param xml <i>String</i> XML.
     * @throws java.io.IOException
     */
    public SimpleXML(InputStream xml) throws IOException {
        this.xml = new StringBuilder(new String(xml.readAllBytes(), StandardCharsets.UTF_8));
        name = this.xml.toString().split("\\W+")[1].trim();
        String fullTag = getFullTag(this.xml.toString(), name);
        if (fullTag != null) {
            attributes = extractAttributes(fullTag);
        } else {
            attributes = new LinkedHashMap();
        }
        childNodes = new ArrayList();
        String content = getContent(this.xml.toString(), name);
        Matcher matcher = Pattern.compile("(?:<.*?>)(.*?)(?:<\\/.*?>)").matcher(content);
        if (matcher.find()) {
            buildChildNodes(content);
        }
    }

    /**
     * Constroi nodos filhos
     *
     * @param content
     * @throws IOException
     */
    private void buildChildNodes(String content) throws IOException {
        if (content != null && !content.isEmpty()) {
            String tagName = content.split("\\W+")[1].trim();
            Matcher matcher = Pattern.compile("(?:<" + tagName + ".*?>)(.*?)(?:<\\/" + tagName + ">)").matcher(content);
            if (matcher.find()) {
                childNodes.add(new SimpleXML(new ByteArrayInputStream(matcher.group().getBytes())));
                buildChildNodes(content.replace(matcher.group(), "").trim());
            }
        }
    }

    /**
     * Verifica se o Nodo tem atributos.
     *
     * @return boolean
     */
    public boolean hasAttributes() {
        return !attributes.isEmpty();
    }

    /**
     * Verifica se o Nodo tem atributo determinado pelo nome.
     *
     * @param name Nome do atributo
     * @return boolean
     */
    public boolean hasAttribute(String name) {
        return attributes.containsKey(name);
    }

    /**
     * Verifica se o Nodo tem filhos.
     *
     * @return boolean
     */
    public boolean hasChildren() {
        return !childNodes.isEmpty();
    }

    /**
     * Pega o nome do Nodo.
     *
     * @return String Nome do Nodo.
     */
    public final String getName() {
        return name;
    }

    /**
     * Pega atributos do Nodo.
     *
     * @return Map<String, String> Atributos do Nodo
     */
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * Configura atributos
     *
     * @param attributes
     */
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Pega atributo do Nodo.
     *
     * @param name Nome do atributo.
     * @return String Valor do atributo.
     */
    public String getAttribute(String name) {
        return attributes.get(name);
    }

    /**
     * Configura atributo do Nodo.
     *
     * @param name Nome do atributo.
     * @param value Valor do atributo.
     */
    public void setAttribute(String name, String value) {
        attributes.put(name, value);
    }

    /**
     * Pega conteúdo de texto entre as <i>TAG XML</i>.
     *
     * @return String Conteúdo de texto entre as <i>TAG XML</i>.
     */
    public String getTextContent() {
        return getContent(xml.toString(), name);
    }

    /**
     * Pega lista com filhos do Nodo.
     *
     * @return List Filhos do Nodo
     */
    public List<SimpleXML> getChildrens() {
        return childNodes;
    }

    /**
     * Pega o filho com um determinado nome.
     *
     * @param name
     * @return SimpleXML Filho com um determinado nome.
     */
    public SimpleXML getChild(String name) {
        for (SimpleXML child : childNodes) {
            if (child.toString().split("\\W+")[1].trim().equalsIgnoreCase(name)) {
                return child;
            }
        }
        return null;
    }

    /**
     * Adiciona um filho
     *
     * @param content
     */
    public void addChild(SimpleXML content) {
        xml = new StringBuilder();
        childNodes.add(content);
    }

    /**
     * Lista com mesma <i>TAG</i>.
     *
     * @param name
     * @return List
     * @throws java.io.IOException
     */
    public List<SimpleXML> getList(String name) throws IOException {
        List<SimpleXML> list = new ArrayList();
        Matcher matcher = Pattern.compile("(?:<" + name + ".*?>)(.*?)(?:<\\/" + name + ">)").matcher(xml);
        while (matcher.find()) {
            list.add(new SimpleXML(new ByteArrayInputStream(matcher.group().getBytes())));
        }
        return list;
    }

    /**
     * Pega conteúdo completo da <i>TAG XML</i> nome e atributos.
     *
     * @param xml
     * @param tag
     * @return String
     */
    private String getFullTag(String xml, String tag) {
        String regex = "<" + tag + " [^>]*?(/?)>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(xml);
        if (matcher.find()) {
            return matcher.group(0).trim();
        }
        return "<" + tag + ">";
    }

    /**
     * Pega conteúdo entre <i>TAG XML</i>.
     *
     * @param xml
     * @param tag
     * @return String
     */
    private String getContent(String xml, String tag) {
        String fullTag = getFullTag(xml, tag);
        int begin = xml.indexOf(fullTag);
        int end = xml.indexOf("</" + tag + ">");
        if (begin > -1 && end > begin) {
            return xml.substring(begin, end).replace(fullTag, "").trim();
        }
        return null;
    }

    /**
     * Extrai atributos da <i>TAG XML</i>.
     *
     * @param attributes
     * @return Map<String, String>
     */
    private Map<String, String> extractAttributes(String attributes) {
        String regex = "(\\S+)=[\"']?((?:.(?![\"']?\\s+(?:\\S+)=|[>\"']))+.)[\"']?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(attributes);
        Map<String, String> attribs = new LinkedHashMap();
        while (matcher.find()) {
            int pos = matcher.group(0).indexOf("=");
            String key = matcher.group(0).substring(0, pos).trim();
            String value = matcher.group(0).substring(pos + 1).trim();
            attribs.put(key, value.startsWith("\"") || value.startsWith("'") ? value.substring(1, value.length() - 1) : value);
        }
        return attribs;
    }

    /**
     * Converte <i>String</i> XML em objeto.
     *
     * @param <T>
     * @param model
     * @param xml
     * @return T Objeto do tipo passado como parâmetro
     * @throws java.io.IOException
     */
    public static final <T extends SimpleXML> T parse(Class<T> model, String xml) throws IOException {
        model = (Class<T>) getClass(model);
        Map<String, Class> classes = new LinkedHashMap();
        for (String name : new BufferedReader(new InputStreamReader(ClassLoader.getSystemClassLoader().getResourceAsStream(model.getPackageName().replaceAll("[.]", "/")))).lines().filter(line -> line.endsWith(".class")).collect(Collectors.toList())) {
            try {
                if (name.startsWith("T")) {
                    Class cls = Class.forName(model.getPackageName() + "." + name.replace(".class", ""));
                    if (!cls.isEnum()) {
                        classes.put(((SimpleXML) cls.getDeclaredConstructor().newInstance()).getName(), cls);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
                System.err.println(ex);
            }
        }
        return xml2Object(new SimpleXML(new ByteArrayInputStream(xml.getBytes())), model, classes);
    }

    /**
     * Função recursiva para pegar campos do XML.
     *
     * @param cls
     * @return Class
     */
    protected static final Class<? extends SimpleXML> getClass(Class cls) {
        if (cls.getSuperclass().isAssignableFrom(SimpleXML.class)) {
            return cls;
        } else {
            return getClass(cls.getSuperclass());
        }
    }

    /**
     * Função recurssiva para transformar <i>String</i> XML para objeto.
     *
     * @param <T>
     * @param xml
     * @param model
     * @return T
     */
    private static <T extends SimpleXML> T xml2Object(SimpleXML xml, Class<T> model, Map<String, Class> classes) throws IOException {
        try {
            T obj = model.getConstructor().newInstance();
            obj.setAttributes(xml.getAttributes());
            for (SimpleXML children : xml.getChildrens()) {
                Field field = obj.getClass().getDeclaredField(children.getName().substring(0, 1).toLowerCase() + children.getName().substring(1));
                field.setAccessible(true);
                if (children.hasChildren()) {
                    if (field.getType().isAssignableFrom(List.class) || field.getType().isAssignableFrom(ArrayList.class)) {
                        if (field.get(obj) == null) {
                            field.set(obj, new ArrayList());
                        }
                        for (SimpleXML value : children.getList(children.getName())) {
                            ((List) field.get(obj)).add(xml2Object(value, classes.get(children.getName()), classes));
                        }
                    } else {
                        if (field.getType().isAssignableFrom(String.class)) {
                            field.set(obj, children.getTextContent());
                        } else {
                            field.set(obj, xml2Object(children, classes.get(children.getName()), classes));
                        }
                    }
                } else {
                    if (field.getType().isEnum()) {
                        field.set(obj, field.getType().getDeclaredMethod("valueOf", String.class).invoke(obj, children.getTextContent()));
                    } else {
                        field.set(obj, children.getTextContent());
                    }
                }
            }
            return obj;
        } catch (IOException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            throw new IOException(ex);
        }
    }

    @Override
    public String toString() {

        if (xml.isEmpty()) {

            xml.append("<").append(name);

            if (!attributes.isEmpty()) {
                xml.append(" ").append(attributes.keySet().stream().map(key -> key + "=\"" + attributes.get(key) + "\"").collect(Collectors.joining(" ")));
            }

            StringBuilder fields = new StringBuilder();
            if (childNodes.isEmpty()) {
                for (Field field : getClass(getClass()).getDeclaredFields()) {
                    if (field.getModifiers() == Modifier.PROTECTED) {
                        field.setAccessible(true);
                        Object value = null;
                        try {
                            value = field.get(this);
                        } catch (IllegalAccessException | IllegalArgumentException ex) {
                            System.err.println(ex);
                        }
                        if (value != null && (field.getType().isAssignableFrom(List.class) || field.getType().isAssignableFrom(ArrayList.class))) {
                            for (Object val : (List) value) {
                                fields.append((val instanceof String || val instanceof Enum ? ("<" + (field.isAnnotationPresent(Name.class) ? field.getAnnotation(Name.class).value() : field.getName()) + ">" + val + "</" + (field.isAnnotationPresent(Name.class) ? field.getAnnotation(Name.class).value() : field.getName()) + ">") : val));
                            }
                        } else if (value != null && !value.toString().isEmpty()) {
                            fields.append((value instanceof String || value instanceof Enum ? ("<" + (field.isAnnotationPresent(Name.class) ? field.getAnnotation(Name.class).value() : field.getName()) + (field.getName().equalsIgnoreCase("signature") ? " xmlns=\"http://www.w3.org/2000/09/xmldsig#\"" : "") + ">" + value + "</" + (field.isAnnotationPresent(Name.class) ? field.getAnnotation(Name.class).value() : field.getName()) + ">") : value));
                        }
                    }
                }
            } else {
                for (SimpleXML child : childNodes) {
                    fields.append(child);
                }
            }

            if (fields.isEmpty()) {
                xml.append("/>");
            } else {
                xml.append(">");
                xml.append(fields);
                xml.append("</").append(name).append(">");
            }
        }

        return xml.toString();
    }

    @Retention(value = RetentionPolicy.RUNTIME)
    @Target(value = {ElementType.FIELD})
    public static @interface Name {

        public String value();
    }
}
