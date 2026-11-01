package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NullInputHandlerTest {

    @Test
    void normalizesRegularInput() {
        assertEquals("hello", new NullInputHandler().normalize(" HELLO "));
    }

    @Test
    void nullInputThrowsNullPointerException() {
        assertThrows(
            NullPointerException.class,
            () -> new NullInputHandler().normalize(null)
        );
    }
}
