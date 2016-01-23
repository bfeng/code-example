package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/22/16.
 */
public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays solution;

    @Before
    public void setUp() throws Exception {
        solution = new MedianOfTwoSortedArrays();
    }

    @Test
    public void testFindMedianSortedArrays() throws Exception {
        int[] input1 = new int[]{0, 2, 4};
        int[] input2 = new int[]{1, 3};
        assertEquals(2, solution.findMedianSortedArrays(input1, input2), 1E-9);
    }
}