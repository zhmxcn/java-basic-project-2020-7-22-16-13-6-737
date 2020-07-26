package com.thoughtworks.CreditCard;

public class CreditCardSystem {
    private CreditCard creditCard;

    public int consume(CreditCard creditCard, Payment payment) {
        return creditCard.getAllPoint(payment.getPoint());
    }
}
