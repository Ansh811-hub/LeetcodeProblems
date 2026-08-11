class Solution {
    public int maximumWealth(int[][] nums) {
        int maxi = 0;
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j = 0; j<nums[i].length; j++){
                sum = sum + nums[i][j];
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }
}