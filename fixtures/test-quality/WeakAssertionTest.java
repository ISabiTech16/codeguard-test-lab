
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class WeakAssertionTest {

    static int calculateDiscount(int price, int discountPercent) {
        return price - (price * discountPercent / 100);
    }

    @Test
    void appliesDiscount() {
        int actual = calculateDiscount(100, 20);

        // Weak: proves only that the result is not null.
        // It does not verify the expected discounted price.
        assertNotNull(Integer.valueOf(actual));
    }
}
