package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bfeng on 1/2/16.
 */
public class PalindromeNumberTest {

    private PalindromeNumber solution;

    @Before
    public void setUp() throws Exception {
        solution = new PalindromeNumber();
    }

    @Test
    public void testIsPalindrome() throws Exception {
        int x1 = 11;
        assertTrue(solution.isPalindrome(x1));

        int x2 = 12;
        assertFalse(solution.isPalindrome(x2));

        int x3 = 121;
        assertTrue(solution.isPalindrome(x3));

        int x4= -2147483648;
        assertFalse(solution.isPalindrome(x4));

        int x5 = 1000021;
        assertFalse(solution.isPalindrome(x5));
    }
}