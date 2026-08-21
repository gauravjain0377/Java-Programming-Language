/*
Rearrange array elements by sign

Input : nums = [2, 4, 5, -1, -3, -4]
Output : [2, -1, 4, -3, 5, -4]
Explanation:
The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

Example 2
Input : nums = [1, -1, -3, -4, 2, 3]
Output : [1, -1, 2, -3, 3, -4]
Explanation:
The positive number 1, 2, 3 maintain their relative positions and -1, -3, -4 maintain their relative positions
*/

import java.util.Scanner;

public class Rearrangearrayelementsbysign {
      public static int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int num : nums) {

            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = rearrangeArray(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
