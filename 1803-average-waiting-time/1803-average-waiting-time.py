class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        ini=customers[0][0]
        sum=0
        n=len(customers)
        for i in range(n):
            if ini<customers[i][0]:
                ini=customers[i][0]
            ini+=customers[i][1]
            print(ini," ",ini-customers[i][0])
            sum+=(ini-customers[i][0])
        return sum/n