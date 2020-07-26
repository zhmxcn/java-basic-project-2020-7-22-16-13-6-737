package com.thoughtworks.CreditCard;

public class WeixinPayment extends Payment{
    public WeixinPayment() {
        this.setName("微信支付");
    }

    @Override
    public int getPoint(int money) {
        return money/20;
    }
}
