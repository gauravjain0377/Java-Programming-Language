import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int number = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = scn.nextInt();
        int product = number * number2;
        System.out.println("The product is: " + product);
    }
}
