class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        l=0
        r=0
        ls=[-1]*3
        sum=0
        n=len(s)
        while(r<n):
            ch=s[r]
            ls[ord(ch)-ord('a')]=r
            sm=min(ls)
            if sm>=0:
                sum+=(n+sm-l-r)
                l+=1
            r+=1
            #print(sum)
        return sum