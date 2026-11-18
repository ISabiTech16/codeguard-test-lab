
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockIsolationTest {

    interface DiscountService {
        int calculate(int price, int discount);
    }

    @Test
    void mockedServiceReturnsConfiguredValue() {
        DiscountService service = mock(DiscountService.class);

        when(service.calculate(100, 20)).thenReturn(80);

        assertEquals(80, service.calculate(100, 20));
    }

    @Test
    void realObjectAssertionShouldNotBeFlagged() {
        int result = 100 - 20;

        assertEquals(80, result);
    }
}
