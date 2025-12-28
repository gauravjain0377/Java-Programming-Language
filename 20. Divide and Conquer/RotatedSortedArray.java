// Search in Rotated Sorted Array
// Input: Sorted, rotated array with distinct numbers (in ascending order).
// It is rotated at a pivot point. Find the index of given element.

// Example =>
// array is 1,2,3,4,5 so it is ascending and in distinct so like taking 3 as pivot.
// now, we have rotated along pivot element 3
// so array will be   (4, 5, 1, 2, 3)

// so for this question we will use Modified Binarr Search


public class RotatedSortedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si)/2;   // (si+ei)/2

        // case Found
        if(arr[mid] == tar) {
            return mid;
        }

        // mid on Line 1
        if(arr[si] <= arr[mid]) {
            // case a: left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid); 
            } else {
                // case b: right
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on Line 2
        else {
            // case c: right
            if(arr[mid] <= tar && tar <= arr[ei] ) {
                return search(arr, tar, mid+1, ei);
            } else {
                // case d: left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}

