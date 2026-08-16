// // Check if Array Is Sorted and Rotated


import java.util.*;

public class CheckArraySortedRotated {
    public static boolean check(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > nums[(i+1) % nums.length]) {
                count++;
            }

            if(count > 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = scn.nextInt();
        }

       // System.out.print(check(nums));

        boolean result = check(nums);
        System.out.print(result);
    }
}





























// import java.util.*;

// public class CheckArraySortedRotated {

//     public static boolean check(int[] nums) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > nums[(i + 1) % nums.length]) {
//                 count++;
//             }
//             if (count > 1) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.print("Enter array size: ");
//         int n = scn.nextInt();

//         int[] nums = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {
//             nums[i] = scn.nextInt();
//         }

//         boolean result = check(nums);

//         System.out.println(result);

//         scn.close();
//     }
// }