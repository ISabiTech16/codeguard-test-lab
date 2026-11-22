package com.codeguard.lab;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.XMLConstants;
import org.xml.sax.InputSource;
import java.io.StringReader;

public class XmlParser {

    public String parse(String xml) throws Exception {
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();

        factory.setFeature(
                "http://apache.org/xml/features/disallow-doctype-decl",
                false
        );
        factory.setFeature(
                "http://xml.org/sax/features/external-general-entities",
                true
        );
        factory.setFeature(
                "http://xml.org/sax/features/external-parameter-entities",
                true
        );

        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "file");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "file");

        return factory.newDocumentBuilder()
                .parse(new InputSource(new StringReader(xml)))
                .getDocumentElement()
                .getTextContent();
    }
}
