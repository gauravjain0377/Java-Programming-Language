import java.util.*;

public class Question1 {
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.print("Enter First Number: ");
       int a = scn.nextInt();
       System.out.print("Enter Second Number: ");
       int b = scn.nextInt();
       System.out.print("Enter Third Number: ");
       int c = scn.nextInt();

       int sum = a + b+ c;
       System.out.println("The average of these three numbers are: " + sum / 3);
    }
    
}

