class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int p = 1;
        int p1 = 1;
        int l = nums.length;
        if(l>=3) {
            p = nums[l-1]*nums[l-2]*nums[l-3];
            p1 = nums[l-1]*nums[0]*nums[1];
        }
        return Math.max(p,p1);
    }
}