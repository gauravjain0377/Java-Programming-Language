import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reverse = "";

        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        System.out.println("Reversed String = " + reverse);

        sc.close();
    }
}