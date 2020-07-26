package com.thoughtworks.CreditCard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardSystemTest {
    @Test
    public void should_return_0_point_when_consume_9_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem(new GoldCard());
        int points = cardSystem.consume(new PosPayment(),9);
        assertEquals(0,points);
    }

    @Test
    public void should_return_1_point_when_consume_10_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem(new GoldCard());
        int points = cardSystem.consume(new PosPayment(),10);
        assertEquals(1,points);
    }

    @Test
    public void should_return_10_point_when_consume_108_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem(new NormalCard());
        int points = cardSystem.consume(new PosPayment(),108);
        assertEquals(10,points);
    }

    @Test
    public void should_return_1_point_when_consume_20_yuan_use_weixin(){
        CreditCardSystem cardSystem = new CreditCardSystem(new GoldCard());
        int points = cardSystem.consume(new WeixinPayment(),20);
        assertEquals(1,points);
    }

    @Test
    public void should_return_1_point_when_consume_10_yuan_use_quickPay(){
        CreditCardSystem cardSystem = new CreditCardSystem(new GoldCard());
        int points = cardSystem.consume(new QuickPayment(),10);
        assertEquals(1,points);
    }

    @Test
    public void should_return_30_point_when_consume_208_yuan_use_weixin(){
        CreditCardSystem cardSystem = new CreditCardSystem(new NormalCard());
        int points = cardSystem.consume(new QuickPayment(),208);
        assertEquals(30,points);
    }

    @Test
    public void should_return_20_point_when_consume_208_yuan_use_instalment(){
        CreditCardSystem cardSystem = new CreditCardSystem(new NormalCard());
        int points = cardSystem.consume(new InstalmentPayment(),208);
        assertEquals(20,points);
    }

    @Test
    public void should_return_740_point_when_consume_6400_yuan_use_instalment(){
        CreditCardSystem cardSystem = new CreditCardSystem(new NormalCard());
        int points = cardSystem.consume(new InstalmentPayment(),6400);
        assertEquals(740,points);
    }

    @Test
    public void should_return_1110_point_when_consume_6400_yuan_use_instalment_by_goldcard(){
        CreditCardSystem cardSystem = new CreditCardSystem(new GoldCard());
        int points = cardSystem.consume(new InstalmentPayment(),6400);
        assertEquals(1110,points);
    }

}