package com.example.example;

import com.example.example.CalculatorAppDemo.CalculateExpression;
import com.example.example.example.CalculatorSample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateExpressionTest {
    CalculateExpression calculateExpression;

    @Before
    public void setUp() {
        calculateExpression = new CalculateExpression();
    }

    @Test
    public void checkBrackets() {
        Assert.assertEquals("Valid", calculateExpression.checkBalancedParentesis("(9+1)+(8-1)"));
        Assert.assertEquals("Not Valid", calculateExpression.checkBalancedParentesis("(9+1)+(8-1"));
        Assert.assertEquals("Not Valid", calculateExpression.checkBalancedParentesis("((3*3+(8-1))"));
        Assert.assertEquals("Valid", calculateExpression.checkBalancedParentesis(""));
        Assert.assertEquals("Not Valid", calculateExpression.checkBalancedParentesis("((("));

    }

    @Test
    public void evaluateString() {
        Assert.assertEquals("12", calculateExpression.evaluate("9+1*3"));
        Assert.assertEquals("28", calculateExpression.findValueInBraces("(9+1)*3-8/4"));
        Assert.assertEquals("20", calculateExpression.findValueInBraces("((9+1)*(3-1))"));
    }

    @Test(expected = ArithmeticException.class)
    public void calculatorTestDivisionByZero() {
        calculateExpression.evaluate("9+3/0");
        calculateExpression.findValueInBraces("(9+3)/0");
        calculateExpression.findValueInBraces("((9+3/0))");
    }

    @Test(expected = NumberFormatException.class)
    public void calculatorTestNumberFormat() {
        calculateExpression.evaluate("jhgjhgjh");
        calculateExpression.evaluate("(9+1)+(9+bb)");
        calculateExpression.evaluate("(9+1)+[9+bb]");
        calculateExpression.evaluate("{9+19+0}");
        calculateExpression.evaluate("5746587461-13353453");
        calculateExpression.evaluate("(6+1)-(8-1)*10+");
        calculateExpression.evaluate("/(6+1)");
        calculateExpression.evaluate("(1+/2)+(8*-9)");

    }

}
