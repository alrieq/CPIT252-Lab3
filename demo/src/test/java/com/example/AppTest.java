package com.example;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import static org.junit.Assert.assertNotEquals;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws CloneNotSupportedException
     */
    @Test
    public void assertClonesNotEqual() throws CloneNotSupportedException{
        Car c1 = new Car("Honda", "Accord", 2019);
        // Make a clone
        Car c2 = c1.getCopy();
        assertNotEquals(c1, c2);
    }
}
