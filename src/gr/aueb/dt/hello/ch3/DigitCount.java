package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * Finds the count of digits of an integer.
 * For instance, if we have num = 123, then
 * digit-count is 3
 */
public class DigitCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;

        System.out.println("Please insert a num (integer)");
        inputNum = scanner.nextInt();

        num = inputNum;
        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.printf("Num: %d includes %d digits", inputNum, count);
    }
}
