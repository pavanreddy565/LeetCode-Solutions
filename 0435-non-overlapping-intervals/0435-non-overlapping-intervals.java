
class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] != b[1]) return a[1]-b[1];
                return a[0]-b[0];

            }
        });
        int count=0;
        int lastEnd=intervals[0][1];
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]<lastEnd){
                count++;
            }else {
                lastEnd=intervals[i][1];
            }
        }return count;
    }
}