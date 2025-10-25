package gr.aueb.dt.hello.ch5;

import java.util.Scanner;

/**
 * Factorial recursive.
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();

        result = factorial(num);

        System.out.println("The factorial of " + num + " is " + result);
    }

    public static int factorial(int num) {
//        if (num == 1) {
//            return 1;
//        }
//        return num * factorial(num - 1);

        return num == 1 ? 1 : num * factorial(num - 1);
    }
}
