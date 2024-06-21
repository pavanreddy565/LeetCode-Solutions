class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        n=len(nums)
        ans=[]
        p=0
        s=n-1
        for p in range(n):

            # if p>0 and nums[p]==nums[p-1]:
            #     continue
            for s in range(n-1,p,-1):

                # if s<n-1 and nums[s]==nums[s+1]:
                #     continue
                q=p+1
                r=s-1
                while q<r:
                    foursum=nums[p]+nums[q]+nums[r]+nums[s]
                    if foursum<target:
                        q+=1
                    elif foursum>target:
                        r-=1
                    else:
                        arr=[nums[p],nums[q],nums[r],nums[s]]
                        if arr not in ans:
                            ans.append(arr)
                        q+=1
                        r-=1
                    # while q<r and nums[q]==nums[q-1]:
                    #     q+=1
                    # while q<r and nums[r]==nums[r+1]:
                    #     r-=1
            
        
        
        return ans