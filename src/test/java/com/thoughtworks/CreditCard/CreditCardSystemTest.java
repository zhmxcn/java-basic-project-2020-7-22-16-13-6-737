package com.thoughtworks.CreditCard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardSystemTest {
    @Test
    public void should_return_1_point_when_consume_10_yuan_use_pos(){
        CreditCardSystem cardSystem = new CreditCardSystem();
        int points = cardSystem.consume(10,"pos");
        assertEquals(1,points);
    }

}