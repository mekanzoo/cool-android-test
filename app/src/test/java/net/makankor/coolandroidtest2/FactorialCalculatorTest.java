package net.makankor.coolandroidtest2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialCalculatorTest {

    private FactorialCalculator instance;
    private FactorialEngineStub factorialEngine;
    private static final int DEF_RESULT_VALUE = 15333343;

    @Before
    public void setup() {
        factorialEngine = new FactorialEngineStub();
        instance = new FactorialCalculator(factorialEngine);
    }

    @Test
    public void factorialShouldReturnValueFromFactorialEngine() {
        Assert.assertEquals(DEF_RESULT_VALUE, instance.factorial(523));
        Assert.assertEquals(523, factorialEngine.getLastParam());
    }


    private static class FactorialEngineStub implements FactorialEngine {
        private int lastParam;

        @Override
        public int doCalculateFactorial(int num) {
            this.lastParam = num;
            return DEF_RESULT_VALUE;
        }

        public int getLastParam() {
            return lastParam;
        }
    }

}