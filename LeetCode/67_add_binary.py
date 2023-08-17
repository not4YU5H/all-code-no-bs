class Solution:
    def addBinary(self, a: str, b: str) -> str:
        ai = int(a,2)
        bi = int(b,2)
        ci = ai+bi
        c = str(bin(ci))
        return c[2:]