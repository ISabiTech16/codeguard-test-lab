package com.codeguard.lab;

public class CommandRunner {

    public String execute(String filename) throws Exception {
        Process process = Runtime.getRuntime()
                .exec("cat " + filename);

        return new String(process.getInputStream().readAllBytes());
    }
}
