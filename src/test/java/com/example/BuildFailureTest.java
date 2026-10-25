
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildFailureTest {

    @Test
    void discountCalculationReturnsExpectedValue() {
        double price = 100.0;
        double discountPercent = 20.0;

        double discountedPrice =
                price - (price * discountPercent / 100.0);

        // Correct assertion: assertEquals(discountedPrice, 80.0, "Discount calculation");
    }
}
