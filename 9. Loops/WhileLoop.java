import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        int count = 1;
        while(count <= number) {
            System.out.println(count);
          count++;

          scn.close();
        }
        }
    }

