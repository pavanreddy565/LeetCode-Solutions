class Solution {
    public int subarrays(int[] nums, int k){
        if (k<0) return 0;
        int l=0,r=0,len=nums.length,count=0,sum=0;
        while(r<len){
            sum+=(nums[r]%2);
            
            while (sum>k){
                if(nums[l]%2!=0){
                    sum-=(nums[l]%2);
                    System.out.println(k+" "+l+" "+r+" "+sum);
                }l++;

            }count+=(r-l+1);
            r++;
        }return count;

    }
    public int numberOfSubarrays(int[] nums, int k) {
        
        return this.subarrays(nums,k)-this.subarrays(nums,k-1);
    }
}