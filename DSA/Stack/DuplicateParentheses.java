/* Duplicate Parentheses
Problem

Check whether an expression contains duplicate brackets.

Example:

((a+b))

Output:

true

because there is an unnecessary pair of parentheses.

Example:

(a+b)

Output:

false

Example:

((a+b)+(c+d))

Output:

false
*/


import java.util.*;

public class DuplicateParentheses {

    public static boolean duplicate(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;

                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                s.pop();

                if (count < 1) {
                    return true;
                }

            } else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(duplicate(str));

        sc.close();
    }
}