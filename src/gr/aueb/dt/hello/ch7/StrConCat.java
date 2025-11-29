package gr.aueb.dt.hello.ch7;

public class StrConCat {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        String str4 = str1.concat(" ").concat(str2);
    }
}
