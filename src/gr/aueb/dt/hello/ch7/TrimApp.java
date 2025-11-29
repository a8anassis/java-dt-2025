package gr.aueb.dt.hello.ch7;

import java.util.Scanner;

public class TrimApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = "";

        System.out.println("Please insert your firstname");
        firstname = scanner.nextLine().trim();  // exclude leading and trailing spaces

        System.out.println("Your firstname is: " + firstname.trim());
    }
}
