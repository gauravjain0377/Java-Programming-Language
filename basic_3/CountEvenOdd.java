import java.util.*;
public class CountEvenOdd {
    public static int[] countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[] {even, odd};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = countEvenOdd(arr);

        System.out.println("Even Numbers = " + result[0]);
        System.out.println("Odd Numbers = " + result[1]);

        sc.close();
    }
}





// import java.util.*;

// public class Main {

//     public static void countEvenOdd(int[] arr) {

//         int even = 0;
//         int odd = 0;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//         }

//         System.out.println("Even Numbers = " + even);
//         System.out.println("Odd Numbers = " + odd);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         countEvenOdd(arr);

//         sc.close();
//     }
// }