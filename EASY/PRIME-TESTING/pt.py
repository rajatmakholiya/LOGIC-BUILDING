class Solution:
    def is_prime(self,n):
        if n<=1:
            return False
        for i in range(2, int(n**0.5) + 1):
            if n%i == 0:
                return False
        return True

class main:
    def __init__(self):
        s = Solution()
        n = int(input("Enter a number: "))
        if s.is_prime(n):
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    main()