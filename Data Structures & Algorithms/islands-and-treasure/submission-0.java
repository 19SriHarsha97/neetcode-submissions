class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                if(grid[r][c] == 0)
                {
                    bfs(r, c, rows, cols, grid);
                }
            }
        }

    }

    public static void bfs(int r, int c, int rows, int cols, int [][] grid)
    {
        LinkedList<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{r, c});
        int [][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty())
        {
            int [] curr = queue.poll();

            for(int [] dir : directions)
            {
                int ri = curr[0] + dir[0];
                int ci = curr[1] + dir[1];

                if(ri >= 0 && ri < rows && ci >= 0 && ci < cols && grid[ri][ci] != -1)
                {
                    if(grid[curr[0]][curr[1]] + 1 < grid[ri][ci])
                    {
                        queue.add(new int[]{ri, ci});
                        grid[ri][ci] = grid[curr[0]][curr[1]] + 1;
                    }
                }
            }
        }
    }
}
