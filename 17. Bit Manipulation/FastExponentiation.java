import java.util.*;

public class FastExponentiation {

    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {   // check least significant bit
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int a = scn.nextInt();
        System.out.print("Enter the exponent: ");
        int n = scn.nextInt();
        int result = fastExponentiation(a, n);
        System.out.println("Result: " + result);
        scn.close();

        
    }
}
