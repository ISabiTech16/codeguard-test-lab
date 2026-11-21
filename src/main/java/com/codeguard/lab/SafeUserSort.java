package com.codeguard.lab;

import java.util.Set;

public class SafeUserSort {

    private static final Set<String> ALLOWED_COLUMNS =
            Set.of("name", "email", "created_at");

    public String buildQuery(String sortColumn) {
        if (!ALLOWED_COLUMNS.contains(sortColumn)) {
            throw new IllegalArgumentException("Invalid sort column");
        }

        return "SELECT * FROM users ORDER BY " + sortColumn;
    }
}
