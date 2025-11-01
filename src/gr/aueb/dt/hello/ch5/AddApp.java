package gr.aueb.dt.hello.ch5;

/**
 * It demonstrates the sum with a method.
 */
public class AddApp {

    public static void main(String[] args) {

        // Declaration and initialization
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        int result2 = 0;


        result = add(num1, num2);
        result2 = add(30, num2);

        System.out.println("Result: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
