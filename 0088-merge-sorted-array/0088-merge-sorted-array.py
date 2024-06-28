class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        l=m-1
        r=0
        while(l>=0 and r<n and nums1[l]>nums2[r]):
            swap=nums1[l]
            nums1[l]=nums2[r]
            nums2[r]=swap
            l-=1
            r+=1
            print(nums1)
        print(nums1,nums2)
        
        
        for i in range(m,n+m):
            nums1[i]=nums2[i-m]
        nums1.sort()
        