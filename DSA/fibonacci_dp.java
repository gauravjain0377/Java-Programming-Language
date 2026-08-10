import java.util.Scanner;

public class fibonacci_dp {
    
    public static int fib(int n, int fib[]){

        if(n == 0 || n == 1) return n;

        if(fib[n] != 0){
            return fib[n];
        }

        return fib[n] = fib(n-1,fib) + fib(n-2,fib);
    }
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n < 0) {
            System.out.println("Invalid");
            scn.close();
            return;
        }

        int fib[] = new int [n+1]; //as we make fibonacci from 0

        System.out.println(fib(n,fib));
    }
}
