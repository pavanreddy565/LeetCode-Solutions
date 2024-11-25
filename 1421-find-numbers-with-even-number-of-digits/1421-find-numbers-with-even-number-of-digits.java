class Solution {
    int findSize(int value){
        int di=0;
        while(value>0){
            di++;
            value=value/10;
        }return di;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(findSize(nums[i])%2==0) count++;
        }return count;
    }
}