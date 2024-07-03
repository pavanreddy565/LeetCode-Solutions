class Solution:
    def merge(self,arr, l, m, r): 
        # code here
        left=l
        right=m+1
        temp=[]
        while(left<m+1 and right<r+1):
            if arr[left]<arr[right]:
                temp.append(arr[left])
                left+=1
            else:
                temp.append(arr[right])
                right+=1
        while left<m+1:
            temp.append(arr[left])
            left+=1
        while right<r+1:
                temp.append(arr[right])
                right+=1
        for i in range(l,r+1):
            arr[i]=temp[i-l]
    def mergeSort(self,arr, l, r):
        #code here
        count=0
        if l>=r:
            return 0
        mid=(l+r)//2
        count+=self.mergeSort(arr,l,mid)
        count+=self.mergeSort(arr,mid+1,r)
        count+=self.countPairs(arr,l,mid,r)
        self.merge(arr,l,mid,r)
        return count
    def countPairs(self,arr, low, mid, high):
        right = mid + 1
        cnt = 0
        for i in range(low, mid + 1):
            while right <= high and arr[i] > 2 * arr[right]:
                right += 1
            cnt += (right - (mid + 1))
        return cnt
    def reversePairs(self, nums: List[int]) -> int:
        return self.mergeSort(nums,0,len(nums)-1)