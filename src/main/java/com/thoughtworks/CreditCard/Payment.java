package com.thoughtworks.CreditCard;

public abstract class Payment {
    private int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    abstract public int getPoint();

    public int getAmount() {
        return amount;
    }
}
