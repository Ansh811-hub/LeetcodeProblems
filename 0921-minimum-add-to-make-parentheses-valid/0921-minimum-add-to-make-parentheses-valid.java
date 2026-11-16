class Solution {
    public int minAddToMakeValid(String s) {
        int j = 0;
        Stack<Character> sp = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                sp.push(s.charAt(i));
            } else {
                if(!sp.isEmpty()) {
                    sp.pop();
                } else {
                    j++;
                }
            }
        }
        return j + sp.size();
    }
}