package com.codeguard.lab;

public class SqlSearch {

    public String buildQuery(String username) {
        return "SELECT * FROM users WHERE username = '" + username + "'";
    }
}
