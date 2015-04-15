package net.makankor.coolandroidtest2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialCalculatorTest {

    private FactorialCalculator instance;
    private FactorialEngine factorialEngine;
    private static final int DEF_RESULT_VALUE = 15333343;

    @Before
    public void setup() {
        factorialEngine = Mockito.mock(FactorialEngine.class);
        instance = new FactorialCalculator(factorialEngine, new FakeLogger());
    }

    @Test
    public void factorialShouldReturnValueFromFactorialEngine() {
        int num = 333;
        int output = 666;
        Mockito.when(factorialEngine.doCalculateFactorial(num)).thenReturn(output);

        Assert.assertEquals(output, instance.factorial(num));
//        Mockito.verify(factorialEngine).doCalculateFactorial(num);
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

    private static class FakeLogger implements Logger {

        @Override
        public void log(String text) {
            System.out.println("Log: " + text);
        }
    }

}