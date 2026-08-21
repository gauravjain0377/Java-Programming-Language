import java.util.LinkedList;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter number of Strings: ");
        int n = sc.nextInt();

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        boolean palindrome = true;

        for (int i = 0; i < list.size() / 2; i++) {

            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}





/* 

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        LinkedList<String> reverse = new LinkedList<>(list);

        Collections.reverse(reverse);

        if (list.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}

*/