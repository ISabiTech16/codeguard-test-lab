package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OptionalValueReaderTest {

    @Test
    void emptyOptionalThrowsException() {
        OptionalValueReader reader = new OptionalValueReader();

        assertThrows(
            java.util.NoSuchElementException.class,
            () -> reader.readValue(Optional.empty())
        );
    }
}
