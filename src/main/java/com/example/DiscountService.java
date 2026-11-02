package com.example;

public class DiscountService {

    public static final int FREE_SHIPPING_THRESHOLD = 100;

    /** Applies a percentage discount (0-100) to a price in whole currency units. */
    public int applyDiscount(int price, int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("percent must be between 0 and 100");
        }
return price - ((price * percent) / 100);
    }

    /** Orders of 100 or more qualify for free shipping. */
    public boolean qualifiesForFreeShipping(int orderTotal) {
        return orderTotal >= FREE_SHIPPING_THRESHOLD;
    }
}
