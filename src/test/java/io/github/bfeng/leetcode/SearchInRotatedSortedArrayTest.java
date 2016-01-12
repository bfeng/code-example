package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/10/16.
 */
public class SearchInRotatedSortedArrayTest {

    SearchInRotatedSortedArray solution;

    @Before
    public void setUp() throws Exception {
        solution = new SearchInRotatedSortedArray();
    }

    @Test(timeout = 100)
    public void testSearchCase1() throws Exception {
        int[] input = new int[]{4, 5, 6, 7, 0, 1, 2};
        assertEquals(2, solution.search(input, 6));
    }

    @Test(timeout = 100)
    public void testSearchCase2() throws Exception {
        int[] input = new int[]{1, 3};
        assertEquals(-1, solution.search(input, 2));
    }

    @Test(timeout = 100)
    public void testSearchCase3() throws Exception {
        int[] input = new int[]{1};
        assertEquals(0, solution.search(input, 1));
    }
}