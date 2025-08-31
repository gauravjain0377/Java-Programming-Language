import java.util.*;


public class ButterflyPattern {

    public static void butterflyPattern(int n) {

        // 1st Half
        for(int i=1; i<=n; i++) {
            // stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
        }

        // stars - i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

        // 2nd half
        for(int i=n; i>=1; i--) {
            // starrs - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
        }

        // stars - i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
        
}
 
  

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        butterflyPattern(n);
        scn.close();
    }
}

