
package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MockSourceTest {

    interface InventoryService {
        int getStock();
    }

    @Test
    void mockIsConfiguredHere() {
        InventoryService service = mock(InventoryService.class);
        when(service.getStock()).thenReturn(10);

        assertEquals(10, service.getStock());
    }
}
