package com.example.example;

import com.example.example.example.CalculatorSample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    CalculatorSample calculatorSample ;

    @Before
    public void setUp() {
        calculatorSample = new CalculatorSample();
    }

    @Test
    public void calculatorAdd() {
        Assert.assertEquals(5,calculatorSample.add(2,3));
        Assert.assertEquals(-1, calculatorSample.add(2, -3));
    }

    @Test
    public void calculatorSub() {
        Assert.assertEquals(2, calculatorSample.subtraction(3,1));
        Assert.assertEquals(-2, calculatorSample.subtraction(-3,-1));
    }

    @Test
    public void calculatorMul() {

        Assert.assertEquals(6,calculatorSample.multiplication(3,2));
        Assert.assertEquals(-6,calculatorSample.multiplication(-3,2));
    }

    @Test
    public void calculatorPositiveDiv() {
        Assert.assertEquals(3, calculatorSample.division(6,2));
        Assert.assertEquals(-3, calculatorSample.division(6,-2));
    }

}
