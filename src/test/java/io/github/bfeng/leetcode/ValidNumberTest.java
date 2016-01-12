package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bfeng on 1/10/16.
 */
public class ValidNumberTest {

    ValidNumber solution;

    @Before
    public void setUp() throws Exception {
        solution = new ValidNumber();
    }

    @Test
    public void testIsNumberCase1() throws Exception {
        assertEquals(true, solution.isNumber("0"));

    }

    @Test
    public void testIsNumberCase2() throws Exception {
        assertTrue(solution.isNumber("  0.1  "));
    }

    @Test
    public void testIsNumberCase3() throws Exception {
        assertFalse(solution.isNumber("abc"));
    }

    @Test
    public void testIsNumberCase4() throws Exception {
        assertFalse(solution.isNumber("1 a"));
    }

    @Test
    public void testIsNumberCase5() throws Exception {
        assertTrue(solution.isNumber("2e10"));
    }
}