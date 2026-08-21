/*
Sort Characters by Frequency



Example 1
Input : s = "tree"
Output : ['e', 'r', 't' ]
Explanation :
The occurrences of each character are as shown below :
e --> 2
r --> 1
t --> 1.

The r and t have same occurrences , so we arrange them by alphabetic order.

Example 2
Input : s = "raaaajj"
Output : ['a' , 'j', 'r' ]
Explanation :
The occurrences of each character are as shown below :

a --> 4
j --> 2
r --> 1
 */

import java.util.*;
public class SortCharacters {
    public static char[] frequencySort(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Store characters
        Character[] chars = new Character[26];

        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('a' + i);
        }

        // Sort by frequency
        Arrays.sort(chars, (a, b) -> {
            if (freq[b - 'a'] != freq[a - 'a']) {
                return freq[b - 'a'] - freq[a - 'a'];
            }

            return a - b;
        });

        // Remove characters that don't exist
        ArrayList<Character> result = new ArrayList<>();

        for (char ch : chars) {
            if (freq[ch - 'a'] > 0) {
                result.add(ch);
            }
        }

        char[] ans = new char[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] ans = frequencySort(s);

        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}

