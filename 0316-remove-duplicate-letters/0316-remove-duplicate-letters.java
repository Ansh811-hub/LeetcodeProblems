import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[256];
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i)] = i;
        }
        
        boolean[] inStack = new boolean[256];
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If character is already in the stack, skip it
            if (inStack[c]) continue;
            
            // Pop elements that are greater than current and appear later in the string
            while (!stack.isEmpty() && stack.peek() > c && lastOccurrence[stack.peek()] > i) {
                inStack[stack.pop()] = false;
            }
            
            stack.push(c);
            inStack[c] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}