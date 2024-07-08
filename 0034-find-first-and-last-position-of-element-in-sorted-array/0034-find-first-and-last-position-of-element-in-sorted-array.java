class Solution {
    int floor(int[] arr,int target){
        int low=0,high=arr.length-1;
        int first=arr.length,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=target){
                first=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return first;
    }int celi(int[] arr,int target){
        int low=0,high=arr.length-1;
        int last=arr.length,mid;
        while(low<=high){
            mid=(low+high)/2;
             System.out.println(arr[mid]);
            if(arr[mid]>target){
                last=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return last;
    }
    public int[] searchRange(int[] nums, int target){
        int lb=this.floor(nums,target);
        if(lb==nums.length||nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,this.celi(nums,target)-1};
    }
}