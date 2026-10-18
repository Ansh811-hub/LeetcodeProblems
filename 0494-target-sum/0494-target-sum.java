class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            HashMap<Integer, Integer> next = new HashMap<>();
            for (int sum : map.keySet()) {
                next.put(sum + num,
                    next.getOrDefault(sum + num, 0) + map.get(sum));
                next.put(sum - num,
                    next.getOrDefault(sum - num, 0) + map.get(sum));
            }
            map = next;
        }
        return map.getOrDefault(target, 0);
    }
}