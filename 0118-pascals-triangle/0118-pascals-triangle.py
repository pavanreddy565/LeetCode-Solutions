class Solution:
    def generateRow(self,num):
        ans=1
        lis=[1]
        for i in range(1,num+1):
            ans*=(num-i+1)
            ans/=(i)
            lis.append(int(ans))
        return lis
    def generate(self, numRows: int) -> List[List[int]]:
        res=[]
        for i in range(numRows):
            res.append(self.generateRow(i))
        return res