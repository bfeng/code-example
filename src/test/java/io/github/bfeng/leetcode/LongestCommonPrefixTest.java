package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/8/16.
 */
public class LongestCommonPrefixTest {

    LongestCommonPrefix solution;

    @Before
    public void setUp() throws Exception {
        solution = new LongestCommonPrefix();
    }

    @Test
    public void testLongestCommonPrefixCase1() throws Exception {
        String[] input = {"abc", "ab", "abcde"};
        assertEquals("ab", solution.longestCommonPrefix(input));
    }

    @Test
    public void testLongestCommonPrefixCase2() throws Exception {
        String[] input = {};
        assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    public void testLongestCommonPrefixCase3() throws Exception {
        String[] input = {"a"};
        assertEquals("a", solution.longestCommonPrefix(input));
    }
}