package fixtures.security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class ParameterizedQueryExample {

    private ParameterizedQueryExample() {
    }

    // SAFER CONTROL:
    // User input is passed as a parameter, not concatenated into SQL.
    public static ResultSet findUser(
            Connection connection,
            String username
    ) throws SQLException {

        String sql =
                "SELECT id, username FROM users WHERE username = ?";

        PreparedStatement statement =
                connection.prepareStatement(sql);

        statement.setString(1, username);

        return statement.executeQuery();
    }
}
