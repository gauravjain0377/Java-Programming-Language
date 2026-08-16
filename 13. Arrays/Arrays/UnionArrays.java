/*

Example 1
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Example 2
Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
Output: [1, 3, 4, 5, 6, 7, 8, 9]
Explanation:
The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2

 */


import java.util.*;

public class UnionArrays {

    public static ArrayList<Integer> union(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }

                i++;

            } else if (nums2[j] < nums1[i]) {

                if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
                    result.add(nums2[j]);
                }

                j++;

            } else {

                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        while (i < nums1.length) {

            if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                result.add(nums1[i]);
            }

            i++;
        }

        while (j < nums2.length) {

            if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
                result.add(nums2[j]);
            }

            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] nums1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            nums1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] nums2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            nums2[i] = scn.nextInt();
        }

        ArrayList<Integer> result = union(nums1, nums2);

        System.out.println(result);

        scn.close();
    }
}
