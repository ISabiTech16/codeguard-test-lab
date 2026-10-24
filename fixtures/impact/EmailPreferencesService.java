package fixtures.impact;

public final class EmailPreferencesService {

    private EmailPreferencesService() {
    }

    // UNRELATED CONTROL:
    // This class does not depend on DiscountPolicy or pricing.
    public static boolean shouldSendPromotionalEmail(
            boolean optedIn,
            boolean emailAddressVerified
    ) {
        return optedIn && emailAddressVerified;
    }
}
