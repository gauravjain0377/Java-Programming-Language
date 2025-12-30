// Find and print all subsets of a given String
// Example => String "abc"
// Ans. Subsets are a,b,c,ab,bc,ac,abc," "   => 8 Subsets of abc

// " " - It is an empty Set or null set.

// Formula => String length is n.
// so there will be 2^n subsets.


public class Subsets {

    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                 System.out.println(ans);
            }
            return;
        }

        // Recursion
        // Yes choice - the character
        findSubsets(str, ans+str.charAt(i), i+1);
        
        // No Choice - The character
        findSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
       findSubsets(str, "", 0);
    }
}


// Time Complexity: O(n * 2^n)
// Space Complexity: O(n)