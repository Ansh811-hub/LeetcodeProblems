class Solution {
    public boolean isPalindrome(String s) {
        String str2 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = "";

    for (int i = str2.length() - 1; i >= 0; i--) {
    rev += str2.charAt(i);
    }
         return str2.equals(rev);
    }
}