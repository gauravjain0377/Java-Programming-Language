import java.util.*;

public class Power {
    
    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        System.out.println("Answer = " + power(base, exponent));

        sc.close();
    }
}





// using Math.pow()
/* 

    import java.util.*;

public class Main {

    public static int power(int base, int exponent) {

        return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();

        System.out.println(power(base, exponent));

        sc.close();
    }
}
    
*/