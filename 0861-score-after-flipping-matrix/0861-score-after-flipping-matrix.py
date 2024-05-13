class Solution:
    def matrixScore(self, grid: List[List[int]]) -> int:

        # For row flips
        # 0 0 1 1
        # 1 1 0 0

        # Flipping the left most to 1 will always give you a larger number
        

        # For column flips
        # 0 1 0
        # 1 0 1

        # Flips columns if number of zeros in column greater than ones


        # What will be first
        # 0 0 1 1
        # 1 0 1 0
        # 1 1 0 0

        # 1 1 1 1
        # 1 0 0 1
        # 1 1 1 1

        # first we flip rows and then flip columns from 2nd cloumns to end
        # we need to fix the first number to highest

        ans = 0

        m, n = len(grid), len(grid[0])

        # Row flips
        for i in range(m):
            if grid[i][0] == 0:
                # flip row i
                for j in range(n):
                    if grid[i][j] == 0:
                        grid[i][j] = 1
                    else:
                        grid[i][j] = 0
            # 1 column in all rows now flipped to 1
            ans += 2**(n-1)

        # Columns flips
        for j in range(1,n):
            currSum = 0
            flipSum = 0
            for i in range(m):
                # count ones
                if grid[i][j] == 1:
                    currSum += 2**(n-j-1)
                else:
                    flipSum += 2**(n-j-1)
            ans += max(currSum, flipSum)
        
        return ans