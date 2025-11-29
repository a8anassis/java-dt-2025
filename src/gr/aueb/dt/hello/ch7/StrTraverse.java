package gr.aueb.dt.hello.ch7;

public class StrTraverse {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));    // s[i]
        }

        // to print the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
