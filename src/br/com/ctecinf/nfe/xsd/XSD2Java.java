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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cássio Conceição
 * @since 23/06/2024
 * @version 2406
 * @see http://ctecinf.com.br/
 */
public class XSD2Java {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser(new File("xsd"));
        fileChooser.setDialogTitle("Selecione o XSD leiaute");
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setFileFilter(new FileNameExtensionFilter("XSD file", "xsd", "XSD"));
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {

                DocType doc = new DocType(fileChooser.getSelectedFile());

                for (EnumType enumType : doc.getEnumTypes()) {

                    StringBuilder jClass = new StringBuilder();
                    jClass.append(new String(XSD2Java.class.getResourceAsStream("copyright.txt").readAllBytes(), Charset.forName("UTF-8")));
                    jClass.append("package ").append(doc.getPackageName()).append(";\n\n");
                    jClass.append(enumType.getComment(""));
                    jClass.append("public enum ").append(enumType.getClassName()).append(" {\n\n");
                    jClass.append("    ").append(enumType.getValues().stream().collect(Collectors.joining(",\n    "))).append(";\n\n");
                    jClass.append("    public String value() {\n        return name();\n    }\n\n    public static ").append(enumType.getClassName()).append(" fromValue(String v) {\n        return valueOf(v);\n    }\n\n}");

                    File file = new File("src", doc.getPackageName().replace(".", File.separator) + File.separator + enumType.getClassName() + ".java");
                    file.getParentFile().mkdirs();
                    try (PrintWriter p = new PrintWriter(new FileWriter(file))) {
                        p.write(jClass.toString());
                    }
                }

                StringBuilder jClass = null;
                String parentClass = null;
                List<String> classInners = new ArrayList();

                for (ClassType classType : doc.getClassTypes()) {

                    if (classType.isClass() && !classInners.contains(classType.getClassName())) {

                        if (classType.isRoot() && jClass != null && parentClass != null) {

                            classInners = new ArrayList();

                            jClass.append("}");

                            File file = new File("src", doc.getPackageName().replace(".", File.separator) + File.separator + parentClass + ".java");
                            file.getParentFile().mkdirs();
                            try (PrintWriter p = new PrintWriter(new FileWriter(file))) {
                                p.write(jClass.toString());
                            }

                            parentClass = classType.getClassName();

                            jClass = new StringBuilder();
                            jClass.append(new String(XSD2Java.class.getResourceAsStream("copyright.txt").readAllBytes(), Charset.forName("UTF-8"))).append("\n");
                            jClass.append("package ").append(doc.getPackageName()).append(";\n\n");
                        }

                        if (jClass == null) {
                            parentClass = classType.getClassName();
                            jClass = new StringBuilder();
                            jClass.append(new String(XSD2Java.class.getResourceAsStream("copyright.txt").readAllBytes(), Charset.forName("UTF-8"))).append("\n");
                            jClass.append("package ").append(doc.getPackageName()).append(";\n\n");
                        }

                        classInners.add(classType.getClassName());

                        jClass.append(classType.getComment(classType.isRoot() ? "" : "    "));
                        jClass.append(classType.isRoot() ? "" : "    ").append("public ").append(classType.isRoot() ? "" : "static ").append("class ").append(classType.getClassName()).append(" extends br.com.ctecinf.SimpleXML {\n");
                        StringBuilder jGetSet = new StringBuilder();
                        String attribs = classType.getAttributes().isEmpty() ? (classType.isRoot() ? ", \"xmlns=" + doc.getNamespace() + "\"" : "") : ", \"" + classType.getAttributes().stream().map(String::valueOf).collect(Collectors.joining("\", \"")) + "\"" + (classType.isRoot() ? ", \"xmlns=" + doc.getNamespace() + "\"" : "");
                        StringBuilder setAttribs = new StringBuilder();
                        for (AttributeType att : classType.getAttributes()) {
                            setAttribs.append(att.getComment(classType.isRoot() ? "" : "    " + "    ", "@param " + att.getFieldName()));
                            setAttribs.append(classType.isRoot() ? "" : "    ").append("    public final void set").append(att.getClassName()).append("(String ").append(att.getFieldName()).append(") {\n");
                            setAttribs.append(classType.isRoot() ? "" : "    ").append("        this.setAttribute(\"").append(att.getName()).append("\", ").append(att.getFieldName()).append(");\n");
                            setAttribs.append(classType.isRoot() ? "" : "    ").append("    }\n\n");
                        }
                        String jConstruct = (classType.isRoot() ? "" : "    ") + "    public " + classType.getClassName() + "() {\n" + (classType.isRoot() ? "        " : "            ") + "super(\"" + classType.getName() + "\"" + attribs + ");\n" + (classType.isRoot() ? "" : "    ") + "    }\n\n";
                        for (FieldType field : doc.getFieldTypes(classType)) {
                            String type = field.isList() ? "java.util.List<" + field.getType() + ">" : field.getType();
                            jClass.append("\n");
                            jClass.append(classType.isRoot() ? "" : "    ").append("    @br.com.ctecinf.SimpleXML.Name(\"").append(field.getName()).append("\")\n");
                            jClass.append(classType.isRoot() ? "" : "    ").append("    protected ").append(type).append(" ").append(field.getFieldName()).append(";\n");
                            jGetSet.append(field.getComment(classType.isRoot() ? "    " : "        ", "@return " + type.split("<")[0]));
                            jGetSet.append(classType.isRoot() ? "" : "    ").append("    public final ").append(type).append(" get").append(field.getClassName()).append("() {\n");
                            if (field.isList()) {
                                jGetSet.append(classType.isRoot() ? "" : "    ").append("        if(this.").append(field.getFieldName()).append(" == null) {\n");
                                jGetSet.append(classType.isRoot() ? "" : "    ").append("            this.").append(field.getFieldName()).append(" = new java.util.ArrayList();\n");
                                jGetSet.append(classType.isRoot() ? "" : "    ").append("        }\n");
                            }
                            jGetSet.append(classType.isRoot() ? "" : "    ").append("        return this.").append(field.getFieldName()).append(";\n");
                            jGetSet.append(classType.isRoot() ? "" : "    ").append("    }\n\n");
                            jGetSet.append(field.getComment(classType.isRoot() ? "    " : "        ", "@param " + field.getFieldName()));
                            jGetSet.append(classType.isRoot() ? "" : "    ").append("    public final void set").append(field.getClassName()).append("(").append(type).append(" ").append(field.getFieldName()).append(") {\n");
                            jGetSet.append(classType.isRoot() ? "" : "    ").append("        this.").append(field.getFieldName()).append(" = ").append(field.getFieldName()).append(";\n");
                            jGetSet.append(classType.isRoot() ? "" : "    ").append("    }\n\n");
                        }
                        jClass.append("\n");
                        jClass.append(jConstruct);
                        jClass.append(setAttribs);
                        jClass.append(jGetSet);
                        jClass.append(classType.isRoot() ? "" : "    }\n\n");

                    }
                }
                if (jClass != null) {

                    jClass.append("}");

                    File file = new File("src", doc.getPackageName().replace(".", File.separator) + File.separator + parentClass + ".java");
                    file.getParentFile().mkdirs();
                    try (PrintWriter p = new PrintWriter(new FileWriter(file))) {
                        p.write(jClass.toString());
                    }
                }

            } catch (XSDException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
