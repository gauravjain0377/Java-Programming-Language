// Left Rotate Array by K Places

import java.util.*;

public class RotateArrayLeftKSteps {
    public static void leftRotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        leftRotate(nums, k);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}
