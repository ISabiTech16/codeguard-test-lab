
package fixtures.teamrules;

public class SystemOutLoggingViolation {
    public void processPayment(String paymentId) {
        System.out.println("Processing payment: " + paymentId);
    }
}
  
