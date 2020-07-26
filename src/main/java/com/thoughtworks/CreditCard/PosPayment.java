package com.thoughtworks.CreditCard;

public class PosPayment extends Payment {
    public PosPayment(int amount) {
        super(amount);
    }

    @Override
    public int getPoint() {
        return getAmount()/10;
    }
}
