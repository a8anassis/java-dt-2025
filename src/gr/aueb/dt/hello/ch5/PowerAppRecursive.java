package gr.aueb.dt.hello.ch5;

import java.util.Scanner;

/**
 * Power of a number with recursion.
 */
public class PowerAppRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;

        System.out.println("Please insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.println("The result is " + result);
    }

    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * pow(base, power - 1);
    }
}
