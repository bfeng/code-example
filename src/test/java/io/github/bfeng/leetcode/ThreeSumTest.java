package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertTrue(Utils.equalsWithoutOrder(expected, solution.threeSum(input)));
    }

    @Test
    public void testThreeSumCase2() throws Exception {
        int[] input = new int[]{0, 0, 0};
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(0);
        one.add(0);
        one.add(0);
        expected.add(one);
        assertEquals(expected, solution.threeSum(input));
    }

    @Test(timeout = 10)
    public void testThreeSumLongInput1() throws Exception {
        int[] input = new int[]{
                -7, -10, -1, 3, 0, -7, -9, -1, 10, 8, -6, 4, 14, -8, 9, -15, 0, -4, -5, 9, 11, 3, -5,
                -8, 2, -6, -14, 7, -14, 10, 5, -6, 7, 11, 4, -7, 11, 11, 7, 7, -4, -14, -12, -13, -14, 4, -13, 1,
                -15, -2, -12, 11, -14, -2, 10, 3, -1, 11, -5, 1, -2, 7, 2, -10, -5, -8, -10, 14, 10, 13, -2, -9, 6,
                -7, -7, 7, 12, -5, -14, 4, 0, -11, -8, 2, -6, -13, 12, 0, 5, -15, 8, -12, -1, -4, -15, 2, -5, -9, -7,
                12, 11, 6, 10, -6, 14, -12, 9, 3, -10, 10, -8, -2, 6, -9, 7, 7, -7, 4, -8, 5, -4, 8, 0, 3, 11, 0,
                -10, -9};
        solution.threeSum(input);
    }

    @Test(timeout = 10)
    public void testThreeSumLongInput2() throws Exception {
        int[] input = new int[]{-15, 13, 6, -11, -4, 5, -13, 5, 3, 2, 6, -1, 4, 12, -10, -13, -7, -4, -5, 6, 9, -14,
                1, -6, 13, 7, -8, 10, -4, 11, -8, -3, 1, 5, -7, 4, -13, -13, -5, -3, 4, -14, 11, -14, 5, -13, -12,
                13, -10, -10, -4, -15, 13, 13, -14, 11, -3, -15, 6, 1, 3, 5, 13, -11, -5, -9, 1, -2, -14, 11, 10, 5,
                4, -1, 6, -6, -7, 9, -15, -2, 7, -12, -10, 5, -14, 13, -6, -9, 6, 7, 7, -6, -2, -3, -9, 0, -5, 7, 5,
                -4, -5, -7, -13, 14, 7, 8, -15, 7, -5, -15, -10, 9};
        solution.threeSum(input);
    }

    @Test(timeout = 10)
    public void testThreeSumLongInput3() throws Exception {
        int[] input = new int[]{13, 14, 1, 2, -11, -11, -1, 5, -1, -11, -9, -12, 5, -3, -7, -4, -12, -9, 8, -13, -8,
                2, -6, 8, 11, 7, 7, -6, 8, -9, 0, 6, 13, -14, -15, 9, 12, -9, -9, -4, -4, -3, -9, -14, 9, -8, -11,
                13, -10, 13, -15, -11, 0, -14, 5, -4, 0, -3, -3, -7, -4, 12, 14, -14, 5, 7, 10, -5, 13, -14, -2, -6,
                -9, 5, -12, 7, 4, -8, 5, 1, -10, -3, 5, 6, -9, -5, 9, 6, 0, 14, -15, 11, 11, 6, 4, -6, -10, -1, 4,
                -11, -8, -13, -10, -2, -1, -7, -9, 10, -7, 3, -4, -2, 8, -13};
        solution.threeSum(input);
    }
}