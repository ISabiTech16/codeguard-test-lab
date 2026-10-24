
package fixtures.regression;

/**
 * Regression-test checklist:
 *
 * 1. Repeated dismissed findings should follow dismissal-matching policy.
 * 2. A dismissal must not hide a materially different genuine issue.
 * 3. Security findings must remain visible at the appropriate severity.
 *
 * These fixtures require execution through CodeGuard's actual analysis
 * pipeline to verify behavior. This class does not run that pipeline.
 */
public class RegressionFixture {
    public static void main(String[] args) {
        RepeatedFindingExample repeated = new RepeatedFindingExample();
        System.out.println(repeated.normalizeLabel(" Example "));

        NewSecurityIssueExample security = new NewSecurityIssueExample();
        System.out.println("Security fixture loaded: "
                + security.getClass().getSimpleName());
    }
}
