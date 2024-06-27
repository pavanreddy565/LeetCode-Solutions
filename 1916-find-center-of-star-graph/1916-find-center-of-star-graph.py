class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        l=set(edges[0])
        for i in range(1,len(edges)):
            l=l.intersection(set(edges[i]))
        return list(l)[0]