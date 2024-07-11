class Solution:
    def reverseParentheses(self, s: str) -> str:
        stack=[] 

        for i in s:
            print(stack)
            if i ==')':
                st=''
                while len(stack)!=0 and stack[-1]!='(':
                    st+=stack.pop()
                stack.pop()
                
                
                for j in st:
                        stack.append(j)
            else:
                stack.append(i)
        return "".join(stack)