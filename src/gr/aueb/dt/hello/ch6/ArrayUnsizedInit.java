package gr.aueb.dt.hello.ch6;

/**
 * Array unsized initialization.
 */
public class ArrayUnsizedInit {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };              // unsized initialization
        int[] arr2 = new int[] { 1, 2, 3, 4, 5 };       // array initializer

        // traverse -- visit each element and print it
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // enhanced for loop
        for (int item : arr) {
            System.out.print(item + " ");
        }

    }
}
