
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserSearchTest {

    @Test
    void buildsQueryWithMaliciousInput() {
        UserSearch search = new UserSearch();

        String payload = "' OR '1'='1";
        String query = search.buildQuery(payload);

        assertTrue(query.contains(payload));
    }
}
