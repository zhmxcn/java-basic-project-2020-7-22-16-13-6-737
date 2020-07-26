package com.thoughtworks.CreditCard;

public class InstalmentPayment extends Payment {
    public InstalmentPayment() {
        this.setName("分期消费");
    }

    @Override
    public int getPoint(int money) {
        int exPoint = money>5000?100:0;
        return money/10+exPoint;
    }
}
