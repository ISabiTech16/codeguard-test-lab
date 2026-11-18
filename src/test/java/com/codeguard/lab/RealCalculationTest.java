
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RealCalculationTest {

    @Test
    void realCalculationUsesExpectedValue() {
        int stock = 15;
        int sold = 5;

        assertEquals(10, stock - sold);
    }
}
