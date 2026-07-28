// Reverse Words in a Sentence

import java.util.*;

public class ReverseWords {

    public static String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverseWords(str));

        sc.close();
    }
}