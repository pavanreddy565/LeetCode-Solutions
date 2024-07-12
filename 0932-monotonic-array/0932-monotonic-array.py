class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        l=0
        r=1
        if nums[0]>nums[-1]:
            nums=nums[::-1]
        while r<len(nums):
            if nums[l]>nums[r]:
                return False
            
            else :
                l+=1

            r+=1
        

            
        return True

