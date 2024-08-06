from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1=dict(Counter(list(s)))
        d2=dict(Counter(list(t)))
        if len(d1.keys())!=len(d2.keys()):
            return False
        for i in d1.keys():
            if i not in d2.keys() or d1[i]!=d2[i]:
                return False
        return True
            
        