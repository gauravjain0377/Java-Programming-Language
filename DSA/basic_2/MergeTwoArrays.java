import java.util.*;

public class MergeTwoArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            merge[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merge[index++] = arr2[i];
        }
        return merge;
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

        int[] result = mergeArrays(arr1, arr2);

        System.out.println("Merged Array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
