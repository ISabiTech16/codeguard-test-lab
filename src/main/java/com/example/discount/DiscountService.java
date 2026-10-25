```java
package com.example.discount;

public class DiscountService {

    public double applyDiscount(double price, double discountPercent) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Invalid discount percentage");
        }

        return price - (price * discountPercent / 100.0);
    }

    public boolean isEligibleForDiscount(double price) {
        return price >= 1000;
    }
}
```
