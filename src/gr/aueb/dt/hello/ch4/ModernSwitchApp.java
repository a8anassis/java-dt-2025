package gr.aueb.dt.hello.ch4;

import java.util.Scanner;

public class ModernSwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Please insert a grade");
        grade = scanner.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Fail");
            case 5, 6 -> System.out.println("Good");
            case 7, 8 -> System.out.println("V. Good");
            case 9, 10 -> System.out.println("Excellent");
            default -> System.out.println("Error in grade");
        }
    }
}
