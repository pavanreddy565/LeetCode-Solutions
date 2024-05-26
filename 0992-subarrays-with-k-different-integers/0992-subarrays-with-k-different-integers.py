class Solution:
    def subarrays(self,nums,k):
        if k<0:
            return 0
        l=0
        r=0
        n=len(nums)
        count=0
        d={}
        while r<n:
            if nums[r] not in d.keys():
                d.update({nums[r]:0})
            d[nums[r]]+=1  
            while len(d)>k:
                d[nums[l]]-=1
                if d[nums[l]] == 0: 
                    d.pop(nums[l])
                l+=1
            count+=(r-l+1)
            r+=1
        return count


    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:
        return self.subarrays(nums,k)-self.subarrays(nums,k-1)