package com.thoughtworks.CreditCard;

import java.util.List;

public class CreditCardSystem {
    public CreditCard getCreditCard() {
        return creditCard;
    }

    private CreditCard creditCard;

    public CreditCardSystem(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    public int consume(Payment payment,int momey) {
        creditCard.pay(payment,momey);
        return creditCard.getPoints();
    }

}
