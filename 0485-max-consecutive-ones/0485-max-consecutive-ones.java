class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0,n=nums.length;
        int maxlength=0;
        while(r<n){
            if(nums[r]!=1){
                l=r+1;
            }
            maxlength=Math.max(maxlength,r-l+1);
            r++;
        }return maxlength;
    }
}