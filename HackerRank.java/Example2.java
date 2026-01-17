import java.util.*;

public class Example2 {

    public static int remainingDigits(int n, int no) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;   // get last digit

            if (digit != no) {
                count++;         // count only if not excluded
            }
            n = n / 10;          // remove last digit
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        System.out.println("Enter digit to exclude: ");
        int no = scn.nextInt();

        int result = remainingDigits(n, no);
        System.out.println("Remaining digit count = " + result);
    }
}
