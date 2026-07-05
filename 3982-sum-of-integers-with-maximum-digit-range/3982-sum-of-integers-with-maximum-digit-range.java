class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {
            int range = getRange(num);

            if (range > maxRange) {
                maxRange = range;
                sum = num;
            } else if (range == maxRange) {
                sum += num;
            }
        }

        return sum;
    }

    private int getRange(int n) {
        if (n == 0) return 0;

        int minDigit = 9;
        int maxDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            minDigit = Math.min(minDigit, digit);
            maxDigit = Math.max(maxDigit, digit);
            n /= 10;
        }

        return maxDigit - minDigit;
    }
}