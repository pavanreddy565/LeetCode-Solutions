class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        if 0 not in nums:
            return 0
        n=len(nums)
        su=int(n*(n+1)/2)
        return su-sum(nums)