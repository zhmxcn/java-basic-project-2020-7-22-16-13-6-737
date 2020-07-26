package com.thoughtworks.CreditCard;

public class NormalCard extends CreditCard {

    @Override
    public void pay(Payment payment, int money) {
        int point = payment.getPoint(money);
        this.addPayRecord(new PayRecord(payment.getName(),money,point));
        this.setPoints(this.getPoints()+point);
    }
}
