
package com.codeguard.lab;

public class SecurityDocumentation {

    public String getSecurityExample() {
        return "Example only: SELECT * FROM users WHERE name = 'admin'";
    }

    public String getDocumentation() {
        return """
                Security training example:

                ```sql
                SELECT * FROM users WHERE name = 'admin';
                ```

                Never execute untrusted SQL directly.
                """;
    }

    public String getSafeMessage(String username) {
        return "Welcome, " + username;
    }
}
