// Remove Specific Character from String

import java.util.*;

public class RemoveCharacterString {

    public static String removeCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println(removeCharacter(str, ch));

        sc.close();
    }
}
