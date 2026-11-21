
package com.codeguard.lab;

public class UserSort {

    public String buildQuery(String sortColumn) {
        return "SELECT * FROM users ORDER BY " + sortColumn;
    }
}
