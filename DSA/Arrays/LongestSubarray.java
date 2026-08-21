/*
Longest subarray with sum K

Example 1
Input: nums = [10, 5, 2, 7, 1, 9],  k=15
Output: 4

Explanation:
The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2
Input: nums = [-3, 2, 1], k=6
Output: 0

Explanation:
There is no sub-array in the array that sums to 6. Therefore, the output is 0.

*/

import java.util.*;

public class LongestSubarray {

    public static int longestSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // If the entire subarray from 0 to i has sum k
            if (sum == k) {
                maxLength = i + 1;
            }
            // Check whether sum - k appeared before
            if (map.containsKey(sum - k)) {
                int length = i - map.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store only the first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        System.out.println(longestSubarray(nums, k));

        scn.close();
    }
}
