
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserSearchTest {

    @Test
    void buildsQueryForNormalUsername() {
        UserSearch search = new UserSearch();

        String query = search.buildQuery("alex");

        assertTrue(query.contains("alex"));
    }
}
