/*
For Majority Element, the best optimized approach is Boyer-Moore Voting Algorithm

Example 1
Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
Output: 7

Explanation:
The number 7 appears 5 times in the 9 sized array

Example 2
Input: nums = [1, 1, 1, 2, 1, 2]
Output: 1

Explanation:
The number 1 appears 4 times in the 6 sized array


*/

import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println("Majority Element = " + majorityElement(nums));

        scn.close();
    }
}

