package com.codeguard.validationfixture;

import java.util.Optional;

public final class UnsafeOptionalFallbackReader {

    public String readName(Optional<String> name) {
        return name.get().trim();
    }
}
