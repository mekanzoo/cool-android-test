package net.makankor.coolandroidtest2;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialEngineImpl implements FactorialEngine {
    @Override
    public int doCalculateFactorial(int num) {
        if (num <= 1) {
         return 1;
         }
          return num * doCalculateFactorial(num -1);
        }
}
