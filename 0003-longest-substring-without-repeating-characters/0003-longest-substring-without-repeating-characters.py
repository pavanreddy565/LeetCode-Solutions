class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res=""
        ls=[]
        for i in s:
            if i not in res:
                res+=i
            else:
                ls.append(len(res))
                if res.find(i)!=len(res)-1:
                    res=res[res.find(i)+1:]+i
                else:
                    res=i
        ls.append(len(res))
        return max(ls)