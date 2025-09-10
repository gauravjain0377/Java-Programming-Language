import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = scn.nextLine();

        int count = 0; // to keep track of vowels

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // get character at index i

            // Check if it's a lowercase vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Print the result
        System.out.println("Number of lowercase vowels: " + count);

        scn.close();
    }
}
