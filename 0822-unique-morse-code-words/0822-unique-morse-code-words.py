class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        codes=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        d={chr(97+i):codes[i] for i in range(26)}
        ans=[]
        for i in words:
            a=''
            for j in i:
                a+=d[j]
            ans.append(a)
        return len(set(ans))