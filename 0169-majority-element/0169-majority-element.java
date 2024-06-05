class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0],count=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==el){
                count++;
            }else{
                count--;
            }
            j++;
            if(count==0){
                el=nums[j];
            }
        }
        return el;
    }
}