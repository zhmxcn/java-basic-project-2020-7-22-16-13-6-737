package com.thoughtworks.CreditCard;

public class GoldCard implements CreditCard {
    @Override
    public int getAllPoint(int Point) {
        return Point/2+Point;
    }
}
