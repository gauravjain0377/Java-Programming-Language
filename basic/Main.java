import java.util.*;

public class Main {
	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;

	while(palindrome != 0) {
	int remainder = palindrome % 10;
	reverse = reverse * 10 + remainder;
	palindrome /= 10;
}
return reverse == number;
}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scn.nextInt();
	
	if(isPalindrome(number)) {
System.out.print("Palindrome");
}
else {
System.out.print("Not a palindrome");
}
}
}