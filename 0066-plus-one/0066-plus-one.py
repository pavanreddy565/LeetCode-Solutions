class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        num="".join(list(map(str,digits)))
        no=str(int(num)+1)
        
        return list(map(int,list(no)))