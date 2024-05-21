class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            if (!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        int[] ans=new int[2];
        for(int i: map.values()){
            ans[0]+=(i/2);
            ans[1]+=(i%2);
        }
        return ans;
    }
    
}