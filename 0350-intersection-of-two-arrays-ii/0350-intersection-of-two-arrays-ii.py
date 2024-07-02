from collections import Counter
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        d1=Counter(nums1)
        d2=Counter(nums2)
        inter=list(set(d1).intersection(set(d2)))
        ans=[]
        for i in inter:
            num=min(d1[i],d2[i])
            ans.extend([i]*num)
        return ans