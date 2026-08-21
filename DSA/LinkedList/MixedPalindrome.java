import java.util.LinkedList;
import java.util.Scanner;

public class MixedPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Object> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            String value = sc.next();

            try {
                list.add(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                list.add(value);
            }
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

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MixedPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Object> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            String value = sc.next();

            try {
                list.add(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                list.add(value);
            }
        }

        LinkedList<Object> reverse = new LinkedList<>(list);

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