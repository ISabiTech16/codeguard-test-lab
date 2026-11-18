package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UnsafeOptionalReaderTest {

    @Test
    void emptyOptionalThrowsException() {
        UnsafeOptionalReader reader = new UnsafeOptionalReader();

        assertThrows(
            java.util.NoSuchElementException.class,
            () -> reader.read(Optional.empty())
        );
    }
}
