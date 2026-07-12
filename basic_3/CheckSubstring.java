import java.util.*;

public class CheckSubstring {

    public static boolean checkSubstring(String str, String sub) {
        return str.contains(sub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Main String: ");
        String str = sc.nextLine();

        System.out.print("Enter Substring: ");
        String sub = sc.nextLine();

        if (checkSubstring(str, sub))
            System.out.println("Substring Found");
        else
            System.out.println("Substring Not Found");

        sc.close();
    }
}
