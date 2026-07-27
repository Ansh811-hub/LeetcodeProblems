class Solution {
    public int maxProduct(int[] nums) {
        int sum = 0;
        int maxi = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                sum = (nums[i]-1)*(nums[j]-1);
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }
}