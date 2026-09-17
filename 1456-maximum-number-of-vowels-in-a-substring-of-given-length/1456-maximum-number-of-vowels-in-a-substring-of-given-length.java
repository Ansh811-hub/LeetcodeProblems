class Solution {

    public int maxVowels(String s, int k) {

        int count = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxi = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add the new character entering the window
            if (isVowel(s.charAt(i))) {
                count++;
            }

            maxi = Math.max(maxi, count);
        }

        return maxi;
    }

    public boolean isVowel(char c) {
        return c == 'a' ||
               c == 'e' ||
               c == 'i' ||
               c == 'o' ||
               c == 'u';
    }
}