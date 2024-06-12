class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row=set()
        column=set()
        n=len(matrix)
        m=len(matrix[0])
        for i in range(n):
            for j in range(m):
                if matrix[i][j]==0:
                    row.add(i)
                    column.add(j)
        row=list(row)
        column=list(column)
        for i in row:
            for j in range(m):
                matrix[i][j]=0
        for i in range(n):
            for j in column:
                matrix[i][j]=0
