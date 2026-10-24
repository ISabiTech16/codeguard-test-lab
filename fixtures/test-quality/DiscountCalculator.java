package fixtures.testquality;

public final class DiscountCalculator {

    private DiscountCalculator() {
    }

    public static int applyDiscount(int price, int discountPercent) {
        if (price < 0) {
            throw new IllegalArgumentException(
                "Price cannot be negative"
            );
        }

        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException(
                "Discount must be between 0 and 100"
            );
        }

        return price - (price * discountPercent / 100);
    }
}
