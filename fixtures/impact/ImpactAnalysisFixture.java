package fixtures.impact;

public final class ImpactAnalysisFixture {

    private ImpactAnalysisFixture() {
    }

    public static void main(String[] args) {
        int directResult =
                PricingService.calculateFinalPrice(100, 20);

        int checkoutResult =
                CheckoutService.calculateCheckoutTotal(
                    100,
                    20,
                    10
                );

        boolean promotionalEmail =
                EmailPreferencesService.shouldSendPromotionalEmail(
                    true,
                    true
                );

        System.out.println("Direct result: " + directResult);
        System.out.println("Checkout result: " + checkoutResult);
        System.out.println(
            "Promotional email allowed: " + promotionalEmail
        );
    }
}
