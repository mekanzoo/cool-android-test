package net.makankor.coolandroidtest2;

/**
 * Created by addy on 4/15/15.
 */
public class Main {
    public static void main(String[] args) {
        printFactorial(5);
        printFactorial(6);
        printFactorial(7);
    }

    private static void printFactorial(int num) {
        System.out.println("Factorial of " + num + " is: " + new FactorialCalculatorFactory().create().factorial(num));
    }
}
