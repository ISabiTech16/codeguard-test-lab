package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SafeUserSortTest {

    private final SafeUserSort sorter = new SafeUserSort();

    @Test
    void shouldAllowApprovedSortColumn() {
        assertEquals(
                "SELECT * FROM users ORDER BY name",
                sorter.buildQuery("name")
        );
    }

    @Test
    void shouldRejectUnapprovedSortColumn() {
        assertThrows(
                IllegalArgumentException.class,
                () -> sorter.buildQuery("name; DROP TABLE users")
        );
    }
}
