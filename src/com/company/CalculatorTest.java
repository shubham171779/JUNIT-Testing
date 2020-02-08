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

}
}
