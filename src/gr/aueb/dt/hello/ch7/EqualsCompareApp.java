package gr.aueb.dt.hello.ch7;

public class EqualsCompareApp {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        boolean equals = str1.equals(str2); // true
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);

        if (str1.compareTo(str2) < 0) {     // we alse have compareToIgnoreCase
            System.out.println("str1 is smaller than str2");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("str1 is greater than str2");
        } else {    // str1.compareTo(str2) == 0
            System.out.println("str1 is equal to str2");
        }
    }
}
