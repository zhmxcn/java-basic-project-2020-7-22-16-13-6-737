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
        int points = cardSystem.consume(20,"weixin");
        assertEquals(1,points);
    }

}