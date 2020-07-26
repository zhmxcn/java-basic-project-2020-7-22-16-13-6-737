package com.thoughtworks.CreditCard;

public class GoldCard extends CreditCard {
    @Override
    public void pay(Payment payment, int money) {
        int point = payment.getPoint(money);
        point = point/2+point;
        this.addPayRecord(new PayRecord(payment.getName(),money,point));
        this.setPoints(this.getPoints()+point);
    }
}
