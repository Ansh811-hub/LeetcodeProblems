class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int cnt = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            cnt++;

            while (sum >= target) {
                minLen = Math.min(minLen, cnt);

                sum -= nums[left];
                left++;
                cnt--;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}