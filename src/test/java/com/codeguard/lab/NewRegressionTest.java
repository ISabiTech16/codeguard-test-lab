package com.codeguard.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NewRegressionTest {

    @Test
    void newRegressionShouldFail() {
        assertEquals(5, 2 + 2);
    }
}
