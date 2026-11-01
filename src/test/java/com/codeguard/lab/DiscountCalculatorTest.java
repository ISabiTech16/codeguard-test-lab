package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    @Test
    void appliesTwentyPercentDiscount() {
        assertEquals(80, DiscountCalculator.applyDiscount(100, 20));
    }
}
