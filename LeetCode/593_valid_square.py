class Solution:
    def validSquare(self, p1: List[int], p2: List[int], p3: List[int], p4: List[int]) -> bool:
        dict = {}
        li = [p1,p2,p3,p4]
        for i in range(len(li)):
            for j in range(i+1,len(li)):
                d = sqrt((li[i][0]-li[j][0])**2 + (li[i][1]-li[j][1])**2)
                if d == 0:
                    return False
                if(dict.get(d) == None):
                    dict[d] = 1
                else:
                    dict[d] += 1
        if((2 in dict.values() and 4 in dict.values()) or (6 in dict.values() and not(0 in dict))):
            return True
        else:
            return False