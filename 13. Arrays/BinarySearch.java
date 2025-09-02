public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {   // right
                start = mid + 1;
            } else {                   // left
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;   

        int index = binarySearch(numbers, key);
        if(index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("The key is found at index: " + index);
        }
    }
}
