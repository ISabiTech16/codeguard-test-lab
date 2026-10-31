package com.codeguard.lab;

public class DiscountCalculator {
    public double applyDiscount(double price, double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}
