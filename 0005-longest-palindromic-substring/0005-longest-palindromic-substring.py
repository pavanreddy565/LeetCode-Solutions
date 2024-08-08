class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s)==0:
            return s
        start=0
        max_=0
        n=len(s)
        for i in range(n):
            l,r=i,i
            while l>=0 and r<n and s[l]==s[r]:
                if r-l+1>max_:
                    start=l
                    max_=r-l+1
                l-=1
                r+=1
            l,r=i,i+1
            while l>=0 and r<n and s[l]==s[r]:
                if r-l+1>max_:
                    start=l
                    max_=r-l+1
                l-=1
                r+=1
        return s[start:start+max_]
            
                