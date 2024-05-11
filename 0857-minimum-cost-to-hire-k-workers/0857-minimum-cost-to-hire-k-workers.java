class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double minCost = Double.MAX_VALUE;
        double qualityTillNow = 0;
        Pair[] workers = new Pair[n];

        for(int i = 0; i < n; i++){
            double ratio = (double)wage[i]/quality[i];//to get the base wage to pay other workers
            workers[i] = new Pair(ratio, quality[i]);
        }

        /** why sorting?
            for any i in sorted workers arr, workers from [0, i - 1] will satisfy the 
            1st condition of the pay rule.
         */
        Arrays.sort(workers);  
        /** why PQ?
            for any i get the k small qualities from workers from [0, i]
         */                           
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(Pair worker: workers){
            double ratio = worker.ratio;//considering every ratio as base wage
            int currentQuality = worker.quality;

            qualityTillNow += currentQuality;
            maxHeap.add(currentQuality); // add current quality in heap

            if(maxHeap.size() > k){
                qualityTillNow -= maxHeap.poll();// removing the max quality to spend minimum
            }
            if(maxHeap.size() == k){
                minCost = Math.min(minCost, qualityTillNow * ratio);
            }
        }
        return minCost;
    }
    private class Pair implements Comparable<Pair> {
        double ratio;
        int quality;

        Pair(double ratio, int quality){
            this.ratio = ratio;
            this.quality = quality;
        }

        public int compareTo(Pair worker){
            return Double.compare(this.ratio, worker.ratio);
        }
    }
}