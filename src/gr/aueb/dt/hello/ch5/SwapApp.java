package gr.aueb.dt.hello.ch5;

/**
 * Swap two numbers. Mutually exchange the values of two variables.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println("a = " + a + ", b = " + b);
    }

    /**
     * Swaps two numbers. a, becomes b, and b becomes, a.
     * @param a     the first number.
     * @param b     the second number.
     */
    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
