package fixtures.testquality;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingEdgeCaseTest {

    @Test
    void calculatesDiscountForOrdinaryInput() {
        assertEquals(
            75,
            DiscountCalculator.applyDiscount(100, 25)
        );
    }
}
