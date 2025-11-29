package gr.aueb.dt.hello.ch7;

/**
 * It finds if a string is a palindrome.
 * Assume s = "aabaa";
 * or s = "abba";
 */
public class PalindromeApp {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
