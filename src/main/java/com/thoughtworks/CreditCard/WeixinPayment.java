package com.thoughtworks.CreditCard;

public class WeixinPayment extends Payment{

    public WeixinPayment(int amount) {
        super(amount);
    }

    @Override
    public int getPoint() {
        return this.getAmount()/20;
    }
}
