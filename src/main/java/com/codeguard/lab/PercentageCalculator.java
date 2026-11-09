package com.codeguard.lab;

public class PercentageCalculator {
    public static int calculateDiscount(int price, int percent) {
        if (price < 0 || percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Invalid input");
        }
        return price - (price * percent / 100);
    }
}
