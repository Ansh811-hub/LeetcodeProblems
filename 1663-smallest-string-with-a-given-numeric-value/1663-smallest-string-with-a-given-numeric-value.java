class Solution {
    public String getSmallestString(int n, int k) {
          char[] ans = new char[n];
        for(int i = 0; i < n; i++) {
            ans[i] = 'a';
        }
        k -= n; 
        for(int i = n - 1; i >= 0; i--) {
            int add = Math.min(25, k);
            ans[i] += add;
            k -= add;
        }
        return new String(ans);
    }
}