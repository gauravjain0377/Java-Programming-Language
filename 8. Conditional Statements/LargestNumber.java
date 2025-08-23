import java.util.*;

public class LargestNumber {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();

        if(number1 > number2) {
            System.out.println("Number 1 is greater than Number 2");
        }
        else {
            System.out.println("Number 2 is greater than Number 1 ");
        }
    }
}





// public class LargestNumber {
//     public static void main(String[] args) {

//         System.out.println(" ");
        
//         int A = 10;
//         int B = 3;

//         if(A > B) {
//             System.out.println("A is Largest");
//         }
//         else {
//             System.out.println("B is largest");
//         }
        
//     }
// }