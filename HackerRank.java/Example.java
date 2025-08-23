import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("42");
        int i = scan.nextInt();
        System.out.println("3.115");
        double d = scan.nextDouble();
        System.out.println("Welcome to HackerRank's Java tutorials!");
        int s = scan.nextInt();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}