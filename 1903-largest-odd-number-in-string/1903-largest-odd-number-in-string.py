class Solution:
    def largestOddNumber(self, num: str) -> str:
        if len(num)==0:
            return ""
        if int(num[-1])%2!=0:
            return num
        return self.largestOddNumber(num[:-1])