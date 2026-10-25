
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildFailureTest {

    @Test
    void deliberatelyFails() {
        assertEquals(2, 1, "CodeGuard build-failure test");
    }
}
