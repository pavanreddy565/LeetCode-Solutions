class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        l=0
        r=int(c**0.5)+1
        #print(r)
        while l<=r:
            sum=l*l+r*r
            if sum ==c:
                return True
            elif sum>c:
                r-=1
            else:
                l+=1
        return False