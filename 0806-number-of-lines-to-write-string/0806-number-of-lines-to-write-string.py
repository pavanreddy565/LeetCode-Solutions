class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        sum=0
        count=0
        for i in s:
            num=widths[int(ord(i))-97]
            if num+sum>100:
                count+=1
                sum=num
            elif sum==100:
                count+=1
                sum-=100
            else:
                sum+=num
        return [count+1,sum]