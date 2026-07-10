  import java.util.*;
public class gcd {
  

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scn.nextInt();

        System.out.print("Enter second number: ");
        int b = scn.nextInt();

        System.out.print(gcd(a, b));
    }
}


