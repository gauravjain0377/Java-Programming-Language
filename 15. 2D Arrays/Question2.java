public class Question2 {

    public static void Sum(int nums[][]) {
        int sum = 0;
        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("Sum of the second row is: " + sum);
        

    }
    public static void main(String[] args) {
        int nums[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {8, 8, 7}
        };
        Sum(nums);    // sum of the second row
    }
}
