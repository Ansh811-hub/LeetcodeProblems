class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        if (N == 0) {
            return 1;
        }

        double p = myPow(x, (int)(N / 2));

        if (N % 2 == 0) {
            return p * p;
        }

        return x * p * p;
    }
}