package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class UrlFetcherTest {

    @Test
    void shouldCreateConnectionFromUserSuppliedUrl() throws Exception {
        UrlFetcher fetcher = new UrlFetcher();

        assertNotNull(fetcher.fetch("http://127.0.0.1:8080"));
    }
}
