class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n=len(matrix)
        for i in range(n):
            for j in range(n):
                if j>i:
                    temp=matrix[i][j]
                    matrix[i][j]=matrix[j][i]
                    matrix[j][i]=temp
        for i in range(n):
            l=0
            r=n-1
            while(l<=r):
                temp=matrix[i][l]
                matrix[i][l]=matrix[i][r]
                matrix[i][r]=temp
                l+=1
                r-=1
        
        