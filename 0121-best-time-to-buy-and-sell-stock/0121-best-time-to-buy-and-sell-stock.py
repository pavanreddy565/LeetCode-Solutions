class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=prices[0]
        n=len(prices)
        pro=0
        for i in range(1,n):
            current=prices[i]
            if current>profit:
                pro=max([pro,current-profit])
                #print(pro)
            else:
                profit=current
            
        return pro