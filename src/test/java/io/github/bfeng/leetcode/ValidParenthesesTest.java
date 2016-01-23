package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by bfeng on 1/22/16.
 */
public class ValidParenthesesTest {

    ValidParentheses solution;

    @Before
    public void setUp() throws Exception {
        solution = new ValidParentheses();
    }

    @Test
    public void testIsValid() throws Exception {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
    }
}