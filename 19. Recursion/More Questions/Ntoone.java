// // Print in terms of N to 1

// import java.util.*;

// public class Ntoone {
//     public static void print(int n) {
//         if(n == 0) return;
//         System.out.println(n);
//         print(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         print(n);
//     }
// }


/*
import java.util.*;

public class Ntoone {

    public static void print(int i, int n) {
        if (i < 1) {
            return;
        }

        System.out.println(i);
        print(i - 1, n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(n, n);

        scn.close();
    }
}
 */




import java.util.*;

public class Ntoone {
    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        print(i + 1, n);
        System.out.println(i);
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(1, n);

        scn.close();
    }
}