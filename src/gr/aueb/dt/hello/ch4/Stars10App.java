package gr.aueb.dt.hello.ch4;

import java.util.Scanner;

/**
 * It prints 10 stars horizontally.
 */
public class Stars10App {

    public static void main(String[] args) {

        // Horizontal
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // Vertical
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // 10 rows with 10 stars each
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 15; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
