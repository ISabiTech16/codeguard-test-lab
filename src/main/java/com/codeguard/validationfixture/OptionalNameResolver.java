
package com.codeguard.validationfixture;

import java.util.Optional;

public final class OptionalNameResolver {

    public String resolveName(Optional<String> name) {
        return name.get().trim();
    }
}
