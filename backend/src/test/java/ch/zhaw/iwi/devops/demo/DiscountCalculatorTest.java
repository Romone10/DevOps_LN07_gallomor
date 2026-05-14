package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {
    @Test
    public void shouldReturnSameAmountForRegularCustomerWithoutCoupon() {
        DiscountCalculator calculator = new DiscountCalculator();
        double result = calculator.calculate(50.0, false, false);
        assertEquals(50.0, result);
    }

    @Test
    public void shouldApplyTenPercentDiscountForOrdersAboveHundred() {
        DiscountCalculator calculator = new DiscountCalculator();
        double result = calculator.calculate(200.0, false, false);
        assertEquals(180.0, result);
    }

    @Test
    public void shouldApplyAdditionalPremiumDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        double result = calculator.calculate(200.0, true, false);
        assertEquals(171.0, result, 0.001);
    }

    @Test
    public void shouldApplyCouponDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        double result = calculator.calculate(50.0, false, true);
        assertEquals(40.0, result, 0.001);
    }

    @Test
    public void shouldCombineOrderDiscountPremiumAndCoupon() {
        DiscountCalculator calculator = new DiscountCalculator();
        double result = calculator.calculate(200.0, true, true);
        assertEquals(161.0, result, 0.001);
    }

    @Test
    public void shouldNeverReturnNegativePrice() {
        DiscountCalculator calculator = new DiscountCalculator();
        double result = calculator.calculate(5.0, false, true);
        assertEquals(0.0, result, 0.001);
    }
}