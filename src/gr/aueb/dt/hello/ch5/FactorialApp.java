package gr.aueb.dt.hello.ch5;

import java.util.Scanner;

/**
 * Factorial demo. Calculate the factorial of a number
 * by using a method. The factorial of n is defined as,
 * n! = 1 * 2 * 3 * ... * n
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();

        // Call the factorial method (service)
        result = facto(num);

        System.out.println("The factorial of " + num + " is " + result);
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param n     the input parameter.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;    // result = result * i;
        }

        return result;
    }
}
