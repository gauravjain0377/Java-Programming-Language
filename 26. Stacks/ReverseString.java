import java.util.*;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String str2 = "HelloWorld";
        String result = reverseString(str);
        String result2 = reverseString(str2);
        System.out.println(result);
        System.out.println(result2);

    }
}

// public class ReverseString {
// public static void main(String[] args) {
// Stack<Character> s = new Stack<>();
// s.push('a');
// s.push('b');
// s.push('c');

// Stack<Character> temp = new Stack<>();

// while (!s.isEmpty()) {
// temp.push(s.pop());
// }

// while (!temp.isEmpty()) {
// s.push(temp.pop());
// }

// while (!s.isEmpty()) {
// System.out.print(s.pop());
// }
// }
// }