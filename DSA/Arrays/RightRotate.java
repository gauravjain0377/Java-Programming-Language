import java.util.*;

public class RightRotate {

    public static void rightRotate(int[] nums) {

        int last = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = last;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        rightRotate(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}