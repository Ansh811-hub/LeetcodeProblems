class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {
            int p = n;
            int product = 1;

            while (p > 0) {
                product *= (p % 10);
                p /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}