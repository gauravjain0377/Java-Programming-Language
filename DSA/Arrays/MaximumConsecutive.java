/*
Maximum consecutive of any given digit
If you want to find the maximum consecutive occurrences of a specific number, pass the number as a parameter.

Input:
8
2 2 3 3 3 2 3 3
3

Output:
3

Because the longest consecutive sequence of 3 is:
3 3 3

 */

import java.util.*;

public class MaximumConsecutive {

    public static int maxConsecutive(int[] nums, int target) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
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

        int target = scn.nextInt();

        System.out.println(maxConsecutive(nums, target));

        scn.close();
    }
}