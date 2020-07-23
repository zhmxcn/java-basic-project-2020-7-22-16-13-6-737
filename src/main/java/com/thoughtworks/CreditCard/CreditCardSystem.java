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
        if (type.equals("quickPay")){
            int exPoints = Math.min(money / 100 * 5, 100);
            return money/10+ exPoints;
        }
        return 0;
    }
}
