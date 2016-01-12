package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/7/16.
 */
public class ZigzagConversionTest {

    ZigzagConversion solution;

    @Before
    public void setUp() throws Exception {
        solution = new ZigzagConversion();
    }

    @Test
    public void testConvertCase1() throws Exception {
        String input = "PAYPALISHIRING";
        String expected = "PAHNAPLSIIGYIR";

        assertEquals(expected, solution.convert(input, 3));
    }

    @Test
    public void testConvertCase2() throws Exception {
        String input = "A";
        assertEquals(input, solution.convert(input, 1));
    }
}