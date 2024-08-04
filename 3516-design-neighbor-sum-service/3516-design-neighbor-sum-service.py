class neighborSum:

    def __init__(self, grid: List[List[int]]):
        self.grid=grid
        self.n=len(grid)
    def findIndex(self,value):
        for i in range(self.n):
            for j in range(self.n):
                if self.grid[i][j]==value:
                    return (i,j)
        return (-1,-1)
    def adjacentSum(self, value: int) -> int:
        ini,jni=self.findIndex(value)
        total=0
        li=[[value,ini,jni]]
        for i in range(self.n):
            for j in range(self.n):
                if (abs(ini-i)==1 and abs(jni-j)==0) or (abs(ini-i)==0 and abs(jni-j)==1):
                    total+=self.grid[i][j]
        #             li.append([self.grid[i][j],i,j])
        # print('adjcent',li)
        return total


    def diagonalSum(self, value: int) -> int:
        ini,jni=self.findIndex(value)
        total=0
        li=[[value,ini,jni]]
        for i in range(self.n):
            for j in range(self.n):
                # if abs(i-j)==0 or abs(i-j)==self.n-1:
                    if (abs(ini-i)==1 and abs(jni-j)==1) or (abs(ini-i)==1 and abs(jni-j)==1):
                        total+=self.grid[i][j]
        #                 li.append([self.grid[i][j],i,j])
        # print(li)
        return total


# Your neighborSum object will be instantiated and called as such:
# obj = neighborSum(grid)
# param_1 = obj.adjacentSum(value)
# param_2 = obj.diagonalSum(value)