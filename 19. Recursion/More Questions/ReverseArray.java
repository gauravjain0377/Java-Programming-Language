import java.util.*;

public class ReverseArray {

    public static void reverse(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        reverse(nums, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        reverse(nums, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        scn.close();
    }
}




/*
import java.util.*;

public class ReverseArray {

    public static void reverse(int[] arr, int i, int n) {

        if (i >= n / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverse(arr, i + 1, n);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scn.close();
    }
}
    
*/