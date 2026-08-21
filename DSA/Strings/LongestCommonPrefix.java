/*
Longest Common Prefix

Input : str = ["flowers" , "flow" , "fly", "flight" ]
Output : "fl"
Explanation :
All strings given in array contains common prefix "fl".

Example 2
Input : str = ["dog" , "cat" , "animal", "monkey" ]
Output : ""
Explanation :
There is no common prefix among the given strings in array.
*/

import java.util.*;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int j = 0;

            while (j < prefix.length()
                    && j < strs[i].length()
                    && prefix.charAt(j) == strs[i].charAt(j)) {

                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        System.out.println(longestCommonPrefix(strs));

        sc.close();
    }
}
