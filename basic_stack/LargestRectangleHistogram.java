/* 

Given an array of integers heights representing the histogram's bar height where the 
  width of each bar is 1, return the area of the largest rectangle in the histogram. 
  
  Problem

Given:

heights = [2,1,5,6,2,3]

Each number is the height of a bar.

      █
      █
    █ █
    █ █   █
█   █ █   █
█ █ █ █ █ █
-------------
2 1 5 6 2 3

Find the largest rectangle area.

Answer:

10

because:

5 6
█ █
█ █

Height = 5

Width = 2

Area =

5 × 2 = 10

*/


import java.util.*;

public class LargestRectangleHistogram {

    public static int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])) {

                int height = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        System.out.println(largestRectangle(heights));

        scn.close();
    }
}



/* 

import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {

        int heights[] = {2, 1, 5, 6, 2, 3};

        int n = heights.length;

        int left[] = new int[n];
        int right[] = new int[n];

        Stack<Integer> s = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty())
                left[i] = -1;
            else
                left[i] = s.peek();

            s.push(i);
        }

        s.clear();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty())
                right[i] = n;
            else
                right[i] = s.peek();

            s.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);
    }
}

*/

/* 
public class LargestRectangle {

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int minHeight = heights[i];

            for (int j = i; j < heights.length; j++) {

                minHeight = Math.min(minHeight, heights[j]);

                int width = j - i + 1;

                int area = minHeight * width;

                maxArea = Math.max(maxArea, area);
            }
        }

        System.out.println("Largest Area = " + maxArea);
    }
}
    
*/






    
