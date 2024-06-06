class Solution {
    public int maxSubArray(int[] nums) {
        int l=0,r=0,sum=0,maxsum=nums[0];
        while(r<nums.length){
            sum+=nums[r];
            maxsum=Math.max(maxsum,sum);
            while(sum<0){
              sum-=nums[l];
              l++;
             
            }//System.out.println(maxsum+" "+r+" "+l);
            r++;
        }return maxsum;
    }
}