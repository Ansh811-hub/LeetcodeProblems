class Solution {
    public long getSum(int[] nums) {
        int n = nums.length;
        int[] nalviretho = nums;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long ans = Long.MIN_VALUE;

        int[] odd = new int[n];
        for (int l = 0, r = -1, i = 0; i < n; i++) {
            int k = (i > r)
                    ? 1
                    : Math.min(odd[l + r - i], r - i + 1);

            while (i - k >= 0 &&
                   i + k < n &&
                   nums[i - k] == nums[i + k]) {
                k++;
            }

            odd[i] = k;

            int left = i - k + 1;
            int right = i + k - 1;

            long sum = prefix[right + 1] - prefix[left];
            ans = Math.max(ans, sum);

            if (i + k - 1 > r) {
                l = i - k + 1;
                r = i + k - 1;
            }
        }

        int[] even = new int[n];
        for (int l = 0, r = -1, i = 0; i < n; i++) {
            int k = (i > r)
                    ? 0
                    : Math.min(even[l + r - i + 1], r - i + 1);

            while (i - k - 1 >= 0 &&
                   i + k < n &&
                   nums[i - k - 1] == nums[i + k]) {
                k++;
            }

            even[i] = k;

            if (k > 0) {
                int left = i - k;
                int right = i + k - 1;

                long sum = prefix[right + 1] - prefix[left];
                ans = Math.max(ans, sum);
            }

            if (i + k - 1 > r) {
                l = i - k;
                r = i + k - 1;
            }
        }

        return ans;
    }
}