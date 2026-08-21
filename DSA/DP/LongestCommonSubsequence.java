// // Given two strings, find the length of the longest subsequence present in both strings in the same order.

// Example:

// S1 = ABCDE
// S2 = ACE

// Common subsequence:

// ACE

// Answer:

// 3

// Important: a subsequence does not need to be continuous.

// For example:

// ABCDE

// ACE is a subsequence because we select:

// A → C → E

// But ACE is not required to appear as a continuous substring.


import java.util.*;

public class LongestCommonSubsequence {

    public static int lcs(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                } else {

                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(lcs(s1, s2));

        sc.close();
    }
}