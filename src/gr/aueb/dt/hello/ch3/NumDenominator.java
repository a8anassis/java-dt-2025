package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * The user inserts a numerator and denominator
 * for a fraction. Assume that we exit the app when
 * numerator is 0 and also take into account that
 * division with zero gives error.
 */
public class NumDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator (quit with zero)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Quiting ....");
                break;
            }

            System.out.println("Please insert the denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("can not divide with zero");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);
        }
    }
}
