package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnreadableEvidenceTest {

    @Test
    void simpleAssertionPasses() {
        assertEquals(4, 2 + 2);
    }
}
