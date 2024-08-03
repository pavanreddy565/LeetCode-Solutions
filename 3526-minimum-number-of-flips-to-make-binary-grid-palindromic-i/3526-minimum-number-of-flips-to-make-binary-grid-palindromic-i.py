class Solution:
    def minFlips(self, grid: List[List[int]]) -> int:
        count=0
        for i in range(len(grid)):
            l=0
            r=len(grid[i])-1
            while(l<=r):
                if grid[i][l]!=grid[i][r]:
                    # grid[i][r]=grid[i][l]
                    count+=1
                l+=1
                r-=1
        count1=0
        
        for i in range(len(grid[0])):
            l=0
            r=len(grid)-1
            while(l<=r):
                    if grid[l][i]!=grid[r][i]:
                        # grid[l][i]=grid[l][i]
                        count1+=1
                    l+=1
                    r-=1
        return min(count,count1)


