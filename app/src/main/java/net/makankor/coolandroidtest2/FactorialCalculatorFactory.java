package net.makankor.coolandroidtest2;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialCalculatorFactory {
    public FactorialCalculator create() {
        return new FactorialCalculator(new FactorialEngineImpl(), new Logger() {
            @Override
            public void log(String text) {

            }
        });
    }
}
