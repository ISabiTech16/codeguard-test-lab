
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PercentageCalculatorTest {

    @Test
    void calculateDiscount() {
        int result = PercentageCalculator.calculateDiscount(100, 20);

        // Weak assertion: passes without verifying the expected result.
        assertTrue(result > 0);
    }
}
