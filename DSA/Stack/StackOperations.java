import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack = " + stack);

        // Push
        stack.push(100);
        System.out.println("After Push = " + stack);

        // Pop
        System.out.println("Popped Element = " + stack.pop());
        System.out.println("After Pop = " + stack);

        // Peek
        System.out.println("Top Element = " + stack.peek());

        // Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (stack.contains(key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        // Size
        System.out.println("Size = " + stack.size());

        // Is Empty
        System.out.println("Is Empty = " + stack.isEmpty());

        // Display Stack
        System.out.println("Stack = " + stack);

        sc.close();
    }
}