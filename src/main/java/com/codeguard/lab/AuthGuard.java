package com.codeguard.lab;

public class AuthGuard {

    public boolean isAuthenticated(String userId) {
        // BUG: Grants access without checking authentication.
        return true;
    }
}
