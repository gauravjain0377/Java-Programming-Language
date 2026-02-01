/* First non-repeating letter in a stream of characters. (lowercase characters)
     aabccxb -> a -1 b b b b x
  a - a
  aa - -1
  aab - b
  aabc - b 
  aabcc - b 
  aabccx - b 
  aabcxb - x


  1. frequency[] = [26] 'a'-'z'
  2. Queue <characters>
  for(int i=0; str.length()) {
  ch = str.charAt(i)
  q.add(ch)
  freq[ch-'a']++
  
  q.remove() = till i find 1st non-repeating letter
  if(q.empty()) -> -1}
  */
  
import java.util.*;

public class FirstnonRepeating {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.println(-1 + " ");
            } else {
                System.out.println(q.peek() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}