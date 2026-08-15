// Print linearly from 1 to N

import java.util.*;

public class onetoN {
    public static void print(int i, int n) {
        if(i > n) return;

        System.out.println(i);
        print(i+1, n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(1, n);
    }
}



// By backtracking
// public class onetoN {
//      public static void print(int i, int n) {
//         if(i < 1) return;

//         print(i-1, n);
//         System.out.println(i);
        

// }
//  public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         print(n, n);
//     }
// }