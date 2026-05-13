class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] post = new int[n];
        int [] pre = new int[n];

        pre[0] = nums[0];
        post[n - 1] = nums[n - 1];


        System.out.println(Arrays.toString(nums));

        for(int i = 1; i < n; i++)
        {
            pre[i] = nums[i] * pre[i - 1];
        }

        System.out.println(Arrays.toString(pre));

        for(int i = n - 2; i >= 0; i--)
        {
            post[i] = nums[i] * post[i + 1];
        }


        System.out.println(Arrays.toString(post));

        int [] res = new int[n];

        for(int i = 0; i < n; i++)
        {
            res[i] = (i > 0 ? pre[i - 1] : 1) * (i < n - 1 ? post[i + 1] : 1);
        }

        return res;
    }
}  
