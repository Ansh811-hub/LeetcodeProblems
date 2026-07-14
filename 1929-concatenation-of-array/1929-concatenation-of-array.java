class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] temp = new int[2*nums.length];
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            temp[i] = nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            temp[i+n] = nums[i];
        }
        return temp;
    }
}