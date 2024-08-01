from collections import defaultdict
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1=defaultdict(lambda: "Not Present")
        d2=defaultdict(lambda: "Not Present")
        if len(s)!=len(t):
            return False
        for i in range(len(s)): 
            if d1[s[i]]=="Not Present" and d2[t[i]]=="Not Present":
                d1[s[i]]=t[i]
                d2[t[i]]=s[i]
            elif d1[s[i]]!=t[i] and d2[t[i]]!=s[i]:
                return False
        return True
        