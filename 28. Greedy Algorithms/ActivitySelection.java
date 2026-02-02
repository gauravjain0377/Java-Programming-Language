/* Activity Selection
// Question and explanation from the Notes.  */

import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {  // O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};


        /* If end is Not sorted 
        itn activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++) {
        activities[i][0] = i;
        activities[i][1] = start[i]; 
        activities[i][2] = end[i];
    }

    // lambda function -> shortform
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
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