class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0;
        int r=0;
        int len=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        while(r<n){
            if (len>k){
                //System.out.println("hi"+l);
                map.remove(nums[l]);
                l++;
                len--;
            }else if (map.containsKey(nums[r])){
                return true;
            }else{
                map.put(nums[r],r);
                r++;
                len=r-l;
            }
            
        }return false;
    }
}