
package com.codeguard.validationfixture;

import java.util.Optional;

public final class OptionalUserLookup {

    public String getDisplayName(Optional<String> displayName) {
        return displayName.get().trim();
    }
}
