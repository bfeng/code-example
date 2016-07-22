package io.github.bfeng.leetcode;

import io.github.bfeng.leetcode.tools.GeneralTestSuite;
import org.junit.Before;

/**
 * Created by bfeng on 4/26/16.
 */
public class LongestPalindromicSubstringTest extends GeneralTestSuite {


    @Before
    public void setUp() throws Exception {
        solution = new LongestPalindromicSubstring();
    }

    @Override
    protected StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        output.append(((LongestPalindromicSubstring) solution).longestPalindrome(input.toString()));
        return output;
    }
}