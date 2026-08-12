// Last updated: 8/12/2026, 12:30:54 PM
class Solution {

    int ans = 0;
    int empty = 1;
    int startX, startY;

    public int uniquePathsIII(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }

                if (grid[i][j] == 0) {
                    empty++;
                }
            }
        }

        dfs(grid, startX, startY, empty);

        return ans;
    }

    public void dfs(int[][] grid, int x, int y, int remain) {

        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length)
            return;

        if (grid[x][y] == -1)
            return;

        if (grid[x][y] == 2) {
            if (remain == 0)
                ans++;
            return;
        }

        grid[x][y] = -1;

        dfs(grid, x + 1, y, remain - 1);
        dfs(grid, x - 1, y, remain - 1);
        dfs(grid, x, y + 1, remain - 1);
        dfs(grid, x, y - 1, remain - 1);

        grid[x][y] = 0;

        if (x == startX && y == startY)
            grid[x][y] = 1;
    }
}