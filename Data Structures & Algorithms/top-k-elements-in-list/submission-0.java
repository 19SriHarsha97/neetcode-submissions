class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i : nums)
        {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int n = nums.length;
        List<Integer>[] arr = new ArrayList[n + 1];

        for(Map.Entry<Integer, Integer> num : freq.entrySet())
        {
            int key = num.getKey();
            int val = num.getValue();

            if(arr[val] == null)
            {
                arr[val] = new ArrayList<Integer>();
            }

            arr[val].add(key);
        }

        List<Integer> res = new ArrayList<>();

        OUTER: for(int i = n; i > 0; i--)
        {
            if(arr[i] == null)
            {
                continue;
            }

            for(int num : arr[i])
            {
                if(k == 0)
                {
                    break OUTER;
                }

                res.add(num);
                k--;
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
