class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0, r = n - 1;
        int max = Integer.MIN_VALUE;
        while(l < r)
        {
            int min = Math.min(heights[l], heights[r]); 
            max = Math.max(max, min * (r - l));
            if(heights[l] == min)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}
