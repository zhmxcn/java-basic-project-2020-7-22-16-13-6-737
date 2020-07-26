package com.thoughtworks.CreditCard;

import java.util.ArrayList;
import java.util.List;

public abstract class CreditCard {
    private List<PayRecord> payRecords = new ArrayList<PayRecord>(20);
    private int points;

    protected CreditCard() {
    }

    public abstract void pay(Payment payment, int money);
    public void addPayRecord(PayRecord payRecord){
        payRecords.add(payRecord);
    }

    public List<PayRecord> getPayRecords(){
        return payRecords;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
