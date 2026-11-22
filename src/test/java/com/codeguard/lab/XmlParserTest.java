package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XmlParserTest {

    @Test
    void shouldResolveExternalEntity() throws Exception {
        Path secret = Files.createTempFile("xxe-test", ".txt");
        Files.writeString(secret, "XXE_SECRET_43");

        String xml = """
                <!DOCTYPE root [
                  <!ENTITY secret SYSTEM "%s">
                ]>
                <root>&secret;</root>
                """.formatted(secret.toUri());

        String result = new XmlParser().parse(xml);

        assertEquals("XXE_SECRET_43", result);
    }
}
