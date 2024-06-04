class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxlength=0;
        for(int i=0;i<n;i++){
            int count=0;
            for (int j=i;j<n;j++){
                if(nums[j]==1){
                    count++;
                    maxlength=Math.max(count,maxlength);
                }else{
                    count=0;
                }
            }
        }return maxlength;
    }
}