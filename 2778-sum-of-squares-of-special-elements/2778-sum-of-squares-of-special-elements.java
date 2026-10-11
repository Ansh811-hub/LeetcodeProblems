class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int j = 0;
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            j = i+1;
            if(n%j == 0){
                sum += nums[i]*nums[i];
            }
        }
        return sum;
    }
}