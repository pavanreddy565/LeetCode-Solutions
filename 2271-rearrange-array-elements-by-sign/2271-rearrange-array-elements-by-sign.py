class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos=[]
        neg=[]
        for i in nums:
            if i>0:
                pos.append(i)
            else:
                neg.append(i)
        res=[0]*len(nums)
        for i in range(len(nums)):
            if i%2==0:
                res[i]=pos.pop(0)
            else:
                res[i]=neg.pop(0)
        return res
            
