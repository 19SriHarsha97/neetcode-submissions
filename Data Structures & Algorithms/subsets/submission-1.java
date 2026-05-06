class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), res);
        return res;
    }

    public static void helper(int idx, int [] nums, List<Integer> tmp, List<List<Integer>> res)
    {
        if(idx >= nums.length)
        {
            res.add(new ArrayList<>(tmp));
            return;
        }

        tmp.add(nums[idx]);
        helper(idx+1, nums, tmp, res);

        tmp.remove(tmp.size() - 1);
        helper(idx + 1, nums, tmp, res);
    }
}
