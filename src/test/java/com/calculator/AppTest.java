package com.calculator;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(App.findMax(new int[]{1,2,3,4}),4);
        System.out.println("Correct answer");
        System.out.println("Test finished");

    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void NegativeTestCase()
    {
        App.findMax(new int[]{1,2,3,4,5});
    }


}
