public class SelectionSort {

    public static void selectionSort(int arr[]) {
       int n = arr.length;

       for(int i=0; i<n-1; i++) {
        int minPos = i;
        for(int j=i+1; j<n; j++) {
            if(arr[minPos] > arr[j]) {
                minPos = j;
            }
        }

        // swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
       }

       System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
  }

    public static void main(String[] args) {
        int arr[] = {60, 24, 82, 52, 77551};
        selectionSort(arr);
    }
}
