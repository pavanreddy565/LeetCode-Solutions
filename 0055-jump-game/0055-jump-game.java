class Solution {
    public boolean canJump(int[] nums) {
        int maxFind=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxFind) return false;
            if(maxFind<nums[i]+i) maxFind=nums[i]+i;
        }return true;
    }
}