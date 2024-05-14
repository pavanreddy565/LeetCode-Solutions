class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n=len(nums)
        for i in range(n-1,-1,-1):
            #print(i)
            if nums.count(nums[i])>1:
                nums.pop(i)
        #print(nums)
        return len(nums)