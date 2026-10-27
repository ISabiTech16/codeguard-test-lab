
package com.example.qa;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;

public class UnsafeReviewFixture {

    // TEST CASE: SQL built through string concatenation.
    public void findUser(Connection connection, String username) throws Exception {
        Statement statement = connection.createStatement();
        statement.executeQuery(
            "SELECT * FROM users WHERE username = '" + username + "'"
        );
    }

    // TEST CASE: Weak hash algorithm.
    public byte[] weakHash(byte[] input) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        return digest.digest(input);
    }

    // TEST CASE: Empty catch block.
    public void parseInput(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ignored) {
        }
    }

    // TEST CASE: Dynamic command execution.
    public Process runCommand(String command) throws Exception {
        return Runtime.getRuntime().exec(command);
    }

    // CLEAN CONTROL: Parameterized query; should not match SQL concatenation.
    public void findUserSafely(Connection connection, String username)
            throws Exception {
        var statement = connection.prepareStatement(
            "SELECT * FROM users WHERE username = ?"
        );
        statement.setString(1, username);
        statement.executeQuery();
    }

    // CLEAN CONTROL: Ordinary string handling.
    public String normalizeUsername(String username) {
        return username == null ? "" : username.trim().toLowerCase();
    }
}
