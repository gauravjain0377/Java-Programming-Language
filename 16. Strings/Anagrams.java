import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {    // Question 4
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scn.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scn.nextLine();

        // Convert both strings to lowercase (to avoid case issues like Race vs Care)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        } else {
            // Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }

        scn.close();
    }
}
