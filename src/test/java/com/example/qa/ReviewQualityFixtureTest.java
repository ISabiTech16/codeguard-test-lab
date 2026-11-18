
package com.example.qa;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewQualityFixtureTest {

    // TEST CASE: No assertions.
    @Test
    void testWithoutAssertions() {
        String result = "hello".trim();
    }

    // TEST CASE: Trivially true assertion.
    @Test
    void testWithTrivialAssertion() {
        assertTrue(true);
    }

    // TEST CASE: Value compared with itself.
    @Test
    void testComparingValueWithItself() {
        int total = 10;
        assertEquals(total, total);
    }

    // TEST CASE: Exception swallowed.
    @Test
    void testSwallowingException() {
        try {
            Integer.parseInt("not-a-number");
        } catch (Exception ignored) {
        }
    }

    // TEST CASE: Disabled test.
    @Disabled("Intentional CodeGuard QA fixture")
    @Test
    void disabledTest() {
        assertEquals(1, 2);
    }

    // CLEAN CONTROL: Meaningful assertion.
    @Test
    void validAssertion() {
        assertEquals(5, "hello".length());
    }

    // CLEAN CONTROL: Expected exception is asserted.
    @Test
    void validExceptionAssertion() {
        assertThrows(NumberFormatException.class,
            () -> Integer.parseInt("not-a-number"));
    }
}
