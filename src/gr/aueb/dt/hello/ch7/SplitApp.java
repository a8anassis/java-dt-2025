package gr.aueb.dt.hello.ch7;

public class SplitApp {

    public static void main(String[] args) {
        String str = "Athens University of Economics and Business";
        String[] tokens = str.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
