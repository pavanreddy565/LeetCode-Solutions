class Solution:
    def find_num(self,nums,k):
        num=1
        total=0
        for i in nums:
            if i+total<=k:
                total+=i
            else:
                num+=1
                total=i
        #print(k," ",num)
        return num
        
    def splitArray(self, nums: List[int], k: int) -> int:
        l=max(nums)
        h=sum(nums)
        while l<=h:
            mid=(l+h)//2
            if self.find_num(nums,mid)>k:
                l=mid+1
            else:
                h=mid-1
        return l