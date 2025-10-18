package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * Alternative to the 'if' statement when we
 * have assignments inside 'if'.
 *
 * It finds the absolute of the integer teh user
 * inserts.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs;

        System.out.println("Please insert an integer");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;

        System.out.println("Abs: " + abs);

    }
}
