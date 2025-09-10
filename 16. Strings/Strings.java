import java.util.*;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scn.nextLine();
        System.out.println(name);

        // calcuate the length of String
        System.out.println(name.length());

        // String Concatenation
        String firstName = "Gaurav";
        String lastName = "Jain";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));

        scn.close();
    }
}
