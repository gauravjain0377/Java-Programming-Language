// Sum of first N numbers

import java.util.*;

// public class Sum {
//     // Parametrised Way
//     public static void sum(int i, int sum) {
//         if(i < 1) {
//             System.out.print(sum);
//             return;
//         }
//         sum(i-1, sum+i);
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         sum(n, 0);
//     }
// }



public class Sum {
    // Functional Way
    public static int sum(int n) {
       if(n == 0) return 0;

       return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.print(sum(n));
    }
}
