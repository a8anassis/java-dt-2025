package gr.aueb.dt.hello.ch3;

import gr.aueb.dt.hello.ch2.ScannerApp;

import java.util.Scanner;

/**
 * keeps reading integers from the user
 * until user enters -1 and evaluate the
 * integers count (-1 included in count)
 */
public class IterationsCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 1;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();

        while (num != -1) {
            iterations++;
            System.out.println("Please enter a number (integer)");
            num = scanner.nextInt();
        }

        System.out.println("Iterations Count: " + iterations);
    }
}
