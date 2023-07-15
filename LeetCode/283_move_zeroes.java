class Solution {
    public void moveZeroes(int[] nums) {
        int li = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                int temp = nums[li];
                nums[li] = nums[i];
                nums[i] = temp;
                li++;
            }
        }
    }
}