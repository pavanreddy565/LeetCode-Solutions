class Solution:
    def isValid(self, s: str) -> bool:
        ls=[]
        d={'(':')','{':'}','[':']'}
        for i in s:
            if i=='(' or i=='{' or i=='[':
                ls.append(i)
            elif len(ls)==0:
                return False
            else:
                c=ls.pop()
                if i != d[c]:
                    return False
        if len(ls)!=0:
            return False
        return True