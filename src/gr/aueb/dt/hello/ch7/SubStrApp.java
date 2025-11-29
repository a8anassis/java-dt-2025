package gr.aueb.dt.hello.ch7;

public class SubStrApp {

    public static void main(String[] args) {
        String str = "Hello World";

        String subStr = str.substring(6);   // returns "World"
        String slicedStr = str.substring(6, 11);    // endIndex is exclusive, returns "World"

        // traverse a string with substring
        for (int i = 0; i < subStr.length(); i++) {
            System.out.print(subStr.substring(i, i + 1));
        }
    }
}
