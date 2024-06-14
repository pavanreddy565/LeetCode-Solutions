class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        res=[]
        top,bottom,left,right=0,m-1,0,n-1
        while right>=left and top<=bottom:
            i=left
            while(i<=right):
                res.append(matrix[top][i])
                i+=1
            top+=1
            #print(res)
            i=top
            while(i<=bottom):
                res.append(matrix[i][right])
                i+=1
            right-=1
            #print(res)
            if top<=bottom:
                i=right
                while(i>=left):
                    res.append(matrix[bottom][i])
                    i-=1
                bottom-=1
            #print(res)
            if left<=right:
                i=bottom
                #print(f'bottom{bottom}, top{top}, right{right},left{left}')
                while(i>=top):
                    res.append(matrix[i][left])
                    i-=1
                left+=1
            
            #print(res)
        return res
