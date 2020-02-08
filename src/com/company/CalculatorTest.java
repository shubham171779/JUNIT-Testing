package com.company;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest
{
@Test
    public void addTest()
{
    Calculator obj=new Calculator();
   assertEquals("failed",6,obj.addition(4,2));
    assertEquals("failed",2,obj.subtraction(4,2));
    assertEquals("failed",8,obj.multiplication(4,2));
  assertEquals("failed",2,obj.division(4,2));
}
}
