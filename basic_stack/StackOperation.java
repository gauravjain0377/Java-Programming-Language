import java.util.*;

public class StackOperation {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack = " + s);

        System.out.println("Peek = " + s.peek());

        System.out.println("Pop = " + s.pop());

        System.out.println("Search = " + s.search(10));

        System.out.println("Contains = " + s.contains(20));

        System.out.println("Size = " + s.size());

        System.out.println("Is Empty = " + s.isEmpty());

        System.out.println("Stack = " + s);
    }
}

