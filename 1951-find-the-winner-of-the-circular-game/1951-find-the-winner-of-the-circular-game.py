class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        queue=[int(i+1) for i in range(n)]
        while(len(queue)>1):
            for i in range(k-1):
                num=queue.pop(0)
                queue.append(num)
            queue.pop(0)
        return queue[0]