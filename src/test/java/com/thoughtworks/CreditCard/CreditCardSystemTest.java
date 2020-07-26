package com.thoughtworks.CreditCard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardSystemTest {
    @Test
    public void should_return_0_point_when_consume_9_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(9,"pos");
        assertEquals(0,points);
    }

    @Test
    public void should_return_1_point_when_consume_10_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(10,"pos");
        assertEquals(1,points);
    }

    @Test
    public void should_return_10_point_when_consume_108_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(108,"pos");
        assertEquals(10,points);
    }

    @Test
    public void should_return_1_point_when_consume_20_yuan_use_weixin(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(new WeixinPayment(20));
        assertEquals(1,points);
    }

    @Test
    public void should_return_1_point_when_consume_10_yuan_use_quickPay(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(10,"quickPay");
        assertEquals(1,points);
    }

    @Test
    public void should_return_30_point_when_consume_208_yuan_use_weixin(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(208,"quickPay");
        assertEquals(30,points);
    }

    @Test
    public void should_return_20_point_when_consume_208_yuan_use_instalment(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(200,"instalment");
        assertEquals(20,points);
    }

    @Test
    public void should_return_740_point_when_consume_6400_yuan_use_instalment(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(6400,"instalment");
        assertEquals(740,points);
    }


}