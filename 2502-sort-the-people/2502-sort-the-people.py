
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        d={}
        for i in range(len(names)):
            d.update({heights[i]:names[i]})
        my=list(d.keys())
        my.sort()
        return [d[i] for i in my[::-1]]