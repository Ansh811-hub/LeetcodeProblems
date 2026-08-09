class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = 0;

            // Sum of elements on left
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }

            // Sum of elements on right
            for (int j = i + 1; j < n; j++) {
                right += nums[j];
            }

            // Store positive difference
            if (left > right)
                ans[i] = left - right;
            else
                ans[i] = right - left;
        }

        return ans;
    }
}