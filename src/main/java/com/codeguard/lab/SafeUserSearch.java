
package com.codeguard.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SafeUserSearch {

    public PreparedStatement buildQuery(
            Connection connection, String username) throws SQLException {

        String sql = "SELECT * FROM users WHERE username = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);

        return statement;
    }
}
