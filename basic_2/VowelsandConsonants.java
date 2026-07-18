import java.util.*;

public class VowelsandConsonants {

    public static void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        countVowelsConsonants(str);

        sc.close();
    }
}



/* 
import java.util.*;

public class VowelsandConsonants {

    public static int[] countVowelsConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] result = countVowelsConsonants(str);

        System.out.println("Vowels = " + result[0]);
        System.out.println("Consonants = " + result[1]);

        sc.close();
    }
}
    */