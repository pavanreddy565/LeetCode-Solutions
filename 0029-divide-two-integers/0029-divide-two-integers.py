class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        
        if(dividend* divisor>0):
            num = dividend//divisor
            if num >= 2**31:
                return 2**31 -1
            return dividend//divisor
        num = -1*int(-1*(dividend/divisor))
        if num < -2**31:
            return -2 **31
        return -1*int(-1*(dividend/divisor))