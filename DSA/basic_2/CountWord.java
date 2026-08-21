import java.util.*;
    
public class CountWord {
    public static int countWords(String str) {
        str = str.trim();

        if (str.length() == 0)
            return 0;

        String[] words = str.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String or a Sentence: ");
        String str = sc.nextLine();

        System.out.println(countWords(str));

        sc.close();
    }
}