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
public class XSD2PHP {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser(new File("xsd"));
        fileChooser.setDialogTitle("Selecione o XSD leiaute");
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setFileFilter(new FileNameExtensionFilter("XSD file", "xsd", "XSD"));
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {

                DocType doc = new DocType(fileChooser.getSelectedFile());

                StringBuilder jClass = null;
                String parentClass = null;
                List<String> classInners = new ArrayList();

                for (ClassType classType : doc.getClassTypes()) {

                    if (classType.isClass() && !classInners.contains(classType.getClassName())) {

                        if (classType.isRoot() && jClass != null && parentClass != null) {

                            classInners = new ArrayList();

                            jClass.append("}");

                            File file = new File("src", "nfe" + File.separator + parentClass + ".php");
                            file.getParentFile().mkdirs();
                            try (PrintWriter p = new PrintWriter(new FileWriter(file))) {
                                p.write(jClass.toString());
                            }

                            parentClass = classType.getClassName();

                            jClass = new StringBuilder("<?php\n\nrequire_once __DIR__ . '/SimpleXML.php';\n\n");
                            jClass.append(new String(XSD2PHP.class.getResourceAsStream("copyright.txt").readAllBytes(), Charset.forName("UTF-8"))).append("\n");
                        }

                        if (jClass == null) {
                            parentClass = classType.getClassName();
                            jClass = new StringBuilder("<?php\n\nrequire_once __DIR__ . '/SimpleXML.php';\n\n");
                            jClass.append(new String(XSD2PHP.class.getResourceAsStream("copyright.txt").readAllBytes(), Charset.forName("UTF-8"))).append("\n");
                        }

                        classInners.add(classType.getClassName());

                        jClass.append(classType.getComment(classType.isRoot() ? "" : "    "));
                        jClass.append(classType.isRoot() ? "" : "    ");
                        if(classType.isRoot()) {
                            jClass.append("class ").append(classType.getClassName()).append(" extends SimpleXML {\n");
                        } else {
                            jClass.append("public function ").append(classType.getFieldName()).append("() {\n        return new class() extends SimpleXML {\n");
                        }
                        StringBuilder jGetSet = new StringBuilder();
                        String attribs = classType.getAttributes().isEmpty() ? (classType.isRoot() ? ", array(\"xmlns\" => \"" + doc.getNamespace() + "\")" : "") : ", array(\"" + classType.getAttributes().stream().map(String::valueOf).collect(Collectors.joining("\" => \"\", \"")) + "\" => \"\"" + (classType.isRoot() ? ", \"xmlns\" => \"" + doc.getNamespace() + "\"" : "") + ")";
                        StringBuilder setAttribs = new StringBuilder();
                        for (AttributeType att : classType.getAttributes()) {
                            setAttribs.append(att.getComment(classType.isRoot() ? "" : "        " + "    ", "@param $" + att.getFieldName()));
                            setAttribs.append(classType.isRoot() ? "" : "        ").append("    public function set").append(att.getClassName()).append("(string $").append(att.getFieldName()).append(") {\n");
                            setAttribs.append(classType.isRoot() ? "" : "        ").append("        $this->setAttribute(\"").append(att.getName()).append("\", $").append(att.getFieldName()).append(");\n");
                            setAttribs.append(classType.isRoot() ? "" : "        ").append("    }\n\n");
                        }
                        String jConstruct = (classType.isRoot() ? "" : "        ") + "    public function __construct() {\n" + (classType.isRoot() ? "        " : "                ") + "parent::__construct(\"" + classType.getName() + "\"" + attribs + ");\n" + (classType.isRoot() ? "" : "        ") + "    }\n\n";
                        for (FieldType field : doc.getFieldTypes(classType)) {
                            String type = field.isList() ? "array" : (field.getType().equals("String") ? "string" : "SimpleXML");
                            jClass.append("\n");
                            jClass.append(classType.isRoot() ? "" : "        ").append("    /**\n").append(classType.isRoot() ? "" : "        ").append("     * @name ").append(field.getName()).append("\n").append(classType.isRoot() ? "" : "        ").append("     */\n");
                            jClass.append(classType.isRoot() ? "" : "        ").append("    protected ").append(type).append(" $").append(field.getFieldName()).append(field.isList() ? " = array();\n" : ";\n");
                            jGetSet.append(field.getComment(classType.isRoot() ? "    " : "            ", "@return " + type));
                            jGetSet.append(classType.isRoot() ? "" : "        ").append("    public function get").append(field.getClassName()).append("() {\n");
                            jGetSet.append(classType.isRoot() ? "" : "        ").append("        return $this->").append(field.getFieldName()).append(";\n");
                            jGetSet.append(classType.isRoot() ? "" : "        ").append("    }\n\n");
                            jGetSet.append(field.getComment(classType.isRoot() ? "    " : "            ", "@param $" + field.getFieldName()));
                            jGetSet.append(classType.isRoot() ? "" : "        ").append("    public function set").append(field.getClassName()).append("(").append(type).append(" $").append(field.getFieldName()).append(") {\n");
                            jGetSet.append(classType.isRoot() ? "" : "        ").append("        $this->").append(field.getFieldName()).append(" = $").append(field.getFieldName()).append(";\n");
                            jGetSet.append(classType.isRoot() ? "" : "        ").append("    }\n\n");
                        }
                        jClass.append("\n");
                        jClass.append(jConstruct);
                        jClass.append(setAttribs);
                        jClass.append(jGetSet);
                        jClass.append(classType.isRoot() ? "" : "        };\n    }\n\n");

                    }
                }
                if (jClass != null) {

                    jClass.append("}");

                    File file = new File("src", "nfe" + File.separator + parentClass + ".php");
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
