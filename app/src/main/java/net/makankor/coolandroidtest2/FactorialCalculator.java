package net.makankor.coolandroidtest2;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialCalculator {
    private FactorialEngine factorialEngine;
    private Logger logger;

    public FactorialCalculator(FactorialEngine factorialEngine, Logger logger) {
        this.factorialEngine = factorialEngine;
        this.logger = logger;
    }

    public int factorial(int num) {
        logger.log("Calculating factorial for " + num);
        return factorialEngine.doCalculateFactorial(num);
    }
}
