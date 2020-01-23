package com.calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class AppTest2
{
   @Test
   public void shouldAnswerWithFalse()
   {
      assertEquals(App.findMax(new int[]{1,2,3,4}),2);
   }
}

