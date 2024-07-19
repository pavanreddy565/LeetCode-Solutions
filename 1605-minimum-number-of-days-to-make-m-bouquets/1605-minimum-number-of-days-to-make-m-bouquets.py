class Solution:
    def possible(self, day,bloom,m,k):
        count=0
        pos=0
        for i in bloom:
            if day>=i:
                count+=1
            else:
                pos+=(count)//k
                count=0
        pos+=(count)//k
        #print("pos",pos)
        return pos>=m
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        l=min(bloomDay)
        h=max(bloomDay)
        ans=-1
        if m*k>len(bloomDay):
            return -1
        while l<=h:
            mid=(l+h)//2
            #print(mid)
            if self.possible(mid,bloomDay,m,k):
                h=mid-1
            else:
                l=mid+1
        return l