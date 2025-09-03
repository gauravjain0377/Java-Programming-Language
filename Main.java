public class Main {
    
public static void printSubArrays(int numbers[]) {
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; i++) {
                System.out.print("SubArrays: ");
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                
            }
        }
        
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}