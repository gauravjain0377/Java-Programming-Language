import java.util.*;

public class PalindromePattern {
    
    public static void palindromePattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

        for(int j=i; j>=1; j--) {
            System.out.print(j);
        }
        for(int j=2; j<=i; j++) {
            System.out.print(j);
        }
        System.out.println();
        
        }

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        palindromePattern(n);
        scn.close();
    }
    
}
