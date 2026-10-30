package com.codeguard.lab;

import org.junit.jupiter.api.Test;

class TimeoutValidationTest {

    @Test
    void longRunningTest() throws InterruptedException {
        Thread.sleep(300000);
    }
}
