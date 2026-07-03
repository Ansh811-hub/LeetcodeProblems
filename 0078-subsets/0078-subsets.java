class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        prints(nums, new ArrayList<>(), 0);
        return res;
    }

    public void prints(int[] nums, ArrayList<Integer> ans, int index) {
        if (index == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[index]);
        prints(nums, ans, index + 1);

        ans.remove(ans.size() - 1);
        prints(nums, ans, index + 1);
    }
}
