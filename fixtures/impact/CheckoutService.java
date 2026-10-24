package fixtures.impact;

public final class CheckoutService {

    private CheckoutService() {
    }

    // INDIRECT DEPENDENCY:
    // CheckoutService -> PricingService -> DiscountPolicy
    public static int calculateCheckoutTotal(
            int price,
            int discountPercent,
            int shippingFee
    ) {
        int discountedPrice =
                PricingService.calculateFinalPrice(
                    price,
                    discountPercent
                );

        return discountedPrice + shippingFee;
    }
}
