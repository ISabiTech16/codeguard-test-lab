package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SafeDiscountCalculatorTest {

    @Test
    void calculatesPercentageDiscountCorrectly() {
        assertEquals(80, SafeDiscountCalculator.applyDiscount(100, 20));
        assertEquals(0, SafeDiscountCalculator.applyDiscount(100, 100));
        assertEquals(100, SafeDiscountCalculator.applyDiscount(100, 0));
    }

    @Test
    void rejectsInvalidInputs() {
        assertThrows(IllegalArgumentException.class,
                () -> SafeDiscountCalculator.applyDiscount(-100, 20));
        assertThrows(IllegalArgumentException.class,
                () -> SafeDiscountCalculator.applyDiscount(100, 101));
    }
}
