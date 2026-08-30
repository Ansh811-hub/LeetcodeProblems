import java.util.Stack;
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> p = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!p.isEmpty()) {
                    result.append('(');
                }
                p.push('(');
            }
            else {
                p.pop();
                if (!p.isEmpty()) {
                    result.append(')');
                }
            }
        }
        return result.toString();
    }
}