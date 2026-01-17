import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scn.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if (ch >= '0' && ch <= '9') {
            //     count++;
            // }
            if(Character.isDigit(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
