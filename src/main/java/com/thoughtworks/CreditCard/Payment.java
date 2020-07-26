package com.thoughtworks.CreditCard;

public abstract class Payment {

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String Name;

    abstract public int getPoint(int money);
}
