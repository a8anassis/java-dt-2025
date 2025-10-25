package gr.aueb.dt.hello.ch5;

import java.util.Scanner;

/**
 * Power of a number.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;

        System.out.println("Please insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.println("The result is: " + result);
    }


    /**
     * Calculates the power of a number.
     *
     * @param base      the base of the power.
     * @param power     the power raised to.
     * @return          the result of the power.
     */
    public static int pow(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base; // result = result * base;
        }
        return result;
    }
}
