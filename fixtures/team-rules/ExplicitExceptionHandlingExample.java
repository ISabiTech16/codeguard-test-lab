
package fixtures.teamrules;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExplicitExceptionHandlingExample {
    private static final Logger LOGGER =
            Logger.getLogger(ExplicitExceptionHandlingExample.class.getName());

    public void loadConfiguration() {
        try {
            parseConfiguration();
        } catch (IllegalArgumentException exception) {
            LOGGER.log(Level.WARNING, "Invalid configuration", exception);
            throw exception;
        }
    }

    private void parseConfiguration() {
        throw new IllegalArgumentException("Invalid configuration");
    }
}
  
