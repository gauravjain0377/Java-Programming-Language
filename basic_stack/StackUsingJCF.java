import java.util.*;

public class StackUsingJCF {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Push
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack = " + s);

        // Peek
        System.out.println("Top Element = " + s.peek());

        // Pop
        System.out.println("Removed Element = " + s.pop());

        System.out.println("Stack After Pop = " + s);

    }
}