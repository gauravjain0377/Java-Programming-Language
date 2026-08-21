import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Original Stack = " + s);

        Collections.reverse(s);

        System.out.println("Reversed Stack = " + s);
    }
}




/* 

import java.util.*;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, data);

        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();

        reverse(s);

        pushAtBottom(s, top);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println("Original Stack = " + s);

        reverse(s);

        System.out.println("Reversed Stack = " + s);

        sc.close();
    }
}
    
*/

