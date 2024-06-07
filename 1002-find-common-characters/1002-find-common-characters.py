class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        word=[list(i) for i in words]
        res=[]
        for i in words[0]:
            st=True
            for j in word:
                if i not in j:
                    st=False
    
                    break
            if st:
                res.append(i)
                for j in word:
                    j.remove(i)
        return res
        