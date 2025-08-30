public class BinarytoDecimal {

    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;


        // dec = dec + [lastDigit * (2^pow)]
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
            System.out.println(decNum);
            
        }
        System.out.println("Decimal of Binary number is: " + decNum);
    }
    public static void main(String[] args) {
        binToDec(101);  
    }
}
