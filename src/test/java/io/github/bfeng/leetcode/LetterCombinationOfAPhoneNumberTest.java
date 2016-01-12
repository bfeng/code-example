package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by bfeng on 1/9/16.
 */
public class LetterCombinationOfAPhoneNumberTest {

    LetterCombinationOfAPhoneNumber solution;

    @Before
    public void setUp() throws Exception {
        solution = new LetterCombinationOfAPhoneNumber();
    }

    @Test
    public void testLetterCombinations() throws Exception {
        String input = "23";
        String[] expected = new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        String[] result = solution.letterCombinations(input).toArray(new String[0]);
        assertArrayEquals(expected, result);
    }
}