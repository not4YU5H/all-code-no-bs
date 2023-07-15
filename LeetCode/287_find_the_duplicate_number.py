class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        new_dict = {}
        for i in nums:
            if not i in new_dict:
                new_dict[i] = 1
            else:
                break
        return i