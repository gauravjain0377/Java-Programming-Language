import java.util.*;

public class BinaryToDecimal {
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * power);
            power *= 2;
            binary /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        System.out.println("Decimal = " + binaryToDecimal(binary));

        sc.close();
    }
}
