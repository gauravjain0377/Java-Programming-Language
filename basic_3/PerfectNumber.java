// A Perfect Number is a number that is equal to the sum of its proper divisors (excluding the number itself).
/* 
Example
6
Divisors = 1, 2, 3
1 + 2 + 3 = 6
Perfect Number

Another example:
28
Divisors = 1, 2, 4, 7, 14
Sum = 28
 */
import java.util.*;

public class PerfectNumber {
    public static boolean isPerfect(int n) {
        if (n <= 1)
            return false;

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {

                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        sc.close();
    }
}

