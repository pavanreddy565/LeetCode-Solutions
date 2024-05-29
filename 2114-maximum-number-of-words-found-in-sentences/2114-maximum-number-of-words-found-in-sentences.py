class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        ma=len(sentences[0].split())
        for i in sentences:
            if len(i.split())>ma:
                ma=len(i.split())
        return ma