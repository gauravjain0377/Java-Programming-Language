/*
Maximum Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1s in the array.


A binary array is an array that contains only 0s and 1s.
Example 1
Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]
Output: 3

Explanation:
The maximum consecutive 1s are present from index 4 to index 6, amounting to 3 1s
 */


import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static int maxConsecutive(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println(maxConsecutive(nums));

        scn.close();
    }
}
