import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

       

        //  System.out.println(-~10);    // - ~ n
        System.out.println(n + " + " + 1 + " is " + -~n);

       scn.close();
    }
}
