class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l=0
        r=len(nums)-1
        while l<=r:
            if nums[l]==val:
                swap=nums[r]
                nums[r]=nums[l]
                nums[l]=swap
                r-=1
            else:
                l+=1
        print(nums)
        return l