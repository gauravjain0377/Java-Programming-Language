// Find Second Largest in Array

import java.util.*;

public class SecondLargest {

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = largest;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = secondLargest(arr);

        // System.out.print(secondLargest(arr));

        if (ans == Integer.MIN_VALUE)
            System.out.println("Second Largest does not exist");
        else
            System.out.println("Second Largest = " + ans);

        sc.close();
    }
}
