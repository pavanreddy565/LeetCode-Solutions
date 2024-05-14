class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l=0
        r=1
        size=len(nums)
        res=[]
        while(l<r and r<size):
            if nums[l]==nums[r]:
                nums.pop(r)
                size-=1
                
            else:
                l+=1
                r=l+1
        return len(nums)
                