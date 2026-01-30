/* Maximum Area in Histogram
  Given an array of integers heights representing the histogram's bar height where the 
  width of each bar is 1, return the area of the largest rectangle in the histogram. 
  heights = [2, 1, 5, 6, 2, 3] 
  Explanation is in the Notes. (See it, you have to sometimes it's important, iykyk 😜)
  */ 

import java.util.*;

public class MaxAreainHistogram {

    public static void maxArea(int arr[]) {   // O(n) - Optimized
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // nsr => Next Smaller Right - O(n)
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // nsl => Next Smaller Left - O(n)
        s = new Stack<>();

        for(int i=0; i<=arr.length-1; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area: wifth = j-i+1 => nsr[i] - nsl[i] - 1    => O(n)
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width; 
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max Area in Histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}
 