import java.util.*;

public class PrimeNo {

    // only for n>=2
    public static boolean isPrime(int n) {

        //corner cases
        if(n == 2) {
            return true;
        }
        boolean isPrime = true;
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {   // completely divisible
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        if(isPrime(n)) {
            System.out.println("The number " + n + " is Prime");
        }
        else {
            System.out.println("The number " + n + " is not Prime");
        }

scn.close();
    }
}

