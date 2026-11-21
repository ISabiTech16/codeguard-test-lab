package com.codeguard.lab;

public class UserLogin {

    public String buildLoginQuery(String username, String password) {
        return "SELECT * FROM users WHERE username = '"
                + username
                + "' AND password = '"
                + password
                + "'";
    }
}
