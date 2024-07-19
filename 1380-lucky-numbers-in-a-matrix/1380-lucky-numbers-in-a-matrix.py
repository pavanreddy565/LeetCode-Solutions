class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        min_=float('-inf')
        m=len(matrix)
        n=len(matrix[0])
        for i  in range(m):
            mino=0
            for j in range(1,n):
                if matrix[i][mino]>matrix[i][j]:
                    mino=j
            sete=True
            for j in range(m):
                if matrix[j][mino]>matrix[i][mino]:
                    sete=False
            if sete:
                min_=matrix[i][mino]
                break
        if min_==float('-inf'):
            return []
    

        return [min_]
