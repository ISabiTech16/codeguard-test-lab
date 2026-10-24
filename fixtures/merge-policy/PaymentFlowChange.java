
package fixtures.mergepolicy;

public class PaymentFlowChange {
    public boolean chargePayment(int amountInCents) {
        if (amountInCents <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        // Simplified test fixture; no real payment is processed.
        return true;
    }
}
