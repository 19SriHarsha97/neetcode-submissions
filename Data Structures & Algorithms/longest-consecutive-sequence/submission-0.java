class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }

        int res = 0;

        for(int num : nums)
        {
            if(!set.contains(num - 1))
            {
                int tmp = 1;
                int n = num;

                while(set.contains(n + 1))
                {
                    tmp++;
                    n++;
                }       

                res = Math.max(res, tmp); 
            }
        }

        return res;
    }
}
