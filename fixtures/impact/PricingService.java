package fixtures.impact;

public final class PricingService {

    private PricingService() {
    }

    // DIRECT CALLER of DiscountPolicy.applyDiscount()
    public static int calculateFinalPrice(
            int price,
            int discountPercent
    ) {
        return DiscountPolicy.applyDiscount(
            price,
            discountPercent
        );
    }
}
