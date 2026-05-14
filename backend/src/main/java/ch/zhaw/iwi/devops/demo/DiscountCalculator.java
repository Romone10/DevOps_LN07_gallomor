package ch.zhaw.iwi.devops.demo;

public class DiscountCalculator {
    public double calculate(double amount, boolean premiumCustomer, boolean couponUsed) {
        double result = amount;

        boolean hasOrderDiscount = amount >= 100;

        if (hasOrderDiscount) {
            result *= 0.9;
        }

        if (premiumCustomer) {
            result *= 0.95;
        }

        if (couponUsed) {
            result -= 10;
        }

        return Math.max(result, 0);
    }
}