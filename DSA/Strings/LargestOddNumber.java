/*
Largest Odd Number in a String

Example 1
Input : s = "5347"
Output : "5347"
Explanation :
The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.

Example 2
Input : s = "0214638"
Output : "21463"
Explanation :
The different odd numbers that can be formed by the given string are --> 1, 3, 21, 63, 463, 1463, 21463.
We cannot include 021463 as the number contains leading zero.
So largest odd number in given string is 21463.*/

import java.util.Scanner;

public class LargestOddNumber {
     public static String largestOddNumber(String s) {

        int n = s.length();

        // Find the last odd digit
        int end = -1;

        for (int i = n - 1; i >= 0; i--) {

            int digit = s.charAt(i) - '0';

            if (digit % 2 == 1) {
                end = i;
                break;
            }
        }

        // No odd number exists
        if (end == -1) {
            return "";
        }

        // Remove leading zeros
        int start = 0;

        while (start <= end && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(largestOddNumber(s));

        sc.close();
    }
}
