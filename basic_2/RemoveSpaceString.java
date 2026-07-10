import java.util.*;

public class RemoveSpaceString {
    public static String removeSpaces(String str) {

        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println(removeSpaces(str));

        sc.close();
    }
}
