
package fixtures.mergepolicy;

public class UnverifiedAiFinding {
    public int calculateTotal(int unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    /*
     * Test scenario:
     * An AI reviewer claims this method has an integer-overflow bug.
     * The claim is unverified; the fixture alone does not establish a bug.
     * CodeGuard should apply its configured policy for unverified AI claims.
     */
}
