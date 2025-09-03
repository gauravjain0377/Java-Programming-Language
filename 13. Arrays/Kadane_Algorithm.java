public class Kadane_Algorithm {

    public static int kadane(int numbers[]) {
        int ms = Integer.MIN_VALUE;  // ms = max sum
        int cs = 0;  // cs = current sum

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        return ms;
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Subarray Sum is: " + kadane(numbers));
    }
}
