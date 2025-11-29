package gr.aueb.dt.hello.ch6;

/**
 * Find the minimum value in an array.
 */
public class ArrayMin {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {
        int minPosition = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }


    public static int getMinPosition2(int[] arr) {
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }
}
