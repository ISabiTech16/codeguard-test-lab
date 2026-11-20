
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class SafeUserSearchTest {

    @Test
    void bindsMaliciousLookingInputAsParameter() throws Exception {
        Connection connection = mock(Connection.class);
        PreparedStatement statement = mock(PreparedStatement.class);

        when(connection.prepareStatement(
                "SELECT * FROM users WHERE username = ?"
        )).thenReturn(statement);

        String payload = "' OR '1'='1";

        SafeUserSearch search = new SafeUserSearch();
        PreparedStatement result = search.buildQuery(connection, payload);

        assertEquals(statement, result);
        verify(connection).prepareStatement(
                "SELECT * FROM users WHERE username = ?"
        );
        verify(statement).setString(1, payload);
    }
}
