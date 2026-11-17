
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PercentageCalculatorTest {

    @Test
    void calculatesTwentyPercentDiscount() {
        assertEquals(80,
                PercentageCalculator.calculateDiscount(100, 20));
    }

    @Test
    void handlesZeroPercentDiscount() {
        assertEquals(100,
                PercentageCalculator.calculateDiscount(100, 0));
    }

    @Test
    void handlesFullDiscount() {
        assertEquals(0,
                PercentageCalculator.calculateDiscount(100, 100));
    }

    @Test
    void handlesDifferentPriceAndPercentage() {
        assertEquals(150,
                PercentageCalculator.calculateDiscount(200, 25));
    }
}
