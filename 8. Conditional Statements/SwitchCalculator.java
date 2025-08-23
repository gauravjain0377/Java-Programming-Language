import java.util.*;

public class SwitchCalculator {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int first = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int second = scn.nextInt();

        System.out.println("Enter operation: ");
        System.out.println("1 Addition");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        System.out.println("5 Modulus");

        switch(scn.nextInt()) {
            case 1: System.out.println(first + second);
            System.out.println("The answer is: " + (first + second));
            break;
            case 2: System.out.println(first - second);
            System.out.println("The answer is: " + (first - second));
            break;
            case 3: System.out.println(first * second);
            System.out.println("The answer is: " + (first * second));
            break;
            case 4: System.out.println(first / second);
            System.out.println("The answer is: " + (first / second));
            break;
            case 5: System.out.println(first % second);
            System.out.println("The answer is: " + (first % second));
            break;
        }
    }
}