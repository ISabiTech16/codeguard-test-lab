package com.codeguard.lab;

import java.util.Optional;

public class SafeOptionalReader {
    public String read(Optional<String> value) {
        return value.orElse("default");
    }
}
