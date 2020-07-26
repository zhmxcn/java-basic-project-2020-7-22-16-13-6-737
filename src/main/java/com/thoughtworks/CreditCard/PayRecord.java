package com.thoughtworks.CreditCard;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PayRecord {
    private String name;
    private int money;
    private String time;
    private int point;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getTime() {
        return time;
    }

    public int getPoint() {
        return point;
    }

    public PayRecord(String payName, int money, int point) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.time = df.format(new Date());
        this.name = payName;
        this.money = money;
        this.point = point;
    }
}
