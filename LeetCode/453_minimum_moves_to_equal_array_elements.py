class Solution:
    def minMoves(self, nums: List[int]) -> int:
        min = nums[0]
        sum = 0
        for i in nums:
            if(i<min): min = i
            sum += i
        c = sum - min*(len(nums))
        return c
