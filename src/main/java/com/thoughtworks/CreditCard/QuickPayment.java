package com.thoughtworks.CreditCard;

public class QuickPayment extends Payment {

    public QuickPayment() {
        this.setName("快捷支付");
    }

    @Override
    public int getPoint(int money) {
        int exPoints = Math.min(money / 100 * 5, 100);
        return money/10+ exPoints;
    }
}
