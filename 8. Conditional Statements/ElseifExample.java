import java.util.*;

public class ElseifExample {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       System.out.print("Enter your age: ");
       int age = scn.nextInt();

        if(age >=18) {
            System.out.println("You are an adult");
        }
        else if(age >=13 && age<18) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("Baby");
        }
    }
}