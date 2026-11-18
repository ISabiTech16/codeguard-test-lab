package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrOnlyRegressionTest {

    @Test
    void regressionShouldBeDetected() {
        assertEquals(5, 2 + 2);
    }
}
