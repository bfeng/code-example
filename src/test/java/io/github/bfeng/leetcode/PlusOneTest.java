package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by bfeng on 1/2/16.
 */
public class PlusOneTest {

    private PlusOne pos;

    @Before
    public void setUp() throws Exception {
        pos = new PlusOne();
    }

    @Test
    public void testPlusOne() throws Exception {
        int[] input1 = new int[]{9, 9};
        int[] expected1 = new int[]{1, 0, 0};
        int[] result1 = pos.plusOne(input1);
        assertArrayEquals(expected1, result1);

        int[] input2 = new int[]{1, 1};
        int[] expected2 = new int[]{1, 2};
        int[] result2 = pos.plusOne(input2);
        assertArrayEquals(expected2, result2);

        int[] input3 = new int[]{1, 9};
        int[] expected3 = new int[]{2, 0};
        int[] result3 = pos.plusOne(input3);
        assertArrayEquals(expected3, result3);
    }
}