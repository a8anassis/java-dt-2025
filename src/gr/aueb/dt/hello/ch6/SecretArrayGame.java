package gr.aueb.dt.hello.ch6;

import java.util.Scanner;

/**
 * Secret Array Game.
 */
public class SecretArrayGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 10, 21, 33, 44, 55 };     // SECRET ARRAY
        int guess = 0;
        int position = -1;

        // invoke a service to get the position, in the array, of the secret value

        while (true) {
            System.out.println("Please guess the secret");
            guess = scanner.nextInt();

            position = getPosition(arr, guess);

            // Display the position of the secret if found
            if (position == -1) {
                System.out.println("The guess was not found");
                continue;
            }

            System.out.println("Element was found in position: " + position);
            break;
        }
    }

    /**
     * Gets the position of the secret value in the array.
     * @param arr       the input parameter.
     * @param guess     the input parameter.
     * @return          the position of the secret value in the array if found, -1 otherwise.
     */
    public static int getPosition(int[] arr, int guess) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == guess) {      // comparison with ==
                return i;
            }
        }
        return -1;
    }
}
