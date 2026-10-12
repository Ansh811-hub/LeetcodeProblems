class Solution {
    public int findClosestNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(result) ||
                (Math.abs(nums[i]) == Math.abs(result) && nums[i] > result)) {
                result = nums[i];
            }
        }
        return result;
    }
}
