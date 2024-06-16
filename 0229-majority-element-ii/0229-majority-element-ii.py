from collections import Counter
class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        d=dict(Counter(nums))
        n=len(nums)//3
        ans=[]
        for i in d.keys():
            if d[i]>n:
                ans.append(i)
        return ans