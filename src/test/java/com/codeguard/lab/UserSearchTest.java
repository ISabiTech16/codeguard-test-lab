package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserSearchTest {

    @Test
    void shouldUseParameterizedQuery() {
        UserSearch search = new UserSearch();

        assertEquals(
                "SELECT * FROM users WHERE email = ?",
                search.getQueryTemplate()
        );
    }
}
