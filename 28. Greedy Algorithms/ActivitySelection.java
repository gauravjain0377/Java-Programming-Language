/* Activity Selection
// Question and explanation from the Notes. 
In this question end time sorted
and in file named = ActivitySelectionnotSorted have end time not sorted see that also.
 */

import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {  // O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};


        /* If end is Not sorted 
       Go to file named = ActivitySelectionnotSorted.java have end time not sorted see that also.
        */

        
        // end time basis sorted
        int maxAct = 0;  // maxAct = maximum activities
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++) {
            if(start[i] >= lastEnd) {
                // acitivity select 
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("maximum Activities = " + maxAct);
        for(int i=0; i<ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}