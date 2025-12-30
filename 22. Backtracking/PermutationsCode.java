// Find Permutations
// Find and print all permutations of a string.
// Example => "abc"
// Permutations are abc, acb, bac, bca, cab, cba

// Formula => n elements so n! (n factorial) so like abc has three elements so (3!) => 3*2*1 = 6, so 6 permuations will be there.


public class PermutationsCode {

    public static void findPermutations(String str, String ans) {
        // base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutations(Newstr, ans+curr);
        }

    }
    public static void main(String[] args) {
        String str = "abc";    // or like 123
        findPermutations(str, "");
    }
}


// Time Complexity: O(n * n!)
// Space Complexity: O()