class Solution:
    def sub(self,inp,out,res):
        if (len(inp)==0):
            res.append(out)
            return res
        else:
            out1=out.copy()
            out2=out.copy()
            out2.append(inp[0])
            res=self.sub(inp[1:],out1,res)
            res=self.sub(inp[1:],out2,res)
            return res
        
    
    def subsets(self, nums: List[int]) -> List[List[int]]:
        return self.sub(nums,[],[])