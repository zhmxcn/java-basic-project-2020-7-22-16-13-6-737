package com.thoughtworks.CreditCard;

import java.math.BigDecimal;

public class CreditCardSystem {
    public int consume(int money, String type) {
        if (type.equals("pos")) {
            return money/10;
        }
        if (type.equals("weixin")){
            return money/20;
        }
        return 0;
    }
}
