import java.util.*;

public class ReverseString {
public static String reverseString(String str) {

    String reverse = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        reverse += str.charAt(i);
    }
    return reverse;
}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scn.nextLine();

        System.out.print(reverseString(str));
    }
}
