package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * Shows a menu to the user, and user makes a choice
 * until the choice equals 3 (where 3 is exit)
 */
public class DoMenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Insert a product");
            System.out.println("2. Delete a product");
            System.out.println("3. Quit the product app");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using our product app");

        while (true) {
            System.out.println("Please select one of the following:");
            System.out.println("1. Insert a book");
            System.out.println("2. Delete a book");
            System.out.println("3. Quit the book app");
            choice = scanner.nextInt();
            if (choice == 3) break;
        }

        System.out.println("Thanks for using our book app");
    }
}
