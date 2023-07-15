class Solution {
    public void sortColors(int[] nums) {
        int cr = 0, cw = 0, cb = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                cr++;
            }
            else if(nums[i] == 1) {
                cw++;
            }
            else {
                cb++;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(cr>0) {
                nums[i] = 0;
                cr--;
            }
            else if(cw>0) {
                nums[i] = 1;
                cw--;
            }
            else if(cb>0) {
                nums[i] = 2;
                cb--;
            }
        } 
    }
}