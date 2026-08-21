/*
A valid parentheses string is defined by the following rules:
It is the empty string "".
If A is a valid parentheses string, then so is "(" + A + ")".
If A and B are valid parentheses strings, then A + B is also valid.

Example 1
Input: s = "((()))"
Output: "(())"
Explanation:
The input string is a single primitive: "((()))".
Removing the outermost layer yields: "(())".

Example 2
Input: s = "()(()())(())"
Output: "()()()"
Explanation:
Primitive decomposition: "()" + "(()())" + "(())"
After removing outermost parentheses: "" + "()()" + "()"
Final result: "()()()".
*/

import java.util.*;
public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();

        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                if (depth > 0) {
                    ans.append(ch);
                }

                depth++;
            }

            else {

                depth--;

                if (depth > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(removeOuterParentheses(s));

        sc.close();
    }
}

