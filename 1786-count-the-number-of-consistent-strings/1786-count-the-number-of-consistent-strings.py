class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count=0
        for i in words:
            r=True
            for j in i :
                if j not in allowed:
                    r=False
            if r:
                count+=1
        return count