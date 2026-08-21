/*
Input : nums = [1, 2, 2, 4, 3, 1, 4]

Output : 3

Explanation : The integer 3 has appeared only once.
 */

import java.util.*;

public class SingleNumber {

    public static int findSingle(int[] nums) {
        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println("Single Number = " + findSingle(nums));

        scn.close();
    }
}