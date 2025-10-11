package gr.aueb.dt.hello.ch1;

/**
 * This app shows how we can write
 * output to the end user.
 */
public class PrintApp {

    public static void main(String[] args) {
        int num = 12;
        int num2 = 20;
        int sum = 0;

        sum = num + num2;

        System.out.println(num);
        System.out.printf("%4d", num);

        System.out.println("The value of num is; " + num);
        System.out.printf("The value of num is: %d ", num);

        System.out.println("The sum of " + num + ", " + num2 + " = " + sum);
        System.out.printf("The sum of %d , %d = %d\n", num, num2, sum);

    }
}
