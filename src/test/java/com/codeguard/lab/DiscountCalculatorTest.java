package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    @Test
    void normalDiscount() {
        assertEquals(80, DiscountCalculator.applyDiscount(100, 20));
    }

    @Test
    void rejectsDiscountAboveOneHundredPercent() {
        assertEquals(50, DiscountCalculator.applyDiscount(100, 150));
    }
}
