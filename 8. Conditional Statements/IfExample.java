import java.util.*;

public class IfExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        if(age>=18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
    }
}
    
