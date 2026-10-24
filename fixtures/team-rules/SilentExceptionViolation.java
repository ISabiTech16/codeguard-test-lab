
package fixtures.teamrules;

public class SilentExceptionViolation {
    public void loadConfiguration() {
        try {
            parseConfiguration();
        } catch (Exception ignored) {
            // Failure is silently swallowed.
        }
    }

    private void parseConfiguration() {
        throw new IllegalStateException("Configuration could not be loaded");
    }
}
  
