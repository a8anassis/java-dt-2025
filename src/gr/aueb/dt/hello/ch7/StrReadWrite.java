package gr.aueb.dt.hello.ch7;

import java.util.Scanner;

public class StrReadWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("Please a string");
        lexeme = scanner.nextLine();    // scanner.next()
        System.out.printf("The lexeme is: %s", lexeme);

        // Assume that we wan to read an int
        System.out.println("Please insert an integer");
        lexeme = scanner.nextLine();
        num = Integer.parseInt(lexeme); // maps string to int
        System.out.printf("The integer is: %d", num);
    }
}
