java
package com.example.discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountServiceTest {

    private final DiscountService service = new DiscountService();

    @Test
    void appliesTwentyPercentDiscount() {
        assertEquals(80.0, service.applyDiscount(100.0, 20.0), 0.001);
    }

    @Test
    void rejectsNegativePrice() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.applyDiscount(-10.0, 20.0)
        );
    }

    @Test
    void rejectsDiscountAboveOneHundredPercent() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.applyDiscount(100.0, 120.0)
        );
    }

    @Test
    void checksDiscountEligibilityThreshold() {
        assertTrue(service.isEligibleForDiscount(1000.0));
        assertFalse(service.isEligibleForDiscount(999.0));
    }
}
