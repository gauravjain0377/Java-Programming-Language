import java.util.*;

public class DecimaltoBinary {
    public static int decimalToBinary(int n) {
        int binary = 0;
        int place = 1;

        while (n > 0) {
            int remainder = n % 2;
            binary = binary + (remainder * place);
            place *= 10;
            n /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + decimalToBinary(n));

        sc.close();
    }
}



// Using Built in Function
/* 
import java.util.*;

public class Main {

    public static String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(decimalToBinary(n));

        sc.close();
    }
}

*/