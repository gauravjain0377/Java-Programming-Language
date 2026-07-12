// Reverse Words in a Sentence

import java.util.*;

public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println(reverseWords(str));

        sc.close();
    }
}
