class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=0,r=0,sum=0,n=nums.length;
        if(k==0) return 0;
        int sub=0;
        while(r<n){
            sum+=nums[r];
            
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            if (sum==k){
                sub++;
            }
            
            r++;
        }return sub;
    }
}