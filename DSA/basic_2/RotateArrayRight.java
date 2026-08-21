// Rotate Array Right by 1 Position

import java.util.*;
public class RotateArrayRight {
    public static void rotateRight(int[] arr)  {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateRight(arr);

        System.out.println("Array after rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
