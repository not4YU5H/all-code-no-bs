class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List k = new ArrayList();
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                k.add(nums[i]);
            }
        }
        return k;
    }
}