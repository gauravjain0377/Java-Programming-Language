import java.util.*;

public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal = decimal + (lastDigit * power);
            power *= 2;
           n /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int n = sc.nextInt();

        System.out.println("Decimal = " + binaryToDecimal(n));

        sc.close();
    }
}
