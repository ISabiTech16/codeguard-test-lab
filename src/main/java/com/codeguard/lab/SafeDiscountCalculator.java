package com.codeguard.lab;

public class SafeDiscountCalculator {

    public static int applyDiscount(int price, int discountPercent) {
        if (price < 0 || discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Invalid input");
        }

        return price - (price * discountPercent / 100);
    }
}
