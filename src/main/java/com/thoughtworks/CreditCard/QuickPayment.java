package com.thoughtworks.CreditCard;

public class QuickPayment extends Payment {
    public QuickPayment(int amount) {
        super(amount);
    }

    @Override
    public int getPoint() {
        int exPoints = Math.min(getAmount() / 100 * 5, 100);
        return getAmount()/10+ exPoints;
    }
}
