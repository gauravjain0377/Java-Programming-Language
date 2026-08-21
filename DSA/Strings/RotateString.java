/*
Rotate String

Input : s = "abcde" , goal = "cdeab"
Output : true
Explanation :
After performing 2 shifts we can achieve the goal string from string s.
After first shift the string s is => bcdea
After second shift the string s is => cdeab.

Example 2
Input : s = "abcde" , goal = "adeac"
Output : false
Explanation :
Any number of shift operations cannot convert string s to string goal.

*/

import java.util.*;
public class RotateString {
    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String goal = sc.next();

        System.out.println(rotateString(s, goal));

        sc.close();
    }
}

