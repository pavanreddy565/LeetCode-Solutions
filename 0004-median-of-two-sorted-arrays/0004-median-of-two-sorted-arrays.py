class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        t=len(nums1)//2
        if len(nums1)%2!=0:
            return nums1[t]
        
        return (nums1[t-1]+nums1[t])/2
        