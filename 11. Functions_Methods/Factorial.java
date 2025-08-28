import java.util.*;

public class Factorial {

    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        int fact =  factorial(n);
        System.out.println("The factorial of " + n + " is " + fact);

        scn.close();
    }
}
