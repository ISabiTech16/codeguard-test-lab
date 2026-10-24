
package fixtures.regression;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewSecurityIssueExample {
    public ResultSet findUser(Connection connection, String username)
            throws SQLException {
        Statement statement = connection.createStatement();

        // Intentionally unsafe fixture: user input is concatenated into SQL.
        String query = "SELECT * FROM users WHERE username = '"
                + username + "'";

        return statement.executeQuery(query);
    }
}
