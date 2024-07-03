from collections import Counter
class Solution:
    def firstUniqChar(self, s: str) -> int:
        d=dict(Counter(list(s)))
        for i in range(len(s)):
            if d[s[i]]<2:
                return i
        return -1