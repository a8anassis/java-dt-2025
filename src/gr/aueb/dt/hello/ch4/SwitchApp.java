package gr.aueb.dt.hello.ch4;

import java.util.Scanner;

/**
 * A switch demo. A menu app where ethe user inserts
 * a choice and gets a feedback,
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following: ");
            System.out.println("1. One-player game");
            System.out.println("2. Two-layer game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("One-player game");
                    break;
                case 2:
                    System.out.println("Tw-player game");
                    break;
                case 3:
                    System.out.println("3. Team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 4);
    }
}
