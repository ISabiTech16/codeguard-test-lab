package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FileAccessTest {

    @Test
    void shouldRejectPathTraversal() {
        FileAccess access = new FileAccess();

        assertThrows(IllegalArgumentException.class,
                () -> access.getFile("../../etc/passwd"));
    }
}
