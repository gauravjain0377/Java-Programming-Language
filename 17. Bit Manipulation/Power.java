// Check if a number is a power of 2 or not.

/* 4 = 2 power 2, 
 8  = 2 power 3,
 7 = 2 power => NO, not divisible.

 4 -> 100
 3 -> 011
 100 & 011 => 0

 8 -> 1000
 7 -> 0111
 1000 & 0111 => 0

 16 -> 10000
 15 -> 01111
 10000 & 01111 => 0


 so conclusion is if n is 2 power something then  n & (n -1) = 0
 */


 import java.util.*;

public class Power {
    // Check if n is a power of 2


    public static boolean powerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        System.out.println(powerofTwo(n));

        scn.close();
    }
}
