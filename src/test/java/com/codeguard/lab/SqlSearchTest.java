package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqlSearchTest {

    @Test
    void shouldBuildQueryWithUsername() {
        SqlSearch search = new SqlSearch();

        String query = search.buildQuery("admin");

        assertEquals(
            "SELECT * FROM users WHERE username = 'admin'",
            query
        );
    }

    @Test
    void shouldExposeSqlInjectionPayload() {
        SqlSearch search = new SqlSearch();

        String query = search.buildQuery("' OR '1'='1");

        assertTrue(query.contains("' OR '1'='1"));
    }
}
