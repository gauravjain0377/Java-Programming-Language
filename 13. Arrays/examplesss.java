import java.util.*;

public class examplesss {
            public static int binarySearch(int numbers[], int key) {
                int start = 0;
                int end = numbers.length - 1;

                while(start <= end) {
                    int mid = (start + end) / 2;

                    if(numbers[mid] == key) {
                        return mid;
                    }
                    
                 if(numbers[mid] < key) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
                return -1;
            }
   

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENter the size of an array: ");
        int size = scn.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++) {
            numbers[i] = scn.nextInt();
        }

        System.out.print("Enter key: ");
        int key = scn.nextInt();

        int index = binarySearch(numbers, key);
        if(index == -1) {
            System.out.print("Index not found");
        } else {
            System.out.println("Found at index " + index);
        }
       
    }
}