package fixtures.security;

public final class HardcodedSecretExample {

    // INTENTIONAL TEST FIXTURE:
    // This fake credential is deliberately embedded in source code.
    // Never use real credentials in test fixtures.
    private static final String API_KEY = "FAKE_TEST_KEY_DO_NOT_USE_12345";

    private HardcodedSecretExample() {
    }

    public static String getApiKeyForTest() {
        return API_KEY;
    }
}
