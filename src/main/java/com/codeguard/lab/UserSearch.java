package com.codeguard.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserSearch {

    private static final String SEARCH_SQL =
            "SELECT * FROM users WHERE email = ?";

    public PreparedStatement prepareSearch(Connection connection, String email)
            throws SQLException {

        PreparedStatement statement =
                connection.prepareStatement(SEARCH_SQL);

        statement.setString(1, email);
        return statement;
    }

    public String getQueryTemplate() {
        return SEARCH_SQL;
    }
}
