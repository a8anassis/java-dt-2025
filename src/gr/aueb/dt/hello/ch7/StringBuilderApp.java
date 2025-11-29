package gr.aueb.dt.hello.ch7;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 100_000; i++) {
            sb.append(i);   // sb = sb + i;
        }
    }
}
