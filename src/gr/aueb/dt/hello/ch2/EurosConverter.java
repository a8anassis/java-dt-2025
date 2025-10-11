package gr.aueb.dt.hello.ch2;

import java.util.Scanner;

/**
 * Converts from Euros to ISA Dollars and cents
 * based on a parity.
 */
public class EurosConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUSACents = 0;
        final int PARITY = 98;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("Please insert the amount of Euros (int)");
        inputEuros = scanner.nextInt();

        totalUSACents = inputEuros * PARITY;

        usaDollars = totalUSACents / 100;
        usaCents = totalUSACents % 100;

        System.out.printf("%d euros = %d usa dollars and %d usa cents", inputEuros, usaDollars, usaCents);
    }
}
