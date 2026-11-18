package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PercentageCalculatorTest {

    @Test
    void calculatesTwentyPercentDiscount() {
        assertEquals(80, PercentageCalculator.calculateDiscount(100, 20));
    }
}
