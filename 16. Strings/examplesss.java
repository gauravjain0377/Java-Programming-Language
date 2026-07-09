import java.util.*;

public class examplesss {
        public static int linearSearch(int numbers[], int key) {
            for(int i=0; i<=numbers.length; i++) {
                if(numbers[i] == key) {
                    return i;
                }
            }
            return -1;
        }
    
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scn.nextInt();

        int numbers[] = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++) {
            numbers[i] = scn.nextInt();
        }

        System.out.print("Enter a key: ");
        int key = scn.nextInt();
        
        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.print("Index not found");
        } else {
            System.out.print("Key found at index " + index);
        }
    
       
    }
}