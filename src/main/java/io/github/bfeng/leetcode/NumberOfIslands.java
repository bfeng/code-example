package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 7/26/16.
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    mark(grid, i, j);
                }
            }
        }
        return count;
    }

    private void mark(char[][] grid, int i, int j) {
        int width = grid[0].length;
        int height = grid.length;
        if (i < 0 || i >= height || j < 0 || j >= width)
            return;

        if (grid[i][j] == '1') {
            grid[i][j] = 'x';
            mark(grid, i - 1, j);
            mark(grid, i + 1, j);
            mark(grid, i, j - 1);
            mark(grid, i, j + 1);
        }
    }
}
