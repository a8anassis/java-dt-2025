package gr.aueb.dt.hello.ch6;

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = { 20, 12, 8, 40, 2 };
        int[] sorted;
        sorted = selectionSort(arr);

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        int minPosition = 0;
        int minValue = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            minValue = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, minPosition, i);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
