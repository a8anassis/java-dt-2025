package gr.aueb.dt.hello.ch3;

/**
 * It finds the sum and mul of the first ten
 * integers, from 1 until 10
 */
public class SumMul10App {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum = sum + i;
            mul = mul * i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.printf("Mul: %,d", mul);
    }
}
