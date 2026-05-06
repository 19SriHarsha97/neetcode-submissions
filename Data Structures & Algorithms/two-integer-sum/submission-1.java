class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int idx = 0; idx < nums.length; idx++)
        {
            map.put(nums[idx], idx);
        }

        for(int idx1 = 0; idx1 < nums.length; idx1++)
        {
            int diff = target - nums[idx1];

            if(map.containsKey(diff) && map.get(diff) != idx1)
            {
                int idx2 = map.get(diff);

                return idx1 < idx2 ? new int[]{idx1, idx2} : new int[]{idx2, idx1};
            }
        }

        return new int[]{};
    }
}
