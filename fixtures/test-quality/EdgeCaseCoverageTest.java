package fixtures.testquality;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EdgeCaseCoverageTest {

    @Test
    void zeroDiscountKeepsOriginalPrice() {
        assertEquals(
            100,
            DiscountCalculator.applyDiscount(100, 0)
        );
    }

    @Test
    void fullDiscountProducesZero() {
        assertEquals(
            0,
            DiscountCalculator.applyDiscount(100, 100)
        );
    }

    @Test
    void rejectsNegativePrice() {
        assertThrows(
            IllegalArgumentException.class,
            () -> DiscountCalculator.applyDiscount(-10, 20)
        );
    }

    @Test
    void rejectsDiscountAboveOneHundredPercent() {
        assertThrows(
            IllegalArgumentException.class,
            () -> DiscountCalculator.applyDiscount(100, 101)
        );
    }

    @Test
    void rejectsNegativeDiscount() {
        assertThrows(
            IllegalArgumentException.class,
            () -> DiscountCalculator.applyDiscount(100, -1)
        );
    }
}
