import java.util.*;

public class Main {
    
    public static int AvgNum(int a, int b, int c ) {
        int average = (a + b + c) / 3;
        return average;
    }
        
    public static void main(String[] args) {
        
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter first number: ");
     int a = scn.nextInt();
    System.out.print("Enter second number: ");
    int b = scn.nextInt();
    System.out.print("Enter third number: ");
    int c = scn.nextInt();
     
     System.out.println("Average of three numbers is: " + AvgNum(a,b,c));

     scn.close();
    }
}