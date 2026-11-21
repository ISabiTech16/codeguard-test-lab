package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserLoginTest {

    @Test
    void shouldBuildLoginQuery() {
        UserLogin login = new UserLogin();

        String query = login.buildLoginQuery("alice", "password123");

        assertTrue(query.contains("username = 'alice'"));
        assertTrue(query.contains("password = 'password123'"));
    }
}
