class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            if (list.contains(ch)) {
                list.remove((Character) ch);
            } 
            else {
                return false;
            }
        }
        return true;
    }
}