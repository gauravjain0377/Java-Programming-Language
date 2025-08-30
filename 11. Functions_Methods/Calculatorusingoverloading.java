import java.util.*;

public class Calculatorusingoverloading {

    public static int Sum(int a, int b) {
        int Sum = a + b;
        return Sum;
    }

    public static int Sum(int a, int b, int c) {
        int Sum = a + b + c;
        return Sum;
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 9;
        System.out.println("Sum is: " + Sum(a,b));
        System.out.println("Sum is: " + Sum(a,b,c));
    }
}
