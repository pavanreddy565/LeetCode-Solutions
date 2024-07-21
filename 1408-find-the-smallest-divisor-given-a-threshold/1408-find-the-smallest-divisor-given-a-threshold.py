class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        small_num=float('inf')
        l=1
        h=max(nums)
        ans=float("inf")
        while l<=h:
            mid=(l+h)//2
            num=sum([math.ceil(j/mid) for  j in nums])
            print(num," ",mid)
            if num<=threshold:
                print(mid,"ans",ans)
                ans=min(ans,mid)
                h=mid-1
            else:
                l=mid+1
        return ans
            
        # while i<=max_:
        #     num=[math.ceil(j/i) for  j in nums]
        #     if sum(num)<=threshold:
        #         return i
        #     i+=1
        # return -1
            