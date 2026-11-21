package com.codeguard.lab;

public class DocumentAccess {

    public boolean canAccessDocument(
            String authenticatedUserId,
            String documentOwnerId) {

        // BUG: checks authentication but ignores ownership.
        return authenticatedUserId != null;
    }
}
