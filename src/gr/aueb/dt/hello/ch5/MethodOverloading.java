package gr.aueb.dt.hello.ch5;

/**
 * Method Overloading.
 */
public class MethodOverloading {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        double num4 = 10.5;
        double num5 = 20.5;
        int result1 = 0;
        int result2 = 0;
        long result3 = 0;
        double result4 = 0;

        // Call the overloaded methods
        result1 = add(num1, num2);
        result2 = add(num1, num2, num3);
        result3 = add(num1, num2);
        result4 = add(num4, num5);

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
        System.out.println("Result4: " + result4);
    }


    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static long add(int num1, long num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}
