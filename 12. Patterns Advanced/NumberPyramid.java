import java.util.*;

public class NumberPyramid {

    public static void numberPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            
            }
            }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        numberPyramid(n);
        scn.close();
    }
}
