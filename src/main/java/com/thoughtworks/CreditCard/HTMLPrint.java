package com.thoughtworks.CreditCard;

public class HTMLPrint implements PrintPoint {
    @Override
    public String print(CreditCard card) {
        String result = "";
        result = "<h2>总积分："+card.getPoints()+"</h2>\n";
        for (PayRecord record:
             card.getPayRecords()) {
            result+=("<p>"+record.getTime()+" "+record.getName()+" "+record.getMoney()+" "+record.getPoint()+"</p>\n");
        }
        return result;
    }
}
