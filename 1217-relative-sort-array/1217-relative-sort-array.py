class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        result=[]
        for i in arr2:
            while i in arr1:
                result.append(arr1.pop(arr1.index(i)))
        arr1.sort()
        for i in arr1:
            result.append(i)
        return result