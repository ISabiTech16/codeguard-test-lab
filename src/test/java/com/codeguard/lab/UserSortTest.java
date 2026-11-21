
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserSortTest {

    @Test
    void buildsQueryUsingRequestedSortColumn() {
        UserSort sort = new UserSort();

        String query = sort.buildQuery("username");

        assertTrue(query.contains("username"));
    }
}
