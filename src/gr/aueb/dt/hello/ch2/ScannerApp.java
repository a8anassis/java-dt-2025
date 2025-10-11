package gr.aueb.dt.hello.ch2;

import java.util.Scanner;

/**
 * This is a Scanner demo.
 */
public class ScannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two ints");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }
}
