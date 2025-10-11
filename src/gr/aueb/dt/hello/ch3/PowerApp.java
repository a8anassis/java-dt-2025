package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * Finds a^b. For instance,
 * 2^10 = 1024.
 */
public class PowerApp {

    public static void main(String[] args) {

        // Declaration and Initialization
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Commands
        System.out.println("Please insert the base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result = result * base;
            i++;
        }

        // Print the results
        System.out.printf("%d^%d=%,d", base, power, result);
    }
}
