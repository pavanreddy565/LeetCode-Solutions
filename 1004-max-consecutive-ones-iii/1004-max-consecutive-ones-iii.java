class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength=0;
        int l=0;
        int r=0;
        int zero=0;
        int num=0,len;
        int n=nums.length;
        while(r<n){
            if (zero<k || nums[r]==1){
                if (nums[r]==0){
                    zero++;
                    
                    //System.out.println(l+" "+r);
                }
                len=r-l+1;
                maxlength=Math.max(maxlength,len);
                r++;
            }else{
                
                while(l<r){
                    if (nums[l]!=0){
                        l++;
                    }else{
                        break;
                    }
                }l++;
                zero--;
            }
        }return maxlength;
    }
}