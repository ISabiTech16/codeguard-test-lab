package fixtures.security;

public final class EnvironmentVariableConfig {

    private EnvironmentVariableConfig() {
    }

    public static String getApiKey() {
        String apiKey = System.getenv("APP_API_KEY");

        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                "Required environment variable APP_API_KEY is missing"
            );
        }

        return apiKey;
    }
}
