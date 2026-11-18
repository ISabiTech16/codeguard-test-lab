package com.codeguard.lab;

import java.util.Optional;

public class UnsafeOptionalReader {
    public String read(Optional<String> value) {
        return value.get();
    }
}
