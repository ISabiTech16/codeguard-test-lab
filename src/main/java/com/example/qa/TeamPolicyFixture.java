
package com.example.qa;

public class TeamPolicyFixture {

    // Configure a deterministic forbidden-text rule for this marker:
    // QA_FORBIDDEN_LOG_SECRET
    public void unsafeLogging(String secret) {
        System.out.println("QA_FORBIDDEN_LOG_SECRET " + secret);
    }

    // CLEAN CONTROL: Should not match the forbidden marker.
    public void safeLogging(String message) {
        System.out.println("Request processed");
    }

    // CLEAN CONTROL: Ordinary business logic.
    public boolean isEligible(double amount) {
        return amount >= 1000.0;
    }
}
