public class SumofSubArrays {

    public static void printSubArrays(int numbers[]) {
        int totalSubArrays = 0;  // for count of total subarrays
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                System.out.print("Subarray: ");
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");
                }

                int sum = 0;
                
                for(int k=i; k<=j; k++) {
                    sum += numbers[k];
                }
                System.out.print("\n");
                System.out.println("Sum: " + sum);
                System.out.println();
                
                totalSubArrays++;  // for count of total sub arrays.
            }
        }
        System.out.println("Total Subarrays: " + totalSubArrays);
        
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        printSubArrays(numbers);
    }
}
