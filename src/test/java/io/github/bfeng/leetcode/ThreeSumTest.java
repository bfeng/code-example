package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/9/16.
 */
public class ThreeSumTest {

    ThreeSum solution;

    @Before
    public void setUp() throws Exception {
        solution = new ThreeSum();
    }

    @Test
    public void testThreeSum() throws Exception {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(-1);
        row1.add(0);
        row1.add(1);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(-1);
        row2.add(-1);
        row2.add(2);
        expected.add(row1);
        expected.add(row2);
        assertEquals(expected, solution.threeSum(input));
    }
}