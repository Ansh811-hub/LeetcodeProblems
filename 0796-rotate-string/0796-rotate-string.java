class Solution {
    public boolean rotateString(String s, String goal) {

         if (s.length() != goal.length()) {
            return false;
        }
        
        StringBuilder ans = new StringBuilder();
        ans.append(s);
        ans.append(s);

      return ans.toString().contains(goal);
    }
}