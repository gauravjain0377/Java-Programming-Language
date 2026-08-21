/*
Sort an array of 0's 1's and 2's

Example 1:
Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]

Explanation:
The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Example 2:
Input: nums = [0, 0, 1, 1, 1]
Output: [0, 0, 1, 1, 1]

Explanation:
The nums array in sorted order has 2 zeroes, 3 ones and zero twos
 */



// This is the Dutch National Flag problem. The most optimized approach uses three pointers: low, mid, and high.

// It sorts the array in-place in O(n) time and O(1) space.

import java.util.Scanner;

public class SortArray012 {
     public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;

            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }


     public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        sortColors(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}
