import java.util.Scanner;

public class AreaofCircle {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Radius: ");
       double Radius = scn.nextDouble();

        double AreaofCircle = 3.14 * Radius * Radius;
        System.out.println("The area of the circle is: " + AreaofCircle);
       
    }
}
