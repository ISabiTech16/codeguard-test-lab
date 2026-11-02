package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DiscountServiceTest {

    private final DiscountService service = new DiscountService();

    @Test
    void appliesPercentageDiscount() {
        assertEquals(150, service.applyDiscount(200, 25));
    }

    @Test
    void zeroPercentLeavesPriceUnchanged() {
        assertEquals(80, service.applyDiscount(80, 0));
    }

    @Test
    void rejectsPercentAbove100() {
        assertThrows(IllegalArgumentException.class, () -> service.applyDiscount(100, 101));
    }

    @Test
    void ordersAtThresholdGetFreeShipping() {
        assertTrue(service.qualifiesForFreeShipping(100));
    }
}
