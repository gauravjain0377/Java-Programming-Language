import java.util.*;

public class Example {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int key = scn.nextInt();

      int index = binarySearch(arr, key);
      if(index == -1) {
        System.out.print("No key found");
      } else {
        System.out.print("Key found at index: " + index);
      }
    }
}