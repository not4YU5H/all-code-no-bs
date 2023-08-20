class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n>=1:
            k = math.log2(n)
            l = int(k)
            if k==l: return True
            else: return False
        else: return False