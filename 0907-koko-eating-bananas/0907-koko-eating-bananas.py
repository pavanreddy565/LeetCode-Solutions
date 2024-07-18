class Solution:
    def find_no_hrs(self,piles,hrs):
        ans=0
        for i in piles:
            ans+=math.ceil(i/hrs)
        return ans
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        low=1
        high=max(piles)
        ans=high
        while low<=high:
            mid=(low+high)//2
            total_hrs=self.find_no_hrs(piles,mid)
            if total_hrs<=h:
                high=mid-1
            else:
                low=mid+1
        return low
