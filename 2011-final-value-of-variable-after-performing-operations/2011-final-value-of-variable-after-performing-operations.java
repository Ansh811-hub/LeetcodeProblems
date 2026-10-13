class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            // Checking the middle character is enough to know if it's '+' or '-'
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}