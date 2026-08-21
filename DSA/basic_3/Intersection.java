// Find Intersection of Two Arrays
/* 
The intersection means the elements that are present in both arrays.

Example:
Array 1 = 1 2 3 4 5
Array 2 = 3 4 5 6 7
Intersection = 3 4 5
 */

import java.util.*;

public class Intersection {
    public static void findIntersection(int[] arr1, int[] arr2) {
        boolean found = false;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No Common Elements");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second array:");

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Intersection: ");
        findIntersection(arr1, arr2);

        sc.close();
    }
}
