package gr.aueb.dt.hello.ch5;

public class FloatingPointApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 10.5F;
        double doubleNum = 200000000.6;

        double doubleResult = 0;

        doubleResult = intNum + floatNum + doubleNum;

        System.out.printf("Result: %.2f", doubleResult);
    }
}
