class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        int i = 0;

        while(i < nums.length - 2)
        {
            int target = -1 * nums[i];

            int l = i+1, r = nums.length - 1;

            while(l < r)
            {
                if(nums[l] + nums[r] < target)
                {
                    l++;
                }
                else if(nums[l] + nums[r] > target)
                {
                    r--;
                }
                else
                {
                    int left = nums[l];
                    int right = nums[r];

                    while(l < r && nums[l] == left)
                    {
                        l++;
                    }
                    while(r > l && nums[r] == right)
                    {
                        r--;
                    }

                    res.add(Arrays.stream(new int[]{left, right, nums[i]})
                                  .boxed()
                                  .collect(Collectors.toList()));
                }
            }

            do
            {
                i++;
            }
            while(i < nums.length - 2 && nums[i] == -1 * target);
        }

        return res;
    }
}
