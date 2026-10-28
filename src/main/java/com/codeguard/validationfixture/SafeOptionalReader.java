package com.codeguard.validationfixture;

import java.util.Optional;

public final class SafeOptionalReader {

    public String readConfigValue(Optional<String> configValue) {
        return configValue.map(String::trim).orElse("default");
    }
}
