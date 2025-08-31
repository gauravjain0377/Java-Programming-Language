import java.util.*;

public class InputArray {
    public static void main(String[] args) {

        int marks[] = new int[50];
        System.out.println("Lenght of array = " + marks.length);
       
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the marks of Physics: ");
        marks[0] = scn.nextInt();  //physics

        System.out.print("Enter the marks of Chemistry: ");
        marks[1] = scn.nextInt();  //chemistry

        System.out.print("Enter the marks of Maths: ");
        marks[2] = scn.nextInt();  //maths


        System.out.println(" ");
        System.out.println("The marks are: ");
        System.out.println("The marks of Physics: " + marks[0]);
        System.out.println("The marks of Chemistry: " + marks[1]);
        System.out.println("The marks of Maths: " + marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("The updated marks of Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("The percentage is: " + percentage + "%");

        scn.close();
    }
    
}
