import java.util.*;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, data);

        s.push(top);
    }


    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Before = " + s);

        pushAtBottom(s, 5);

        System.out.println("After = " + s);
    }
}




/* 

import java.util.*;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, data);

        s.push(top);
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

        System.out.print("Enter element to push at bottom: ");
        int data = sc.nextInt();

        pushAtBottom(s, data);

        System.out.println("Updated Stack = " + s);

        sc.close();
    }
}
    
*/