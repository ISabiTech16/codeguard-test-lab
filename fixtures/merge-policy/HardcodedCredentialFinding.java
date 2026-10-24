
package fixtures.mergepolicy;

public class HardcodedCredentialFinding {
    // Intentionally fake credential for testing only.
    private static final String API_KEY = "TEST_ONLY_FAKE_KEY_12345";

    public String getApiKey() {
        return API_KEY;
    }
}
