class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        ans=[]
        #print(nums[4],nums)
        for i in range(len(nums)-k+1):
            prev=nums[i]
            tog=True
            #print(i)
            for j in range(i,i+k):
                #print(j," ",i)
                if prev!=nums[j]:
                    tog=False
                prev+=1
            if tog:
                ans.append(prev-1)
            else:
                ans.append(-1)
        return ans