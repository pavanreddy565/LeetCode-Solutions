class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        suf=1
        pre=1
        ans=-10**6
        n=len(nums)
        for i in range(n):
            if pre==0:
                pre=1
            if suf==0:
                suf=1
            pre*=nums[i]
            suf*=nums[n-i-1]
            ans=max(ans,max(pre,suf))
        return ans
