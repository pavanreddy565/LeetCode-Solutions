import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int leftmost = newInterval[0];
        int rightmost = newInterval[1];
        if(intervals.length==0) return new int[][]{newInterval};
        ArrayList<int[]> ans = new ArrayList<>();
        boolean n=true;
        // Add all intervals that are completely before the newInterval
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < leftmost) {
                ans.add(intervals[i]); // No overlap, add to the answer
            } else if (intervals[i][0] > rightmost ) {
                if(n)
                    ans.add(new int[]{leftmost, rightmost}); // Add merged interval        
                n=false;
                leftmost = newInterval[0];
                rightmost = newInterval[1];
                ans.add(intervals[i]); // Add the current interval
            } else { // There's overlap, merge intervals
                leftmost = Math.min(leftmost, intervals[i][0]);
                rightmost = Math.max(rightmost, intervals[i][1]);
            }
        }
        
        // Add the last merged interval
        if(n) ans.add(new int[]{leftmost, rightmost});
        
        // Convert ArrayList to 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}
