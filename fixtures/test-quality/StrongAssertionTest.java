package fixtures.testquality;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrongAssertionTest {

    @Test
    void appliesTwentyPercentDiscount() {
        int actual = DiscountCalculator.applyDiscount(100, 20);

        assertEquals(80, actual);
    }
}
