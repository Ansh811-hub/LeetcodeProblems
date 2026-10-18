class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return b[0] - a[0];   // larger distance first

            return b[1] - a[1];       // larger value first
        });
        for (int num : arr) {
            pq.add(new int[]{Math.abs(num - x), num});

            if (pq.size() > k)
                pq.poll();
        }
        while (!pq.isEmpty()) {
            result.add(pq.poll()[1]);
        }
        Collections.sort(result);
        return result;
    }
}