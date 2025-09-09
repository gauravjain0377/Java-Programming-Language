import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        // int n = 2005;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10; // n = n /10;
        }
scn.close();
    }
}
