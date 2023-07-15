class Solution {
    public int removeDuplicates(int[] nums) {
        int sub = nums[0] - 1;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = sub;
            }
        }
        int li = 0, temp = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=sub) {
                temp = nums[li];
                nums[li] = nums[i];
                nums[i] = temp;
                li++;
            }
        }
        return li;
    }
}