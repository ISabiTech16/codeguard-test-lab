package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthGuardTest {

    private final AuthGuard authGuard = new AuthGuard();

    @Test
    void unauthenticatedUserMustBeRejected() {
        assertFalse(authGuard.isAuthenticated(null));
    }

    @Test
    void blankUserIdMustBeRejected() {
        assertFalse(authGuard.isAuthenticated(" "));
    }

    @Test
    void authenticatedUserMustBeAccepted() {
        assertTrue(authGuard.isAuthenticated("user-101"));
    }
}
