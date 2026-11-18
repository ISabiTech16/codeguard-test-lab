
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MethodScopeIsolationTest {

    interface PriceService {
        int getPrice();
    }

    @Test
    void mockSetupExistsInThisMethod() {
        PriceService service = mock(PriceService.class);
        when(service.getPrice()).thenReturn(100);

        assertEquals(100, service.getPrice());
    }

    @Test
    void realObjectAssertionInAnotherMethod() {
        int actualPrice = 100;
        int discount = 20;

        int finalPrice = actualPrice - discount;

        assertEquals(80, finalPrice);
    }
}
