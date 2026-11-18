package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SafeOptionalReaderTest {

    @Test
    void returnsValueWhenPresent() {
        assertEquals("hello",
            new SafeOptionalReader().read(Optional.of("hello")));
    }

    @Test
    void returnsDefaultWhenEmpty() {
        assertEquals("default",
            new SafeOptionalReader().read(Optional.empty()));
    }
}
