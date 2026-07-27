class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int xor = 0;
        while(i < nums.length){
            xor ^= nums[i];
            i++;
        }
        return xor;
    }
}