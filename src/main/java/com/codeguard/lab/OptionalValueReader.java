package com.codeguard.lab;

import java.util.Optional;

public class OptionalValueReader {

    public String readValue(Optional<String> value) {
        return value.get();
    }
}
