class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        nums.sort()
        count=1
        lastseen=-10**6
        longest=1
        print(nums)
        for i in nums:
            #print(lastseen," ",count)
            if i-1==lastseen:
                count+=1
                lastseen=i
            elif i!=lastseen:
                count=1
                lastseen=i
            longest=max(longest,count)
        return longest
        