package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * User finds a secret key
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int inputNum = 0;

        while (true) {
            System.out.println("Please guess the secret");
            inputNum = scanner.nextInt();

//            if (inputNum == SECRET) {
//                System.out.println("Bingo");
//                break;
//            } else {
//                System.out.println("Try Again");
//            }

            if (inputNum != SECRET) {
                System.out.println("Try Again");
                continue;
            }

            System.out.println("Bingo");
            break;
        }
    }
}
