package net.makankor.coolthingswithtest.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by addy on 4/9/15.
 */
public class CalculatorTest {
    private Calculator instance;

    @Before
    public void setup() {
        instance = new Calculator();
    }

    @Test
    public void factorialOfZeroShouldReturnOne() {
        Assert.assertEquals(1, instance.factorial(0));
    }

    @Test
    public void factorialOfOneShouldReturnOne() {
        Assert.assertEquals(1, instance.factorial(1));
    }

    @Test
    public void factorialOfTwoShouldReturnOne() {
        Assert.assertEquals(2, instance.factorial(2));
    }

    @Test
    public void factorialOfFiveShouldReturn120() {
        Assert.assertEquals(120, instance.factorial(5));
    }
}