package com.thoughtworks.CreditCard;

public class InstalmentPayment extends Payment {
    public InstalmentPayment(int amount) {
        super(amount);
    }

    @Override
    public int getPoint() {
        int exPoint = getAmount()>5000?100:0;
        return getAmount()/10+exPoint;
    }
}
