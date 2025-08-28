import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        if(n == 2) {
            System.out.println("2 is prime");
        }
   
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                System.out.println("The number " + n + " is not prime");
            }
            else {
                System.out.println("The number " + n + " is prime");
            }
        }


        scn.close();
    }
}
