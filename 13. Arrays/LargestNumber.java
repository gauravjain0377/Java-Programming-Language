import java.util.*;

public class LargestNumber {

    
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE; 
       
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i]; 
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i]; 
            }
        }

       
        System.out.println("The smallest number is: " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int numbers[] = new int[size];
       
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scn.nextInt();
        }

        
        System.out.println("The largest number is: " + getLargest(numbers));

        scn.close();
    }
}





// import java.util.*;

// public class LargestNumber {

// public static int getLargest(int numbers[]) {
//     int largest = Integer.MIN_VALUE;
//     int smallest = Integer.MAX_VALUE;

//     for(int i=0; i<numbers.length; i++) {
//         if(largest < numbers[i]) {
//             largest = numbers[i];
//         }
//         if(smallest > numbers[i]) {
//             smallest = numbers[i];
//         }
//     }
//     System.out.println("The smallest number is: " + smallest);
//     return largest;

// }
//     public static void main(String[] args) {
//         int numbers[] = {10000, 200000000, -605555, -58143, 5};
        
//         System.out.println("The largest number is: " + getLargest(numbers));

//     }
// }
