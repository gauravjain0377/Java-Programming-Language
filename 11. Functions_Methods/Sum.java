import java.util.*;

public class Sum {

    public static int calculateSum(int a, int b, int c) {    // int a, int b, int c => called as parameters and formal parameters
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();
        System.out.print("Enter Third Number: ");
        int c = scn.nextInt();
        int sum = calculateSum(a, b, c);  // Here, a, b and c known as arguments or actual parameters
        System.out.println("The sum is: " + sum);
        scn.close();
    }
}


// import java.util.*;

// public class Sum {

//     public static void calculateSum(int a, int b, int c) {
//         int sum = a + b + c;
//         System.out.println("The sum is: " + sum);
//     }
    
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter First Number: ");
//         int a = scn.nextInt();
//         System.out.print("Enter Second Number: ");
//         int b = scn.nextInt();
//         System.out.print("Enter Third Number: ");
//         int c = scn.nextInt();
//         calculateSum(a, b, c);

//         scn.close();
//     }
// }