import java.util.*;

public class MissingNumber {
     public static int findMissing(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing Number = " + findMissing(arr, n));

        sc.close();
    }
}