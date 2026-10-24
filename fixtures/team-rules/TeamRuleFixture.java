
package fixtures.teamrules;

/**
 * Fixture index for CodeGuard team-rule testing.
 *
 * Candidate conventions:
 * 1. Prefer a logging framework over System.out in service code.
 * 2. Avoid silently swallowing exceptions.
 *
 * These are candidate rules, not proof that CodeGuard has them configured.
 */
public class TeamRuleFixture {
    public static void main(String[] args) {
        new SystemOutLoggingViolation().processPayment("TEST-PAYMENT");
        new StructuredLoggingExample().processPayment("TEST-PAYMENT");

        new SilentExceptionViolation().loadConfiguration();
    }
}
  
