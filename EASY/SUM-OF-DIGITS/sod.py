class Solution:
    def sumOfDigits(self, n):
        # code here
        sum=0
        for i in str(n):
            sum += int(i)
        return sum

class main:
    obj = Solution()
    print(obj.sumOfDigits(12345))