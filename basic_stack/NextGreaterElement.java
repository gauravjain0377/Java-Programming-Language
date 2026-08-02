/* 
Problem

Given:

arr = [6, 8, 0, 1, 3]

Find the first greater element on the right of every element.

Output:

[8, -1, 1, 3, -1]
Why?
For 6

Right side:

8 0 1 3

First greater element:

8

Answer:

8
For 8

Right side:

0 1 3

No greater element.

Answer:

-1
For 0

Right side:

1 3

First greater:

1

Answer:

1
For 1

Right side:

3

Answer:

3
For 3

Nothing on the right.

Answer:

-1

Final answer:

Array : 6  8  0  1  3
NGE   : 8 -1  1  3 -1
 */



// import java.util.Stack;

// public class NextGreaterElement {

//     public static void main(String[] args) {

//         int arr[] = {6, 8, 0, 1, 3};

//         int nextGreater[] = new int[arr.length];

//         Stack<Integer> s = new Stack<>();

//         for (int i = arr.length - 1; i >= 0; i--) {

//             while (!s.isEmpty() && s.peek() <= arr[i]) {
//                 s.pop();
//             }

//             if (s.isEmpty()) {
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = s.peek();
//             }

//             s.push(arr[i]);
//         }

//         for (int i = 0; i < nextGreater.length; i++) {
//             System.out.print(nextGreater[i] + " ");
//         }
//     }
// }




import java.util.*;

public class NextGreaterElement {

    public static void nextGreater(int[] arr, int[] ans) {

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextGreater(arr, ans);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}