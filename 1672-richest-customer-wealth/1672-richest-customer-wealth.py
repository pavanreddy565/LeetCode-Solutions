class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maxsum=0
        for i in accounts:
            maxsum=max(maxsum,sum(i))
        return maxsum