class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n=arrays.size();
        int min_=arrays.get(0).get(0),max_=arrays.get(0).get(arrays.get(0).size() - 1);
        int maxi=0;
        for(int i=1;i<n;i++){
            int num=Math.max(Math.abs(arrays.get(i).get(0)-max_),Math.abs(arrays.get(i).get(arrays.get(i).size() - 1)-min_));
            maxi=Math.max(num,maxi);
            min_=Math.min(arrays.get(i).get(0),min_);
            max_=Math.max(arrays.get(i).get(arrays.get(i).size() - 1),max_);
        
        }return maxi;
    }
}