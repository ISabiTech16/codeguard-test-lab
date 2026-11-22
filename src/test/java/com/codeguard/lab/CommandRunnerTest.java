package com.codeguard.lab;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
class CommandRunnerTest {

    @Test
    void shouldCreateCommandRunner() {
        CommandRunner runner = new CommandRunner();

        assertNotNull(runner);
    }
    @Test
void shouldNotExecuteShellCommandsFromHostInput() throws Exception {
    Path marker = Path.of(
        System.getProperty("java.io.tmpdir"),
        "codeguard-injection-proof"
    );

    Files.deleteIfExists(marker);

    String maliciousHost =
        "127.0.0.1; touch " + marker + " #";

    Process process = new CommandRunner()
        .runDiagnostic(maliciousHost);

    process.waitFor(10, TimeUnit.SECONDS);
    process.destroyForcibly();

    assertFalse(
        Files.exists(marker),
        "Host input must not execute additional shell commands"
    );
}
}
