class Solution {
    public int minSwaps(String s) {
        int open = 0;
        int unmatched = 0;

        for (char c : s.toCharArray()) {

            if (c == '[') {
                open++;
            } 
            else if (c == ']' && open > 0) {
                open--;
            } 
            else {
                unmatched++;
            }
        }

        return (unmatched + 1) / 2;
    }
}