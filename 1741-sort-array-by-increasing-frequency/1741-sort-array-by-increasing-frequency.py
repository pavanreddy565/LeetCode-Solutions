from collections import Counter
class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        d=Counter(nums)
        di={}
        for i,j in d.items():
            if j in di.keys():
                di[j].append(i)
            else:
                di.update({j:[i]})
        print(di)
        ans=[]
        num=list(di.keys())
        num.sort()
        for i in num:
            if len(di[i])>1:
                di[i].sort()
                di[i]=di[i][::-1]
            for j in di[i]:
                ans.extend([j]*i)
        return ans