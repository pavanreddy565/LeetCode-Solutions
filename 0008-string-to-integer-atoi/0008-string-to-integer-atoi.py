class Solution:
    def myAtoi(self, s: str) -> int:
        ans=''
        n=len(s)
        i=0
        pos=[]
        if n==0:
            return 0
        

        while i<n and s[i]==' ' :
            i+=1
        while i<n and not s[i].isdigit() :
            if s[i]=='-' or s[i]=='+':
                pos.append(s[i])
            if s[i].isalpha() or s[i] not in ['-','+'] or (s[i] in ['-','+'] and len(pos)>1 ):
                return 0
            i+=1
        
        while i<n and  s[i].isdigit():
            
            if not  (s[i]=='0' and len(ans)==0):
                ans+=s[i]
            i+=1
        if len(ans)==0:
            return 0
        if len(pos)==1:
            ans=pos[0]+ans
        ans=eval(ans)
        if ans>(2**31)-1:
            return (2**31)-1
        elif ans<-2**31:
            return -2**31
        return ans
