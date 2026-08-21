// Two Pointers Approach
// Move All Zeros to End

import java.util.*;

public class MoveAllZerosToEnd {

    public static void moveZeros(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
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

        moveZeros(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}