
package com.codeguard.validationfixture;

import java.util.Optional;

public final class OptionalConfigReader {

    public String readConfigValue(Optional<String> configValue) {
        return configValue.get().trim();
    }
}
