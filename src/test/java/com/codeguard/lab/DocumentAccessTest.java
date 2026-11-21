package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentAccessTest {

    @Test
    void ownerCanAccessDocument() {
        DocumentAccess access = new DocumentAccess();

        assertTrue(access.canAccessDocument("user-1", "user-1"));
    }

    @Test
    void differentUserCannotAccessDocument() {
        DocumentAccess access = new DocumentAccess();

        assertFalse(access.canAccessDocument("user-2", "user-1"));
    }
}
