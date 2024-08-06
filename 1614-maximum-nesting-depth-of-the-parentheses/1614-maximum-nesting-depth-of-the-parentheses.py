class Solution:
    def maxDepth(self, s: str) -> int:
        stack=[]
        max_=0
        for i in s:
            if i=='(':
                stack.append(i)
                max_=max(max_,len(stack))
            elif i==')':
                stack.pop()
        return max_