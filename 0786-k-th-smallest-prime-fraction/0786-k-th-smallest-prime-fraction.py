class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        d={}
        n=len(arr)
        for i in range(n):
            for j in range(i+1,n):
                d.update({(arr[i]/arr[j]):[arr[i],arr[j]]})
        return d[sorted(d.keys())[k-1]]