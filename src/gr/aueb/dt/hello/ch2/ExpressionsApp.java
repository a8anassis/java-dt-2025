package gr.aueb.dt.hello.ch2;

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;

//        result1 = num1 / num2;
//        result2 = num1 * num2;

        result3 = num2++;   // result3 -> 5, num2 -> 6
        result4 = ++num2;   // num2 -> result3 -> 6

        result5 = (num1 + num2) * (num1 - num2) / (num1 % num2);

        System.out.println("Sum = " + sum);
        System.out.println("Result1 = " + result1);
    }
}
