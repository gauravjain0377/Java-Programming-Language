import java.util.*;

public class HalfPyramidNumber {
    
    public static void halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = scn.nextInt();
        halfPyramid(n);

        scn.close();
    }
}