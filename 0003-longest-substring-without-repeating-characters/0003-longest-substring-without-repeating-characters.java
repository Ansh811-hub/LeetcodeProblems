class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int cnt = 0;
        int maxi = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
                cnt--;
            }
            set.add(s.charAt(i));
            cnt++;
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
}