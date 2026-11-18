
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SecurityDocumentationTest {

    @Test
    void returnsSecurityExampleAsPlainText() {
        SecurityDocumentation service = new SecurityDocumentation();

        assertTrue(service.getSecurityExample().contains("SELECT"));
    }

    @Test
    void returnsDocumentationAsPlainText() {
        SecurityDocumentation service = new SecurityDocumentation();

        assertTrue(service.getDocumentation().contains("Security training example"));
    }

    @Test
    void returnsSafeWelcomeMessage() {
        SecurityDocumentation service = new SecurityDocumentation();

        assertTrue(service.getSafeMessage("Alex").contains("Welcome"));
    }
}
