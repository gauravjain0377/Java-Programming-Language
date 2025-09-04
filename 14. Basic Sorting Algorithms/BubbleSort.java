public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        // outer loop
        for (int i = 0; i < n - 1; i++) {
            // inner loop
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
    }
}
