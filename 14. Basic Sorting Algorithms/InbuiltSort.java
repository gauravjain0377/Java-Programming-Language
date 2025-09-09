import java.util.*;

public class InbuiltSort {

    public static void main(String[] args) {
        Integer arr[] = { 5, 444, 1, 3, 2, 34, 5443, 2343, 4243, 3443, 34, 533, 4};
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 7);
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 7, Collections.reverseOrder());
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}