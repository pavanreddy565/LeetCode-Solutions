class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //for(int i=0;i<nums.length;i++) map.put(nums[i],0);
        int l=0,r=0,n=nums.length;
        long sum=0,maxSum=0;
        while(r<n){
            while(r - l + 1 >k){
                sum-=nums[l];
                if(map.containsKey(nums[l])) map.remove(nums[l]);
                l++;
                
            }while(map.containsKey(nums[r])&&map.get(nums[r])==1){
                sum-=nums[l];
                if(map.containsKey(nums[l])) map.remove(nums[l]);
                l++;
                
            }
            
            sum+=nums[r];
            
            map.put(nums[r],1);
            r++;
            //System.out.println(sum+" "+r+" "+l+" "+k);
            if(r - l  == k)
                maxSum=Math.max(sum,maxSum);
            
        }return maxSum;

        
    }
}