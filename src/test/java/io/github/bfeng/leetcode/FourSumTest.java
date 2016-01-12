package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        List<Integer> row1 = new ArrayList<>();
        row1.add(-1);
        row1.add(0);
        row1.add(0);
        row1.add(1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(-1);
        row2.add(0);
        row2.add(0);
        row2.add(1);
        List<Integer> row3 = new ArrayList<>();
        row3.add(-1);
        row3.add(0);
        row3.add(0);
        row3.add(1);
        expected.add(row1);
        expected.add(row2);
        expected.add(row3);
        assertEquals(expected, solution.fourSum(input, target));
    }
}