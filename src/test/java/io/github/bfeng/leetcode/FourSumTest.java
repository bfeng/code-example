package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by bfeng on 1/9/16.
 */
public class FourSumTest {

    FourSum solution;

    @Before
    public void setUp() throws Exception {
        solution = new FourSum();
    }

    @Test
    public void testFourSum() throws Exception {
        int[] input = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 0, 1));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));

        List<List<Integer>> result = solution.fourSum(input, target);
        assertTrue(Utils.equalsWithoutOrder(expected, result));
    }
}