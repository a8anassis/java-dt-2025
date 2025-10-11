package gr.aueb.dt.hello.ch2;

/**
 * It uses the Math.random() method to produce
 * random integers.
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1;
    }
}
