class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }System.out.println(index);
        if(index==-1){
            int l=0,r=n-1,temp=0;
            while(l<r){
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l+=1;
                r-=1;
            }return ;
        }
        int tem=0;
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                tem=nums[i];
                nums[i]=nums[index];
                nums[index]=tem;
                break;
            }
        } int l=index+1,r=n-1,temp=0;
        while(l<r){
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l+=1;
                r-=1;
        }
    }
}