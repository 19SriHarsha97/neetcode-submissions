class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++)
        {
            while(!dq.isEmpty() && dq.getLast() < nums[i])
            {
                dq.pollLast();
            }
            dq.addLast(nums[i]);
        }

        res.add(dq.getFirst());

        int i = k;
        while(i < nums.length)
        {
            if(dq.peekFirst() == nums[i - k])
            {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && dq.getLast() < nums[i])
            {
                dq.pollLast();
            }
            dq.addLast(nums[i]);
            res.add(dq.peekFirst());
            i++;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
