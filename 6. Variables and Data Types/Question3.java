import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the cost of pencil: ");
        float pencil = scn.nextFloat();

        System.out.print("Enter the cost of pen: ");
        float pen = scn.nextFloat();

        System.out.print("Enter the cost of eraser: ");
        float eraser = scn.nextFloat();

        float total = pencil + pen + eraser;

        float totalWithGST = (0.18f * total);
        System.out.println("The total cost of stationery is: " + totalWithGST);
    }
}
