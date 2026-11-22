package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommandRunnerTest {

    @Test
    void shouldCreateCommandRunner() {
        CommandRunner runner = new CommandRunner();

        assertNotNull(runner);
    }
}
