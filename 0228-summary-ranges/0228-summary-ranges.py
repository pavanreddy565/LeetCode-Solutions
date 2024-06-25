class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if len(nums)==0:
            return []
        start=0
        end=0
        ans=[]
        for i in range(1,len(nums)):
            if nums[i]!=nums[i-1]+1:
                if start==end:
                    ans.append(str(nums[start]))
                else:
                    ans.append(str(nums[start])+"->"+str(nums[end]))
                start=i
            end+=1
        if start==end:
                    ans.append(str(nums[start]))
        else:
                    ans.append(str(nums[start])+"->"+str(nums[end]))

        return ans