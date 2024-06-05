class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }int maxine=nums[0];
        for(int i:map.keySet()){
            if(map.get(i)>map.get(maxine)){
                maxine=i;
            }
        }return maxine;
    }
}