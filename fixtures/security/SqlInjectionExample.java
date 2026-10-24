package fixtures.security;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class SqlInjectionExample {

    private SqlInjectionExample() {
    }

    // INTENTIONAL VULNERABILITY:
    // User-controlled input is concatenated into SQL.
    public static ResultSet findUser(
            Connection connection,
            String username
    ) throws SQLException {

        String sql = "SELECT id, username FROM users WHERE username = '"
                + username + "'";

        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }
}
