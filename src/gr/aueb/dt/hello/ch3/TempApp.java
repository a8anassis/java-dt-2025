package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * get an input from the user and checks
 * if the temperature is below zero.
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTempBellowZero = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = scanner.nextInt();

        isTempBellowZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTempBellowZero);
    }
}
