package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * To evaluate the count of positive integers
 * that the user will insert.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = 0;
        int positivesCount = 0;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please enter a number (integer)");
            num = scanner.nextInt();
        }

        System.out.printf("Positives count: " + positivesCount);
    }
}
