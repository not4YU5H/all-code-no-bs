class Solution {
    public int maxSubArray(int[] nums) {
        int till_now_max = Integer.MIN_VALUE,max_end = 0;
        for(int i=0;i<nums.length;i++)
        {
            max_end += nums[i];
            if(till_now_max<max_end)
                till_now_max = max_end;
            if(max_end<0)
                max_end = 0;
        }
        return till_now_max;
    }
}