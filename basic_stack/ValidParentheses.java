/* 
Valid Parentheses
Problem

Given a string containing:

( )  { }  [ ]

Check whether the parentheses are balanced.

Examples
Input:  ()[]{}
Output: true
Input:  ([{}])
Output: true
Input:  ([)]
Output: false
Input:  (((
Output: false
 */


import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {

                if (s.isEmpty()) {
                    return false;
                }

                if (
                    (ch == ')' && s.peek() == '(') ||
                    (ch == '}' && s.peek() == '{') ||
                    (ch == ']' && s.peek() == '[')
                    ) {
                    s.pop();
                } else {
                    return false;
                }


            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isValid(str));

        sc.close();
    }
}