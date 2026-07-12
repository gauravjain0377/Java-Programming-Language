/* 
A Strong Number is a number whose sum of the factorials of its digits is equal to the number itself.

Example
145
1! + 4! + 5!
= 1 + 24 + 120
= 145
It is a Strong Number

Another example:
2
2! = 2
Strong Number
*/

import java.util.*;

public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isStrong(n))
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");

        sc.close();
    }
}
