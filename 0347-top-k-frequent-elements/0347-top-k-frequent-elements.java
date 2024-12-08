class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        if(k>map.size()) return new int[k];
        for(int i:map.keySet()) pq.add(new int[]{map.get(i),i});
        int ans[] = new int[k];
        int i = 0;
        while(i<k){
            int[] arr = pq.poll();
            ans[i++] = arr[1];
        }return ans;


    }
}