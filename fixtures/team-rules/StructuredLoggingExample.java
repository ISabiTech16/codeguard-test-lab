
package fixtures.teamrules;

import java.util.logging.Logger;

public class StructuredLoggingExample {
    private static final Logger LOGGER =
            Logger.getLogger(StructuredLoggingExample.class.getName());

    public void processPayment(String paymentId) {
        LOGGER.info(() -> "Processing payment: " + paymentId);
    }
}
  
