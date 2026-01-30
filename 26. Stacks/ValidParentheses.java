/* Valid Parentheses 
   Given a string s containing just the characters '(', ')', '{', '}',
   '[', ']', determine if the input string is valid.
   An input string is valid if:
   1. Open brackets must be closed by the same type of brackets.
   2. Open brackets must be closed in the correct order.
   3. Every close bracket has a corresponding open bracket of the same type.
   
   Ex - s = "()[]{}" => valid
   s = "()" => valid
   s = "(] => Not Valid
   s = ")(" => Not Valid 
   s = "({[]})" => valid
   s = "({[])}" => Not Valid 
   */

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String str) {   // O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // Opening
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else {
                // closing
                if(s.isEmpty()) {
                    return false;
                }
                if( (s.peek() == '(' && ch == ')' ) // ()
                || (s.peek() == '{' && ch == '}' )  // {}
                || (s.peek() == '[' && ch == ']') ) // []
                  {  
                    s.pop();
                }  else {
                    return false;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        } 
       
    }
    public static void main(String[] args) {
        String str = "({})[]"; // true
        String str2 = "(){})[]"; // true

        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}