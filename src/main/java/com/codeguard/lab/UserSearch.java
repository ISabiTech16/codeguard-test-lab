
package com.codeguard.lab;

public class UserSearch {

    public String buildQuery(String username) {
        return "SELECT * FROM users WHERE username = '" + username + "'";
    }
}
