package com.codeguard.validationfixture;

import java.util.Optional;

public final class OptionalFallbackReader {

    public String readName(Optional<String> name) {
        if (name.isPresent()) {
            return name.get().trim();
        }
        return "Unknown";
    }
}
