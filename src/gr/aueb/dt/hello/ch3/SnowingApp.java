package gr.aueb.dt.hello.ch3;

import java.util.Scanner;

/**
 * Decides if it is snowing, depending on
 * two conditions: 1) if it is raining and 2)
 * if temperature is below zero.
 * We read from the user these two conditions and
 * based on the input we evaluate the returned value that
 * will be true / false
 */
public class SnowingApp {

    public static void main(String[] args) {

        // Declaration and initialization
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;
        Scanner scanner = new Scanner(System.in);

        // Commands
        System.out.println("Please insert if it is raining (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert the temperature (int)");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        // Print the results
        System.out.println("Is snowing: " + isSnowing);
    }
}
