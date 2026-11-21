package com.codeguard.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandRunnerTest {

    @Test
    void shouldRejectCommandInjection() {
        CommandRunner runner = new CommandRunner();

        assertThrows(Exception.class,
                () -> runner.execute("test.txt; rm -rf /"));
    }
}
