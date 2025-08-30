import java.util.*;

public class InvertedandRotatedHalfPyramid {

    public static void Pyramid(int n) {
        for(int i=1; i<=n; i++) {   // outer loop
            for(int j=1; j<=n-i; j++) {   // inner loop
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {   // inner loop 
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        Pyramid(n);

        scn.close();
        }

    }