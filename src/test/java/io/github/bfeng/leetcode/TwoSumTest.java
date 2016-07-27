package io.github.bfeng.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bfeng on 7/24/16.
 */
public class TwoSumTest {

    TwoSum solution;

    @Before
    public void setUp() throws Exception {
        solution = new TwoSum();
    }

    @Test
    public void testTwoSum() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};

        int[] result = solution.twoSum(input, target);
        Assert.assertArrayEquals(expected, result);
        result = solution.twoSumHash(input, target);
        Assert.assertArrayEquals(expected, result);
        result = solution.twoSumSort(input, target);
        Assert.assertArrayEquals(expected, result);
    }
}