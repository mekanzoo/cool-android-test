package net.makankor.coolandroidtest2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialEngineImplTest {
    private FactorialEngineImpl instance;

    @Before
    public void setup() {
        instance = new FactorialEngineImpl();
    }

    @Test
    public void factorialOfZeroShouldReturnOne() {
        Assert.assertEquals(1, instance.doCalculateFactorial(0));
    }

    @Test
    public void factorialOfOneShouldReturnOne() {
        Assert.assertEquals(1, instance.doCalculateFactorial(1));
    }

    @Test
    public void factorialOfTwoShouldReturnOne() {
        Assert.assertEquals(2, instance.doCalculateFactorial(2));
    }

    @Test
    public void factorialOfFiveShouldReturn120() {
        Assert.assertEquals(120, instance.doCalculateFactorial(5));
    }
}