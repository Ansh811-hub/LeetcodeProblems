class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxi = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        maxi = sum;
        for(int i = k; i<nums.length; i++){
            sum = sum+nums[i]-nums[i-k];
            maxi = Math.max(maxi,sum);
        }
        return (double)maxi/k;
    }
}