public class CountingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            }

            int count[] = new int[largest +  1];
            for(int i=0; i<arr.length; i++) {
                count[arr[i]]++;
            }
       

        // sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
    }
     System.out.print("Sorted Array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
 }

    public static void main(String[] args) {
        int arr[] = { 5, 444, 1, 3, 2, 3434, 56, 43, 455, 42};
        countingSort(arr);
    }
}
