public class SubArrays {

    public static void printSubArrays(int numbers[]) {
        int totalSubArrays = 0;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                System.out.print("Subarray: ");
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                totalSubArrays++;
            }
        }
        System.out.println("Total Subarrays: " + totalSubArrays);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
