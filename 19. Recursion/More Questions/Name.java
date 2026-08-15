// Prine name N times using recursion.

import java.util.*;

public class Name {

    public static void name(int n) {  // O(n) - Both time and space complexity
        if (n == 0) {
            return;
        }

        System.out.println("Gaurav");
        name(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        name(n);

        scn.close();
    }
}





/* 
import java.util.*;

public class Name {

    public static void name(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Gaurav");
        name(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        name(1, n);

        scn.close()  ;
    }
}

*/