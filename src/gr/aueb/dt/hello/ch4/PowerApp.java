package gr.aueb.dt.hello.ch4;

import java.util.Scanner;

/**
 * It finds the power of a^n with
 * for. For instance, 2^10 = 1024
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

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("%d^%d=%d", base, power, result);
    }
}
