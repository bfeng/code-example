package io.github.bfeng.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bfeng on 7/26/16.
 */
public class NumberOfIslandsTest {

    @Test
    public void testNumIslands() throws Exception {
        NumberOfIslands solution = new NumberOfIslands();

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        Assert.assertEquals(1, solution.numIslands(grid1));

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        Assert.assertEquals(3, solution.numIslands(grid2));
    }
}