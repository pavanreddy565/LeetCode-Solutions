class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        l=0
        r=len(s)-1
        d=''
        while l<r:
            d=s[l]
            s[l]=s[r]
            s[r]=d
            l+=1
            r-=1
    
        