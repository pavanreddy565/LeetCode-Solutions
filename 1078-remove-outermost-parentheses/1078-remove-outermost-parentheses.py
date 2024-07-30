class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        stack=[]
        min_=0
        ans=''
        for i in range(len(s)):
            if s[i]=="(":
                stack.append(s[i])
                
            else:
                stack.pop()
            #print(stack,"min",min_)
            if len(stack)==0:
                ans+=s[min_+1:i]
                min_=i+1
        return ans