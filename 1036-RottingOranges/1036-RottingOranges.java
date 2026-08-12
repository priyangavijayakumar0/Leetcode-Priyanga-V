// Last updated: 8/12/2026, 12:30:51 PM
import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;
        int min= 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int x = pos[0], y = pos[1];

                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2; 
                        fresh--;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            min++;
        }

        
        return fresh == 0 ? min : -1;
    }
}
