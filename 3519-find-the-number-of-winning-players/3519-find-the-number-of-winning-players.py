from collections import Counter
class Solution:
    def uniqueNo(self,arr):
        
        dic=dict(Counter(arr))
        
        return max(dic.values())
    def winningPlayerCount(self, n: int, pick: List[List[int]]) -> int:
        d={}
        for i in range(len(pick)):
            if pick[i][0] not in d.keys():
                d[pick[i][0]]=[pick[i][1]]
            else:
                d[pick[i][0]].append(pick[i][1])
        count=0
        for i in range(n):
            if i in d.keys() and self.uniqueNo(d[i])>i:
                count+=1
        return count
                
        