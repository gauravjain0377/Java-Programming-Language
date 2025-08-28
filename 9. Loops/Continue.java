// Display all numbers entered by user except multiple of 10

import java.util.*;

public class Continue {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);   
    
    do {
        System.out.print("Enter your number: ");
        int n = scn.nextInt();

        if(n % 10 == 0 ) {
            continue;
        }
        System.out.println("Number was: " + n);

        
    } 
    while(true);
   
}
}
