package com.codeguard.lab;

import java.io.IOException;

public class CommandRunner {

    public Process runDiagnostic(String host) throws IOException {
        ProcessBuilder builder = new ProcessBuilder(
                "sh",
                "-c",
                "ping -c 1 " + host
        );

        return builder.start();
    }
}
