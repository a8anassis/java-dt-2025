package gr.aueb.dt.hello.ch6;

/**
 * Demonstrates arrays, as method parameters.
 */
public class ArrayAsMethodParam {

    public static void main(String[] args) {
        int[] ages = { 20, 25, 30, 22, 28, 32, 35, 37, 26 };

        // printArray(ages);
        printArray(ages, 2, 7);
    }

    /**
     * Prints the contents of the array.
     * @param arr   the input parameter.
     */
    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int item : arr) {
            System.out.println(item);
        }
    }

    /**
     * Prints a slice of the array.
     * @param arr   the input parameter.
     * @param low   the lower bound of the slice.
     * @param high  the upper bound of the slice.
     */
    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length || low > high)  {
            return;
        }
        for (int i = low; i < high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
