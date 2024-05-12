class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n=len(grid)
        maxLocal=[[0 for j in range(n-2)] for i in range(n-2)]
        
        for i in range(n-2):
            #maxLocal.append([])
            #print(maxLocal)
            for j in range(n-2):
                a=max(grid[i][j:j+3])
                b=max(grid[i+1][j:j+3])
                c=max(grid[i+2][j:j+3])
                maxLocal[i][j]=max([a,b,c])
        return maxLocal