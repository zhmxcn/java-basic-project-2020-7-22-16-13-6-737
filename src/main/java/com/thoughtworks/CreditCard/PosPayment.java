package com.thoughtworks.CreditCard;

public class PosPayment extends Payment {

    public PosPayment() {
        this.setName("POS机消费");
    }

    @Override
    public int getPoint(int money) {
        return money/10;
    }
}
