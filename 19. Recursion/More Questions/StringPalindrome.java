import java.util.*;

public class StringPalindrome {

    public static boolean checkPalindrome(String str, int i) {

        int n = str.length();

        if (i >= n / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }

        return checkPalindrome(str, i + 1);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        if (checkPalindrome(str, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scn.close();
    }
}