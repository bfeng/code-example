package io.github.bfeng.leetcode;

import org.junit.Before;

/**
 * Created by bfeng on 7/18/16.
 */
public class LongestRepeatingSubstringTest extends GeneralTestSuite {

    @Before
    public void setUp() throws Exception {
        solution = new LongestRepeatingSubstring();
    }

    @Override
    StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        output.append(((LongestRepeatingSubstring) solution).longestRepeatingSubstring(input.toString()));
        return output;
    }
}