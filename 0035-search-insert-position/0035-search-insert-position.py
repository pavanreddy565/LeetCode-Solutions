class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        l=0
        n=len(nums)
        while l<n:
            if nums[l]==target:
                return l
            elif nums[l]>target:
                return l
            l+=1
        return l
        