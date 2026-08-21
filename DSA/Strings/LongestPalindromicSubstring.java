/*
Longest Palindromic Substring
A palindromic substring is a contiguous sequence of characters within the string that reads the same forward and backward.

Example 1
Input: s = "babad"
Output: "bab"

Explanation:
Both "bab" and "aba" are valid palindromic substrings of length 3. Return either.

Example 2
Input: s = "cbbd"
Output: "bb"

Explanation:
The longest palindrome is "bb" of length 2.
 */

import java.util.*;

public class LongestPalindromicSubstring {


    public static String longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            int len1 = expand(s, i, i);

            // Even length
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {

                maxLength = len;

                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    static int expand(String s, int left, int right) {

        while (left >= 0
                && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(longestPalindrome(s));

        sc.close();
    }
}

