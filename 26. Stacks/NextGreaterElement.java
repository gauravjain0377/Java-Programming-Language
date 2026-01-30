// Next Greater Element
// Very Important Question - Explanation in Notes
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
// arr = [6, 8, 0, 1, 3]
// next Greater = [8, -1, 1, 3, -1]

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            // 1. while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //2. if-else
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            //3. push in s 
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++) {
            System.out.println(nextGreater[i] + " ");
        }
        System.out.println();
    }
}


// There are different forms for this question.
/* So, 1. next Greater Right Side is above the Question

   2. next Greater Left Side - so in code we just have to change the loop.
   for(int i=0; i<=arr.length-1; i++) {
            // 1. while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

    3. next Smaller Right Side - So in code , just change  < to >, see below.
                for(int i=arr.length-1; i>=0; i--) {
            // 1. while loop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }


    4. next Smaller Left Side - so in code, the changes will be        
         for(int i=0; i<=arr.length-1; i++) {
            // 1. while loop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            
            */