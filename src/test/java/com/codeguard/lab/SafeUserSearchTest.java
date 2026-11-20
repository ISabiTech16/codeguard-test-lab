
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SafeUserSearchTest {

    @Test
    void usesParameterizedQuery() throws Exception {
        Method method = SafeUserSearch.class.getMethod(
                "buildQuery",
                java.sql.Connection.class,
                String.class
        );

        assertTrue(method.getReturnType()
                .getName().contains("PreparedStatement"));
    }
}
