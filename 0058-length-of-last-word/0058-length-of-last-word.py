class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        ans=[]
        for i in s.split(' '):
            if len(i)>0:
                ans.append(i)
        print(ans)
        return len(ans[-1])