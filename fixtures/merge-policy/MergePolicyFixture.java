
package fixtures.mergepolicy;

/**
 * Candidate merge-policy test scenarios:
 *
 * 1. Hardcoded credential: security finding should receive appropriate
 *    severity and policy treatment.
 * 2. Maintainability concern: lower-priority findings should be ranked
 *    appropriately.
 * 3. Payment flow: sensitive payment changes should receive human review
 *    under the applicable policy.
 * 4. Unverified AI claim: an AI claim alone should not block a merge.
 *
 * These are test inputs, not evidence that the product passes the tests.
 */
public class MergePolicyFixture {
    public static void main(String[] args) {
        HardcodedCredentialFinding credential =
                new HardcodedCredentialFinding();
        System.out.println("Fixture loaded: " + credential.getApiKey());

        MaintainabilityFinding maintainability =
                new MaintainabilityFinding();
        System.out.println(
                maintainability.formatName("Test", "User"));

        PaymentFlowChange payment = new PaymentFlowChange();
        System.out.println(payment.chargePayment(100));

        UnverifiedAiFinding aiFinding = new UnverifiedAiFinding();
        System.out.println(aiFinding.calculateTotal(100, 2));
    }
}
