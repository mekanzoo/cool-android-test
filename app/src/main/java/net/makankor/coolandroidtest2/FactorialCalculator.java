package net.makankor.coolandroidtest2;

/**
 * Created by addy on 4/15/15.
 */
public class FactorialCalculator {
    public int factorial(int num) {
        if (num <= 0) {
            return 1;
        }

        int value = num;

        for (int i = num-1; i > 0; i--) {
            value *= i;
        }

        return value;
    }

//    public int factorial(int num) {
//       if (num <= 1) {
//           return 1;
//       }
//        return num * factorial(num -1);
//    }



}
