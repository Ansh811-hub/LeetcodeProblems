class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> freq.get(b) - freq.get(a)
        );

        pq.addAll(freq.keySet());
        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for (int i = 0; i < freq.get(ch); i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}