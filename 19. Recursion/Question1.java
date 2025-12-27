public class Question1 {

    public static void allOccurences(int arr[], int key, int i ) {
        if(i == arr.length) {
        return;
    }
        if(arr[i] == key) {
       System.out.print(i+" ");
    }
    allOccurences(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 5, 5, 7, 6};
        int key = 5;
        allOccurences(arr, key, 0);
        System.out.println();

    }
}
