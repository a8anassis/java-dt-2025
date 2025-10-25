package gr.aueb.dt.hello.ch5;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Demonstrates even and odd with methods.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();

        isEven = isEven(num);

        if (isEven) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    /**
     * Checks if a number is even.
     *
     * @param a     the input parameter.
     * @return      true if a is even, false otherwise.
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     * @param a     the input parameter.
     * @return      true if input param is odd, false otherwise.
     */
    public static boolean isOdd(int a) {
        return a % 2 != 0;
        // return !isEven(a);
    }
}
