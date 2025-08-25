public class ReverseNumber {
    public static void main(String[] args) {
        int n = 2005;
        while(n>0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;    //  n = n /10;
        }   
       
    }
}
