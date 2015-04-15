package net.makankor.coolandroidtest2;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialCalculator {
    private FactorialEngine factorialEngine;

    public FactorialCalculator(FactorialEngine factorialEngine) {
        this.factorialEngine = factorialEngine;
    }

    public int factorial(int num) {
       return factorialEngine.doCalculateFactorial(num);
    }
}
