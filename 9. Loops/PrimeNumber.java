import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        if(n == 2) {
            System.out.println(n + " is prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++) {
                if(n % i == 0) {
                      isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("The number " + n + " is prime" );
            } else {
                System.out.println("The number " + n + " is not prime");
            }
            scn.close();
        }
    }
        }
        

// import java.util.*;

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int n = scn.nextInt();

//         if(n == 2) {
//             System.out.println(n + " is prime");
//         } else {
//             boolean isPrime = true;
//             for(int i=2; i<=Math.sqrt(n); i++) {
//                 if(n % i == 0) {
//                       isPrime = false;
//                 }
//             }
//             if(isPrime == true) {
//                 System.out.println("The number " + n + " is prime" );
//             } else {
//                 System.out.println("The number " + n + " is not prime");
//             }
//             scn.close();
//         }
//     }
    
//         }
        