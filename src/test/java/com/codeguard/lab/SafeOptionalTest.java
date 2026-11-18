package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SafeOptionalTest {

    @Test
    void safelyReadsPresentValue() {
        Optional<String> value = Optional.of("hello");
        assertEquals("hello", value.orElse("fallback"));
    }
}
