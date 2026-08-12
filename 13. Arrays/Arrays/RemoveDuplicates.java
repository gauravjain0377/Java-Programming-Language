// Remove Duplicates from Sorted Array

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++) {
            nums[i] = scn.nextInt();
        }

        int k = removeDuplicates(nums);
        System.out.println(k);

        for(int i=0; i<k; i++) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}