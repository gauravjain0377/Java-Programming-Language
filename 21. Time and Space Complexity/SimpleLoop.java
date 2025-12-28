public class SimpleLoop {
    public static void main(String[] args) {
        int n = 10;;
        for(int i=0; i<n; i++) {
            System.out.println(i);

        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)



// Time Complexity =>
// The for loop runs from i = 0 to i = n - 1
// Number of iterations = n
// Each iteration does a constant-time operation (println)
// Time Complexity: O(n)
// As n increases, the execution time grows linearly.

// Space Complexity =>
// Uses a constant amount of extra memory:
// Variables: n, i
// No additional data structures (arrays, recursion stack, etc.)
// Space Complexity: O(1) (constant space)