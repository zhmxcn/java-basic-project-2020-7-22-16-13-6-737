package com.thoughtworks.CreditCard;

public class ConslePrint implements PrintPoint {
    @Override
    public String print(CreditCard card) {
        String result = "";
        result = "总积分："+card.getPoints()+"\n";
        for (PayRecord record:
                card.getPayRecords()) {
            result+=(record.getTime()+" "+record.getName()+" "+record.getMoney()+" "+record.getPoint()+"\n");
        }
        return result;
    }
}
